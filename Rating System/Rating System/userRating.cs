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
    public partial class userRating : Form
    {
        List<fbExportClass> lister = new List<fbExportClass>();
        public userRating()
        {
            InitializeComponent();
        }


        private void back_btn_Click(object sender, EventArgs e)
        {
            this.Hide();
            Home home = new Home();
            home.ShowDialog();
        }

        private void exitToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void submit_btn_Click(object sender, EventArgs e)
        {
            if (Nametb.Text == "")
            {
                MessageBox.Show("Name is required");
            }
            else if (Emailtb.Text == "")
            {
                MessageBox.Show("Email is required");
            }
            else
            {
                fbExportClass elem = null;
                foreach (DataGridViewRow row in dataGridView1.Rows)
                {
                    if (row.Cells["Criteria"].Value != null)
                    {
                        elem = new fbExportClass();
                        elem.Criteria = row.Cells["Criteria"].Value.ToString();
                        elem.Excellent = Convert.ToBoolean(row.Cells["Excellent"].Value);
                        elem.Good = Convert.ToBoolean(row.Cells["Good"].Value);
                        elem.Average = Convert.ToBoolean(row.Cells["Average"].Value);
                        elem.Dissatisfied = Convert.ToBoolean(row.Cells["Dissatisfied"].Value);

                        elem.Date = DNT.Text.ToString();
                        lister.Add(elem);
                    }
                }
                using (StreamWriter sw = new StreamWriter(@"D:\read.csv", true))
                {
                    foreach (fbExportClass i in lister)
                    {
                        sw.WriteLine(i.Criteria + "," + i.Excellent + "," + i.Good + "," + i.Average + "," + i.Dissatisfied + "," + i.Date);
                    }
                }
                MessageBox.Show("Thank you for your feeback");
            }
       
           
        }
        public void loadRatingOpt()
        {
            dataGridView1.Rows.Add("Food Quality");
            dataGridView1.Rows.Add("Staff Friendliness");
            dataGridView1.Rows.Add("Cleanliness");
            dataGridView1.Rows.Add("Order Accuracy");
            dataGridView1.Rows.Add("Restaurant Ambiance");
            dataGridView1.Rows.Add("Value For Money");

        }

        public void userRating_Load(object sender, EventArgs e)
        {
            loadRatingOpt();
            DateTime date = DateTime.Now;
            DNT.Text = (date.ToString());
        }
    }
}
