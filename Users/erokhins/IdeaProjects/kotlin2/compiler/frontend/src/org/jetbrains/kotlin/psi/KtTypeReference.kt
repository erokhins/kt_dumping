'super' @ [33:34] ==> public constructor KtModifierListOwnerStub<T : (StubElement<*>..StubElement<*>?)>(node: (ASTNode..ASTNode?)) defined in org.jetbrains.kotlin.psi.KtModifierListOwnerStub[JavaClassConstructorDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> KotlinPlaceHolderStub<KtTypeReference>

'node' @ [33:40] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.psi.KtTypeReference.<init>[ValueParameterDescriptorImpl]

'super' @ [35:65] ==> public constructor KtModifierListOwnerStub<T : (StubElement<*>..StubElement<*>?)>(stub: (KotlinPlaceHolderStub<KtTypeReference>..KotlinPlaceHolderStub<KtTypeReference>?), nodeType: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in org.jetbrains.kotlin.psi.KtModifierListOwnerStub[JavaClassConstructorDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> KotlinPlaceHolderStub<KtTypeReference>

'stub' @ [35:71] ==> value-parameter stub: KotlinPlaceHolderStub<KtTypeReference> defined in org.jetbrains.kotlin.psi.KtTypeReference.<init>[ValueParameterDescriptorImpl]

'TYPE_REFERENCE' @ [35:96] ==> public final val TYPE_REFERENCE: (KtPlaceHolderStubElementType<(KtTypeReference..KtTypeReference?)>..KtPlaceHolderStubElementType<(KtTypeReference..KtTypeReference?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'visitor' @ [38:16] ==> value-parameter visitor: KtVisitor<R, D> defined in org.jetbrains.kotlin.psi.KtTypeReference.accept[ValueParameterDescriptorImpl]

'visitTypeReference' @ [38:24] ==> public open fun visitTypeReference(@NotNull typeReference: KtTypeReference, data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.psi.KtVisitor[JavaMethodDescriptor]

'this' @ [38:43] ==> <this> defined in org.jetbrains.kotlin.psi.KtTypeReference[LazyClassReceiverParameterDescriptor]

'data' @ [38:49] ==> value-parameter data: D defined in org.jetbrains.kotlin.psi.KtTypeReference.accept[ValueParameterDescriptorImpl]

'getStubOrPsiChild' @ [42:34] ==> @Nullable public open fun <T : (KtElement..KtElement?)> getStubOrPsiChild(@NotNull element: KtElementImplStub<*>, @NotNull types: TokenSet, @NotNull factory: ArrayFactory<(KtTypeElement..KtTypeElement?)>): KtTypeElement? defined in org.jetbrains.kotlin.psi.KtStubbedPsiUtil[JavaMethodDescriptor]
Inferred types:
    <T : (KtElement..KtElement?)> -> (org.jetbrains.kotlin.psi.KtTypeElement..org.jetbrains.kotlin.psi.KtTypeElement?)

'this' @ [42:52] ==> <this> defined in org.jetbrains.kotlin.psi.KtTypeReference[LazyClassReceiverParameterDescriptor]

'TYPE_ELEMENT_TYPES' @ [42:77] ==> public final val TYPE_ELEMENT_TYPES: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'ARRAY_FACTORY' @ [42:111] ==> public final val ARRAY_FACTORY: (ArrayFactory<(KtTypeElement..KtTypeElement?)>..ArrayFactory<(KtTypeElement..KtTypeElement?)>?) defined in org.jetbrains.kotlin.psi.KtTypeElement[JavaPropertyDescriptor]

'modifierList' @ [45:16] ==> public final val KtTypeReference.modifierList: KtModifierList?[MyPropertyDescriptor]

'annotations' @ [45:30] ==> public final val KtModifierList.annotations: (MutableList<(KtAnnotation..KtAnnotation?)>..List<(KtAnnotation..KtAnnotation?)>)[MyPropertyDescriptor]

'orEmpty' @ [45:42] ==> @InlineOnly public inline fun <T> List<(KtAnnotation..KtAnnotation?)>?.orEmpty(): List<(KtAnnotation..KtAnnotation?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotation..org.jetbrains.kotlin.psi.KtAnnotation?)

'modifierList' @ [49:16] ==> public final val KtTypeReference.modifierList: KtModifierList?[MyPropertyDescriptor]

'annotationEntries' @ [49:30] ==> public final val KtModifierList.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'orEmpty' @ [49:48] ==> @InlineOnly public inline fun <T> List<(KtAnnotationEntry..KtAnnotationEntry?)>?.orEmpty(): List<(KtAnnotationEntry..KtAnnotationEntry?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'findChildByType' @ [53:16] ==> @Nullable protected/*protected and package*/ open fun <T : (PsiElement..PsiElement?)> findChildByType(p0: (IElementType..IElementType?)): PsiElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiElement

'LPAR' @ [53:53] ==> public final val LPAR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'findChildByType' @ [53:70] ==> @Nullable protected/*protected and package*/ open fun <T : (PsiElement..PsiElement?)> findChildByType(p0: (IElementType..IElementType?)): PsiElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiElement

'RPAR' @ [53:107] ==> public final val RPAR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

