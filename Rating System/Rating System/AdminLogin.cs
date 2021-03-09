using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Rating_System
{
    public partial class AdminLogin : Form
    {
        public AdminLogin()
        {
            InitializeComponent();
        }

        private void login_cancel_btn_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void login_btn_Click(object sender, EventArgs e)
        {
            if (username_tb.Text == "" && password_tb.Text == "")
            {
                MessageBox.Show("Username and password is required!");
            }
            else if (username_tb.Text == "admin" && password_tb.Text == "admin")
            {
                this.Hide();
                AdminPanel adminpanel = new AdminPanel();
                adminpanel.ShowDialog();
            }
            else
            {
                MessageBox.Show("Wrong username or password");
            }

        }
    }
}
