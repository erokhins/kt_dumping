'callType' @ [42:13] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion[PropertyDescriptorImpl]

'DOT' @ [42:34] ==> public object DOT : CallType<KtExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'callType' @ [42:41] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion[PropertyDescriptorImpl]

'SAFE' @ [42:62] ==> public object SAFE : CallType<KtExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'emptyList' @ [42:75] ==> public fun <T> emptyList(): List<ExtensionFunctionTypeValueCompletion.Result> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'ArrayList' @ [44:23] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Result

'variablesProvider' @ [46:26] ==> value-parameter variablesProvider: RealContextVariablesProvider defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables[ValueParameterDescriptorImpl]

'allFunctionTypeVariables' @ [46:44] ==> public final val allFunctionTypeVariables: List<VariableDescriptor> defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider[PropertyDescriptorImpl]

'variable' @ [47:32] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables[LocalVariableDescriptor]

'type' @ [47:41] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'!' @ [48:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'variableType' @ [48:18] ==> val variableType: KotlinType defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables[LocalVariableDescriptor]

'isExtensionFunctionType' @ [48:31] ==> public val KotlinType.isExtensionFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'variableType' @ [50:27] ==> val variableType: KotlinType defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables[LocalVariableDescriptor]

'memberScope' @ [50:40] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedFunctions' @ [50:52] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'INVOKE' @ [50:100] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'FROM_IDE' @ [50:125] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'createSynthesizedInvokes' @ [51:28] ==> public fun createSynthesizedInvokes(functions: Collection<FunctionDescriptor>): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tasks[DeserializedSimpleFunctionDescriptor]

'invokes' @ [51:53] ==> val invokes: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables[LocalVariableDescriptor]

'invoke' @ [52:37] ==> val invoke: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables[LocalVariableDescriptor]

'substituteExtensionIfCallable' @ [52:44] ==> public fun <TCallable : CallableDescriptor> FunctionDescriptor.substituteExtensionIfCallable(receiverTypes: Collection<KotlinType>, callType: CallType<*>): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TCallable : CallableDescriptor> -> FunctionDescriptor

'receiverTypes' @ [52:74] ==> private final val receiverTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion[PropertyDescriptorImpl]

'map' @ [52:88] ==> public inline fun <T, R> Iterable<ReceiverType>.map(transform: (ReceiverType) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverType
    <R> -> KotlinType

'it' @ [52:94] ==> value-parameter it: ReceiverType defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [52:97] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.ReceiverType[DeserializedPropertyDescriptor]

'callType' @ [52:105] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion[PropertyDescriptorImpl]

'!' @ [55:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'useReceiverTypes' @ [55:34] ==> value-parameter useReceiverTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'emptyList' @ [55:59] ==> public fun <T> emptyList(): List<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement

'descriptor' @ [56:29] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'lookupElementFactory' @ [58:55] ==> private final val lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion[PropertyDescriptorImpl]

'createLookupElement' @ [58:76] ==> public open fun createLookupElement(descriptor: DeclarationDescriptor, useReceiverTypes: Boolean, qualifyNestedClasses: Boolean, includeClassTypeArguments: Boolean, parametersAndTypeGrayed: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'substituted' @ [58:96] ==> val substituted: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables[LocalVariableDescriptor]

'lookupElementFactory' @ [59:57] ==> private final val lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion[PropertyDescriptorImpl]

'createLookupElement' @ [59:78] ==> public open fun createLookupElement(descriptor: DeclarationDescriptor, useReceiverTypes: Boolean, qualifyNestedClasses: Boolean, includeClassTypeArguments: Boolean, parametersAndTypeGrayed: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'variable' @ [59:98] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables[LocalVariableDescriptor]

'lookupElementFactory' @ [60:49] ==> private final val lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion[PropertyDescriptorImpl]

'insertHandlerProvider' @ [60:70] ==> public final val insertHandlerProvider: InsertHandlerProvider defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'insertHandler' @ [60:92] ==> public final fun insertHandler(descriptor: DeclarationDescriptor): InsertHandler<LookupElement> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[SimpleFunctionDescriptorImpl]

'invoke' @ [60:106] ==> val invoke: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables[LocalVariableDescriptor]

'LookupElementDecorator<LookupElement>' @ [62:58] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'variableLookupElement' @ [62:96] ==> val variableLookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor[LocalVariableDescriptor]

'invokeLookupElement' @ [64:37] ==> val invokeLookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor[LocalVariableDescriptor]

'renderElement' @ [64:57] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]

'presentation' @ [64:71] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'presentation' @ [66:37] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [66:50] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'variable' @ [66:61] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables[LocalVariableDescriptor]

'name' @ [66:70] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [66:75] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'presentation' @ [68:57] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'tailFragments' @ [68:70] ==> public final val LookupElementPresentation.tailFragments: (MutableList<(LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?)>..List<(LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?)>)[MyPropertyDescriptor]

'first' @ [68:84] ==> public fun <T> List<(LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?)>.first(): (LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.codeInsight.lookup.LookupElementPresentation.TextFragment..com.intellij.codeInsight.lookup.LookupElementPresentation.TextFragment?)

'presentation' @ [69:37] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'clearTail' @ [69:50] ==> public open fun clearTail(): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'presentation' @ [70:37] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'appendTailText' @ [70:50] ==> public open fun appendTailText(@NotNull p0: String, p1: Boolean): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'parameterTail' @ [70:65] ==> val parameterTail: (LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?) defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor.<no name provided>.renderElement[LocalVariableDescriptor]

'text' @ [70:79] ==> public final val text: (String..String?) defined in com.intellij.codeInsight.lookup.LookupElementPresentation.TextFragment[JavaPropertyDescriptor]

'lookupElementFactory' @ [72:37] ==> private final val lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion[PropertyDescriptorImpl]

'basicFactory' @ [72:58] ==> public final val basicFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'appendContainerAndReceiverInformation' @ [72:71] ==> public final fun appendContainerAndReceiverInformation(descriptor: CallableDescriptor, appendTailText: (String) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'variable' @ [72:109] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables[LocalVariableDescriptor]

'presentation' @ [73:41] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'appendTailText' @ [73:54] ==> public open fun appendTailText(@NotNull p0: String, p1: Boolean): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'it' @ [73:69] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor.<no name provided>.renderElement.<anonymous>[ValueParameterDescriptorImpl]

'insertHandler' @ [78:37] ==> val insertHandler: InsertHandler<LookupElement> defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor[LocalVariableDescriptor]

'handleInsert' @ [78:51] ==> public abstract fun handleInsert(p0: (InsertionContext..InsertionContext?), p1: (LookupElement..LookupElement?)): Unit defined in com.intellij.codeInsight.completion.InsertHandler[JavaMethodDescriptor]

'context' @ [78:64] ==> value-parameter context: InsertionContext? defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'this' @ [78:73] ==> <this> defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor.<no name provided>[LazyClassReceiverParameterDescriptor]

'listOf' @ [81:36] ==> public fun <T> listOf(element: <no name provided>): List<<no name provided>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> <no name provided>

'lookupElement' @ [81:43] ==> val lookupElement: <no name provided> defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables.<no name provided>.createStandardLookupElementsForDescriptor[LocalVariableDescriptor]

'results' @ [92:21] ==> val results: ArrayList<ExtensionFunctionTypeValueCompletion.Result> defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables[LocalVariableDescriptor]

'add' @ [92:29] ==> public open fun add(element: ExtensionFunctionTypeValueCompletion.Result): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Result' @ [92:33] ==> public constructor Result(invokeDescriptor: FunctionDescriptor, factory: AbstractLookupElementFactory) defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.Result[ClassConstructorDescriptorImpl]

'substituted' @ [92:40] ==> val substituted: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables[LocalVariableDescriptor]

'factory' @ [92:53] ==> val factory: <no name provided> defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables[LocalVariableDescriptor]

'results' @ [97:16] ==> val results: ArrayList<ExtensionFunctionTypeValueCompletion.Result> defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.processVariables[LocalVariableDescriptor]

