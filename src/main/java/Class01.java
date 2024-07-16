public class Class01 {
    public static void main(String[] args) {

        /*

        TERMİNALİ AÇTIKTAN SONRA:
cd (proje dosya konumu) yaz, enter git init --> yeni boş repo oluşturur
git status --> son durumu gösterir
git add (dosya adı) --> yazılan dosyayı ekler
git add . --> bütün dosyaları ekler
git commit -m "v1" --> bu isimle veya versiyonla yayınla demek
git log --> yapılan değişiklikleri hangi kullanıcı hangi zamanda saatte yapmış verir.
git log --oneline -->7 haneli hashcode verir
git show (hashcode 7 haneli) --> o versiyonda ne değişiklik yapıldığını verir
git diff --> diğer versiyona göre farklılıkları verir (+versiyon2 şeklinde gösterir)
git add + git commit komut birleşimi --> git commit -am
cls --> terminal ekran temizleme


GIT KOMUTLARI
---------------
- 1. git init --> Local repo oluşturmak için yani git ile klasörümüzün içindeki dosyaları
ilişkilendirmek için kullanılır
- 2. git add . --> Working space'deki (yani yerel) dosyadarımı staging area'ya
(yani commitlemek için beklenen yer) gönderir
- 3. git commit -m "mesaj" --> Staging area'dan commit stora dosyalarımı göndermek için kullanılır
(Commit yani version yani sürüm oluşmuş olur
- 4. git push --> Uzak repo'ya (GitHub) göndermek için kullandığımız kod.
Yalnız git push komutunu direk kullanmak istersek bir kere
                git remote add origin - github'daki oluşturduğumuz repo'nun adresi -
                git push -u origin master
                -- Bu iki komutu tek seferde kullandıktan sonra diğer commit'lerden sonra sadece git push komutu kullanırız.

--------Kurulum:
1. Adim: Git uygulamasini indir ve kur (https://www.git-scm.com/)
2. Adim: GitHub hesap ve Repository olustur
3. Adim: Ornek bir proje olustur ve once Git e sonra GitHub a yedekle

--------Komutlar

git --version
git config --global user.email "email_adresiniz"
git config --global user.name "isminiz"
git config --global -l --> Ayarları listeler
git init --> git ile ilişkilendirir
git status --> Working Space ve Staged deki değişiklikleri gösterir
git add . --> Working'den staging area'ya gönderir
git status
git diff --> Working space deki değişikliği gösterir
git diff --staged --> Staging Area daki değişiklikleri gösterir
git commit -m "first commit"
git show "hashcode" --> Versiyondaki değişiklikleri gösterir
git log --oneline
git remote add origin https://github.com/techproed2020/Git_...
git push -u origin master

 - KULLANICI BILGILERI :

    git config --global user.name "kullanıcı adı / rumuz"
    git config --global user.email "E-posta"
    git config --list             # Calisma ve kullanici bilgilerini göster

- YEREL DEPO :

    git add <DOSYA(LAR)>          # Yeni ve degismis dosyalari guncellenecekler listesine ekle
    git add .                     # Yeni ve degismis dosyalarin tumunu guncellenecekler listesine ekle
    git add -u                    # Silinmis ve degistirilmis dosyalari guncellenecekler listesine ekle
    git rm <DOSYA(LAR)>           # Calisma agacında ve dizinde dosyalari kaldir
    git rm -f                     # Calisma agacında ve dizinde dosyalari zorla kaldir
    git commit -m 'not'           # Değisiklikleri depoya kaydet
    git commit -a -m "not"        # Tum değisiklikleri depoya kaydet
    cat .gitignore                # Dosyayi depoya ekleme
    git rm --cached <DOSYA>       # Dosyayi takip etmeyi birak
    git diff                      # Degisiklikler arasindaki farklari goster
    git diff --cached             # Listeye Eklenen Değişiklikler Arasındaki Farkları Göster
    git status                    # Calisma agacindaki durumu goster
    git log                       # Islem gunlugunu goster



 - UZAK DEPO :

   git clone <ADRES>              # Uzaktaki depoyu klonla
   git pull                       # Depodaki son degisiklikleri al
   git push                       # Yereldeki degisiklikleri uzak depoda uygula (origin                                                                          master)komutu da eklenebilir



 - DAL (BRANCH) KOMUTLARI :

   git branch <DAL ADI>           # Dal olustur
   git branch                     # Dallari goster
   git checkout <DAL ADI>         # Calisilan dali degistir
   git merge <DAL ADI>            # Dallari birlestir
   git branch -d <DAL ADI>        # Dal sil



 - DIGER KOMUTLAR :

   git --version                  # Git versiyon numarasını  göster
   git --help                     # Git yardım sayfasını göster
   git remote -v                  # Uzak depo adresini ver
   git log --since=<LIMIT>        # Iki zaman araligindaki commitleri goster
   git shortlog -s                # Commit yapanlarin isim ve commit sayilarini göster
   git shortlog -e                # Commit yapanlarin isim ve E-postalarini göster
   git shortlog -n                # Commit yapanlari commit sayisina göre sirala
   git reset -- hard HEAD         # Son yapılan degisiklikleri iptal edip HEAD geri don
   git checkout -- <DOSYA>        # Sadece bir dosyayi depodaki haline geri getir
   git revert HEAD                # Son yapilan commiti geri al
   git stash                      # Commit yapilmamis degisiklikleri kaydet
   git stash pop                  # Commit yapilmamis degisikliklere geri don
   git stash list                 # Commit yapilmamis degisiklikleri listele
   git stash drop                 # Commit yapilmamis degisiklikleri kaldır




   Unutulmamasi gerekenler:
•	conflicleri localde hallet

git rm -r --cached .idea // gitignore dosyasi calismazsa workspacede hatalar gelebilir
			bu kod ile onbellek temizleniyor hatalar onleniyor
----------------------------------------------------------------------------------------------------------------
•	eger maine gecip pull yapmayi unutursam
	git stash save "bu sekilde araya kodlari kopyala"
	daha sonra main-pull-caner-merge
	git stash pop yaparak hem ara alandaki kodlari siler hem de guncellerle birlestirir

•	koda yazmadan cektim
•	git checkout main // maine gecmek icin
•	git pull // uzaktakini locale aliyorum
•	git checkout Caner // kendi yerine gec
•	git merge main // maindekileri caner kismina aliyorum.
•	burada kodlari yazdim
•	git add .
•	git commit -m "asd"
•	git checkout main // tekrar maine gectim
•	git pull // kodlari tekrar uzaktan locale aldim
•	git checkout caner // tekrar caner kismina geldim
•	git merge main // tekrar maindeki guncel kodlari canere aktardim
•	**burada conflict yasayabilirim** amac sikintiyi burada cozmek
•	git push
---------------------------------------------------------------------------------------------------------------------------**burada conflict yasayabilirim**
•	ayni alana kod yazilirsa cakisacak, silmeden de bos alanlara kodlari kaydirabilirim
•	herkesin calisma alanini onceden belirle ister bunu kod araligi ile istersen de class olarak belirlemek sart



         */






    }
}
