,g��b�N\ _�Y _�S(WH a n d l e r A d a p t e r -N ���O(u0R�v�~�N` H a n d l e r M e t h o d A r g u m e n t R e s o l v e r ` � 
 �S,g��R/f(W,g��KNMRHQJ�J�S p r i n g M V C -N�vpenc�~�[��k�zpenc�~�[(WS p r i n g M V C �u�/fS p r i n g Fh�g-N��	g͑���v0WMO� 
 Teg�S�s�`���meQ�nx��nZipenc�~�[	g�N9��R��[�Nt�S p r i n g M V C �v8h�_�St�e*YY\O(u� 
 @b�N�Q�[(W gTZP'Y�i	N��juY�{egJ�J�penc�~�[0 
  
 (Wb�N�N�SS p r i n g M V C �~b&^eg�v�O)R�v�eP�N�wS�'Y�[	g�l	g�`Ǐ�C o n t r o l l e r -N�e�l�v�Spe/f�YUO�[bꁨR�leQ�v� 
 (W�m�R
N�l�` @ P a t h V a r i a b l e ` 0` @ R e q u e s t P a r a m ` 0` @ R e q u e s t B o d y ` 1\��Y�b��Bl-N�v�Spe;N�R�leQ� 
 u�(W�e�l�Spe�NaMOn�Q` H t t p S e r v l e t R e q u e s t ` 0` H t t p S e s s i o n ` I{{|�W�v�Spe��[ꁨR1\	g<P�N�O�S�v�cO(u� 
 �s(Wb�N1\ _�Yeg�ek�[�sُ*N�R���,g��;N���[�s�Spe�v㉐g0��HQ؏/f ���HQww{|�V 
  
 ! [ U M L ] ( h t t p s : / / i m a g e - s t a t i c . s e g m e n t f a u l t . c o m / 8 1 9 / 0 2 7 / 8 1 9 0 2 7 6 8 8 - 5 f c b a 2 e 4 2 5 b 2 1 _ a r t i c l e x )  
  
 ,g��b�N�{US�[�s㉐g` H t t p S e r v l e t R e q u e s t ` 0` H t t p S e r v l e t R e s p o n s e ` 0` M o d e l ` �N�S�l�` @ R e q u e s t P a r a m ` 0` @ R e q u e s t B o d y ` �v�R��� 
 S p r i n g M V C �c�OvQ�N�Spe㉐ghV�[�s{|<O��S�N�gwS p r i n g M V C �nx 
  
 # # # #    _�Sek����� 
  
  
 # # # # #   M o d e l A n d V i e w C o n t a i n e r  
  
 ` ` `  
 p u b l i c   c l a s s   M o d e l A n d V i e w C o n t a i n e r   {  
         p r i v a t e   O b j e c t   v i e w ;  
         p r i v a t e   M o d e l   m o d e l ;  
         p r i v a t e   H t t p S t a t u s   s t a t u s ;  
         p r i v a t e   b o o l e a n   r e q u e s t H a n d l e d   =   f a l s e ;  
  
         p u b l i c   v o i d   s e t V i e w ( O b j e c t   v i e w )   {  
                 t h i s . v i e w   =   v i e w ;  
         }  
  
         p u b l i c   S t r i n g   g e t V i e w N a m e ( )   {  
                 r e t u r n   ( t h i s . v i e w   i n s t a n c e o f   S t r i n g   ?   ( S t r i n g )   t h i s . v i e w   :   n u l l ) ;  
         }  
          
         p u b l i c   v o i d   s e t V i e w N a m e ( S t r i n g   v i e w N a m e )   {  
                 t h i s . v i e w   =   v i e w N a m e ;  
         }  
          
         p u b l i c   O b j e c t   g e t V i e w ( )   {  
                 r e t u r n   t h i s . v i e w ;  
         }  
  
         p u b l i c   b o o l e a n   i s V i e w R e f e r e n c e ( )   {  
                 r e t u r n   ( t h i s . v i e w   i n s t a n c e o f   S t r i n g ) ;  
         }  
  
         p u b l i c   M o d e l   g e t M o d e l ( )   {  
                 i f   ( O b j e c t s . i s N u l l ( t h i s . m o d e l ) )   {  
                         t h i s . m o d e l   =   n e w   E x t e n d e d M o d e l M a p ( ) ;  
                 }  
                 r e t u r n   t h i s . m o d e l ;  
         }  
  
         p u b l i c   v o i d   s e t S t a t u s ( H t t p S t a t u s   s t a t u s )   {  
                 t h i s . s t a t u s   =   s t a t u s ;  
         }  
  
         p u b l i c   H t t p S t a t u s   g e t S t a t u s ( )   {  
                 r e t u r n   t h i s . s t a t u s ;  
         }  
          
         p u b l i c   b o o l e a n   i s R e q u e s t H a n d l e d ( )   {  
                 r e t u r n   r e q u e s t H a n d l e d ;  
         }  
  
         p u b l i c   v o i d   s e t R e q u e s t H a n d l e d ( b o o l e a n   r e q u e s t H a n d l e d )   {  
                 t h i s . r e q u e s t H a n d l e d   =   r e q u e s t H a n d l e d ;  
         }  
  
 }  
 ` ` `  
 �{|�vO(u:Wof/f�k*N��Blۏeg��O�e�^ N*N�[a��;N��(u�N�OX[H a n d l e r YtǏz-NM o d e l �N�Sԏ�V�vV i e w �[a�� 
 �{|\O(u�N�Spe㉐ghV` H a n d l e r M e t h o d A r g u m e n t R e s o l v e r ` �TH a n d l e r ԏ�V<P㉐ghV` H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r ` � 
  
 -   v i e w :   �[IN�v{|�W/fO b j e c t �/f�V:NH a n d l e r �e�S�Nԏ�V N*NS t r i n g h�:yƉ�V�vTW[�_N�S�N�v�cԏ�V N*NƉ�V�[a�V i e w  
 -   M o d e l 0E x t e n d e d M o d e l M a p :   ��/fS p r i n g -N�[IN�v{|��S�N�v�cwZP/fM a p  
 -   r e q u e s t H a n d l e d :   h��,g!k��Bl/f&T�]�~Yt�[b�Tg(WYt�l�` @ R e s p o n s e B o d y ` \OO(u0R 
  
 # # # # #   H a n d l e r M e t h o d A r g u m e n t R e s o l v e r  
  
 ` ` `  
 p u b l i c   i n t e r f a c e   H a n d l e r M e t h o d A r g u m e n t R e s o l v e r   {  
         b o o l e a n   s u p p o r t s P a r a m e t e r ( M e t h o d P a r a m e t e r   p a r a m e t e r ) ;  
         O b j e c t   r e s o l v e A r g u m e n t ( M e t h o d P a r a m e t e r   p a r a m e t e r ,   H t t p S e r v l e t R e q u e s t   r e q u e s t ,    
                                         H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   M o d e l A n d V i e w C o n t a i n e r   c o n t a i n e r ,  
                                                       C o n v e r s i o n S e r v i c e   c o n v e r s i o n S e r v i c e )   t h r o w s   E x c e p t i o n ;  
 }  
  
 ` ` `  
 勥c�S/f N*NV{eu�c�S�\O(u/f�b��Bl-N�vpenc㉐g:NC o n t r o l l e r -N�e�l�v�Spe<P0 
 	g�N�[Mb��O��S p r i n g   M V C YteQ�S>f�_��HNؚ�~0��HNꁨRS0�[IN�N$N*N�e�l 
  
 -   s u p p o r t s P a r a m e t e r :   dk�e�l$R�eS_MR�v�Spe㉐ghV/f&T/ec OeQ�v�Spe�ԏ�Vt r u e h�:y/ec 
 -   r e s o l v e A r g u m e n t :   �Nr e q u e s t �[a�-N㉐g�Qp a r a m e t e r  ����v<P�d��N` M e t h o d P a r a m e t e r ` �T` H t t p S e r v l e t R e q u e s t ` �SpeY� 
 ؏ OeQ�N` C o n v e r s i o n S e r v i c e ` �(u�N(W�br e q u e s t -N�S�Q�v<P ���l�bcb` M e t h o d P a r a m e t e r ` �Spe�v{|�W0 
 ُ*N�e�l�v�Spe�[IN�TS p r i n g M V C -N�v�e�lz	gNT�;N��/f:N�N�{Spencl�bc�vǏz 
  
  
 # # # # #   S e r v l e t R e q u e s t M e t h o d A r g u m e n t R e s o l v e r 0S e r v l e t R e s p o n s e M e t h o d A r g u m e n t R e s o l v e r  
 ��HQb�Neg�[�s$N*N�{US�v�Spe㉐ghV�S_b�NH a n d l e r �Spe{|�W/f`   H t t p S e r v l e t R e q u e s t ` 0` H t t p S e r v l e t R e s p o n s e ` � ���ꁨR�leQ0 
 �Nx�YN� 
  
 ` ` `  
 p u b l i c   c l a s s   S e r v l e t R e q u e s t M e t h o d A r g u m e n t R e s o l v e r   i m p l e m e n t s   H a n d l e r M e t h o d A r g u m e n t R e s o l v e r   {  
  
         @ O v e r r i d e  
         p u b l i c   b o o l e a n   s u p p o r t s P a r a m e t e r ( M e t h o d P a r a m e t e r   p a r a m e t e r )   {  
                 C l a s s < ? >   p a r a m e t e r T y p e   =   p a r a m e t e r . g e t P a r a m e t e r T y p e ( ) ;  
                 r e t u r n   S e r v l e t R e q u e s t . c l a s s . i s A s s i g n a b l e F r o m ( p a r a m e t e r T y p e ) ;  
         }  
  
         @ O v e r r i d e  
         p u b l i c   O b j e c t   r e s o l v e A r g u m e n t ( M e t h o d P a r a m e t e r   p a r a m e t e r ,   H t t p S e r v l e t R e q u e s t   r e q u e s t ,  
                                                                     H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   M o d e l A n d V i e w C o n t a i n e r   c o n t a i n e r ,  
                                                                     C o n v e r s i o n S e r v i c e   c o n v e r s i o n S e r v i c e )   t h r o w s   E x c e p t i o n   {  
                 r e t u r n   r e q u e s t ;  
         }  
  
 }  
 ` ` `  
 1 .   (W` s u p p o r t s P a r a m e t e r ` HQ�S�QH a n d l e r �Spe�v{|�W�$R�e�{|�W/fN/f` S e r v l e t R e q u e s t ` �vP[{|��Y�g/fԏ�Vt r u e  
 2 .   S_` s u p p o r t s P a r a m e t e r ` ԏ�Vt r u e �v�ePgbL�` r e s o l v e A r g u m e n t ` �e�l�(W勹e�l-N�v�cԏ�Vr e q u e s t �[a� 
  
  
 ` ` `  
 p u b l i c   c l a s s   S e r v l e t R e s p o n s e M e t h o d A r g u m e n t R e s o l v e r   i m p l e m e n t s   H a n d l e r M e t h o d A r g u m e n t R e s o l v e r   {  
         @ O v e r r i d e  
         p u b l i c   b o o l e a n   s u p p o r t s P a r a m e t e r ( M e t h o d P a r a m e t e r   p a r a m e t e r )   {  
                 C l a s s < ? >   p a r a m e t e r T y p e   =   p a r a m e t e r . g e t P a r a m e t e r T y p e ( ) ;  
                 r e t u r n   S e r v l e t R e s p o n s e . c l a s s . i s A s s i g n a b l e F r o m ( p a r a m e t e r T y p e ) ;  
         }  
         @ O v e r r i d e  
         p u b l i c   O b j e c t   r e s o l v e A r g u m e n t ( M e t h o d P a r a m e t e r   p a r a m e t e r ,   H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,  
                                                                     M o d e l A n d V i e w C o n t a i n e r   c o n t a i n e r ,  
                                                                     C o n v e r s i o n S e r v i c e   c o n v e r s i o n S e r v i c e )   t h r o w s   E x c e p t i o n   {  
                 r e t u r n   r e s p o n s e ;  
         }  
 }  
 ` ` `  
  
  
 # # # # #   M o d e l M e t h o d A r g u m e n t R e s o l v e r  
  
 ` ` `  
 p u b l i c   c l a s s   M o d e l M e t h o d A r g u m e n t R e s o l v e r   i m p l e m e n t s   H a n d l e r M e t h o d A r g u m e n t R e s o l v e r   {  
  
         @ O v e r r i d e  
         p u b l i c   b o o l e a n   s u p p o r t s P a r a m e t e r ( M e t h o d P a r a m e t e r   p a r a m e t e r )   {  
                 r e t u r n   M o d e l . c l a s s . i s A s s i g n a b l e F r o m ( p a r a m e t e r . g e t P a r a m e t e r T y p e ( ) ) ;  
         }  
  
         @ O v e r r i d e  
         p u b l i c   O b j e c t   r e s o l v e A r g u m e n t ( M e t h o d P a r a m e t e r   p a r a m e t e r ,   H t t p S e r v l e t R e q u e s t   r e q u e s t ,  
                                                                     H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   M o d e l A n d V i e w C o n t a i n e r   c o n t a i n e r ,  
                                                                     C o n v e r s i o n S e r v i c e   c o n v e r s i o n S e r v i c e )   t h r o w s   E x c e p t i o n   {  
  
                 A s s e r t . s t a t e ( c o n t a i n e r   ! =   n u l l ,   " M o d e l A n d V i e w C o n t a i n e r   i s   r e q u i r e d   f o r   m o d e l   e x p o s u r e " ) ;  
                 r e t u r n   c o n t a i n e r . g e t M o d e l ( ) ;  
         }  
 }  
 ` ` `  
 �㉐ghV;N��/f�N㉐g�QM o d e l �[a���e�OTg�[H a n d l e r -N�vM o d e l �SpeۏL��leQ 
  
 # # # # #   R e q u e s t P a r a m M e t h o d A r g u m e n t R e s o l v e r  
 �cNeg�Qeg�[�s�l�` @ R e q u e s t P a r a m ` �v�R���S_H a n d l e r -N�v�Spe��` @ R e q u e s t P a r a m ` h�l� ����Nr e q u e s t -N�S�Q�[�^�v�Spe� 
 6qT�(u` C o n v e r s i o n S e r v i c e ` l�bcbcknx�v{|�W0 
  
 1 .   �[IN�l�` @ R e q u e s t P a r a m `  
  
 ` ` `  
 @ T a r g e t ( E l e m e n t T y p e . P A R A M E T E R )  
 @ R e t e n t i o n ( R e t e n t i o n P o l i c y . R U N T I M E )  
 @ D o c u m e n t e d  
 p u b l i c   @ i n t e r f a c e   R e q u e s t P a r a m   {  
  
         S t r i n g   n a m e ( ) ;  
  
         b o o l e a n   r e q u i r e d ( )   d e f a u l t   t r u e ;  
  
         S t r i n g   d e f a u l t V a l u e ( )   d e f a u l t   " " ;  
  
 }  
 ` ` `  
  
 -   n a m e :   �Nr e q u e s t �S�Spe�vTW[���Spe�_kX 
 -   r e q u i r e d :   �f��Spe/f&T�_kX�؞��/ft r u e  
 -   d e f a u l t V a l u e :   �Y�gr e q u e s t -N~bN0R�[�^�v�Spe���HN1\(u؞��<P 
  
 2 .   �[�s㉐ghV` R e q u e s t P a r a m M e t h o d A r g u m e n t R e s o l v e r `  
  
 ` ` `  
 p u b l i c   c l a s s   R e q u e s t P a r a m M e t h o d A r g u m e n t R e s o l v e r   i m p l e m e n t s   H a n d l e r M e t h o d A r g u m e n t R e s o l v e r   {  
         @ O v e r r i d e  
         p u b l i c   b o o l e a n   s u p p o r t s P a r a m e t e r ( M e t h o d P a r a m e t e r   p a r a m e t e r )   {  
                 r e t u r n   p a r a m e t e r . h a s P a r a m e t e r A n n o t a t i o n ( R e q u e s t P a r a m . c l a s s ) ;  
         }  
  
         @ O v e r r i d e  
         p u b l i c   O b j e c t   r e s o l v e A r g u m e n t ( M e t h o d P a r a m e t e r   p a r a m e t e r ,   H t t p S e r v l e t R e q u e s t   r e q u e s t ,  
                                                                     H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   M o d e l A n d V i e w C o n t a i n e r   c o n t a i n e r ,  
                                                                     C o n v e r s i o n S e r v i c e   c o n v e r s i o n S e r v i c e )   t h r o w s   E x c e p t i o n   {  
  
                 R e q u e s t P a r a m   p a r a m   =   p a r a m e t e r . g e t P a r a m e t e r A n n o t a t i o n ( R e q u e s t P a r a m . c l a s s ) ;  
                 i f   ( O b j e c t s . i s N u l l ( p a r a m ) )   {  
                         r e t u r n   n u l l ;  
                 }  
                 S t r i n g   v a l u e   =   r e q u e s t . g e t P a r a m e t e r ( p a r a m . n a m e ( ) ) ;  
                 i f   ( S t r i n g U t i l s . i s E m p t y ( v a l u e ) )   {  
                         v a l u e   =   p a r a m . d e f a u l t V a l u e ( ) ;  
                 }  
                 i f   ( ! S t r i n g U t i l s . i s E m p t y ( v a l u e ) )   {  
                         r e t u r n   c o n v e r s i o n S e r v i c e . c o n v e r t ( v a l u e ,   p a r a m e t e r . g e t P a r a m e t e r T y p e ( ) ) ;  
                 }  
                  
                 i f   ( p a r a m . r e q u i r e d ( ) )   {  
                         t h r o w   n e w   M i s s i n g S e r v l e t R e q u e s t P a r a m e t e r E x c e p t i o n ( p a r a m e t e r . g e t P a r a m e t e r N a m e ( ) ,  
                                         p a r a m e t e r . g e t P a r a m e t e r T y p e ( ) . g e t N a m e ( ) ) ;  
                 }  
                 r e t u r n   n u l l ;  
         }  
  
 }  
 ` ` `  
  
 -   s u p p o r t s P a r a m e t e r :   $R�eH a n d l e r �v�Spe/f&T	g�m�R�l�` @ R e q u e s t P a r a m `  
 -   r e s o l v e A r g u m e n t :   �Nr e q u e s t -N~bc�[n a m e �v�Spe��Y�g~bN0R(u؞��<PK�<P��Y�g؞��<P_N�l	g�S_r e q u i r e d = t r u e �e�b�Q_8^� 
 &TRԏ�Vn u l l ;   �Y�g�Nr e q u e s t -N~b0R�N�Spe<P���HN�(u` c o n v e r s i o n S e r v i c e . c o n v e r t ` �e�ll�bcbcknx�v{|�W 
  
  
 # # # # #   R e q u e s t B o d y M e t h o d A r g u m e n t R e s o l v e r    
 b�N�~�~�[�s gT N*N�l�` @ R e q u e s t B o d y ` �S_��ُ*N�l㉄v�Spe� ����br e q u e s t Am-N�vpencl�bcb�[a� 
  
 1 .   �[IN�l� 
  
 ` ` `  
 @ T a r g e t ( E l e m e n t T y p e . P A R A M E T E R )  
 @ R e t e n t i o n ( R e t e n t i o n P o l i c y . R U N T I M E )  
 @ D o c u m e n t e d  
 p u b l i c   @ i n t e r f a c e   R e q u e s t B o d y   {  
         b o o l e a n   r e q u i r e d ( )   d e f a u l t   t r u e ;  
 }  
 ` ` `  
  
 2 .   �[�s㉐ghV` R e q u e s t B o d y M e t h o d A r g u m e n t R e s o l v e r `  
  
 1u�Nb�N ���O(u0RJ S O N �vl�bc�@b�Nb�N_eQf a s t j s o n  
  
 ` ` `  
 < d e p e n d e n c y >  
         < g r o u p I d > c o m . a l i b a b a < / g r o u p I d >  
         < a r t i f a c t I d > f a s t j s o n < / a r t i f a c t I d >  
         < v e r s i o n > 1 . 2 . 6 0 < / v e r s i o n >  
 < / d e p e n d e n c y >  
 ` ` `  
  
 �[te�Nx�YN� 
  
 ` ` `  
 p u b l i c   c l a s s   R e q u e s t B o d y M e t h o d A r g u m e n t R e s o l v e r   i m p l e m e n t s   H a n d l e r M e t h o d A r g u m e n t R e s o l v e r   {  
         @ O v e r r i d e  
         p u b l i c   b o o l e a n   s u p p o r t s P a r a m e t e r ( M e t h o d P a r a m e t e r   p a r a m e t e r )   {  
                 r e t u r n   p a r a m e t e r . h a s P a r a m e t e r A n n o t a t i o n ( R e q u e s t B o d y . c l a s s ) ;  
         }  
  
         @ O v e r r i d e  
         p u b l i c   O b j e c t   r e s o l v e A r g u m e n t ( M e t h o d P a r a m e t e r   p a r a m e t e r ,   H t t p S e r v l e t R e q u e s t   r e q u e s t ,  
                                                                     H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   M o d e l A n d V i e w C o n t a i n e r   c o n t a i n e r ,  
                                                                     C o n v e r s i o n S e r v i c e   c o n v e r s i o n S e r v i c e )   t h r o w s   E x c e p t i o n   {  
                 S t r i n g   h t t p M e s s a g e B o d y   =   t h i s . g e t H t t p M e s s a g e B o d y ( r e q u e s t ) ;  
                 i f   ( ! S t r i n g U t i l s . i s E m p t y ( h t t p M e s s a g e B o d y ) )   {  
                         r e t u r n   J S O N . p a r s e O b j e c t ( h t t p M e s s a g e B o d y ,   p a r a m e t e r . g e t P a r a m e t e r T y p e ( ) ) ;  
                 }  
  
                 R e q u e s t B o d y   r e q u e s t B o d y   =   p a r a m e t e r . g e t P a r a m e t e r A n n o t a t i o n ( R e q u e s t B o d y . c l a s s ) ;  
                 i f   ( O b j e c t s . i s N u l l ( r e q u e s t B o d y ) )   {  
                         r e t u r n   n u l l ;  
                 }  
                 i f   ( r e q u e s t B o d y . r e q u i r e d ( ) )   {  
                         t h r o w   n e w   M i s s i n g S e r v l e t R e q u e s t P a r a m e t e r E x c e p t i o n ( p a r a m e t e r . g e t P a r a m e t e r N a m e ( ) ,  
                                         p a r a m e t e r . g e t P a r a m e t e r T y p e ( ) . g e t N a m e ( ) ) ;  
                 }  
                 r e t u r n   n u l l ;  
         }  
  
         p r i v a t e   S t r i n g   g e t H t t p M e s s a g e B o d y ( H t t p S e r v l e t R e q u e s t   r e q u e s t )   t h r o w s   I O E x c e p t i o n   {  
                 S t r i n g B u i l d e r   s b   =   n e w   S t r i n g B u i l d e r ( ) ;  
                 B u f f e r e d R e a d e r   r e a d e r   =   r e q u e s t . g e t R e a d e r ( ) ;  
                 c h a r [ ]   b u f f   =   n e w   c h a r [ 1 0 2 4 ] ;  
                 i n t   l e n ;  
                 w h i l e   ( ( l e n   =   r e a d e r . r e a d ( b u f f ) )   ! =   - 1 )   {  
                         s b . a p p e n d ( b u f f ,   0 ,   l e n ) ;  
                 }  
                 r e t u r n   s b . t o S t r i n g ( ) ;  
         }  
 }  
  
 ` ` `  
 -   g e t H t t p M e s s a g e B o d y :   �Nr e q u e s t �[a�Am-N���S�Qpencl�bcbW[&{2N 
 -   r e s o l v e A r g u m e n t :   �b�S�Qeg�vW[&{2N�Ǐf a s t j s o n l�bcb�Spe{|�W�v�[a� 
  
 # # # # #   H a n d l e r M e t h o d A r g u m e n t R e s o l v e r C o m p o s i t e  
 �cNegb�NR�^�Spe㉐ghV�v�~T{|` H a n d l e r M e t h o d A r g u m e n t R e s o l v e r C o m p o s i t e ` �ُ_N/fV{eu!j_�v8^(u�e_ 
  
 ` ` `  
 p u b l i c   c l a s s   H a n d l e r M e t h o d A r g u m e n t R e s o l v e r C o m p o s i t e   i m p l e m e n t s   H a n d l e r M e t h o d A r g u m e n t R e s o l v e r   {  
         p r i v a t e   L i s t < H a n d l e r M e t h o d A r g u m e n t R e s o l v e r >   a r g u m e n t R e s o l v e r s   =   n e w   A r r a y L i s t < > ( ) ;  
          
         @ O v e r r i d e  
         p u b l i c   b o o l e a n   s u p p o r t s P a r a m e t e r ( M e t h o d P a r a m e t e r   p a r a m e t e r )   {  
                 r e t u r n   t r u e ;  
         }  
  
         @ O v e r r i d e  
         p u b l i c   O b j e c t   r e s o l v e A r g u m e n t ( M e t h o d P a r a m e t e r   p a r a m e t e r ,   H t t p S e r v l e t R e q u e s t   r e q u e s t ,  
                                                                     H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   M o d e l A n d V i e w C o n t a i n e r   c o n t a i n e r ,  
                                                                     C o n v e r s i o n S e r v i c e   c o n v e r s i o n S e r v i c e )   t h r o w s   E x c e p t i o n   {  
                 f o r   ( H a n d l e r M e t h o d A r g u m e n t R e s o l v e r   r e s o l v e r   :   a r g u m e n t R e s o l v e r s )   {  
                         i f   ( r e s o l v e r . s u p p o r t s P a r a m e t e r ( p a r a m e t e r ) )   {  
                                 r e t u r n   r e s o l v e r . r e s o l v e A r g u m e n t ( p a r a m e t e r ,   r e q u e s t ,   c o n v e r s i o n S e r v i c e ) ;  
                         }  
                 }  
                 t h r o w   n e w   I l l e g a l A r g u m e n t E x c e p t i o n ( " U n s u p p o r t e d   p a r a m e t e r   t y p e   [ "   +  
                                 p a r a m e t e r . g e t P a r a m e t e r T y p e ( ) . g e t N a m e ( )   +   " ] .   s u p p o r t s P a r a m e t e r   s h o u l d   b e   c a l l e d   f i r s t . " ) ;  
         }  
  
         p u b l i c   v o i d   a d d R e s o l v e r ( H a n d l e r M e t h o d A r g u m e n t R e s o l v e r   r e s o l v e r )   {  
                 t h i s . a r g u m e n t R e s o l v e r s . a d d ( r e s o l v e r ) ;  
         }  
  
         p u b l i c   v o i d   a d d R e s o l v e r ( H a n d l e r M e t h o d A r g u m e n t R e s o l v e r . . .   r e s o l v e r s )   {  
                 C o l l e c t i o n s . a d d A l l ( t h i s . a r g u m e n t R e s o l v e r s ,   r e s o l v e r s ) ;  
         }  
  
         p u b l i c   v o i d   c l e a r ( )   {  
                 t h i s . a r g u m e n t R e s o l v e r s . c l e a r ( ) ;  
         }  
 }  
  
 ` ` `  
 T7h_N�[�s�c�S` H a n d l e r M e t h o d A r g u m e n t R e s o l v e r ` ��Q萚[INL i s t �(W` r e s o l v e A r g u m e n t ` -N�_�s@b	g�v㉐ghV� 
 ~b0R/ec�Spe�v㉐ghV1\ _�Y㉐g�~bN0R1\�b�Q_8^ 
  
  
 # # # #   USCQKmՋ 
 0Rdk�	N*N㉐ghV���]�~ _�S�[b�b�NegZP N�NUSCQKmՋ�HQ�[INKmՋ(u�O� 
 -   ����` @ R e q u e s t P a r a m ` :   R�^T e s t C o n t r o l l e r ��e�lt e s t 4 �v�Spen a m e ,   a g e ,   b i r t h d a y ,   r e q u e s t � 
 ����㉐ghV/f&T��Yck8^Yt{|�W:NS t r i n g 0I n t e g e r 0D a t e 0H t t p S e r v l e t R e q u e s t �v㉐g 
 -   ����` @ R e q u e s t B o d y ` : R�^T e s t C o n t r o l l e r ��e�lu s e r �v�SpeU s e r V o ,   ����㉐ghV��Ycknx�v�bJ S O N W[&{2N㉐gbU s e r V o �[a� 
  
 R�^T e s t C o n t r o l l e r ��Nx�YN� 
  
 ` ` `  
 @ S e r v i c e  
 p u b l i c   c l a s s   T e s t C o n t r o l l e r   {  
  
         @ R e q u e s t M a p p i n g ( p a t h   =   " / t e s t 4 " ,   m e t h o d   =   R e q u e s t M e t h o d . P O S T )  
         p u b l i c   v o i d   t e s t 4 ( @ R e q u e s t P a r a m ( n a m e   =   " n a m e " )   S t r i n g   n a m e ,  
                                             @ R e q u e s t P a r a m ( n a m e   =   " a g e " )   I n t e g e r   a g e ,  
                                             @ R e q u e s t P a r a m ( n a m e   =   " b i r t h d a y " )   D a t e   b i r t h d a y ,  
                                             H t t p S e r v l e t R e q u e s t   r e q u e s t )   {  
         }  
  
         @ R e q u e s t M a p p i n g ( p a t h   =   " / u s e r " ,   m e t h o d   =   R e q u e s t M e t h o d . P O S T )  
         p u b l i c   v o i d   u s e r ( @ R e q u e s t B o d y   U s e r V o   u s e r V o )   {  
         }  
  
 }  
 ` ` `  
  
 R�^U s e r V o �[a� 
 ` ` `  
 p u b l i c   c l a s s   U s e r V o   {  
         p r i v a t e   S t r i n g   n a m e ;  
         p r i v a t e   I n t e g e r   a g e ;  
         p r i v a t e   D a t e   b i r t h d a y ;  
  
         / / weug e t t e r   s e t t e r   t o S t r i n g  
 }  
 ` ` `  
  
 1 .   �QUSCQKmՋ1 �����,{ N*NKmՋ(u�O 
  
 ` ` `  
 @ T e s t  
 p u b l i c   v o i d   t e s t 1 ( )   t h r o w s   N o S u c h M e t h o d E x c e p t i o n   {  
         T e s t C o n t r o l l e r   t e s t C o n t r o l l e r   =   n e w   T e s t C o n t r o l l e r ( ) ;  
         M e t h o d   m e t h o d   =   t e s t C o n t r o l l e r . g e t C l a s s ( ) . g e t M e t h o d ( " t e s t 4 " ,  
                         S t r i n g . c l a s s ,   I n t e g e r . c l a s s ,   D a t e . c l a s s ,   H t t p S e r v l e t R e q u e s t . c l a s s ) ;  
  
         / / �g�^H a n d l e r M e t h o d �[a� 
         H a n d l e r M e t h o d   h a n d l e r M e t h o d   =   n e w   H a n d l e r M e t h o d ( t e s t C o n t r o l l e r ,   m e t h o d ) ;  
  
         / / �g�^!j�b��Bl�vr e q u e s t  
         M o c k H t t p S e r v l e t R e q u e s t   r e q u e s t   =   n e w   M o c k H t t p S e r v l e t R e q u e s t ( ) ;  
         r e q u e s t . s e t P a r a m e t e r ( " n a m e " ,   " S i l e n t l y 9 5 2 7 " ) ;  
         r e q u e s t . s e t P a r a m e t e r ( " a g e " ,   " 2 5 " ) ;  
         r e q u e s t . s e t P a r a m e t e r ( " b i r t h d a y " ,   " 2 0 2 0 - 1 1 - 1 2   1 3 : 0 0 : 0 0 " ) ;  
  
         / / �m�R/ec�v㉐ghV 
         H a n d l e r M e t h o d A r g u m e n t R e s o l v e r C o m p o s i t e   r e s o l v e r C o m p o s i t e   =   n e w   H a n d l e r M e t h o d A r g u m e n t R e s o l v e r C o m p o s i t e ( ) ;  
         r e s o l v e r C o m p o s i t e . a d d R e s o l v e r ( n e w   R e q u e s t P a r a m M e t h o d A r g u m e n t R e s o l v e r ( ) ) ;  
         r e s o l v e r C o m p o s i t e . a d d R e s o l v e r ( n e w   S e r v l e t R e q u e s t M e t h o d A r g u m e n t R e s o l v e r ( ) ) ;  
  
         / / �[INl�bchV 
         D e f a u l t F o r m a t t i n g C o n v e r s i o n S e r v i c e   c o n v e r s i o n S e r v i c e   =   n e w   D e f a u l t F o r m a t t i n g C o n v e r s i o n S e r v i c e ( ) ;  
         D a t e F o r m a t t e r   d a t e F o r m a t t e r   =   n e w   D a t e F o r m a t t e r ( ) ;  
         d a t e F o r m a t t e r . s e t P a t t e r n ( " y y y y - M M - d d   H H : m m : s s " ) ;    
         c o n v e r s i o n S e r v i c e . a d d F o r m a t t e r ( d a t e F o r m a t t e r ) ;  
          
         M o c k H t t p S e r v l e t R e s p o n s e   r e s p o n s e   =   n e w   M o c k H t t p S e r v l e t R e s p o n s e ( ) ;  
  
         / / (u�N�g~b�e�l�SpeT 
         D e f a u l t P a r a m e t e r N a m e D i s c o v e r e r   p a r a m e t e r N a m e D i s c o v e r e r   =   n e w   D e f a u l t P a r a m e t e r N a m e D i s c o v e r e r ( ) ;  
         h a n d l e r M e t h o d . g e t P a r a m e t e r s ( ) . f o r E a c h ( m e t h o d P a r a m e t e r   - >   {  
                 t r y   {  
                         m e t h o d P a r a m e t e r . i n i t P a r a m e t e r N a m e D i s c o v e r y ( p a r a m e t e r N a m e D i s c o v e r e r ) ;  
                          
                         O b j e c t   v a l u e   =   r e s o l v e r C o m p o s i t e . r e s o l v e A r g u m e n t ( m e t h o d P a r a m e t e r ,   r e q u e s t , r e s p o n s e ,   n u l l ,   c o n v e r s i o n S e r v i c e ) ;  
                         S y s t e m . o u t . p r i n t l n ( m e t h o d P a r a m e t e r . g e t P a r a m e t e r N a m e ( )   +   "   :   "   +   v a l u e   +   "       t y p e :   "   +   v a l u e . g e t C l a s s ( ) ) ;  
                 }   c a t c h   ( E x c e p t i o n   e )   {  
                         e . p r i n t S t a c k T r a c e ( ) ;  
                 }  
         } ) ;  
 }  
 ` ` `  
 �USCQKmՋ-N	g$N�p�f NN� 
 1 .   ` D e f a u l t F o r m a t t i n g C o n v e r s i o n S e r v i c e ` :   �{|/fS p r i n g -N�v N*Npencl�bchVg�R�؞���]�~�m�R�N�_Yl�bchV� 
 ُ̑b�N؏��n�N�egl�bc�v<h_` y y y y - M M - d d   H H : m m : s s `  
 2 .   ` D e f a u l t P a r a m e t e r N a m e D i s c o v e r e r ` :   �{|/f(u�N�g~b�SpeT�v{|��V:N N,�eg���Ǐ�S\/f�_�����_�SpeT�v��S���S0R�Spe{|�W� 
 �V:N(Wы�e��SpeT	g�S��/fO9e�S�v�@b�N ���ُ7h N*N{|�S p r i n g �]�~�[�s�NY�y㉐g�b�Nُ̑�v�c_(u1\L� 
  
  gTSbpS�Q㉐g�Qeg�v�SpeTW[0<P0{|�W 
  
 ! [ gbL��~�g] ( h t t p s : / / i m a g e - s t a t i c . s e g m e n t f a u l t . c o m / 2 7 6 / 5 0 1 / 2 7 6 5 0 1 0 0 5 - 5 f c b 7 c 4 3 3 e 8 1 d _ a r t i c l e x )  
  
 2 .   �QUSCQKmՋ����(u�O2  
  
 ` ` `  
 @ T e s t  
 p u b l i c   v o i d   t e s t 2 ( )   t h r o w s   N o S u c h M e t h o d E x c e p t i o n   {  
         T e s t C o n t r o l l e r   t e s t C o n t r o l l e r   =   n e w   T e s t C o n t r o l l e r ( ) ;  
         M e t h o d   m e t h o d   =   t e s t C o n t r o l l e r . g e t C l a s s ( ) . g e t M e t h o d ( " u s e r " ,   U s e r V o . c l a s s ) ;  
  
         H a n d l e r M e t h o d   h a n d l e r M e t h o d   =   n e w   H a n d l e r M e t h o d ( t e s t C o n t r o l l e r ,   m e t h o d ) ;  
  
         M o c k H t t p S e r v l e t R e q u e s t   r e q u e s t   =   n e w   M o c k H t t p S e r v l e t R e q u e s t ( ) ;  
         U s e r V o   u s e r V o   =   n e w   U s e r V o ( ) ;  
         u s e r V o . s e t N a m e ( " S i l e n t l y 9 5 2 7 " ) ;  
         u s e r V o . s e t A g e ( 2 5 ) ;  
         u s e r V o . s e t B i r t h d a y ( n e w   D a t e ( ) ) ;  
         r e q u e s t . s e t C o n t e n t ( J S O N . t o J S O N S t r i n g ( u s e r V o ) . g e t B y t e s ( ) ) ;   / / !j�bJ S O N �Spe 
  
         H a n d l e r M e t h o d A r g u m e n t R e s o l v e r C o m p o s i t e   r e s o l v e r C o m p o s i t e   =   n e w   H a n d l e r M e t h o d A r g u m e n t R e s o l v e r C o m p o s i t e ( ) ;  
         r e s o l v e r C o m p o s i t e . a d d R e s o l v e r ( n e w   R e q u e s t B o d y M e t h o d A r g u m e n t R e s o l v e r ( ) ) ;  
  
         M o c k H t t p S e r v l e t R e s p o n s e   r e s p o n s e   =   n e w   M o c k H t t p S e r v l e t R e s p o n s e ( ) ;  
  
         D e f a u l t P a r a m e t e r N a m e D i s c o v e r e r   p a r a m e t e r N a m e D i s c o v e r e r   =   n e w   D e f a u l t P a r a m e t e r N a m e D i s c o v e r e r ( ) ;  
         h a n d l e r M e t h o d . g e t P a r a m e t e r s ( ) . f o r E a c h ( m e t h o d P a r a m e t e r   - >   {  
                 t r y   {  
                         m e t h o d P a r a m e t e r . i n i t P a r a m e t e r N a m e D i s c o v e r y ( p a r a m e t e r N a m e D i s c o v e r e r ) ;  
                         O b j e c t   v a l u e   =   r e s o l v e r C o m p o s i t e . r e s o l v e A r g u m e n t ( m e t h o d P a r a m e t e r ,   r e q u e s t ,   r e s p o n s e ,   n u l l ,   n u l l ) ;  
                         S y s t e m . o u t . p r i n t l n ( m e t h o d P a r a m e t e r . g e t P a r a m e t e r N a m e ( )   +   "   :   "   +   v a l u e   +   "       t y p e :   "   +   v a l u e . g e t C l a s s ( ) ) ;  
                 }   c a t c h   ( E x c e p t i o n   e )   {  
                         e . p r i n t S t a c k T r a c e ( ) ;  
                 }  
         } ) ;  
 }  
 ` ` `  
  
 gbL��v�~�g�YN� 
  
 ! [ ] ( h t t p s : / / i m a g e - s t a t i c . s e g m e n t f a u l t . c o m / 2 1 4 / 0 0 5 / 2 1 4 0 0 5 2 6 5 5 - 5 f c b 7 c f 7 b b a 5 b _ a r t i c l e x )  
  
  
 # # # #   ;`�~ 
 ,g\��b�N�[b�N	N*N�Spe㉐ghV��N�0RS p r i n g M V C -NH a n d l e r �Spe�v㉐gǏz0 
 N N��b�N\ _�Yx�Sԏ�V<P㉐ghV` H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r `  
  
 # # # #   �^U\ 
 ,g��b�N _�S�v㉐ghV�S�[�s�N�Spe�vꁨR\ň��S p r i n g M V C �v�Spe㉐ghV؏S+T�N�Spe�v!h��I{�v^NS p r i n g M V C �]�~�c�O�N�_0N�[�v㉐ghV� 
 �k�Y�` P a t h V a r i a b l e M e t h o d A r g u m e n t R e s o l v e r ` 0` S e s s i o n A t t r i b u t e M e t h o d A r g u m e n t R e s o l v e r ` 0` S e r v l e t C o o k i e V a l u e M e t h o d A r g u m e n t R e s o l v e r ` I{I{��^�����N� NN 
 