,g�{b�Neg�[b` H a n d l e r A d a p t e r ` �v�[�s{|` R e q u e s t M a p p i n g H a n d l e r A d a p t e r ` �ُ_N/f` H a n d l e r A d p a t e r ` �v gT N��0HQww{|�V 
  
 ! [ U M L ] ( h t t p s : / / i m a g e - s t a t i c . s e g m e n t f a u l t . c o m / 1 1 8 / 1 9 8 / 1 1 8 1 9 8 1 7 5 8 - 5 f c f 8 5 8 8 e 5 f 6 0 _ a r t i c l e x )  
  
 ` R e q u e s t M a p p i n g H a n d l e r A d a p t e r ` ,g��(WS p r i n g M V C -N`S	g͑���v0WMO�}�6q�[�S/f` H a n d l e r A d a p t e r ` �v N�y�[�s� 
 FO/f�[/fO(u gY�v N*N�[�s{|�;N��(u�N\�g*N��Bl�M��~` @ R e q u e s t M a p p i n g ` {|�W�vH a n d l e r Yt 
  
  
 # # # #    _�Sek����� 
  
 # # # # #   H a n d l e r A d a p t e r  
  
 ` ` `  
 p u b l i c   i n t e r f a c e   H a n d l e r A d a p t e r   {  
         M o d e l A n d V i e w   h a n d l e ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,  
                                                 H a n d l e r M e t h o d   h a n d l e r )   t h r o w s   E x c e p t i o n ;  
 }  
 ` ` `  
  
 勥c�Sb�N�S�[IN�N N*Nh a n d l e �e�l�FO/f(WS p r i n g M V C -N؏	g N*N` s u p p o r t s ` �e�l�RMbb�N_N�Ǐ(WS p r i n g M V C -N` H a n d l e r A d a p t e r ` 	gY*N�[�s� 
 ُ_N/f N*NV{eu!j_�@b�N ���ُ N*N` s u p p o r t s ` �e�l�(Wb�N _�S�vS m a r t M V C -N�SSb�{ZP N*N�[�s�@b�N�S�� N*Nh a n d l e �e�l1\��Y�N0 
  
 b�N�S�Nw0Rԏ�V<P/f N*N` M o d e l A n d V i e w ` �[a��h�:ygbL�h a n d l e �e�lKNT ����b�c6RhV-N�v�e�lԏ�V<P ���\ňb` M o d e l A n d V i e w ` �[a�� 
 @b�Nُ̑�S�Nw�Q(WH a n d l e r A d a p t e r -NOO(u0Rb�NKNMR _�SǏ�vԏ�V<PYt0�cNegb�NwN` M o d e A n d V i e w ` �v�[IN 
  
 # # # # #   M o d e l A n d V i e w  
  
 ` ` `  
 p u b l i c   c l a s s   M o d e l A n d V i e w   {  
         p r i v a t e   O b j e c t   v i e w ;  
         p r i v a t e   M o d e l   m o d e l ;  
         p r i v a t e   H t t p S t a t u s   s t a t u s ;  
  
         p u b l i c   v o i d   s e t V i e w N a m e ( S t r i n g   v i e w N a m e )   {  
                 t h i s . v i e w   =   v i e w N a m e ;  
         }  
  
         p u b l i c   S t r i n g   g e t V i e w N a m e ( )   {  
                 r e t u r n   ( t h i s . v i e w   i n s t a n c e o f   S t r i n g   ?   ( S t r i n g )   t h i s . v i e w   :   n u l l ) ;  
         }  
  
         / / weug e t t e r   s e t t e r  
 }  
  
 ` ` `  
  
 # # # # #   R e q u e s t M a p p i n g H a n d l e r A d a p t e r  
  
 ` ` `  
 p u b l i c   c l a s s   R e q u e s t M a p p i n g H a n d l e r A d a p t e r   i m p l e m e n t s   H a n d l e r A d a p t e r ,   I n i t i a l i z i n g B e a n   {  
  
         p r i v a t e   L i s t < H a n d l e r M e t h o d A r g u m e n t R e s o l v e r >   c u s t o m A r g u m e n t R e s o l v e r s ;  
         p r i v a t e   H a n d l e r M e t h o d A r g u m e n t R e s o l v e r C o m p o s i t e   a r g u m e n t R e s o l v e r C o m p o s i t e ;  
  
         p r i v a t e   L i s t < H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r >   c u s t o m R e t u r n V a l u e H a n d l e r s ;  
         p r i v a t e   H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r C o m p o s i t e   r e t u r n V a l u e H a n d l e r C o m p o s i t e ;  
  
         p r i v a t e   C o n v e r s i o n S e r v i c e   c o n v e r s i o n S e r v i c e ;  
  
         @ O v e r r i d e  
         p u b l i c   M o d e l A n d V i e w   h a n d l e ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e ,  
                                                               H a n d l e r M e t h o d   h a n d l e r M e t h o d )   t h r o w s   E x c e p t i o n   {  
  
                 I n v o c a b l e H a n d l e r M e t h o d   i n v o c a b l e M e t h o d   =   c r e a t e I n v o c a b l e H a n d l e r M e t h o d ( h a n d l e r M e t h o d ) ;  
                 M o d e l A n d V i e w C o n t a i n e r   m a v C o n t a i n e r   =   n e w   M o d e l A n d V i e w C o n t a i n e r ( ) ;  
  
                 i n v o c a b l e M e t h o d . i n v o k e A n d H a n d l e ( r e q u e s t ,   r e s p o n s e ,   m a v C o n t a i n e r ) ;  
  
                 r e t u r n   g e t M o d e l A n d V i e w ( m a v C o n t a i n e r ) ;  
         }  
  
         p r i v a t e   M o d e l A n d V i e w   g e t M o d e l A n d V i e w ( M o d e l A n d V i e w C o n t a i n e r   m a v C o n t a i n e r )   {  
                 i f   ( m a v C o n t a i n e r . i s R e q u e s t H a n d l e d ( ) )   {  
                         / / ,g!k��Bl�]�~Yt�[b 
                         r e t u r n   n u l l ;  
                 }  
  
                 M o d e l A n d V i e w   m a v   =   n e w   M o d e l A n d V i e w ( ) ;  
                 m a v . s e t S t a t u s ( m a v C o n t a i n e r . g e t S t a t u s ( ) ) ;  
                 m a v . s e t M o d e l ( m a v C o n t a i n e r . g e t M o d e l ( ) ) ;  
                 m a v . s e t V i e w ( m a v C o n t a i n e r . g e t V i e w ( ) ) ;  
                 r e t u r n   m a v ;  
         }  
  
         p r i v a t e   I n v o c a b l e H a n d l e r M e t h o d   c r e a t e I n v o c a b l e H a n d l e r M e t h o d ( H a n d l e r M e t h o d   h a n d l e r M e t h o d )   {  
                 r e t u r n   n e w   I n v o c a b l e H a n d l e r M e t h o d ( h a n d l e r M e t h o d ,  
                                 t h i s . a r g u m e n t R e s o l v e r C o m p o s i t e ,  
                                 t h i s . r e t u r n V a l u e H a n d l e r C o m p o s i t e ,  
                                 t h i s . c o n v e r s i o n S e r v i c e ) ;  
         }  
  
         @ O v e r r i d e  
         p u b l i c   v o i d   a f t e r P r o p e r t i e s S e t ( )   t h r o w s   E x c e p t i o n   {  
                 A s s e r t . n o t N u l l ( c o n v e r s i o n S e r v i c e ,   " c o n v e r s i o n S e r v i c e   c a n   n o t   n u l l " ) ;  
                 i f   ( O b j e c t s . i s N u l l ( a r g u m e n t R e s o l v e r C o m p o s i t e ) )   {  
                         L i s t < H a n d l e r M e t h o d A r g u m e n t R e s o l v e r >   r e s o l v e r s   =   g e t D e f a u l t A r g u m e n t R e s o l v e r s ( ) ;  
                         t h i s . a r g u m e n t R e s o l v e r C o m p o s i t e   =   n e w   H a n d l e r M e t h o d A r g u m e n t R e s o l v e r C o m p o s i t e ( ) ;  
                         t h i s . a r g u m e n t R e s o l v e r C o m p o s i t e . a d d R e s o l v e r ( r e s o l v e r s ) ;  
                 }  
  
                 i f   ( O b j e c t s . i s N u l l ( r e t u r n V a l u e H a n d l e r C o m p o s i t e ) )   {  
                         L i s t < H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r >   h a n d l e r s   =   g e t D e f a u l t R e t u r n V a l u e H a n d l e r s ( ) ;  
                         t h i s . r e t u r n V a l u e H a n d l e r C o m p o s i t e   =   n e w   H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r C o m p o s i t e ( ) ;  
                         t h i s . r e t u r n V a l u e H a n d l e r C o m p o s i t e . a d d R e t u r n V a l u e H a n d l e r ( h a n d l e r s ) ;  
                 }  
         }  
  
         / * *  
           *   R�YS؞��ԏ�V<PYthV 
           *  
           *   @ r e t u r n  
           * /  
         p r i v a t e   L i s t < H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r >   g e t D e f a u l t R e t u r n V a l u e H a n d l e r s ( )   {  
                 L i s t < H a n d l e r M e t h o d R e t u r n V a l u e H a n d l e r >   h a n d l e r s   =   n e w   A r r a y L i s t < > ( ) ;  
  
                 h a n d l e r s . a d d ( n e w   M a p M e t h o d R e t u r n V a l u e H a n d l e r ( ) ) ;  
                 h a n d l e r s . a d d ( n e w   M o d e l M e t h o d R e t u r n V a l u e H a n d l e r ( ) ) ;  
                 h a n d l e r s . a d d ( n e w   R e s p o n s e B o d y M e t h o d R e t u r n V a l u e H a n d l e r ( ) ) ;  
                 h a n d l e r s . a d d ( n e w   V i e w N a m e M e t h o d R e t u r n V a l u e H a n d l e r ( ) ) ;  
                 h a n d l e r s . a d d ( n e w   V i e w M e t h o d R e t u r n V a l u e H a n d l e r ( ) ) ;  
  
                 i f   ( ! C o l l e c t i o n U t i l s . i s E m p t y ( g e t C u s t o m R e t u r n V a l u e H a n d l e r s ( ) ) )   {  
                         h a n d l e r s . a d d A l l ( g e t D e f a u l t R e t u r n V a l u e H a n d l e r s ( ) ) ;  
                 }  
  
                 r e t u r n   h a n d l e r s ;  
         }  
  
         / * *  
           *   R�YS؞���Spe㉐ghV 
           *  
           *   @ r e t u r n  
           * /  
         p r i v a t e   L i s t < H a n d l e r M e t h o d A r g u m e n t R e s o l v e r >   g e t D e f a u l t A r g u m e n t R e s o l v e r s ( )   {  
                 L i s t < H a n d l e r M e t h o d A r g u m e n t R e s o l v e r >   r e s o l v e r s   =   n e w   A r r a y L i s t < > ( ) ;  
  
                 r e s o l v e r s . a d d ( n e w   M o d e l M e t h o d A r g u m e n t R e s o l v e r ( ) ) ;  
                 r e s o l v e r s . a d d ( n e w   R e q u e s t P a r a m M e t h o d A r g u m e n t R e s o l v e r ( ) ) ;  
                 r e s o l v e r s . a d d ( n e w   R e q u e s t B o d y M e t h o d A r g u m e n t R e s o l v e r ( ) ) ;  
                 r e s o l v e r s . a d d ( n e w   S e r v l e t R e s p o n s e M e t h o d A r g u m e n t R e s o l v e r ( ) ) ;  
                 r e s o l v e r s . a d d ( n e w   S e r v l e t R e q u e s t M e t h o d A r g u m e n t R e s o l v e r ( ) ) ;  
  
                 i f   ( ! C o l l e c t i o n U t i l s . i s E m p t y ( g e t C u s t o m A r g u m e n t R e s o l v e r s ( ) ) )   {  
                         r e s o l v e r s . a d d A l l ( g e t C u s t o m A r g u m e n t R e s o l v e r s ( ) ) ;  
                 }  
  
                 r e t u r n   r e s o l v e r s ;  
         }  
  
         / / weug e t t e r   s e t t e r  
 }  
  
 ` ` `  
  
 1 .   �Q�0RFh�g�vibU\'`�@b�Nُ̑�[IN�N` c u s t o m A r g u m e n t R e s o l v e r s ` 0` c u s t o m R e t u r n V a l u e H a n d l e r s ` $N*N�Sϑ��Y�gS m a r t M V C �c�O�v�Spe㉐ghV�Tԏ�V<PYthVN�n��(u7b�v �Bl�AQ���m�Rꁚ[IN�v�Spe㉐ghV�Tԏ�V<PYthV 
 2 .   (W` R e q u e s t M a p p i n g H a n d l e r A d a p t e r ` �ReQ0Rs p r i n g �[hVKNT ���ZP N�NR�YS�v�]\O�@b�N�[�s�N�c�S` I n i t i a l i z i n g B e a n ` �(W` a f t e r P r o p e r t i e s S e t ` �e�l-Nb�N ����b�|�~؞��/ec�v�Spe㉐ghV�Tԏ�V<PYthV�N�S(u7bꁚ[IN�v Nw��m�R0R�|�~-N0 
 3 .   S_` D i s p a t c h e r S e r v l e t ` Yt(u7b��Bl�v�ePO�(u` H a n d l e r A d a p t e r ` �vh a n d l e �e�l�ُ�ePHQ�Ǐ OeQ` H a n d l e r M e t h o d ` R�^KNMRb�N�]�~ _�S�[b�v�~�N` I n v o c a b l e H a n d l e r M e t h o d ` �6qT�(u` i n v o k e A n d H a n d l e ` gbL��c6RhV�v�e�l 
 4 .   S_gbL��[b�c6RhV�v�e�l�b�N ����Ǐ` M o d e l A n d V i e w C o n t a i n e r ` R�^` M o d e l A n d V i e w ` �[a�ԏ�V 
  
  
 # # # #   USCQKmՋ 
 ,g�{�vUSCQKmՋ�vh1\/f��Y�Ǐ` R e q u e s t M a p p i n g H a n d l e r A d a p t e r ` ��b�R�v�(u0R�c6RhV-N�v�e�lv^Ncknxԏ�V�,g!kUSCQKmՋ1\O(u
N N�{�v�c6RhV{|` T e s t I n v o c a b l e H a n d l e r M e t h o d C o n t r o l l e r ` -N�v�e�l` t e s t V i e w N a m e `  
  
 ` ` `  
 p u b l i c   S t r i n g   t e s t V i e w N a m e ( M o d e l   m o d e l )   {  
         m o d e l . a d d A t t r i b u t e ( " b l o g U R L " ,   " h t t p : / / s i l e n t l y 9 5 2 7 . c n " ) ;  
         r e t u r n   " / s i l e n t l y 9 5 2 7 . j s p " ;  
 }  
 ` ` `  
  
 KmՋ��YckR�v�(u0R�e�l` t e s t V i e w N a m e ` �v^Nԏ�V�v` M o d e l A n d V i e w ` -NS+Tm o d e l S+T��n�v^\'`` b l o g U R L ` �v i e w �v<P/f` / s i l e n t l y 9 5 2 7 . j s p `  
  
 USCQKmՋ�YN� 
  
 ` ` `  
 @ T e s t  
 p u b l i c   v o i d   h a n d l e ( )   t h r o w s   E x c e p t i o n   {  
         T e s t I n v o c a b l e H a n d l e r M e t h o d C o n t r o l l e r   c o n t r o l l e r   =   n e w   T e s t I n v o c a b l e H a n d l e r M e t h o d C o n t r o l l e r ( ) ;  
  
         M e t h o d   m e t h o d   =   c o n t r o l l e r . g e t C l a s s ( ) . g e t M e t h o d ( " t e s t V i e w N a m e " ,   M o d e l . c l a s s ) ;  
         H a n d l e r M e t h o d   h a n d l e r M e t h o d   =   n e w   H a n d l e r M e t h o d ( c o n t r o l l e r ,   m e t h o d ) ;  
  
         M o c k H t t p S e r v l e t R e q u e s t   r e q u e s t   =   n e w   M o c k H t t p S e r v l e t R e q u e s t ( ) ;  
         M o c k H t t p S e r v l e t R e s p o n s e   r e s p o n s e   =   n e w   M o c k H t t p S e r v l e t R e s p o n s e ( ) ;  
  
         D e f a u l t F o r m a t t i n g C o n v e r s i o n S e r v i c e   c o n v e r s i o n S e r v i c e   =   n e w   D e f a u l t F o r m a t t i n g C o n v e r s i o n S e r v i c e ( ) ;  
         D a t e F o r m a t t e r   d a t e F o r m a t t e r   =   n e w   D a t e F o r m a t t e r ( ) ;  
         d a t e F o r m a t t e r . s e t P a t t e r n ( " y y y y - M M - d d   H H : m m : s s " ) ;  
         c o n v e r s i o n S e r v i c e . a d d F o r m a t t e r ( d a t e F o r m a t t e r ) ;  
  
         R e q u e s t M a p p i n g H a n d l e r A d a p t e r   h a n d l e r A d a p t e r   =   n e w   R e q u e s t M a p p i n g H a n d l e r A d a p t e r ( ) ;  
         h a n d l e r A d a p t e r . s e t C o n v e r s i o n S e r v i c e ( c o n v e r s i o n S e r v i c e ) ;  
         h a n d l e r A d a p t e r . a f t e r P r o p e r t i e s S e t ( ) ;  
  
         M o d e l A n d V i e w   m o d e l A n d V i e w   =   h a n d l e r A d a p t e r . h a n d l e ( r e q u e s t ,   r e s p o n s e ,   h a n d l e r M e t h o d ) ;  
  
         S y s t e m . o u t . p r i n t l n ( " m o d e l A n d V i e w : " ) ;  
         S y s t e m . o u t . p r i n t l n ( J S O N . t o J S O N S t r i n g ( m o d e l A n d V i e w ) ) ;  
 }  
  
 ` ` `  
  
 ���Q�v�~�g�YN� 
  
 ! [ r e s u l t ] ( h t t p s : / / i m a g e - s t a t i c . s e g m e n t f a u l t . c o m / 1 0 1 / 6 2 3 / 1 0 1 6 2 3 4 0 1 0 - 5 f c f 8 c 4 8 a e a 9 5 _ a r t i c l e x )  
  
 # # # #   ;`�~ 
 ,g���Ǐ _�S` R e q u e s t M a p p i n g H a n d l e r A d a p t e r ` ��bb�NKNMR _�S�vY*N�~�N���~Tw�eg�N�v^N��Ycknx�v�]\O0 
  
 # # # #   �^U\ 
 S p r i n g M V C -N` H a n d l e r A d a p t e r ` 	gY*N�[�s{|���	gNT�vO(u�e_��` R e q u e s t M a p p i n g H a n d l e r A d a p t e r ` /fO(u gY�v N*N� 
 	gtQ���vTf[�S�NwwvQ�N�v�[�s{|