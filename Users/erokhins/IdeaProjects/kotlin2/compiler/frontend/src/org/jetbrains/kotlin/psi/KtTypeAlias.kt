'super' @ [29:34] ==> public constructor KtTypeParameterListOwnerStub<T : (KotlinStubWithFqName<*>..KotlinStubWithFqName<*>?)>(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtTypeParameterListOwnerStub[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KotlinStubWithFqName<*>..KotlinStubWithFqName<*>?)> -> KotlinTypeAliasStub

'node' @ [29:40] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.psi.KtTypeAlias.<init>[ValueParameterDescriptorImpl]

'super' @ [30:46] ==> public constructor KtTypeParameterListOwnerStub<T : (KotlinStubWithFqName<*>..KotlinStubWithFqName<*>?)>(@NotNull stub: KotlinTypeAliasStub, @NotNull nodeType: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>)) defined in org.jetbrains.kotlin.psi.KtTypeParameterListOwnerStub[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KotlinStubWithFqName<*>..KotlinStubWithFqName<*>?)> -> KotlinTypeAliasStub

'stub' @ [30:52] ==> value-parameter stub: KotlinTypeAliasStub defined in org.jetbrains.kotlin.psi.KtTypeAlias.<init>[ValueParameterDescriptorImpl]

'TYPEALIAS' @ [30:77] ==> public final val TYPEALIAS: (KtTypeAliasElementType..KtTypeAliasElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'visitor' @ [33:13] ==> value-parameter visitor: KtVisitor<R, D> defined in org.jetbrains.kotlin.psi.KtTypeAlias.accept[ValueParameterDescriptorImpl]

'visitTypeAlias' @ [33:21] ==> public open fun visitTypeAlias(@NotNull typeAlias: KtTypeAlias, data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.psi.KtVisitor[JavaMethodDescriptor]

'this' @ [33:36] ==> <this> defined in org.jetbrains.kotlin.psi.KtTypeAlias[LazyClassReceiverParameterDescriptor]

'data' @ [33:42] ==> value-parameter data: D defined in org.jetbrains.kotlin.psi.KtTypeAlias.accept[ValueParameterDescriptorImpl]

'stub' @ [36:13] ==> public final val KtTypeAlias.stub: KotlinTypeAliasStub?[MyPropertyDescriptor]

'isTopLevel' @ [36:19] ==> public abstract fun isTopLevel(): Boolean defined in org.jetbrains.kotlin.psi.stubs.KotlinTypeAliasStub[SimpleFunctionDescriptorImpl]

'parent' @ [36:35] ==> public final val KtTypeAlias.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'IfNotParsed' @ [38:5] ==> public constructor IfNotParsed() defined in org.jetbrains.kotlin.psi.IfNotParsed[JavaClassConstructorDescriptor]

'findChildByType' @ [40:13] ==> @Nullable protected/*protected and package*/ open fun <T : (PsiElement..PsiElement?)> findChildByType(p0: (IElementType..IElementType?)): PsiElement? defined in org.jetbrains.kotlin.psi.KtTypeAlias[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'TYPE_ALIAS_KEYWORD' @ [40:38] ==> public final val TYPE_ALIAS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'IfNotParsed' @ [42:5] ==> public constructor IfNotParsed() defined in org.jetbrains.kotlin.psi.IfNotParsed[JavaClassConstructorDescriptor]

'if (stub != null) {
            val typeReferences = getStubOrPsiChildrenAsList<KtTypeReference, KotlinPlaceHolderStub<KtTypeReference>>(KtStubElementTypes.TYPE_REFERENCE)
            typeReferences[0]
        }
        else {
            findChildByType(KtNodeTypes.TYPE_REFERENCE)
        }' @ [44:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtTypeReference?, elseBranch: KtTypeReference?): KtTypeReference?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtTypeReference?

'stub' @ [44:20] ==> public final val KtTypeAlias.stub: KotlinTypeAliasStub?[MyPropertyDescriptor]

'getStubOrPsiChildrenAsList' @ [45:34] ==> @NotNull protected/*protected and package*/ open fun <PsiT : (KtElementImplStub<*>..KtElementImplStub<*>?), StubT : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> getStubOrPsiChildrenAsList(@NotNull elementType: KtStubElementType<(KotlinPlaceHolderStub<KtTypeReference>..KotlinPlaceHolderStub<KtTypeReference>?), (KtTypeReference..KtTypeReference?)>): (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>) defined in org.jetbrains.kotlin.psi.KtTypeAlias[JavaMethodDescriptor]
Inferred types:
    <PsiT : (KtElementImplStub<*>..KtElementImplStub<*>?)> -> KtTypeReference
    <StubT : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> -> KotlinPlaceHolderStub<KtTypeReference>

'TYPE_REFERENCE' @ [45:137] ==> public final val TYPE_REFERENCE: (KtPlaceHolderStubElementType<(KtTypeReference..KtTypeReference?)>..KtPlaceHolderStubElementType<(KtTypeReference..KtTypeReference?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'typeReferences' @ [46:13] ==> val typeReferences: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>) defined in org.jetbrains.kotlin.psi.KtTypeAlias.getTypeReference[LocalVariableDescriptor]

'findChildByType' @ [49:13] ==> @Nullable protected/*protected and package*/ open fun <T : (PsiElement..PsiElement?)> findChildByType(p0: (IElementType..IElementType?)): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtTypeAlias[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)

'TYPE_REFERENCE' @ [49:41] ==> public final val TYPE_REFERENCE: (IElementType..IElementType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'getItemPresentation' @ [53:64] ==> @Nullable public open fun getItemPresentation(@NotNull p0: NavigationItem): ItemPresentation? defined in com.intellij.navigation.ItemPresentationProviders[JavaMethodDescriptor]

'this' @ [53:84] ==> <this> defined in org.jetbrains.kotlin.psi.KtTypeAlias[LazyClassReceiverParameterDescriptor]

