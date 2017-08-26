'super' @ [30:34] ==> public constructor KtElementImplStub<T : (StubElement<*>..StubElement<*>?)>(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtElementImplStub[JavaClassConstructorDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> KotlinPlaceHolderStub<KtClassBody>

'node' @ [30:40] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.psi.KtClassBody.<init>[ValueParameterDescriptorImpl]

'super' @ [32:61] ==> public constructor KtElementImplStub<T : (StubElement<*>..StubElement<*>?)>(@NotNull stub: KotlinPlaceHolderStub<KtClassBody>, @NotNull nodeType: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>)) defined in org.jetbrains.kotlin.psi.KtElementImplStub[JavaClassConstructorDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> KotlinPlaceHolderStub<KtClassBody>

'stub' @ [32:67] ==> value-parameter stub: KotlinPlaceHolderStub<KtClassBody> defined in org.jetbrains.kotlin.psi.KtClassBody.<init>[ValueParameterDescriptorImpl]

'CLASS_BODY' @ [32:73] ==> public final val CLASS_BODY: (KtPlaceHolderStubElementType<(KtClassBody..KtClassBody?)>..KtPlaceHolderStubElementType<(KtClassBody..KtClassBody?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'parentByStub' @ [34:32] ==> protected/*protected and package*/ for synthetic extension final val KtClassBody.parentByStub: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'asList' @ [36:45] ==> @SafeVarargs public open fun <T : (Any..Any?)> asList(vararg p0: (KtDeclaration..KtDeclaration?)): (MutableList<(KtDeclaration..KtDeclaration?)>..List<(KtDeclaration..KtDeclaration?)>?) defined in java.util.Arrays[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtDeclaration

'getStubOrPsiChildren' @ [36:53] ==> @NotNull public open fun <Psi : (PsiElement..PsiElement?)> getStubOrPsiChildren(@NotNull p0: TokenSet, @NotNull p1: ArrayFactory<(KtDeclaration..KtDeclaration?)>): (Array<(KtDeclaration..KtDeclaration?)>..Array<out (KtDeclaration..KtDeclaration?)>) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]
Inferred types:
    <Psi : (PsiElement..PsiElement?)> -> KtDeclaration

'DECLARATION_TYPES' @ [36:74] ==> public final val DECLARATION_TYPES: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'ARRAY_FACTORY' @ [36:107] ==> public final val ARRAY_FACTORY: (ArrayFactory<(KtDeclaration..KtDeclaration?)>..ArrayFactory<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaPropertyDescriptor]

'visitor' @ [38:69] ==> value-parameter visitor: KtVisitor<R, D> defined in org.jetbrains.kotlin.psi.KtClassBody.accept[ValueParameterDescriptorImpl]

'visitClassBody' @ [38:77] ==> public open fun visitClassBody(@NotNull classBody: KtClassBody, data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.psi.KtVisitor[JavaMethodDescriptor]

'this' @ [38:92] ==> <this> defined in org.jetbrains.kotlin.psi.KtClassBody[LazyClassReceiverParameterDescriptor]

'data' @ [38:98] ==> value-parameter data: D defined in org.jetbrains.kotlin.psi.KtClassBody.accept[ValueParameterDescriptorImpl]

'findChildrenByType' @ [41:17] ==> protected/*protected and package*/ open fun <T : (PsiElement..PsiElement?)> findChildrenByType(p0: (IElementType..IElementType?)): (MutableList<(KtAnonymousInitializer..KtAnonymousInitializer?)>..List<(KtAnonymousInitializer..KtAnonymousInitializer?)>?) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtAnonymousInitializer

'CLASS_INITIALIZER' @ [41:48] ==> public final val CLASS_INITIALIZER: (IElementType..IElementType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'getStubOrPsiChildrenAsList' @ [44:17] ==> @NotNull protected/*protected and package*/ open fun <PsiT : (KtElementImplStub<*>..KtElementImplStub<*>?), StubT : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> getStubOrPsiChildrenAsList(@NotNull elementType: KtStubElementType<(KotlinPlaceHolderStub<(KtSecondaryConstructor..KtSecondaryConstructor?)>..KotlinPlaceHolderStub<(KtSecondaryConstructor..KtSecondaryConstructor?)>?), (KtSecondaryConstructor..KtSecondaryConstructor?)>): (MutableList<(KtSecondaryConstructor..KtSecondaryConstructor?)>..List<(KtSecondaryConstructor..KtSecondaryConstructor?)>) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]
Inferred types:
    <PsiT : (KtElementImplStub<*>..KtElementImplStub<*>?)> -> KtSecondaryConstructor
    <StubT : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> -> KotlinPlaceHolderStub<(org.jetbrains.kotlin.psi.KtSecondaryConstructor..org.jetbrains.kotlin.psi.KtSecondaryConstructor?)>

'SECONDARY_CONSTRUCTOR' @ [44:63] ==> public final val SECONDARY_CONSTRUCTOR: (KtPlaceHolderStubElementType<(KtSecondaryConstructor..KtSecondaryConstructor?)>..KtPlaceHolderStubElementType<(KtSecondaryConstructor..KtSecondaryConstructor?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'getStubOrPsiChildrenAsList' @ [47:17] ==> @NotNull protected/*protected and package*/ open fun <PsiT : (KtElementImplStub<*>..KtElementImplStub<*>?), StubT : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> getStubOrPsiChildrenAsList(@NotNull elementType: KtStubElementType<(KotlinPropertyStub..KotlinPropertyStub?), (KtProperty..KtProperty?)>): (MutableList<(KtProperty..KtProperty?)>..List<(KtProperty..KtProperty?)>) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]
Inferred types:
    <PsiT : (KtElementImplStub<*>..KtElementImplStub<*>?)> -> KtProperty
    <StubT : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> -> KotlinPropertyStub

'PROPERTY' @ [47:63] ==> public final val PROPERTY: (KtPropertyElementType..KtPropertyElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'getStubOrPsiChildrenAsList' @ [50:17] ==> @NotNull protected/*protected and package*/ open fun <PsiT : (KtElementImplStub<*>..KtElementImplStub<*>?), StubT : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> getStubOrPsiChildrenAsList(@NotNull elementType: KtStubElementType<(KotlinObjectStub..KotlinObjectStub?), (KtObjectDeclaration..KtObjectDeclaration?)>): (MutableList<(KtObjectDeclaration..KtObjectDeclaration?)>..List<(KtObjectDeclaration..KtObjectDeclaration?)>) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]
Inferred types:
    <PsiT : (KtElementImplStub<*>..KtElementImplStub<*>?)> -> KtObjectDeclaration
    <StubT : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> -> KotlinObjectStub

'OBJECT_DECLARATION' @ [50:63] ==> public final val OBJECT_DECLARATION: (KtObjectElementType..KtObjectElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'filter' @ [50:83] ==> public inline fun <T> Iterable<(KtObjectDeclaration..KtObjectDeclaration?)>.filter(predicate: ((KtObjectDeclaration..KtObjectDeclaration?)) -> Boolean): List<(KtObjectDeclaration..KtObjectDeclaration?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtObjectDeclaration..org.jetbrains.kotlin.psi.KtObjectDeclaration?)

'it' @ [50:92] ==> value-parameter it: (KtObjectDeclaration..KtObjectDeclaration?) defined in org.jetbrains.kotlin.psi.KtClassBody.<get-allCompanionObjects>.<anonymous>[ValueParameterDescriptorImpl]

'isCompanion' @ [50:95] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'node' @ [53:17] ==> public final var KtClassBody.node: ASTNode[MyPropertyDescriptor]

'getChildren' @ [53:22] ==> @NotNull public abstract fun getChildren(@Nullable p0: TokenSet?): (Array<(ASTNode..ASTNode?)>..Array<out (ASTNode..ASTNode?)>) defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'create' @ [53:43] ==> @NotNull public open fun create(@NotNull vararg p0: (IElementType..IElementType?)): TokenSet defined in com.intellij.psi.tree.TokenSet[JavaMethodDescriptor]

'RBRACE' @ [53:59] ==> public final val RBRACE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'singleOrNull' @ [53:68] ==> public fun <T> Array<out (ASTNode..ASTNode?)>.singleOrNull(): ASTNode? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.lang.ASTNode..com.intellij.lang.ASTNode?)

'psi' @ [53:84] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'node' @ [56:17] ==> public final var KtClassBody.node: ASTNode[MyPropertyDescriptor]

'getChildren' @ [56:22] ==> @NotNull public abstract fun getChildren(@Nullable p0: TokenSet?): (Array<(ASTNode..ASTNode?)>..Array<out (ASTNode..ASTNode?)>) defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'create' @ [56:43] ==> @NotNull public open fun create(@NotNull vararg p0: (IElementType..IElementType?)): TokenSet defined in com.intellij.psi.tree.TokenSet[JavaMethodDescriptor]

'LBRACE' @ [56:59] ==> public final val LBRACE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'singleOrNull' @ [56:68] ==> public fun <T> Array<out (ASTNode..ASTNode?)>.singleOrNull(): ASTNode? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.lang.ASTNode..com.intellij.lang.ASTNode?)

'psi' @ [56:84] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getStubOrPsiChildrenAsList' @ [62:17] ==> @NotNull protected/*protected and package*/ open fun <PsiT : (KtElementImplStub<*>..KtElementImplStub<*>?), StubT : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> getStubOrPsiChildrenAsList(@NotNull elementType: KtStubElementType<(KotlinModifierListStub..KotlinModifierListStub?), (KtDeclarationModifierList..KtDeclarationModifierList?)>): (MutableList<(KtDeclarationModifierList..KtDeclarationModifierList?)>..List<(KtDeclarationModifierList..KtDeclarationModifierList?)>) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]
Inferred types:
    <PsiT : (KtElementImplStub<*>..KtElementImplStub<*>?)> -> KtDeclarationModifierList
    <StubT : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> -> KotlinModifierListStub

'MODIFIER_LIST' @ [62:44] ==> public final val MODIFIER_LIST: (KtModifierListElementType<(KtDeclarationModifierList..KtDeclarationModifierList?)>..KtModifierListElementType<(KtDeclarationModifierList..KtDeclarationModifierList?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'flatMap' @ [62:59] ==> public inline fun <T, R> Iterable<(KtDeclarationModifierList..KtDeclarationModifierList?)>.flatMap(transform: ((KtDeclarationModifierList..KtDeclarationModifierList?)) -> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>): List<(KtAnnotationEntry..KtAnnotationEntry?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclarationModifierList..org.jetbrains.kotlin.psi.KtDeclarationModifierList?)
    <R> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'it' @ [62:69] ==> value-parameter it: (KtDeclarationModifierList..KtDeclarationModifierList?) defined in org.jetbrains.kotlin.psi.KtClassBody.<get-danglingAnnotations>.<anonymous>[ValueParameterDescriptorImpl]

'annotationEntries' @ [62:72] ==> public final val KtDeclarationModifierList.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

