using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace Rating_System
{
    public partial class AdminPanel : Form
    {
        public AdminPanel()
        {
            InitializeComponent();
        }

        private void adminToolStripMenuItem_Click(object sender, EventArgs e)
        {
            
        }

        private void importCSVToolStripMenuItem_Click(object sender, EventArgs e)
        {
            string fileName = @"D:\read.csv";
            dataGridView1.DataSource = feedbackReader(fileName);
        }
        public List<fbClass> feedbackReader(string fileName)
        {
            var feedbacks = from line in File.ReadAllLines(fileName)
                        let item = line.Split(',')
                        select new fbClass
                        {
                            Criteria = item[0],Excellent = item[1],Good = item[2],Average = item[3],Dissatisfied = item[4],Date = item[5]
                        };
            return feedbacks.ToList();
        }



        public int[][] gridLoop()
        {
            int[] FQ = { 0, 0, 0, 0 };
            int[] SF = { 0, 0, 0, 0};
            int[] C = { 0, 0, 0, 0 };
            int[] OA = { 0, 0, 0, 0};
            int[] RA = { 0, 0, 0, 0 };
            int[] VFM = { 0, 0, 0, 0};

            foreach (DataGridViewRow row in dataGridView1.Rows)
            {
                string CriteraVar = row.Cells[0].Value.ToString();

                bool excellentCol = Convert.ToBoolean(row.Cells[1].Value);
                bool goodCol = Convert.ToBoolean(row.Cells[2].Value);
                bool averageCol = Convert.ToBoolean(row.Cells[3].Value);
                bool dissatisfiedCol = Convert.ToBoolean(row.Cells[4].Value);


                switch (CriteraVar)
                {
                    case "Food Quality":
                        if (excellentCol == true)
                        {
                            FQ[0] += 1;
                        }
                        else if (goodCol == true)
                        {
                            FQ[1] += 1;
                        }
                        else if (averageCol == true)
                        {
                            FQ[2] += 1;
                        }
                        else if (dissatisfiedCol == true)
                        {
                            FQ[3] += 1;
                        }
                        break;

                    case "Staff Friendliness":
                        if (excellentCol == true)
                        {
                            SF[0] += 1;
                        }
                        else if (goodCol == true)
                        {
                            SF[1] += 1;
                        }
                        else if (averageCol == true)
                        {
                            SF[2] += 1;
                        }
                        else if (dissatisfiedCol == true)
                        {
                            SF[3] += 1;
                        }
                        break;

                    case "Cleanliness":
                        if (excellentCol == true)
                        {
                            C[0] += 1;
                        }
                        else if (goodCol == true)
                        {
                            C[1] += 1;
                        }
                        else if (averageCol == true)
                        {
                            C[2] += 1;
                        }
                        else if (dissatisfiedCol == true)
                        {
                            C[3] += 1;
                        }
                        break;

                    case "Order Accuracy":
                        if (excellentCol == true)
                        {
                            OA[0] += 1;
                        }
                        else if (goodCol == true)
                        {
                            OA[1] += 1;
                        }
                        else if (averageCol == true)
                        {
                            OA[2] += 1;
                        }
                        else if (dissatisfiedCol == true)
                        {
                            OA[3] += 1;
                        }
                        break;

                    case "Restaurant Ambiance":
                        if (excellentCol == true)
                        {
                            RA[0] += 1;
                        }
                        else if (goodCol == true)
                        {
                            RA[1] += 1;
                        }
                        else if (averageCol == true)
                        {
                            RA[2] += 1;
                        }
                        else if (dissatisfiedCol == true)
                        {
                            RA[3] += 1;
                        }
                        break;

                    case "Value For Money":
                        if (excellentCol == true)
                        {
                            VFM[0] += 1;
                        }
                        else if (goodCol == true)
                        {
                            VFM[1] += 1;
                        }
                        else if (averageCol == true)
                        {
                            VFM[2] += 1;
                        }
                        else if (dissatisfiedCol == true)
                        {
                            VFM[3] += 1;
                        }
                        break;
                }
            }
            int[][] ratingArray = new int[][] { FQ, SF, C, OA, RA, VFM };
            return ratingArray;
        }

        private void reportToolStripMenuItem_Click(object sender, EventArgs e)
        {
            dataGridView1.DataSource = null;
            int[][] ratingArray = gridLoop();

            for (int i = 0; i < ratingArray.GetLength(0); i++)
            {
                int[] row = new int[ratingArray[0].Length];

                for (int j = 0; j < ratingArray[i].Length; j++)
                {
                    row[j] = ratingArray[i][j];
                }
                dataGridView1.Rows.Add(row);
            }

        }
    }
    public class fbClass
    {
        public string Criteria { get; set; }
        public string Excellent { get; set; }
        public string Good { get; set; }
        public string Average { get; set; }
        public string Dissatisfied { get; set; }
        public string Date { get; set; }
    }
}
