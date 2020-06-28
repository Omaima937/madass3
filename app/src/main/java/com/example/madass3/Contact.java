package com.example.madass3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Contact extends AppCompatActivity {


        private String cname;
        private int cimg;

        public Contact(String name, int img) {
            this.cname = name;
            this.cimg = img;
        }

        //Getter

        public String getName() {
            return cname;
        }

        public int getImg() {
            return cimg;
        }

        //Setter

        public void setName(String name) {
            this.cname = name;
        }

        public void setImg(int img) {
            this.cimg = img;
        }
    }
