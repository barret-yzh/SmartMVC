,g\���v�Q�[��n�v�[�{US�;N��eg�[�sS m a r t M V C -N�v�b*bhV�R���HQb؏/fegwN,g\���m�S0R�v{|�V��N�Sُ�N{| ����c�O�v�e�l 
  
 ! [ �b*bhV{|�V] ( h t t p s : / / i m a g e - s t a t i c . s e g m e n t f a u l t . c o m / 2 0 5 / 6 8 1 / 2 0 5 6 8 1 3 5 2 3 - 5 f c 3 5 e b 3 c d 0 6 c _ a r t i c l e x )  
  
 # # # #    _�Sek����� 
  
  
 # # # # #   H a n d l e r I n t e r c e p t o r  
  
 ��HQb�Neg�[IN` H a n d l e r I n t e r c e p t o r ` �c�S��c�O�N	N*N�e�l� 
 1 .   p r e H a n d l e :   (WgbL�H a n d l e r KNMR���(u��Y�gԏ�V�v/ff a l s e ���HNH a n d l e r 1\NO�QgbL� 
 2 .   p o s t H a n d l e :   (WH a n d l e r gbL��[bKNT���(u��S�N���SH a n d l e r ԏ�V�v�~�g` M o d e l A n d V i e w `  
 3 .   a f t e r C o m p l e t i o n :   勹e�l/f�e���NHN�`�QN��O���(u��k�Y�` p r e H a n d l e ` ԏ�Vf a l s e �H a n d l e r gbL�Ǐz-N�b�Q_8^�H a n d l e r ck8^gbL��[b 
  
 ` ` `  
 p u b l i c   i n t e r f a c e   H a n d l e r I n t e r c e p t o r   {  
  
         d e f a u l t   b o o l e a n   p r e H a n d l e ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   O b j e c t   h a n d l e r )  
                         t h r o w s   E x c e p t i o n   {  
                 r e t u r n   t r u e ;  
         }  
  
         d e f a u l t   v o i d   p o s t H a n d l e ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   O b j e c t   h a n d l e r ,  
                                                         @ N u l l a b l e   M o d e l A n d V i e w   m o d e l A n d V i e w )   t h r o w s   E x c e p t i o n   {  
         }  
  
         d e f a u l t   v o i d   a f t e r C o m p l e t i o n ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   O b j e c t   h a n d l e r ,  
                                                                   @ N u l l a b l e   E x c e p t i o n   e x )   t h r o w s   E x c e p t i o n   {  
         }  
 }  
  
 ` ` `  
  
 # # # # #   M a p p e d I n t e r c e p t o r  
  
 b�N���wS��8^�b*bhV/f �����n�[�T�NU R L uHe�v�FO/f�N
Nb��v�b*bhV�c�S�[INb�N�lw0R{|��n�:N�N��0RM�nNN�R�vR�y� 
 @b�Nb�N�S�^�z` M a p p e d I n t e r c e p t o r ` 0` M a p p e d I n t e r c e p t o r ` @b ����[b�v�R��� 
  
 1 .   \O:Nwck` H a n d l e r I n t e r c e p t o r ` �v�Nt{|�@b�N ����~b�N` H a n d l e r I n t e r c e p t o r ` ��[�s` H a n d l e r I n t e r c e p t o r ` �v	N*N�c�S� 
 v^N�Q� ���S+Twck` H a n d l e r I n t e r c e p t o r ` �v�[�O 
 2 .   �{t` i n t e r c e p t o r ` �[�T�NU R L uHe��cd��T�NU R L  
 3 .   �c�Om a t c h �R����(u�e OeQp a t h �$R�eS_MR` H a n d l e r I n t e r c e p t o r ` /f&T/ec,g!k��Bl0募R���{US�[�s��S/ecp a t h �v�[te9SM�� 
  ����N��fYBg�v9SM����gwS p r i n g M V C -N�v` M a p p e d I n t e r c e p t o r `  
  
 �[te�Nx�YN� 
  
 ` ` `  
 p u b l i c   c l a s s   M a p p e d I n t e r c e p t o r   i m p l e m e n t s   H a n d l e r I n t e r c e p t o r   {  
         p r i v a t e   L i s t < S t r i n g >   i n c l u d e P a t t e r n s   =   n e w   A r r a y L i s t < > ( ) ;  
         p r i v a t e   L i s t < S t r i n g >   e x c l u d e P a t t e r n s   =   n e w   A r r a y L i s t < > ( ) ;  
  
         p r i v a t e   H a n d l e r I n t e r c e p t o r   i n t e r c e p t o r ;  
  
         p u b l i c   M a p p e d I n t e r c e p t o r ( H a n d l e r I n t e r c e p t o r   i n t e r c e p t o r )   {  
                 t h i s . i n t e r c e p t o r   =   i n t e r c e p t o r ;  
         }  
  
         / * *  
           *   �m�R/ec�vp a t h  
           *  
           *   @ p a r a m   p a t t e r n s  
           *   @ r e t u r n  
           * /  
         p u b l i c   M a p p e d I n t e r c e p t o r   a d d I n c l u d e P a t t e r n s ( S t r i n g . . .   p a t t e r n s )   {  
                 t h i s . i n c l u d e P a t t e r n s . a d d A l l ( A r r a y s . a s L i s t ( p a t t e r n s ) ) ;  
                 r e t u r n   t h i s ;  
         }  
  
         / * *  
           *   �m�R�cd��vp a t h  
           *  
           *   @ p a r a m   p a t t e r n s  
           *   @ r e t u r n  
           * /  
         p u b l i c   M a p p e d I n t e r c e p t o r   a d d E x c l u d e P a t t e r n s ( S t r i n g . . .   p a t t e r n s )   {  
                 t h i s . e x c l u d e P a t t e r n s . a d d A l l ( A r r a y s . a s L i s t ( p a t t e r n s ) ) ;  
                 r e t u r n   t h i s ;  
         }  
  
  
         / * *  
           *   9hnc OeQ�vp a t h ,   $R�eS_MR�vi n t e r c e p t o r /f&T/ec 
           *  
           *   @ p a r a m   l o o k u p P a t h  
           *   @ r e t u r n  
           * /  
         p u b l i c   b o o l e a n   m a t c h e s ( S t r i n g   l o o k u p P a t h )   {  
                 i f   ( ! C o l l e c t i o n U t i l s . i s E m p t y ( t h i s . e x c l u d e P a t t e r n s ) )   {  
                         i f   ( e x c l u d e P a t t e r n s . c o n t a i n s ( l o o k u p P a t h ) )   {  
                                 r e t u r n   f a l s e ;  
                         }  
                 }  
                 i f   ( O b j e c t U t i l s . i s E m p t y ( t h i s . i n c l u d e P a t t e r n s ) )   {  
                         r e t u r n   t r u e ;  
                 }  
                 i f   ( i n c l u d e P a t t e r n s . c o n t a i n s ( l o o k u p P a t h ) )   {  
                         r e t u r n   t r u e ;  
                 }  
                 r e t u r n   f a l s e ;  
         }  
  
  
         @ O v e r r i d e  
         p u b l i c   b o o l e a n   p r e H a n d l e ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   O b j e c t   h a n d l e r )  
                         t h r o w s   E x c e p t i o n   {  
                 r e t u r n   t h i s . i n t e r c e p t o r . p r e H a n d l e ( r e q u e s t ,   r e s p o n s e ,   h a n d l e r ) ;  
         }  
  
         @ O v e r r i d e  
         p u b l i c   v o i d   p o s t H a n d l e ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   O b j e c t   h a n d l e r ,  
                                                       @ N u l l a b l e   M o d e l A n d V i e w   m o d e l A n d V i e w )   t h r o w s   E x c e p t i o n   {  
                 t h i s . i n t e r c e p t o r . p o s t H a n d l e ( r e q u e s t ,   r e s p o n s e ,   h a n d l e r ,   m o d e l A n d V i e w ) ;  
         }  
  
         @ O v e r r i d e  
         p u b l i c   v o i d   a f t e r C o m p l e t i o n ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   O b j e c t   h a n d l e r ,  
                                                                 @ N u l l a b l e   E x c e p t i o n   e x )   t h r o w s   E x c e p t i o n   {  
                 t h i s . i n t e r c e p t o r . a f t e r C o m p l e t i o n ( r e q u e s t ,   r e s p o n s e ,   h a n d l e r ,   e x ) ;  
         }  
 }  
 ` ` `  
  
 # # # # #   I n t e r c e p t o r R e g i s t r y  
  
 �s(Wb�N�]�~ _�S�[�NYt�b*bN�R;����v�c�S` H a n d l e r I n t e r c e p t o r ` ��{t` H a n d l e r I n t e r c e p t o r ` N��Bl_�v f\sQT�{| 
 ` M a p p e d I n t e r c e p t o r ` �b�N؏:\ N*N�b*bhV�v�l�Q-N�_�{t@b	g�v�b*bhV�Ջ�`N�Y�g�l	gُ*N� 
 ��HNS_ ������Sy��v-N@b	g�b*bhV�v�eP1\O�_���S�@b�Nb�N؏ ����^�N N*N` I n t e r c e p t o r R e g i s t r y `  
  
 ` ` `  
 p u b l i c   c l a s s   I n t e r c e p t o r R e g i s t r y   {  
         p r i v a t e   L i s t < M a p p e d I n t e r c e p t o r >   m a p p e d I n t e r c e p t o r s   =   n e w   A r r a y L i s t < > ( ) ;  
  
         / * *  
           *   �l�Q N*N�b*bhV0RR e g i s t r y  
           *   @ p a r a m   i n t e r c e p t o r  
           *   @ r e t u r n  
           * /  
         p u b l i c   M a p p e d I n t e r c e p t o r   a d d I n t e r c e p t o r ( H a n d l e r I n t e r c e p t o r   i n t e r c e p t o r )   {  
                 M a p p e d I n t e r c e p t o r   m a p p e d I n t e r c e p t o r   =   n e w   M a p p e d I n t e r c e p t o r ( i n t e r c e p t o r ) ;  
                 m a p p e d I n t e r c e p t o r s . a d d ( m a p p e d I n t e r c e p t o r ) ;  
                 r e t u r n   m a p p e d I n t e r c e p t o r ;  
         }  
  
         p u b l i c   L i s t < M a p p e d I n t e r c e p t o r >   g e t M a p p e d I n t e r c e p t o r s ( )   {  
                 r e t u r n   m a p p e d I n t e r c e p t o r s ;  
         }  
 }  
  
 ` ` `  
  
 # # # #   4 . 2   USCQKmՋ 
 0Rdkb�N�b*bhV�v�R���� _�S�[�}�6q�{US�FO/fb�N؏/f ���ZP N�NUSCQKmՋ�KmՋ(u�O� 
 1 .   R�^ N*N�b*bhV�v�[�s���Yck8^�v�l�Q0R` I n t e r c e p t o r R e g i s t r y `  
 2 .   ��Y:N�l�Q�v�b*bhV��n/ecU R L �T�cd��vU R L  
 3 .   KmՋ�b*bhV�vm a t c h �e�l/f&Tcknx 
  
 �b*bhV�v�[�s{|` T e s t H a n d l e r I n t e r c e p t o r `  
  
 ` ` `  
 p u b l i c   c l a s s   T e s t H a n d l e r I n t e r c e p t o r   i m p l e m e n t s   H a n d l e r I n t e r c e p t o r   {  
         @ O v e r r i d e  
         p u b l i c   b o o l e a n   p r e H a n d l e ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   O b j e c t   h a n d l e r )   t h r o w s   E x c e p t i o n   {  
                 S y s t e m . o u t . p r i n t l n ( " T e s t H a n d l e r I n t e r c e p t o r   = >   p r e H a n d l e " ) ;  
                 r e t u r n   t r u e ;  
         }  
  
         @ O v e r r i d e  
         p u b l i c   v o i d   p o s t H a n d l e ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   O b j e c t   h a n d l e r ,   M o d e l A n d V i e w   m o d e l A n d V i e w )   t h r o w s   E x c e p t i o n   {  
                 S y s t e m . o u t . p r i n t l n ( " T e s t H a n d l e r I n t e r c e p t o r   = >   p o s t H a n d l e " ) ;  
         }  
  
         @ O v e r r i d e  
         p u b l i c   v o i d   a f t e r C o m p l e t i o n ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   O b j e c t   h a n d l e r ,   E x c e p t i o n   e x )   t h r o w s   E x c e p t i o n   {  
                 S y s t e m . o u t . p r i n t l n ( " T e s t H a n d l e r I n t e r c e p t o r   = >   a f t e r C o m p l e t i o n " ) ;  
         }  
 }  
 ` ` `  
  
  
 9hncRMb�Q�vUSCQKmՋ(u�O�QUSCQKmՋ� 
  
 ` ` `  
 p u b l i c   c l a s s   H a n d l e r I n t e r c e p t o r T e s t   {  
  
         p r i v a t e   I n t e r c e p t o r R e g i s t r y   i n t e r c e p t o r R e g i s t r y   =   n e w   I n t e r c e p t o r R e g i s t r y ( ) ;  
  
         @ T e s t  
         p u b l i c   v o i d   t e s t ( )   t h r o w s   E x c e p t i o n   {  
                 T e s t H a n d l e r I n t e r c e p t o r   i n t e r c e p t o r   =   n e w   T e s t H a n d l e r I n t e r c e p t o r ( ) ;  
  
                 i n t e r c e p t o r R e g i s t r y . a d d I n t e r c e p t o r ( i n t e r c e p t o r )  
                                 . a d d E x c l u d e P a t t e r n s ( " / e x _ t e s t " )  
                                 . a d d I n c l u d e P a t t e r n s ( " / i n _ t e s t " ) ;  
  
                 L i s t < M a p p e d I n t e r c e p t o r >   i n t e r c e p t o r s   =   i n t e r c e p t o r R e g i s t r y . g e t M a p p e d I n t e r c e p t o r s ( ) ;  
  
                 A s s e r t . a s s e r t E q u a l s ( i n t e r c e p t o r s . s i z e ( ) ,   1 ) ;  
  
                 M a p p e d I n t e r c e p t o r   m a p p e d I n t e r c e p t o r   =   i n t e r c e p t o r s . g e t ( 0 ) ;  
  
                 A s s e r t . a s s e r t T r u e ( m a p p e d I n t e r c e p t o r . m a t c h e s ( " / i n _ t e s t " ) ) ;  
                 A s s e r t . a s s e r t F a l s e ( m a p p e d I n t e r c e p t o r . m a t c h e s ( " / e x _ t e s t " ) ) ;  
  
                 m a p p e d I n t e r c e p t o r . p r e H a n d l e ( n u l l ,   n u l l ,   n u l l ) ;  
                 m a p p e d I n t e r c e p t o r . p o s t H a n d l e ( n u l l ,   n u l l ,   n u l l ,   n u l l ) ;  
                 m a p p e d I n t e r c e p t o r . a f t e r C o m p l e t i o n ( n u l l ,   n u l l ,   n u l l ,   n u l l ) ;  
         }  
  
 }  
  
 ` ` `  
  
 ЏL��v�~�g� 
  
 ! [ �b*bhVUSCQKmՋ�~�g] ( h t t p s : / / i m a g e - s t a t i c . s e g m e n t f a u l t . c o m / 2 8 2 / 3 7 9 / 2 8 2 3 7 9 2 7 4 5 - 5 f c 3 6 b 8 1 9 4 b 7 8 _ a r t i c l e x )  
  
  
 # # # #   ,g��\�~ 
 ,g��b�N�[b�N�b*bhV�vsQ;����v _�S�` H a n d l e r I n t e r c e p t o r ` -N�v` a f t e r C o m p l e t i o n ` �e�lN�{�NHN�`�QN��O��gbL� 
  
 # # # #   �^U\ 
 ,g���[�s�v�b*bhV�TS p r i n g M V C �c�O�v�b*bhV	g�N���]+R��R��_NN�YS p r i n g M V C �v:_'Y�'Y�[�S�N�[�k@www��R�m�[S p r i n g M V C �b*bhV�vt�