'super' @ [33:34] ==> public constructor KtDeclarationStub<T : (StubElement<*>..StubElement<*>?)>(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtDeclarationStub[JavaClassConstructorDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> KotlinPlaceHolderStub<KtClassInitializer>

'node' @ [33:40] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.psi.KtClassInitializer.<init>[ValueParameterDescriptorImpl]

'super' @ [35:68] ==> public constructor KtDeclarationStub<T : (StubElement<*>..StubElement<*>?)>(@NotNull stub: KotlinPlaceHolderStub<KtClassInitializer>, @NotNull nodeType: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>)) defined in org.jetbrains.kotlin.psi.KtDeclarationStub[JavaClassConstructorDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> KotlinPlaceHolderStub<KtClassInitializer>

'stub' @ [35:74] ==> value-parameter stub: KotlinPlaceHolderStub<KtClassInitializer> defined in org.jetbrains.kotlin.psi.KtClassInitializer.<init>[ValueParameterDescriptorImpl]

'CLASS_INITIALIZER' @ [35:99] ==> public final val CLASS_INITIALIZER: (KtPlaceHolderStubElementType<(KtClassInitializer..KtClassInitializer?)>..KtPlaceHolderStubElementType<(KtClassInitializer..KtClassInitializer?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'visitor' @ [37:69] ==> value-parameter visitor: KtVisitor<R, D> defined in org.jetbrains.kotlin.psi.KtClassInitializer.accept[ValueParameterDescriptorImpl]

'visitClassInitializer' @ [37:77] ==> public open fun visitClassInitializer(@NotNull initializer: KtClassInitializer, data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.psi.KtVisitor[JavaMethodDescriptor]

'this' @ [37:99] ==> <this> defined in org.jetbrains.kotlin.psi.KtClassInitializer[LazyClassReceiverParameterDescriptor]

'data' @ [37:105] ==> value-parameter data: D defined in org.jetbrains.kotlin.psi.KtClassInitializer.accept[ValueParameterDescriptorImpl]

'findChildByClass' @ [40:17] ==> @Nullable protected/*protected and package*/ open fun <T : (Any..Any?)> findChildByClass(p0: (Class<(KtExpression..KtExpression?)>..Class<(KtExpression..KtExpression?)>?)): KtExpression? defined in org.jetbrains.kotlin.psi.KtClassInitializer[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtExpression

'java' @ [40:54] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'body' @ [43:18] ==> public open val body: KtExpression? defined in org.jetbrains.kotlin.psi.KtClassInitializer[PropertyDescriptorImpl]

'lBrace' @ [43:47] ==> public final val KtBlockExpression.lBrace: PsiElement?[MyPropertyDescriptor]

'findChildByType' @ [46:17] ==> @Nullable protected/*protected and package*/ open fun <T : (PsiElement..PsiElement?)> findChildByType(p0: (IElementType..IElementType?)): PsiElement? defined in org.jetbrains.kotlin.psi.KtClassInitializer[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'INIT_KEYWORD' @ [46:42] ==> public final val INIT_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'getParentOfType' @ [49:17] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'sure' @ [49:56] ==> public inline fun <T : Any> KtClassOrObject?.sure(message: () -> String): KtClassOrObject defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtClassOrObject

'KtDeclarationImpl' @ [52:44] ==> public constructor KtDeclarationImpl(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtDeclarationImpl[JavaClassConstructorDescriptor]

'node' @ [52:62] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.psi.KtScriptInitializer.<init>[ValueParameterDescriptorImpl]

'findChildByClass' @ [54:17] ==> @Nullable protected/*protected and package*/ open fun <T : (Any..Any?)> findChildByClass(p0: (Class<(KtExpression..KtExpression?)>..Class<(KtExpression..KtExpression?)>?)): KtExpression? defined in org.jetbrains.kotlin.psi.KtScriptInitializer[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtExpression

'java' @ [54:54] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'getParentOfType' @ [57:17] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtScript? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtScript

'sure' @ [57:49] ==> public inline fun <T : Any> KtScript?.sure(message: () -> String): KtScript defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtScript

'visitor' @ [59:69] ==> value-parameter visitor: KtVisitor<R, D> defined in org.jetbrains.kotlin.psi.KtScriptInitializer.accept[ValueParameterDescriptorImpl]

'visitScriptInitializer' @ [59:77] ==> public open fun visitScriptInitializer(@NotNull initializer: KtScriptInitializer, data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.psi.KtVisitor[JavaMethodDescriptor]

'this' @ [59:100] ==> <this> defined in org.jetbrains.kotlin.psi.KtScriptInitializer[LazyClassReceiverParameterDescriptor]

'data' @ [59:106] ==> value-parameter data: D defined in org.jetbrains.kotlin.psi.KtScriptInitializer.accept[ValueParameterDescriptorImpl]

