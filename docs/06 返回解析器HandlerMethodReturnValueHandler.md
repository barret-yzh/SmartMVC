MR N�{b�N _�S�[b�N�Spe�v㉐ghV��cNegb�N _�Y _�Sԏ�V<P�vYthV�(WS p r i n g M V C -N�]�~�Q萞[�s�N�_Y�vԏ�V<PYthV� 
 b�Nُ̑N�S���[�s��HNY�bc	��N5 *N8^(u�vԏ�V<PYthVeg\O:N,g�{�v _�S�Q�[���HQb�N Nw�egwN{|�V 
  
 ! [ u m l ] ( h t t p s : / / i m a g e - s t a t i c . s e g m e n t f a u l t . c o m / 3 4 6 / 3 5 1 / 3 4 6 3 5 1 4 1 2 3 - 5 f c c 4 2 2 c 4 7 b f 0 _ a r t i c l e x )  
  
 ,g�{b�N;N���[�s5 *N�R���ُ_N/fS p r i n g M V C -N8^(u�v�R��� 
 -   ` M a p ` :   /ecH a n d l e r ԏ�VM a p <P�>eeQ0R
NN�e-N�(u�Nu�b�2n�gO(u 
 -   ` M o d e l ` :   /ecH a n d l e r ԏ�VM o d e l <P�>eeQ0R
NN�e-N�(u�Nu�b�2n�gO(u 
 -   ` V i e w ` :   /ecH a n d l e r �v�cԏ�V ���2n�g�v` V i e w ` �[a� 
 -   ` v i e w N a m e ` :   /ecԏ�V N*NS t r i n g �[a��h�:yƉ�V�v_ 
 -   ` @ R e s p o n s e B o d y ` :   �Y�g�e�l
N���l�` @ R e s p o n s e B o d y ` h�l���HNԏ�VJ S O N W[&{2N 
  
 # # # #    _�Sek����� 
  
 # # # # #   H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r  
  
 ` ` `  
 p u b l i c   i n t e r f a c e   H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r   {  
  
         b o o l e a n   s u p p o r t s R e t u r n T y p e ( M e t h o d P a r a m e t e r   r e t u r n T y p e ) ;  
  
         v o i d   h a n d l e R e t u r n V a l u e ( @ N u l l a b l e   O b j e c t   r e t u r n V a l u e ,   M e t h o d P a r a m e t e r   r e t u r n T y p e ,  
                                                       M o d e l A n d V i e w C o n t a i n e r   m a v C o n t a i n e r ,  
                                                       H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )   t h r o w s   E x c e p t i o n ;  
 }  
 ` ` `  
 -   s u p p o r t s R e t u r n T y p e :   T�Spe㉐ghV N7h�$R�eYthV/f&T/ec�ԏ�V<P�v{|�W 
 -   h a n d l e R e t u r n V a l u e :   r e t u r n V a l u e ( H a n d l e r gbL�KNT�vԏ�V<P) �勹e�l؏ ��� OeQ` H t t p S e r v l e t R e s p o n s e ` �[a�� 
 /f�V:N�S��O(WYtvQ-N�v�cYt�[te*N��Bl��k�Y` @ R e s p o n s e B o d y `  
  
  
 # # # # #   M a p M e t h o d R e t u r n V a l u e H a n d l e r   0  M o d e l M e t h o d R e t u r n V a l u e H a n d l e r  
 HQegw$N*N�{US�v�[�s�/ecԏ�VM a p �M o d e l  
  
 ` ` `  
 p u b l i c   c l a s s   M o d e l M e t h o d R e t u r n V a l u e H a n d l e r   i m p l e m e n t s   H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r   {  
  
         @ O v e r r i d e  
         p u b l i c   b o o l e a n   s u p p o r t s R e t u r n T y p e ( M e t h o d P a r a m e t e r   r e t u r n T y p e )   {  
                 r e t u r n   M o d e l . c l a s s . i s A s s i g n a b l e F r o m ( r e t u r n T y p e . g e t P a r a m e t e r T y p e ( ) ) ;  
         }  
  
         @ O v e r r i d e  
         p u b l i c   v o i d   h a n d l e R e t u r n V a l u e ( @ N u l l a b l e   O b j e c t   r e t u r n V a l u e ,   M e t h o d P a r a m e t e r   r e t u r n T y p e ,  
                                                                     M o d e l A n d V i e w C o n t a i n e r   m a v C o n t a i n e r ,  
                                                                     H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )   t h r o w s   E x c e p t i o n   {  
  
                 i f   ( r e t u r n V a l u e   = =   n u l l )   {  
                         r e t u r n ;  
                 }   e l s e   i f   ( r e t u r n V a l u e   i n s t a n c e o f   M o d e l )   {  
                         m a v C o n t a i n e r . g e t M o d e l ( ) . a d d A l l A t t r i b u t e s ( ( ( M o d e l )   r e t u r n V a l u e ) . a s M a p ( ) ) ;  
                 }   e l s e   {  
                         / /   s h o u l d   n o t   h a p p e n  
                         t h r o w   n e w   U n s u p p o r t e d O p e r a t i o n E x c e p t i o n ( " U n e x p e c t e d   r e t u r n   t y p e :   "   +  
                                         r e t u r n T y p e . g e t P a r a m e t e r T y p e ( ) . g e t N a m e ( )   +   "   i n   m e t h o d :   "   +   r e t u r n T y p e . g e t M e t h o d ( ) ) ;  
                 }  
         }  
 }  
 ` ` `  
  
 ` ` `  
 p u b l i c   c l a s s   M a p M e t h o d R e t u r n V a l u e H a n d l e r   i m p l e m e n t s   H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r   {  
         @ O v e r r i d e  
         p u b l i c   b o o l e a n   s u p p o r t s R e t u r n T y p e ( M e t h o d P a r a m e t e r   r e t u r n T y p e )   {  
                 r e t u r n   M a p . c l a s s . i s A s s i g n a b l e F r o m ( r e t u r n T y p e . g e t P a r a m e t e r T y p e ( ) ) ;  
         }  
  
         @ O v e r r i d e  
         @ S u p p r e s s W a r n i n g s ( " u n c h e c k e d " )  
         p u b l i c   v o i d   h a n d l e R e t u r n V a l u e ( @ N u l l a b l e   O b j e c t   r e t u r n V a l u e ,   M e t h o d P a r a m e t e r   r e t u r n T y p e ,  
                                                                     M o d e l A n d V i e w C o n t a i n e r   m a v C o n t a i n e r ,  
                                                                     H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )   t h r o w s   E x c e p t i o n   {  
  
                 i f   ( r e t u r n V a l u e   i n s t a n c e o f   M a p )   {  
                         m a v C o n t a i n e r . g e t M o d e l ( ) . a d d A l l A t t r i b u t e s ( ( M a p )   r e t u r n V a l u e ) ;  
                 }   e l s e   i f   ( r e t u r n V a l u e   ! =   n u l l )   {  
                         / /   s h o u l d   n o t   h a p p e n  
                         t h r o w   n e w   U n s u p p o r t e d O p e r a t i o n E x c e p t i o n ( " U n e x p e c t e d   r e t u r n   t y p e :   "   +  
                                         r e t u r n T y p e . g e t P a r a m e t e r T y p e ( ) . g e t N a m e ( )   +   "   i n   m e t h o d :   "   +   r e t u r n T y p e . g e t M e t h o d ( ) ) ;  
                 }  
         }  
 }  
  
 ` ` `  
 (W
N N�{b�N�]�~�0R` M o d e l A n d V i e w C o n t a i n e r ` ��[/f N*NM o d e l A n d V i e w �v�[hV��k*N��Bl��O�e�^ N*N�[a�� 
 �[O/�zte*NH a n d l e r gbL�MR�v�Spe㉐g0gbL��N�Sԏ�V<PYt�ُ$N*N{|�v�[�s;N����/f\H a n d l e r �vԏ�V<P�m�R0RM o d e l -N� 
 (u�NTb��g�^` M o d e A n d V i e w ` �[a��N�S�[�s2n�g 
  
 # # # # #   V i e w N a m e M e t h o d R e t u r n V a l u e H a n d l e r 0V i e w M e t h o d R e t u r n V a l u e H a n d l e r  
 RMb
Nb�$N*NYthV;N���#��v/f` M o d e l A n d V i e w ` -N�vM o d e l �R��cNegb�N���[�s�v/f�#�V i e w �R� 
 1u�N,g�{b�N ���O(u0RV i e w �[a��@b�Nb�N ���HQ�^�NV i e w �v㉐g��S/fN�S�[�s��e�Ob�N�s(W_(u 
  
 ` ` `  
 p u b l i c   i n t e r f a c e   V i e w   {  
 }  
 ` ` `  
  
 �cNegb�Nww/ecH a n d l e r ԏ�VV i e w N a m e �TV i e w �v�[�s 
  
 ` ` `  
 p u b l i c   c l a s s   V i e w N a m e M e t h o d R e t u r n V a l u e H a n d l e r   i m p l e m e n t s   H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r   {  
  
         @ O v e r r i d e  
         p u b l i c   b o o l e a n   s u p p o r t s R e t u r n T y p e ( M e t h o d P a r a m e t e r   r e t u r n T y p e )   {  
                 C l a s s < ? >   p a r a m T y p e   =   r e t u r n T y p e . g e t P a r a m e t e r T y p e ( ) ;  
                 r e t u r n   C h a r S e q u e n c e . c l a s s . i s A s s i g n a b l e F r o m ( p a r a m T y p e ) ;  
         }  
  
         @ O v e r r i d e  
         p u b l i c   v o i d   h a n d l e R e t u r n V a l u e ( @ N u l l a b l e   O b j e c t   r e t u r n V a l u e ,   M e t h o d P a r a m e t e r   r e t u r n T y p e ,  
                                                                     M o d e l A n d V i e w C o n t a i n e r   m a v C o n t a i n e r ,  
                                                                     H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )   t h r o w s   E x c e p t i o n   {  
  
                 i f   ( r e t u r n V a l u e   i n s t a n c e o f   C h a r S e q u e n c e )   {  
                         S t r i n g   v i e w N a m e   =   r e t u r n V a l u e . t o S t r i n g ( ) ;  
                         m a v C o n t a i n e r . s e t V i e w N a m e ( v i e w N a m e ) ;  
                 }   e l s e   i f   ( r e t u r n V a l u e   ! =   n u l l )   {  
                         / /   s h o u l d   n o t   h a p p e n  
                         t h r o w   n e w   U n s u p p o r t e d O p e r a t i o n E x c e p t i o n ( " U n e x p e c t e d   r e t u r n   t y p e :   "   +  
                                         r e t u r n T y p e . g e t P a r a m e t e r T y p e ( ) . g e t N a m e ( )   +   "   i n   m e t h o d :   "   +   r e t u r n T y p e . g e t M e t h o d ( ) ) ;  
                 }  
         }  
 }  
  
 ` ` `  
  
 ` ` `  
 p u b l i c   c l a s s   V i e w M e t h o d R e t u r n V a l u e H a n d l e r   i m p l e m e n t s   H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r   {  
  
         @ O v e r r i d e  
         p u b l i c   b o o l e a n   s u p p o r t s R e t u r n T y p e ( M e t h o d P a r a m e t e r   r e t u r n T y p e )   {  
                 r e t u r n   V i e w . c l a s s . i s A s s i g n a b l e F r o m ( r e t u r n T y p e . g e t P a r a m e t e r T y p e ( ) ) ;  
         }  
  
         @ O v e r r i d e  
         p u b l i c   v o i d   h a n d l e R e t u r n V a l u e ( @ N u l l a b l e   O b j e c t   r e t u r n V a l u e ,   M e t h o d P a r a m e t e r   r e t u r n T y p e ,  
                                                                     M o d e l A n d V i e w C o n t a i n e r   m a v C o n t a i n e r ,  
                                                                     H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )   t h r o w s   E x c e p t i o n   {  
  
                 i f   ( r e t u r n V a l u e   i n s t a n c e o f   V i e w )   {  
                         V i e w   v i e w   =   ( V i e w )   r e t u r n V a l u e ;  
                         m a v C o n t a i n e r . s e t V i e w ( v i e w ) ;  
                 }   e l s e   i f   ( r e t u r n V a l u e   ! =   n u l l )   {  
                         / /   s h o u l d   n o t   h a p p e n  
                         t h r o w   n e w   U n s u p p o r t e d O p e r a t i o n E x c e p t i o n ( " U n e x p e c t e d   r e t u r n   t y p e :   "   +  
                                         r e t u r n T y p e . g e t P a r a m e t e r T y p e ( ) . g e t N a m e ( )   +   "   i n   m e t h o d :   "   +   r e t u r n T y p e . g e t M e t h o d ( ) ) ;  
                 }  
         }  
  
 }  
 ` ` `  
 ` V i e w N a m e M e t h o d R e t u r n V a l u e H a n d l e r ` ��Y�gԏ�V<P/fS t r i n g ���HN�bُ*Nԏ�V<PS_ZP/fƉ�V�vTW[�>eeQ0R` M o d e l A n d V i e w C o n t a i n e r ` -N 
 ` V i e w M e t h o d R e t u r n V a l u e H a n d l e r ` ��Y�gԏ�V<P/fV i e w �[a����HN�v�c�bƉ�V>eeQ0R` M o d e l A n d V i e w C o n t a i n e r ` -N 
  
 # # # # #   R e s p o n s e B o d y M e t h o d R e t u r n V a l u e H a n d l e r  
 S_�e�lb�C o n t r o l l e r ���l�` @ R e s p o n s e B o d y ` h�l�e�ԏ�V<P �����l�bcbJ S O N W[&{2N���Q 
  
 �[IN�l�` @ R e s p o n s e B o d y `  
  
 ` ` `  
 @ T a r g e t ( { E l e m e n t T y p e . T Y P E ,   E l e m e n t T y p e . M E T H O D } )  
 @ R e t e n t i o n ( R e t e n t i o n P o l i c y . R U N T I M E )  
 @ D o c u m e n t e d  
 p u b l i c   @ i n t e r f a c e   R e s p o n s e B o d y   {  
 }  
 ` ` `  
  
 ` ` `  
 p u b l i c   c l a s s   R e s p o n s e B o d y M e t h o d R e t u r n V a l u e H a n d l e r   i m p l e m e n t s   H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r   {  
         @ O v e r r i d e  
         p u b l i c   b o o l e a n   s u p p o r t s R e t u r n T y p e ( M e t h o d P a r a m e t e r   r e t u r n T y p e )   {  
                 r e t u r n   ( A n n o t a t e d E l e m e n t U t i l s . h a s A n n o t a t i o n ( r e t u r n T y p e . g e t C o n t a i n i n g C l a s s ( ) ,   R e s p o n s e B o d y . c l a s s )   | |  
                                 r e t u r n T y p e . h a s M e t h o d A n n o t a t i o n ( R e s p o n s e B o d y . c l a s s ) ) ;  
         }  
  
         @ O v e r r i d e  
         p u b l i c   v o i d   h a n d l e R e t u r n V a l u e ( @ N u l l a b l e   O b j e c t   r e t u r n V a l u e ,   M e t h o d P a r a m e t e r   r e t u r n T y p e ,  
                                                                     M o d e l A n d V i e w C o n t a i n e r   m a v C o n t a i n e r ,  
                                                                     H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )  
                         t h r o w s   I O E x c e p t i o n   {  
                 / / h��,g!k��Bl�]�~Yt�[b 
                 m a v C o n t a i n e r . s e t R e q u e s t H a n d l e d ( t r u e ) ;  
  
                 o u t P u t M e s s a g e ( r e s p o n s e ,   J S O N . t o J S O N S t r i n g ( r e t u r n V a l u e ) ) ;  
         }  
  
         p r i v a t e   v o i d   o u t P u t M e s s a g e ( H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,   S t r i n g   m e s s a g e )   t h r o w s   I O E x c e p t i o n   {  
                 t r y   ( P r i n t W r i t e r   o u t   =   r e s p o n s e . g e t W r i t e r ( ) )   {  
                         o u t . w r i t e ( m e s s a g e ) ;  
                 }  
         }  
  
 }  
 ` ` `  
 1 .   ` m a v C o n t a i n e r . s e t R e q u e s t H a n d l e d ( t r u e ) ; ` h���QS_MR��Bl�]�~Yt�[b�T�~�v2n�g�e �(WgbL� 
 2 .   O(uf a s t J s o n �bԏ�V<Pl�bcbJ S O N W[&{2N��QO(ur e s p o n s e ���Q�~MR�z 
  
 # # # # #   H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r C o m p o s i t e  
  
 N�Spe㉐ghV N7h�ُ̑_N ��� N*Nԏ�V<PYthV�vZ�T{| 
  
 ` ` `  
 p u b l i c   c l a s s   H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r C o m p o s i t e   i m p l e m e n t s   H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r   {  
         p r i v a t e   L i s t < H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r >   r e t u r n V a l u e H a n d l e r s   =   n e w   A r r a y L i s t < > ( ) ;  
  
         @ O v e r r i d e  
         p u b l i c   b o o l e a n   s u p p o r t s R e t u r n T y p e ( M e t h o d P a r a m e t e r   r e t u r n T y p e )   {  
                 r e t u r n   t r u e ;  
         }  
  
         @ O v e r r i d e  
         p u b l i c   v o i d   h a n d l e R e t u r n V a l u e ( O b j e c t   r e t u r n V a l u e ,   M e t h o d P a r a m e t e r   r e t u r n T y p e ,   M o d e l A n d V i e w C o n t a i n e r   m a v C o n t a i n e r ,  
                                                                     H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )   t h r o w s   E x c e p t i o n   {  
                 f o r   ( H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r   h a n d l e r   :   r e t u r n V a l u e H a n d l e r s )   {  
                         i f   ( h a n d l e r . s u p p o r t s R e t u r n T y p e ( r e t u r n T y p e ) )   {  
                                 h a n d l e r . h a n d l e R e t u r n V a l u e ( r e t u r n V a l u e ,   r e t u r n T y p e ,   m a v C o n t a i n e r ,   r e q u e s t ,   r e s p o n s e ) ;  
                                 r e t u r n ;  
                         }  
                 }  
                 t h r o w   n e w   I l l e g a l A r g u m e n t E x c e p t i o n ( " U n s u p p o r t e d   p a r a m e t e r   t y p e   [ "   +  
                                 r e t u r n T y p e . g e t P a r a m e t e r T y p e ( ) . g e t N a m e ( )   +   " ] .   s u p p o r t s P a r a m e t e r   s h o u l d   b e   c a l l e d   f i r s t . " ) ;  
         }  
  
         p u b l i c   v o i d   c l e a r ( )   {  
                 t h i s . r e t u r n V a l u e H a n d l e r s . c l e a r ( ) ;  
         }  
  
         p u b l i c   v o i d   a d d R e t u r n V a l u e H a n d l e r ( H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r . . .   h a n d l e r s )   {  
                 C o l l e c t i o n s . a d d A l l ( t h i s . r e t u r n V a l u e H a n d l e r s ,   h a n d l e r s ) ;  
         }  
 }  
  
 ` ` `  
  
 # # # #   USCQKmՋ 
 0Rdk@b	g�v _�S�]\O���]�[b��c@w�~�~b�N�vUSCQKmՋ 
 ��KmՋُ5 �yYthV/f&Tck8^�]\O�b�N ����^ N*N` T e s t R e t u r n V a l u e C o n t r o l l e r `  
  
 ` ` `  
 p u b l i c   c l a s s   T e s t R e t u r n V a l u e C o n t r o l l e r   {  
  
         @ R e s p o n s e B o d y  
         p u b l i c   U s e r V o   t e s t R e s p o n s e B o d y ( )   {  
                 U s e r V o   u s e r V o   =   n e w   U s e r V o ( ) ;  
                 u s e r V o . s e t B i r t h d a y ( n e w   D a t e ( ) ) ;  
                 u s e r V o . s e t A g e ( 2 0 ) ;  
                 u s e r V o . s e t N a m e ( " S i l e n t l y 9 5 2 7 " ) ;  
                 r e t u r n   u s e r V o ;  
         }  
  
         p u b l i c   S t r i n g   t e s t V i e w N a m e ( )   {  
                 r e t u r n   " / j s p / i n d e x . j s p " ;  
         }  
  
         p u b l i c   V i e w   t e s t V i e w ( )   {  
                 r e t u r n   n e w   V i e w ( )   {  
                 } ;  
         }  
  
         p u b l i c   M o d e l   t e s t M o d e l ( M o d e l   m o d e l )   {  
                 m o d e l . a d d A t t r i b u t e ( " t e s t M o d e l " ,   " S i l e n t l y 9 5 2 7 " ) ;  
                 r e t u r n   m o d e l ;  
         }  
  
         p u b l i c   M a p < S t r i n g ,   O b j e c t >   t e s t M a p ( )   {  
                 M a p < S t r i n g ,   O b j e c t >   p a r a m s   =   n e w   H a s h M a p < > ( ) ;  
                 p a r a m s . p u t ( " t e s t M a p " ,   " S i l e n t l y 9 5 2 7 " ) ;  
                 r e t u r n   p a r a m s ;  
         }  
  
 }  
 ` ` `  
  
 (WR�^USCQKmՋ{|KNMR�b�NHQww` M e t h o d P a r a m e t e r ` -N�v N*N�g ��e�l 
  
 ` ` `  
 / * *  
   *   C r e a t e   a   n e w   { @ c o d e   M e t h o d P a r a m e t e r }   f o r   t h e   g i v e n   m e t h o d ,   w i t h   n e s t i n g   l e v e l   1 .  
   *   @ p a r a m   m e t h o d   t h e   M e t h o d   t o   s p e c i f y   a   p a r a m e t e r   f o r  
   *   @ p a r a m   p a r a m e t e r I n d e x   t h e   i n d e x   o f   t h e   p a r a m e t e r :   - 1   f o r   t h e   m e t h o d  
   *   r e t u r n   t y p e ;   0   f o r   t h e   f i r s t   m e t h o d   p a r a m e t e r ;   1   f o r   t h e   s e c o n d   m e t h o d  
   *   p a r a m e t e r ,   e t c .  
   * /  
 p u b l i c   M e t h o d P a r a m e t e r ( M e t h o d   m e t h o d ,   i n t   p a r a m e t e r I n d e x )   {  
 	 t h i s ( m e t h o d ,   p a r a m e t e r I n d e x ,   1 ) ;  
 }  
 ` ` `  
 �N�g ��e�l�v�lʑb�S�N�N�0R�S_` p a r a m e t e r I n d e x ` I{�N- 1 �v�eP�h�:y�g ��e�lԏ�V<P�v` M e t h o d P a r a m e t e r ` � 
  
 USCQKmՋ{|�YN� 
  
 ` ` `  
 @ T e s t  
 p u b l i c   v o i d   t e s t ( )   t h r o w s   E x c e p t i o n   {  
         H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r C o m p o s i t e   c o m p o s i t e   =   n e w   H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r C o m p o s i t e ( ) ;  
         c o m p o s i t e . a d d R e t u r n V a l u e H a n d l e r ( n e w   M o d e l M e t h o d R e t u r n V a l u e H a n d l e r ( ) ) ;  
         c o m p o s i t e . a d d R e t u r n V a l u e H a n d l e r ( n e w   M a p M e t h o d R e t u r n V a l u e H a n d l e r ( ) ) ;  
         c o m p o s i t e . a d d R e t u r n V a l u e H a n d l e r ( n e w   R e s p o n s e B o d y M e t h o d R e t u r n V a l u e H a n d l e r ( ) ) ;  
         c o m p o s i t e . a d d R e t u r n V a l u e H a n d l e r ( n e w   V i e w M e t h o d R e t u r n V a l u e H a n d l e r ( ) ) ;  
         c o m p o s i t e . a d d R e t u r n V a l u e H a n d l e r ( n e w   V i e w N a m e M e t h o d R e t u r n V a l u e H a n d l e r ( ) ) ;  
  
         M o d e l A n d V i e w C o n t a i n e r   m v C o n t a i n e r   =   n e w   M o d e l A n d V i e w C o n t a i n e r ( ) ;  
         T e s t R e t u r n V a l u e C o n t r o l l e r   c o n t r o l l e r   =   n e w   T e s t R e t u r n V a l u e C o n t r o l l e r ( ) ;  
  
         / / KmՋ�e�lt e s t V i e w N a m e  
         M e t h o d   v i e w N a m e M e t h o d   =   c o n t r o l l e r . g e t C l a s s ( ) . g e t M e t h o d ( " t e s t V i e w N a m e " ) ;  
         M e t h o d P a r a m e t e r   v i e w N a m e M e t h o d P a r a m e t e r   =   n e w   M e t h o d P a r a m e t e r ( v i e w N a m e M e t h o d ,   - 1 ) ;   / / �S�_ԏ�V<P�vM e t h o d P a r a m e t e r  
         c o m p o s i t e . h a n d l e R e t u r n V a l u e ( c o n t r o l l e r . t e s t V i e w N a m e ( ) ,   v i e w N a m e M e t h o d P a r a m e t e r ,   m v C o n t a i n e r ,   n u l l ,   n u l l ) ;  
         A s s e r t . a s s e r t E q u a l s ( m v C o n t a i n e r . g e t V i e w N a m e ( ) ,   " / j s p / i n d e x . j s p " ) ;  
  
         / / KmՋ�e�lt e s t V i e w  
         M e t h o d   v i e w M e t h o d   =   c o n t r o l l e r . g e t C l a s s ( ) . g e t M e t h o d ( " t e s t V i e w " ) ;  
         M e t h o d P a r a m e t e r   v i e w M e t h o d P a r a m e t e r   =   n e w   M e t h o d P a r a m e t e r ( v i e w M e t h o d ,   - 1 ) ;  
         c o m p o s i t e . h a n d l e R e t u r n V a l u e ( c o n t r o l l e r . t e s t V i e w ( ) ,   v i e w M e t h o d P a r a m e t e r ,   m v C o n t a i n e r ,   n u l l ,   n u l l ) ;  
         A s s e r t . a s s e r t T r u e ( m v C o n t a i n e r . g e t V i e w ( )   i n s t a n c e o f   V i e w ) ;  
  
         / / KmՋ�e�lt e s t R e s p o n s e B o d y  
         M e t h o d   r e s p o n s e B o d y M e t h o d   =   c o n t r o l l e r . g e t C l a s s ( ) . g e t M e t h o d ( " t e s t R e s p o n s e B o d y " ) ;  
         M e t h o d P a r a m e t e r   r e s B o d y M e t h o d P a r a m e t e r   =   n e w   M e t h o d P a r a m e t e r ( r e s p o n s e B o d y M e t h o d ,   - 1 ) ;  
         M o c k H t t p S e r v l e t R e s p o n s e   r e s p o n s e   =   n e w   M o c k H t t p S e r v l e t R e s p o n s e ( ) ;  
         c o m p o s i t e . h a n d l e R e t u r n V a l u e ( c o n t r o l l e r . t e s t R e s p o n s e B o d y ( ) ,   r e s B o d y M e t h o d P a r a m e t e r ,   m v C o n t a i n e r ,   n u l l ,   r e s p o n s e ) ;  
         S y s t e m . o u t . p r i n t l n ( r e s p o n s e . g e t C o n t e n t A s S t r i n g ( ) ) ;   / / SbpS�QC o n t r o l l e r -Nԏ�V�vJ S O N W[&{2N 
  
         / / KmՋ�e�lt e s t M o d e l  
         M e t h o d   m o d e l M e t h o d   =   c o n t r o l l e r . g e t C l a s s ( ) . g e t M e t h o d ( " t e s t M o d e l " ,   M o d e l . c l a s s ) ;  
         M e t h o d P a r a m e t e r   m o d e l M e t h o d P a r a m e t e r   =   n e w   M e t h o d P a r a m e t e r ( m o d e l M e t h o d ,   - 1 ) ;  
         c o m p o s i t e . h a n d l e R e t u r n V a l u e ( c o n t r o l l e r . t e s t M o d e l ( m v C o n t a i n e r . g e t M o d e l ( ) ) ,   m o d e l M e t h o d P a r a m e t e r ,   m v C o n t a i n e r ,   n u l l ,   n u l l ) ;  
         A s s e r t . a s s e r t E q u a l s ( m v C o n t a i n e r . g e t M o d e l ( ) . g e t A t t r i b u t e ( " t e s t M o d e l " ) ,   " S i l e n t l y 9 5 2 7 " ) ;  
  
         / / KmՋ�e�lt e s t M a p  
         M e t h o d   m a p M e t h o d   =   c o n t r o l l e r . g e t C l a s s ( ) . g e t M e t h o d ( " t e s t M a p " ) ;  
         M e t h o d P a r a m e t e r   m a p M e t h o d P a r a m e t e r   =   n e w   M e t h o d P a r a m e t e r ( m a p M e t h o d ,   - 1 ) ;  
         c o m p o s i t e . h a n d l e R e t u r n V a l u e ( c o n t r o l l e r . t e s t M a p ( ) ,   m a p M e t h o d P a r a m e t e r ,   m v C o n t a i n e r ,   n u l l ,   n u l l ) ;  
         A s s e r t . a s s e r t E q u a l s ( m v C o n t a i n e r . g e t M o d e l ( ) . g e t A t t r i b u t e ( " t e s t M a p " ) ,   " S i l e n t l y 9 5 2 7 " ) ;  
 }  
 ` ` `  
  
 USCQKmՋ���Q�v�~�g� 
  
 ! [ r e s u l t ] ( h t t p s : / / i m a g e - s t a t i c . s e g m e n t f a u l t . c o m / 3 8 1 / 5 4 2 / 3 8 1 5 4 2 8 5 5 6 - 5 f c c 5 6 d 5 1 b f 2 7 _ a r t i c l e x )  
  
  
 # # # #   ;`�~ 
  
 ,g�{b�N�[b�N5 *N8^(uԏ�V<P�v㉐ghV�/ecH a n d l e r ԏ�V` M a p ` 0`   M o d l e ` 0  ` V i e w ` 0  ` V i e w N a m e ` �N�S��` @ R e s p o n s e B o d y ` h�l� 
 N N��b�N\O _�S` H a n d l e r A d a p t e r ` -NO(u0R�v gT N*N�~�N��[bKNT1\�S�N�b@b	g�v�~�N�~ňw�eg�[bH a n d l e r �v�(uǏz 
  
 # # # #   �^U\ 
 'Y�[�S�N�[�^�v�SwwS p r i n g M V C -N` H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r ` �v�[�s{|��N�S p r i n g M V C /ec�T�Nԏ�V<PYt