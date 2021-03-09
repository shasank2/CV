namespace Rating_System
{
    partial class userRating
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label3 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.fileToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.exitToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.back_btn = new System.Windows.Forms.Button();
            this.submit_btn = new System.Windows.Forms.Button();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.Criteria = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Excellent = new System.Windows.Forms.DataGridViewCheckBoxColumn();
            this.Good = new System.Windows.Forms.DataGridViewCheckBoxColumn();
            this.Average = new System.Windows.Forms.DataGridViewCheckBoxColumn();
            this.Dissatisfied = new System.Windows.Forms.DataGridViewCheckBoxColumn();
            this.DNT = new System.Windows.Forms.Label();
            this.Nametb = new System.Windows.Forms.TextBox();
            this.Emailtb = new System.Windows.Forms.TextBox();
            this.menuStrip1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // label3
            // 
            this.label3.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.label3.Location = new System.Drawing.Point(346, 25);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(106, 23);
            this.label3.TabIndex = 30;
            this.label3.Text = "Email";
            this.label3.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label1
            // 
            this.label1.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.label1.Location = new System.Drawing.Point(53, 25);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(106, 23);
            this.label1.TabIndex = 28;
            this.label1.Text = "Customer Name";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.fileToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(781, 24);
            this.menuStrip1.TabIndex = 43;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // fileToolStripMenuItem
            // 
            this.fileToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.exitToolStripMenuItem});
            this.fileToolStripMenuItem.Name = "fileToolStripMenuItem";
            this.fileToolStripMenuItem.Size = new System.Drawing.Size(37, 20);
            this.fileToolStripMenuItem.Text = "File";
            // 
            // exitToolStripMenuItem
            // 
            this.exitToolStripMenuItem.Name = "exitToolStripMenuItem";
            this.exitToolStripMenuItem.Size = new System.Drawing.Size(93, 22);
            this.exitToolStripMenuItem.Text = "Exit";
            this.exitToolStripMenuItem.Click += new System.EventHandler(this.exitToolStripMenuItem_Click);
            // 
            // back_btn
            // 
            this.back_btn.Location = new System.Drawing.Point(654, 312);
            this.back_btn.Name = "back_btn";
            this.back_btn.Size = new System.Drawing.Size(100, 29);
            this.back_btn.TabIndex = 44;
            this.back_btn.Text = "Back";
            this.back_btn.UseVisualStyleBackColor = true;
            this.back_btn.Click += new System.EventHandler(this.back_btn_Click);
            // 
            // submit_btn
            // 
            this.submit_btn.Location = new System.Drawing.Point(654, 358);
            this.submit_btn.Name = "submit_btn";
            this.submit_btn.Size = new System.Drawing.Size(100, 29);
            this.submit_btn.TabIndex = 45;
            this.submit_btn.Text = "Submit";
            this.submit_btn.UseVisualStyleBackColor = true;
            this.submit_btn.Click += new System.EventHandler(this.submit_btn_Click);
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Criteria,
            this.Excellent,
            this.Good,
            this.Average,
            this.Dissatisfied});
            this.dataGridView1.Location = new System.Drawing.Point(70, 130);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.Size = new System.Drawing.Size(545, 257);
            this.dataGridView1.TabIndex = 46;
            // 
            // Criteria
            // 
            this.Criteria.HeaderText = "Criteria";
            this.Criteria.Name = "Criteria";
            // 
            // Excellent
            // 
            this.Excellent.HeaderText = "Excellent";
            this.Excellent.Name = "Excellent";
            this.Excellent.Resizable = System.Windows.Forms.DataGridViewTriState.True;
            this.Excellent.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.Automatic;
            // 
            // Good
            // 
            this.Good.HeaderText = "Good";
            this.Good.Name = "Good";
            this.Good.Resizable = System.Windows.Forms.DataGridViewTriState.True;
            this.Good.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.Automatic;
            // 
            // Average
            // 
            this.Average.HeaderText = "Average";
            this.Average.Name = "Average";
            this.Average.Resizable = System.Windows.Forms.DataGridViewTriState.True;
            this.Average.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.Automatic;
            // 
            // Dissatisfied
            // 
            this.Dissatisfied.HeaderText = "Dissatisfied";
            this.Dissatisfied.Name = "Dissatisfied";
            this.Dissatisfied.Resizable = System.Windows.Forms.DataGridViewTriState.True;
            this.Dissatisfied.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.Automatic;
            // 
            // DNT
            // 
            this.DNT.AutoSize = true;
            this.DNT.Location = new System.Drawing.Point(205, 79);
            this.DNT.Name = "DNT";
            this.DNT.Size = new System.Drawing.Size(28, 13);
            this.DNT.TabIndex = 47;
            this.DNT.Text = "date";
            // 
            // Nametb
            // 
            this.Nametb.Location = new System.Drawing.Point(165, 28);
            this.Nametb.Name = "Nametb";
            this.Nametb.Size = new System.Drawing.Size(181, 20);
            this.Nametb.TabIndex = 48;
            // 
            // Emailtb
            // 
            this.Emailtb.Location = new System.Drawing.Point(434, 27);
            this.Emailtb.Name = "Emailtb";
            this.Emailtb.Size = new System.Drawing.Size(181, 20);
            this.Emailtb.TabIndex = 49;
            // 
            // userRating
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(781, 450);
            this.Controls.Add(this.Emailtb);
            this.Controls.Add(this.Nametb);
            this.Controls.Add(this.DNT);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.submit_btn);
            this.Controls.Add(this.back_btn);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "userRating";
            this.Text = "userRating";
            this.Load += new System.EventHandler(this.userRating_Load);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem fileToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem exitToolStripMenuItem;
        private System.Windows.Forms.Button back_btn;
        private System.Windows.Forms.Button submit_btn;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.Label DNT;
        private System.Windows.Forms.DataGridViewTextBoxColumn Criteria;
        private System.Windows.Forms.DataGridViewCheckBoxColumn Excellent;
        private System.Windows.Forms.DataGridViewCheckBoxColumn Good;
        private System.Windows.Forms.DataGridViewCheckBoxColumn Average;
        private System.Windows.Forms.DataGridViewCheckBoxColumn Dissatisfied;
        private System.Windows.Forms.TextBox Nametb;
        private System.Windows.Forms.TextBox Emailtb;
    }
}