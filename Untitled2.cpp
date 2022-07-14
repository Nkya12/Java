#include<iostream>
#include<stdio.h>
#include<conio.h>

using namespace std;

string namaPenyewa[10],judulFilm[10],jenisFilm[10],bonus[10];
int hargaSewa[10],lamaSewa[10],TS=0,totalBayar[10];


void memasukan(){
	string nama,judul,jenis;
	int lama,total;
	char kode,perulangan;
	
	do{
	system("cls");
	cout<<"Nama Penyewa : ";
	cin>>nama;
	cout<<"Judul Film : ";
	cin>>judul;
	cout<<"Kode Film (A, D, K) : ";
	cin>>kode;
	cout<<"Lama Sewa : ";
	cin>>lama;
	cout<<"Ada Data Lagi [Y/T] : ";
	cin>>perulangan;
	
	for(int i = 0; i < 10; i++){
			if(namaPenyewa[i]==""){
				namaPenyewa[i]=nama;
				judulFilm[i]=judul;
				switch(kode){
					case 'A':
						jenisFilm[i]="action";
						hargaSewa[i]=5000;
						break;
					case 'D':
						jenisFilm[i]="DRAMA";
						hargaSewa[i]=4000;
					case 'K':
						jenisFilm[i]="DRAMA";
						hargaSewa[i]=3000;		
				}
				lamaSewa[i]=lama;	
				totalBayar[i]=lama*hargaSewa[i];
				if(lama >= 5){
					bonus[i] = "Gelas";
				}
				else if(lama >= 3){
					bonus[i]="Stiker";
				}
				else {
					bonus[i]="Tdk ada";
				}
				break;
			}
		}
	}while(tolower(perulangan)== 'y');
}

int total(){
	int nilai;
	for(int qwe=0;qwe<10;qwe++){
		nilai += totalBayar[qwe];
	}
	return nilai;
}
void menampilkan(){
	
	system("cls");
	cout<<"==================================================================================================================="<<endl;
	cout<<"Nama penyewa\tJudul Film\tJenis Film\tHarga Sewa\tLama Sewa\tTotal Bayar\tBonus"<<endl;
	cout<<"==================================================================================================================="<<endl;
	for(int i = 0; i < 10;i++){
		if(namaPenyewa[i]!=""){
			cout<<namaPenyewa[i]<<"\t\t"<<judulFilm[i]<<"\t\t"<<jenisFilm[i]<<"\t\t"<<hargaSewa[i]<<"\t\t"<<lamaSewa[i]<<"\t\t"<<totalBayar[i]<<"\t\t"<<bonus[i]<<endl;}
		else{break;}				
	}
	cout<<"==================================================================================================================="<<endl;
	cout<<"Total Seluruhnya\t\t\t\t\t\t:\t\t"<<total()<<endl;
}




int main(){
	char tmbh;
	bool quit = true;
	while(quit){
		cout<<"Data yang sudah ada "<<endl;
		menampilkan();
		cout<<"Menambah data (Y/T) : ";
		cin>>tmbh;
		if(tmbh == 'Y'){
			memasukan();
		}else if(tmbh == 'T'){
			quit = false;
		}else{
			cout<<"Tidak dapat menerima input";}	
		}
		
	}
