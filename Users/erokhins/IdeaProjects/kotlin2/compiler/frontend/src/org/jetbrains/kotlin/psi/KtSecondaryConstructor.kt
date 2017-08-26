'super' @ [25:34] ==> protected constructor KtConstructor<T : KtConstructor<KtSecondaryConstructor>>(node: ASTNode) defined in org.jetbrains.kotlin.psi.KtConstructor[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtConstructor<T>> -> KtSecondaryConstructor

'node' @ [25:40] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor.<init>[ValueParameterDescriptorImpl]

'super' @ [26:72] ==> protected constructor KtConstructor<T : KtConstructor<KtSecondaryConstructor>>(stub: KotlinPlaceHolderStub<KtSecondaryConstructor>, nodeType: KtPlaceHolderStubElementType<KtSecondaryConstructor>) defined in org.jetbrains.kotlin.psi.KtConstructor[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtConstructor<T>> -> KtSecondaryConstructor

'stub' @ [26:78] ==> value-parameter stub: KotlinPlaceHolderStub<KtSecondaryConstructor> defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor.<init>[ValueParameterDescriptorImpl]

'SECONDARY_CONSTRUCTOR' @ [26:103] ==> public final val SECONDARY_CONSTRUCTOR: (KtPlaceHolderStubElementType<(KtSecondaryConstructor..KtSecondaryConstructor?)>..KtPlaceHolderStubElementType<(KtSecondaryConstructor..KtSecondaryConstructor?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'visitor' @ [28:69] ==> value-parameter visitor: KtVisitor<R, D> defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor.accept[ValueParameterDescriptorImpl]

'visitSecondaryConstructor' @ [28:77] ==> public open fun visitSecondaryConstructor(@NotNull constructor: KtSecondaryConstructor, data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.psi.KtVisitor[JavaMethodDescriptor]

'this' @ [28:103] ==> <this> defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[LazyClassReceiverParameterDescriptor]

'data' @ [28:109] ==> value-parameter data: D defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor.accept[ValueParameterDescriptorImpl]

'parent' @ [30:49] ==> public final val KtSecondaryConstructor.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [30:56] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'findChildByClass' @ [32:40] ==> @Nullable protected/*protected and package*/ open fun <T : (Any..Any?)> findChildByClass(p0: (Class<(KtBlockExpression..KtBlockExpression?)>..Class<(KtBlockExpression..KtBlockExpression?)>?)): KtBlockExpression? defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtBlockExpression..org.jetbrains.kotlin.psi.KtBlockExpression?)

'KtBlockExpression' @ [32:57] ==> public constructor KtBlockExpression(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtBlockExpression[JavaClassConstructorDescriptor]

'java' @ [32:82] ==> public val <T> KClass<KtBlockExpression>.java: Class<KtBlockExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBlockExpression

'notNullChild' @ [34:44] ==> @NotNull protected/*protected and package*/ open fun <T : (Any..Any?)> notNullChild(p0: (PsiElement..PsiElement?)): PsiElement defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiElement

'super' @ [34:69] ==> <this> defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[LazyClassReceiverParameterDescriptor]

'getConstructorKeyword' @ [34:75] ==> public open fun getConstructorKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtConstructor[SimpleFunctionDescriptorImpl]

'findNotNullChildByClass' @ [36:60] ==> @NotNull protected/*protected and package*/ open fun <T : (Any..Any?)> findNotNullChildByClass(p0: (Class<(KtConstructorDelegationCall..KtConstructorDelegationCall?)>..Class<(KtConstructorDelegationCall..KtConstructorDelegationCall?)>?)): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtConstructorDelegationCall..org.jetbrains.kotlin.psi.KtConstructorDelegationCall?)

'KtConstructorDelegationCall' @ [36:84] ==> public constructor KtConstructorDelegationCall(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtConstructorDelegationCall[JavaClassConstructorDescriptor]

'java' @ [36:119] ==> public val <T> KClass<KtConstructorDelegationCall>.java: Class<KtConstructorDelegationCall> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtConstructorDelegationCall

'getDelegationCall' @ [38:48] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[SimpleFunctionDescriptorImpl]

'isImplicit' @ [38:68] ==> public final val KtConstructorDelegationCall.isImplicit: Boolean[MyPropertyDescriptor]

'KtPsiFactory' @ [41:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[ClassConstructorDescriptorImpl]

'project' @ [41:39] ==> public final val KtSecondaryConstructor.project: Project[MyPropertyDescriptor]

'getDelegationCall' @ [42:23] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[SimpleFunctionDescriptorImpl]

'assert' @ [44:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'current' @ [44:16] ==> val current: KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor.replaceImplicitDelegationCallWithExplicit[LocalVariableDescriptor]

'isImplicit' @ [44:24] ==> public final val KtConstructorDelegationCall.isImplicit: Boolean[MyPropertyDescriptor]

'+' @ [44:38] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'text' @ [44:102] ==> public final val KtSecondaryConstructor.text: (String..String?)[MyPropertyDescriptor]

'current' @ [45:9] ==> val current: KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor.replaceImplicitDelegationCallWithExplicit[LocalVariableDescriptor]

'delete' @ [45:17] ==> @Override public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtConstructorDelegationCall[JavaMethodDescriptor]

'addAfter' @ [47:21] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[JavaMethodDescriptor]

'psiFactory' @ [47:30] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor.replaceImplicitDelegationCallWithExplicit[LocalVariableDescriptor]

'createColon' @ [47:41] ==> public final fun createColon(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'valueParameterList' @ [47:56] ==> public final val KtSecondaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'if (isThis) "this" else "super"' @ [49:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isThis' @ [49:34] ==> value-parameter isThis: Boolean defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor.replaceImplicitDelegationCallWithExplicit[ValueParameterDescriptorImpl]

'addAfter' @ [51:16] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[JavaMethodDescriptor]

'psiFactory' @ [51:25] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor.replaceImplicitDelegationCallWithExplicit[LocalVariableDescriptor]

'creareDelegatedSuperTypeEntry' @ [51:36] ==> public final fun creareDelegatedSuperTypeEntry(text: String): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'delegationName' @ [51:66] ==> val delegationName: String defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor.replaceImplicitDelegationCallWithExplicit[LocalVariableDescriptor]

'colon' @ [51:90] ==> val colon: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor.replaceImplicitDelegationCallWithExplicit[LocalVariableDescriptor]

