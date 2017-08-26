'ChangeFunctionSignatureFix' @ [38:5] ==> public constructor ChangeFunctionSignatureFix(element: PsiElement, functionDescriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionSignatureFix[ClassConstructorDescriptorImpl]

'functionLiteral' @ [38:32] ==> value-parameter functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.<init>[ValueParameterDescriptorImpl]

'functionDescriptor' @ [38:49] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.<init>[ValueParameterDescriptorImpl]

'element' @ [43:23] ==> protected final val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix[PropertyDescriptorImpl]

'runChangeSignature' @ [44:9] ==> public fun runChangeSignature(project: Project, callableDescriptor: CallableDescriptor, configuration: KotlinChangeSignatureConfiguration, defaultValueContext: PsiElement, commandName: String? = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeSignature.kt[SimpleFunctionDescriptorImpl]

'project' @ [45:17] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.invoke[ValueParameterDescriptorImpl]

'functionDescriptor' @ [46:17] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix[PropertyDescriptorImpl]

'originalDescriptor' @ [49:32] ==> value-parameter originalDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.invoke.<no name provided>.configure[ValueParameterDescriptorImpl]

'modify' @ [49:51] ==> public fun KotlinMethodDescriptor.modify(action: (KotlinMutableMethodDescriptor) -> Unit): KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature[SimpleFunctionDescriptorImpl]

'CollectingNameValidator' @ [50:45] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'descriptor' @ [51:29] ==> value-parameter descriptor: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.invoke.<no name provided>.configure.<anonymous>[ValueParameterDescriptorImpl]

'clearNonReceiverParameters' @ [51:40] ==> public final fun clearNonReceiverParameters(): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMutableMethodDescriptor[SimpleFunctionDescriptorImpl]

'parameterTypes' @ [52:42] ==> private final val parameterTypes: List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix[PropertyDescriptorImpl]

'KotlinNameSuggester' @ [53:44] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesByType' @ [53:64] ==> public final fun suggestNamesByType(type: KotlinType, validator: (String) -> Boolean, defaultName: String? = ...): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'type' @ [53:83] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.invoke.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'validator' @ [53:89] ==> val validator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.invoke.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [54:33] ==> value-parameter descriptor: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.invoke.<no name provided>.configure.<anonymous>[ValueParameterDescriptorImpl]

'addParameter' @ [54:44] ==> public final fun addParameter(parameter: KotlinParameterInfo): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMutableMethodDescriptor[SimpleFunctionDescriptorImpl]

'KotlinParameterInfo' @ [54:57] ==> @JvmOverloads public constructor KotlinParameterInfo(callableDescriptor: CallableDescriptor, originalIndex: Int = ..., name: String, originalTypeInfo: KotlinTypeInfo = ..., defaultValueForParameter: KtExpression? = ..., defaultValueForCall: KtExpression? = ..., valOrVar: KotlinValVar = ..., modifierList: KtModifierList? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[ClassConstructorDescriptorImpl]

'functionDescriptor' @ [54:77] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix[PropertyDescriptorImpl]

'-' @ [54:97] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'name' @ [54:101] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.invoke.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'KotlinTypeInfo' @ [54:107] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'type' @ [54:129] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.invoke.<no name provided>.configure.<anonymous>[LocalVariableDescriptor]

'element' @ [62:17] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.invoke[LocalVariableDescriptor]

'text' @ [63:17] ==> public final val ChangeFunctionLiteralSignatureFix.text: String[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactoryWithDelegate<KtFunctionLiteral, Companion.Data>' @ [66:24] ==> public constructor KotlinSingleIntentionActionFactoryWithDelegate<E : KtElement, D : Any>(actionPriority: IntentionActionPriority = ...) defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactoryWithDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtFunctionLiteral
    <D : Any> -> Data

'EXPECTED_PARAMETERS_NUMBER_MISMATCH' @ [70:51] ==> public final val EXPECTED_PARAMETERS_NUMBER_MISMATCH: (DiagnosticFactory2<(KtFunction..KtFunction?), (Int..Int?), (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>?)>..DiagnosticFactory2<(KtFunction..KtFunction?), (Int..Int?), (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [70:87] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters2<(KtFunction..KtFunction?), (Int..Int?), (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'diagnostic' @ [70:92] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.Companion.getElementOfInterest[ValueParameterDescriptorImpl]

'diagnosticWithParameters' @ [71:20] ==> val diagnosticWithParameters: DiagnosticWithParameters2<(KtFunction..KtFunction?), (Int..Int?), (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>?)> defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.Companion.getElementOfInterest[LocalVariableDescriptor]

'psiElement' @ [71:45] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtFunction..KtFunction?), (Int..Int?), (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>?)>.psiElement: (KtFunction..KtFunction?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtFunction..org.jetbrains.kotlin.psi.KtFunction?)
    <A : (Any..Any?)> -> (kotlin.Int..kotlin.Int?)
    <B : (Any..Any?)> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)>..kotlin.collections.List<(org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)>?)

'element' @ [75:30] ==> value-parameter element: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.Companion.extractFixData[ValueParameterDescriptorImpl]

'resolveToDescriptorIfAny' @ [75:38] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'EXPECTED_PARAMETERS_NUMBER_MISMATCH' @ [76:41] ==> public final val EXPECTED_PARAMETERS_NUMBER_MISMATCH: (DiagnosticFactory2<(KtFunction..KtFunction?), (Int..Int?), (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>?)>..DiagnosticFactory2<(KtFunction..KtFunction?), (Int..Int?), (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [76:77] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters2<(KtFunction..KtFunction?), (Int..Int?), (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'diagnostic' @ [76:82] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.Companion.extractFixData[ValueParameterDescriptorImpl]

'b' @ [76:94] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtFunction..KtFunction?), (Int..Int?), (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>?)>.b: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtFunction..org.jetbrains.kotlin.psi.KtFunction?)
    <A : (Any..Any?)> -> (kotlin.Int..kotlin.Int?)
    <B : (Any..Any?)> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)>..kotlin.collections.List<(org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)>?)

'Data' @ [77:20] ==> public constructor Data(descriptor: FunctionDescriptor, parameterTypes: List<KotlinType>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.Companion.Data[ClassConstructorDescriptorImpl]

'descriptor' @ [77:25] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.Companion.extractFixData[LocalVariableDescriptor]

'parameterTypes' @ [77:37] ==> val parameterTypes: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.Companion.extractFixData[LocalVariableDescriptor]

'ChangeFunctionLiteralSignatureFix' @ [81:19] ==> private constructor ChangeFunctionLiteralSignatureFix(functionLiteral: KtFunctionLiteral, functionDescriptor: FunctionDescriptor, parameterTypes: List<KotlinType>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix[ClassConstructorDescriptorImpl]

'originalElement' @ [81:53] ==> value-parameter originalElement: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.Companion.createFix[ValueParameterDescriptorImpl]

'data' @ [81:70] ==> value-parameter data: ChangeFunctionLiteralSignatureFix.Companion.Data defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.Companion.createFix[ValueParameterDescriptorImpl]

'descriptor' @ [81:75] ==> public final val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.Companion.Data[PropertyDescriptorImpl]

'data' @ [81:87] ==> value-parameter data: ChangeFunctionLiteralSignatureFix.Companion.Data defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.Companion.createFix[ValueParameterDescriptorImpl]

'parameterTypes' @ [81:92] ==> public final val parameterTypes: List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralSignatureFix.Companion.Data[PropertyDescriptorImpl]

