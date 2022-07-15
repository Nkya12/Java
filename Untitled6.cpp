#include<stdio.h>
#include<conio.h>
#include<iostream>
#define N 20

using namespace std;

int main(){
	string namaPenyewa[N];
	char judulFilm[N][8];
	string jenisFilm[N];
	char bonus[N][8];
	int hargaSewa[N],lamaSewa[N],totalBayar[N];
	char kode,lagi;
	
	for(int i = 0 ; i < N; i++){
		cout<<"Nama Penyewa 		: ";
		gets(namaPenyewa[i]);
		cout<<"judul film 			: ";
		gets(judulFilm[i]);	
		cout<<"Kode film 			: ";
		cin>>kode;	
		cout<<"Lama sewa 			: ";
		cin>>lamaSewa[i];
		cout<<"Ada data lagi [Y/T]	:";
		cin>>lagi;
		
		switch(kode){
			case 'A':
			case 'a':
				jenisFilm[i]='Action';
				hargaSewa[i]=5000;
			case 'D':
			case 'd':
				jenisFilm[i]='Drama';
				hargaSewa[i]=4000;
			case 'K':
			case 'k':
				jenisFilm[i]='Komedi';
				hargaSewa[i]=3000;
		}
		
		totalBayar[i]=lamaSewa[i]*hargaSewa[i];
		
		if(lagi == 'T' || lagi == 't'){
			break;
		}
		
	}
	
	for(int a = 0; a < N;a++){
		cout<<"==================================================================================================="<<endl;
		cout<<"Nama penyewa\tJudul Film\tJenis Film\tHarga Sewa\tLama Sewa\tTotal Bayar\tBonus"<<endl;
		cout<<"==================================================================================================="<<endl;
						
	}
	}
}

