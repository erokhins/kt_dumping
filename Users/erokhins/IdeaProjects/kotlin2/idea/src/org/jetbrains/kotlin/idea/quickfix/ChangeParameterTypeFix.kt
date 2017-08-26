'KotlinQuickFixAction<KtParameter>' @ [37:72] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtParameter) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtParameter

'element' @ [37:106] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.<init>[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [38:36] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [38:59] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [38:92] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [38:103] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.<init>[ValueParameterDescriptorImpl]

'KotlinTypeInfo' @ [39:28] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'IdeDescriptorRenderers' @ [39:71] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_NOT_NULL_TYPE_APPROXIMATION' @ [39:94] ==> @field:JvmField public final val SOURCE_CODE_NOT_NULL_TYPE_APPROXIMATION: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [39:134] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [39:145] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.<init>[ValueParameterDescriptorImpl]

'getParentOfType' @ [45:39] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtNamedDeclaration..KtNamedDeclaration?)>): KtNamedDeclaration? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtNamedDeclaration

'element' @ [45:55] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.<init>[ValueParameterDescriptorImpl]

'java' @ [45:90] ==> public val <T> KClass<KtNamedDeclaration>.java: Class<KtNamedDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'this' @ [46:9] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[LazyClassReceiverParameterDescriptor]

'containingDeclarationName' @ [46:14] ==> private final val containingDeclarationName: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[PropertyDescriptorImpl]

'declaration' @ [46:42] ==> val declaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.<init>[LocalVariableDescriptor]

'fqName' @ [46:55] ==> public final val KtNamedDeclaration.fqName: FqName?[MyPropertyDescriptor]

'asString' @ [46:63] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'declaration' @ [46:77] ==> val declaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.<init>[LocalVariableDescriptor]

'name' @ [46:90] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'this' @ [47:9] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[LazyClassReceiverParameterDescriptor]

'isPrimaryConstructorParameter' @ [47:14] ==> private final val isPrimaryConstructorParameter: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[PropertyDescriptorImpl]

'declaration' @ [47:46] ==> val declaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.<init>[LocalVariableDescriptor]

'super' @ [53:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [53:22] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [53:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [53:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [53:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.isAvailable[ValueParameterDescriptorImpl]

'containingDeclarationName' @ [53:60] ==> private final val containingDeclarationName: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[PropertyDescriptorImpl]

'element' @ [57:23] ==> protected final val element: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[PropertyDescriptorImpl]

'if (isPrimaryConstructorParameter)
            "Change parameter '${element.name}' type of primary constructor of class '$containingDeclarationName' to '$typePresentation'"
        else
            "Change parameter '${element.name}' type of function '$containingDeclarationName' to '$typePresentation'"' @ [58:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isPrimaryConstructorParameter' @ [58:20] ==> private final val isPrimaryConstructorParameter: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[PropertyDescriptorImpl]

'element' @ [59:34] ==> val element: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.getText[LocalVariableDescriptor]

'name' @ [59:42] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'containingDeclarationName' @ [59:88] ==> private final val containingDeclarationName: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[PropertyDescriptorImpl]

'typePresentation' @ [59:120] ==> private final val typePresentation: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[PropertyDescriptorImpl]

'element' @ [61:34] ==> val element: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.getText[LocalVariableDescriptor]

'name' @ [61:42] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'containingDeclarationName' @ [61:68] ==> private final val containingDeclarationName: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[PropertyDescriptorImpl]

'typePresentation' @ [61:100] ==> private final val typePresentation: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[PropertyDescriptorImpl]

'message' @ [64:49] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'element' @ [67:23] ==> protected final val element: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[PropertyDescriptorImpl]

'element' @ [68:24] ==> val element: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.invoke[LocalVariableDescriptor]

'getStrictParentOfType' @ [68:32] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtFunction? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtFunction

'function' @ [69:30] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.invoke[LocalVariableDescriptor]

'valueParameters' @ [69:39] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'indexOf' @ [69:55] ==> public abstract fun indexOf(element: (KtParameter..KtParameter?)): Int defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'element' @ [69:63] ==> val element: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.invoke[LocalVariableDescriptor]

'function' @ [70:23] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.invoke[LocalVariableDescriptor]

'analyze' @ [70:32] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [71:26] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.invoke[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [71:49] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'function' @ [71:76] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.invoke[LocalVariableDescriptor]

'originalDescriptor' @ [73:82] ==> value-parameter originalDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.invoke.<no name provided>.configure[ValueParameterDescriptorImpl]

'apply' @ [73:101] ==> @InlineOnly public inline fun <T> KotlinMethodDescriptor.apply(block: KotlinMethodDescriptor.() -> Unit): KotlinMethodDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMethodDescriptor

'parameters' @ [74:17] ==> public final val KotlinMethodDescriptor.parameters: (MutableList<(KotlinParameterInfo..KotlinParameterInfo?)>..List<(KotlinParameterInfo..KotlinParameterInfo?)>?)[MyPropertyDescriptor]

'if (receiver != null) parameterIndex + 1 else parameterIndex' @ [74:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'receiver' @ [74:32] ==> public abstract val receiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'parameterIndex' @ [74:50] ==> val parameterIndex: Int defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.invoke[LocalVariableDescriptor]

'parameterIndex' @ [74:74] ==> val parameterIndex: Int defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.invoke[LocalVariableDescriptor]

'currentTypeInfo' @ [74:90] ==> public final var currentTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'typeInfo' @ [74:108] ==> private final val typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix[PropertyDescriptorImpl]

'runChangeSignature' @ [79:9] ==> public fun runChangeSignature(project: Project, callableDescriptor: CallableDescriptor, configuration: KotlinChangeSignatureConfiguration, defaultValueContext: PsiElement, commandName: String? = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeSignature.kt[SimpleFunctionDescriptorImpl]

'element' @ [79:28] ==> val element: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.invoke[LocalVariableDescriptor]

'project' @ [79:36] ==> public final val KtParameter.project: Project[MyPropertyDescriptor]

'descriptor' @ [79:45] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.invoke[LocalVariableDescriptor]

'configuration' @ [79:57] ==> val configuration: <no name provided> defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.invoke[LocalVariableDescriptor]

'element' @ [79:72] ==> val element: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.ChangeParameterTypeFix.invoke[LocalVariableDescriptor]

'text' @ [79:81] ==> public final val ChangeParameterTypeFix.text: String[MyPropertyDescriptor]

