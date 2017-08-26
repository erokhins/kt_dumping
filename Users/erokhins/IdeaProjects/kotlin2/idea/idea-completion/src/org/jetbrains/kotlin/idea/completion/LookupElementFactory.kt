'it' @ [73:95] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.<init>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [77:29] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.Companion.hasSingleFunctionTypeParameter[ValueParameterDescriptorImpl]

'original' @ [77:40] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'valueParameters' @ [77:49] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'singleOrNull' @ [77:65] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.singleOrNull(): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'parameter' @ [78:20] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.Companion.hasSingleFunctionTypeParameter[LocalVariableDescriptor]

'type' @ [78:30] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'isFunctionType' @ [78:35] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'basicFactory' @ [82:33] ==> public final val basicFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'insertHandlerProvider' @ [82:46] ==> public final val insertHandlerProvider: InsertHandlerProvider defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[PropertyDescriptorImpl]

'getValue' @ [84:60] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'inDescriptor' @ [85:9] ==> private final val inDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'parentsWithSelf' @ [85:22] ==> public val DeclarationDescriptor.parentsWithSelf: Sequence<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [86:18] ==> public fun <T> Sequence<DeclarationDescriptor>.takeWhile(predicate: (DeclarationDescriptor) -> Boolean): Sequence<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [86:30] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.superFunctions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'filterIsInstance' @ [87:18] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<FunctionDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> FunctionDescriptor

'toList' @ [88:18] ==> public fun <T> Sequence<FunctionDescriptor>.toList(): List<FunctionDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'flatMap' @ [89:18] ==> public inline fun <T, R> Iterable<FunctionDescriptor>.flatMap(transform: (FunctionDescriptor) -> Iterable<FunctionDescriptor>): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> FunctionDescriptor

'it' @ [89:28] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.superFunctions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'findOriginalTopMostOverriddenDescriptors' @ [89:31] ==> public fun <D : CallableDescriptor> FunctionDescriptor.findOriginalTopMostOverriddenDescriptors(): Set<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> FunctionDescriptor

'toSet' @ [90:18] ==> public fun <T> Iterable<FunctionDescriptor>.toSet(): Set<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'SmartList' @ [94:22] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LookupElement

'callType' @ [96:28] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'DEFAULT' @ [96:49] ==> public object DEFAULT : CallType<Nothing?> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'callType' @ [96:60] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'DOT' @ [96:81] ==> public object DOT : CallType<KtExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'callType' @ [96:88] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'SAFE' @ [96:109] ==> public object SAFE : CallType<KtExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'callType' @ [96:117] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'SUPER_MEMBERS' @ [96:138] ==> public object SUPER_MEMBERS : CallType<KtSuperExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'result' @ [98:9] ==> val result: SmartList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[LocalVariableDescriptor]

'add' @ [98:16] ==> public open fun add(element: (LookupElement..LookupElement?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'createLookupElement' @ [98:20] ==> public open fun createLookupElement(descriptor: DeclarationDescriptor, useReceiverTypes: Boolean, qualifyNestedClasses: Boolean, includeClassTypeArguments: Boolean, parametersAndTypeGrayed: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [98:40] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'useReceiverTypes' @ [98:52] ==> value-parameter useReceiverTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'!' @ [98:96] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNormalCall' @ [98:97] ==> val isNormalCall: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[LocalVariableDescriptor]

'callType' @ [98:113] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'INFIX' @ [98:134] ==> public object INFIX : CallType<KtExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'descriptor' @ [101:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'isNormalCall' @ [101:49] ==> val isNormalCall: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[LocalVariableDescriptor]

'if (callType != CallType.SUPER_MEMBERS) {
                result.addSpecialFunctionCallElements(descriptor, useReceiverTypes)
            }
            else if (useReceiverTypes) {
                result.addIfNotNull(createSuperFunctionCallWithArguments(descriptor))
            }' @ [102:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'callType' @ [102:17] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'SUPER_MEMBERS' @ [102:38] ==> public object SUPER_MEMBERS : CallType<KtSuperExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'result' @ [103:17] ==> val result: SmartList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[LocalVariableDescriptor]

'addSpecialFunctionCallElements' @ [103:24] ==> private final fun MutableCollection<LookupElement>.addSpecialFunctionCallElements(descriptor: FunctionDescriptor, useReceiverTypes: Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [103:55] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'useReceiverTypes' @ [103:67] ==> value-parameter useReceiverTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'useReceiverTypes' @ [105:22] ==> value-parameter useReceiverTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'result' @ [106:17] ==> val result: SmartList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[LocalVariableDescriptor]

'addIfNotNull' @ [106:24] ==> public fun <T : Any> MutableCollection<(LookupElement..LookupElement?)>.addIfNotNull(t: LookupElement?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> (com.intellij.codeInsight.lookup.LookupElement..com.intellij.codeInsight.lookup.LookupElement?)

'createSuperFunctionCallWithArguments' @ [106:37] ==> private final fun createSuperFunctionCallWithArguments(descriptor: FunctionDescriptor): LookupElement? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [106:74] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'callType' @ [111:13] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'DOT' @ [111:34] ==> public object DOT : CallType<KtExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'descriptor' @ [111:41] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [111:77] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'isOperator' @ [111:88] ==> public final val FunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'descriptor' @ [111:102] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'name' @ [111:113] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'GET' @ [111:145] ==> @field:JvmField public final val GET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'createLookupElement' @ [112:37] ==> public open fun createLookupElement(descriptor: DeclarationDescriptor, useReceiverTypes: Boolean, qualifyNestedClasses: Boolean, includeClassTypeArguments: Boolean, parametersAndTypeGrayed: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [112:57] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'useReceiverTypes' @ [112:69] ==> value-parameter useReceiverTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[ValueParameterDescriptorImpl]

'LookupElementDecorator<LookupElement>' @ [113:42] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'baseLookupElement' @ [113:80] ==> val baseLookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[LocalVariableDescriptor]

'setOf' @ [115:54] ==> public fun <T> setOf(element: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'lookupString' @ [115:60] ==> public final val <no name provided>.lookupString: String[MyPropertyDescriptor]

'super' @ [118:21] ==> <this> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor.<no name provided>[LazyClassReceiverParameterDescriptor]

'renderElement' @ [118:27] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'presentation' @ [118:41] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'presentation' @ [119:21] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [119:34] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'lookupString' @ [119:45] ==> public final val <no name provided>.lookupString: String[MyPropertyDescriptor]

'context' @ [123:39] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'startOffset' @ [123:47] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'assert' @ [124:21] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'context' @ [124:28] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'document' @ [124:36] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'charsSequence' @ [124:45] ==> public final val Document.charsSequence: CharSequence[MyPropertyDescriptor]

'startOffset' @ [124:59] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor.<no name provided>.handleInsert[LocalVariableDescriptor]

'context' @ [125:21] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'document' @ [125:29] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'deleteString' @ [125:38] ==> public abstract fun deleteString(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'startOffset' @ [125:51] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor.<no name provided>.handleInsert[LocalVariableDescriptor]

'startOffset' @ [125:68] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor.<no name provided>.handleInsert[LocalVariableDescriptor]

'context' @ [126:21] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'editor' @ [126:29] ==> public final val InsertionContext.editor: Editor[MyPropertyDescriptor]

'moveCaret' @ [126:36] ==> public fun Editor.moveCaret(offset: Int, scrollType: ScrollType = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'startOffset' @ [126:46] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor.<no name provided>.handleInsert[LocalVariableDescriptor]

'getInstance' @ [128:41] ==> public open fun getInstance(p0: (Project..Project?)): (AutoPopupController..AutoPopupController?) defined in com.intellij.codeInsight.AutoPopupController[JavaMethodDescriptor]

'context' @ [128:53] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'project' @ [128:61] ==> public final val InsertionContext.project: (Project..Project?)[MyPropertyDescriptor]

'autoPopupParameterInfo' @ [128:71] ==> public open fun autoPopupParameterInfo(@NotNull p0: Editor, @Nullable p1: PsiElement?): Unit defined in com.intellij.codeInsight.AutoPopupController[JavaMethodDescriptor]

'context' @ [128:94] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'editor' @ [128:102] ==> public final val InsertionContext.editor: Editor[MyPropertyDescriptor]

'lookupElement' @ [131:13] ==> val lookupElement: <no name provided> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[LocalVariableDescriptor]

'assignPriority' @ [131:27] ==> public fun LookupElement.assignPriority(priority: ItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'GET_OPERATOR' @ [131:55] ==> enum entry GET_OPERATOR defined in org.jetbrains.kotlin.idea.completion.ItemPriority[FakeCallableDescriptorForObject]

'result' @ [132:13] ==> val result: SmartList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[LocalVariableDescriptor]

'add' @ [132:20] ==> public open fun add(element: (LookupElement..LookupElement?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'lookupElement' @ [132:24] ==> val lookupElement: <no name provided> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[LocalVariableDescriptor]

'result' @ [135:16] ==> val result: SmartList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createStandardLookupElementsForDescriptor[LocalVariableDescriptor]

'map' @ [135:23] ==> public inline fun <T, R> Iterable<(LookupElement..LookupElement?)>.map(transform: ((LookupElement..LookupElement?)) -> LookupElement): List<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.codeInsight.lookup.LookupElement..com.intellij.codeInsight.lookup.LookupElement?)
    <R> -> LookupElement

'standardLookupElementsPostProcessor' @ [135:27] ==> private final val standardLookupElementsPostProcessor: (LookupElement) -> LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'descriptor' @ [140:29] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[ValueParameterDescriptorImpl]

'valueParameters' @ [140:40] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'lastOrNull' @ [140:56] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.lastOrNull(): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'!' @ [141:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [141:14] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[ValueParameterDescriptorImpl]

'valueParameters' @ [141:25] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'all' @ [141:41] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.all(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [141:47] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements.<anonymous>[ValueParameterDescriptorImpl]

'lastParameter' @ [141:53] ==> val lastParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[LocalVariableDescriptor]

'it' @ [141:70] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements.<anonymous>[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [141:73] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'lastParameter' @ [143:13] ==> val lastParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[LocalVariableDescriptor]

'original' @ [143:27] ==> public final val ValueParameterDescriptor.original: ValueParameterDescriptor[MyPropertyDescriptor]

'type' @ [143:36] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'isBuiltinFunctionalType' @ [143:41] ==> public val KotlinType.isBuiltinFunctionalType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'descriptor' @ [144:37] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[ValueParameterDescriptorImpl]

'valueParameters' @ [144:48] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [144:64] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'lastParameter' @ [146:33] ==> val lastParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[LocalVariableDescriptor]

'type' @ [146:47] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'insertHandlerProvider' @ [147:33] ==> public final val insertHandlerProvider: InsertHandlerProvider defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'insertHandler' @ [147:55] ==> public final fun insertHandler(descriptor: DeclarationDescriptor): InsertHandler<LookupElement> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[SimpleFunctionDescriptorImpl]

'descriptor' @ [147:69] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[ValueParameterDescriptorImpl]

'insertHandler' @ [148:17] ==> val insertHandler: KotlinFunctionInsertHandler.Normal defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[LocalVariableDescriptor]

'lambdaInfo' @ [148:31] ==> public final val lambdaInfo: GenerateLambdaInfo? defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[PropertyDescriptorImpl]

'getValueParametersCountFromFunctionType' @ [149:46] ==> public fun getValueParametersCountFromFunctionType(type: KotlinType): Int defined in org.jetbrains.kotlin.resolve.calls.util[DeserializedSimpleFunctionDescriptor]

'parameterType' @ [149:86] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[LocalVariableDescriptor]

'add' @ [150:17] ==> public abstract fun add(element: LookupElement): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'createFunctionCallElementWithLambda' @ [150:21] ==> private final fun createFunctionCallElementWithLambda(descriptor: FunctionDescriptor, parameterType: KotlinType, useReceiverTypes: Boolean, explicitLambdaParameters: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [150:57] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[ValueParameterDescriptorImpl]

'parameterType' @ [150:69] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[LocalVariableDescriptor]

'useReceiverTypes' @ [150:84] ==> value-parameter useReceiverTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[ValueParameterDescriptorImpl]

'functionParameterCount' @ [150:129] ==> val functionParameterCount: Int defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[LocalVariableDescriptor]

'isSingleParameter' @ [153:17] ==> val isSingleParameter: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[LocalVariableDescriptor]

'parameterType' @ [156:42] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[LocalVariableDescriptor]

'toFuzzyType' @ [156:56] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [156:68] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[ValueParameterDescriptorImpl]

'typeParameters' @ [156:79] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'component1' @ [157:23] ==> public final operator fun component1(): VariableDescriptor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [157:33] ==> public final operator fun component2(): TypeSubstitutor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'contextVariablesProvider' @ [157:49] ==> private final val contextVariablesProvider: ContextVariablesProvider defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'functionTypeVariables' @ [157:74] ==> public abstract fun functionTypeVariables(requiredType: FuzzyType): Collection<Pair<VariableDescriptor, TypeSubstitutor>> defined in org.jetbrains.kotlin.idea.completion.ContextVariablesProvider[SimpleFunctionDescriptorImpl]

'fuzzyParameterType' @ [157:96] ==> val fuzzyParameterType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[LocalVariableDescriptor]

'descriptor' @ [158:49] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[ValueParameterDescriptorImpl]

'substitute' @ [158:60] ==> @Nullable public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'substitutor' @ [158:71] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[LocalVariableDescriptor]

'add' @ [159:21] ==> public abstract fun add(element: LookupElement): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'createFunctionCallElementWithArguments' @ [159:25] ==> private final fun createFunctionCallElementWithArguments(descriptor: FunctionDescriptor, argumentText: String, useReceiverTypes: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'substitutedDescriptor' @ [159:64] ==> val substitutedDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[LocalVariableDescriptor]

'variable' @ [159:87] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[LocalVariableDescriptor]

'name' @ [159:96] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'render' @ [159:101] ==> public fun Name.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'useReceiverTypes' @ [159:111] ==> value-parameter useReceiverTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.addSpecialFunctionCallElements[ValueParameterDescriptorImpl]

'createLookupElement' @ [171:29] ==> public open fun createLookupElement(descriptor: DeclarationDescriptor, useReceiverTypes: Boolean, qualifyNestedClasses: Boolean, includeClassTypeArguments: Boolean, parametersAndTypeGrayed: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [171:49] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[ValueParameterDescriptorImpl]

'useReceiverTypes' @ [171:61] ==> value-parameter useReceiverTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[ValueParameterDescriptorImpl]

'insertHandlerProvider' @ [172:35] ==> public final val insertHandlerProvider: InsertHandlerProvider defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'insertHandler' @ [172:57] ==> public final fun insertHandler(descriptor: DeclarationDescriptor): InsertHandler<LookupElement> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[SimpleFunctionDescriptorImpl]

'descriptor' @ [172:71] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[ValueParameterDescriptorImpl]

'inputTypeArguments' @ [172:122] ==> public final val inputTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[PropertyDescriptorImpl]

'GenerateLambdaInfo' @ [173:26] ==> public constructor GenerateLambdaInfo(lambdaType: KotlinType, explicitParameters: Boolean) defined in org.jetbrains.kotlin.idea.completion.handlers.GenerateLambdaInfo[ClassConstructorDescriptorImpl]

'parameterType' @ [173:45] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[ValueParameterDescriptorImpl]

'explicitLambdaParameters' @ [173:60] ==> value-parameter explicitLambdaParameters: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[ValueParameterDescriptorImpl]

'if (explicitLambdaParameters)
            LambdaSignatureTemplates.lambdaPresentation(parameterType, LambdaSignatureTemplates.SignaturePresentation.NAMES_OR_TYPES)
        else
            LambdaSignatureTemplates.DEFAULT_LAMBDA_PRESENTATION' @ [174:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'explicitLambdaParameters' @ [174:38] ==> value-parameter explicitLambdaParameters: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[ValueParameterDescriptorImpl]

'lambdaPresentation' @ [175:38] ==> public final fun lambdaPresentation(lambdaType: KotlinType, presentationKind: LambdaSignatureTemplates.SignaturePresentation): String defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'parameterType' @ [175:57] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[ValueParameterDescriptorImpl]

'NAMES_OR_TYPES' @ [175:119] ==> enum entry NAMES_OR_TYPES defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.SignaturePresentation[FakeCallableDescriptorForObject]

'DEFAULT_LAMBDA_PRESENTATION' @ [177:38] ==> public final val DEFAULT_LAMBDA_PRESENTATION: String defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[PropertyDescriptorImpl]

'BasicLookupElementFactory' @ [180:34] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[FakeCallableDescriptorForObject]

'SHORT_NAMES_RENDERER' @ [180:60] ==> public final val SHORT_NAMES_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.Companion[PropertyDescriptorImpl]

'descriptor' @ [181:13] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[ValueParameterDescriptorImpl]

'valueParameters' @ [181:24] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [181:40] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'parametersRenderer' @ [182:13] ==> var parametersRenderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[LocalVariableDescriptor]

'parametersRenderer' @ [182:34] ==> var parametersRenderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[LocalVariableDescriptor]

'withOptions' @ [182:53] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'valueParametersHandler' @ [183:17] ==> public abstract var valueParametersHandler: DescriptorRenderer.ValueParametersHandler defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'this' @ [183:95] ==> <this> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda.<anonymous>[ReceiverParameterDescriptorImpl]

'valueParametersHandler' @ [183:100] ==> public abstract var valueParametersHandler: DescriptorRenderer.ValueParametersHandler defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'builder' @ [185:25] ==> value-parameter builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda.<anonymous>.<no name provided>.appendBeforeValueParameter[ValueParameterDescriptorImpl]

'append' @ [185:33] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'parametersRenderer' @ [190:38] ==> var parametersRenderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[LocalVariableDescriptor]

'renderValueParameters' @ [190:57] ==> public abstract fun renderValueParameters(parameters: Collection<ValueParameterDescriptor>, synthesizedParameterNames: Boolean): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'listOf' @ [190:79] ==> public fun <T> listOf(element: (ValueParameterDescriptor..ValueParameterDescriptor?)): List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'descriptor' @ [190:86] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[ValueParameterDescriptorImpl]

'valueParameters' @ [190:97] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'last' @ [190:113] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.last(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'descriptor' @ [190:122] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[ValueParameterDescriptorImpl]

'hasSynthesizedParameterNames' @ [190:133] ==> public abstract fun hasSynthesizedParameterNames(): Boolean defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'lookupElement' @ [192:9] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[LocalVariableDescriptor]

'LookupElementDecorator<LookupElement>' @ [192:34] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'lookupElement' @ [192:72] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[LocalVariableDescriptor]

'super' @ [194:17] ==> <this> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda.<no name provided>[LazyClassReceiverParameterDescriptor]

'renderElement' @ [194:23] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'presentation' @ [194:37] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'presentation' @ [196:17] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'clearTail' @ [196:30] ==> public open fun clearTail(): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'presentation' @ [197:17] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'appendTailText' @ [197:30] ==> public open fun appendTailText(@NotNull p0: String, p1: Boolean): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'lambdaPresentation' @ [197:48] ==> val lambdaPresentation: String defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[LocalVariableDescriptor]

'presentation' @ [198:17] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'appendTailText' @ [198:30] ==> public open fun appendTailText(@NotNull p0: String, p1: Boolean): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'parametersPresentation' @ [198:45] ==> val parametersPresentation: String defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[LocalVariableDescriptor]

'basicFactory' @ [199:17] ==> public final val basicFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'appendContainerAndReceiverInformation' @ [199:30] ==> public final fun appendContainerAndReceiverInformation(descriptor: CallableDescriptor, appendTailText: (String) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [199:68] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[ValueParameterDescriptorImpl]

'presentation' @ [199:82] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'appendTailText' @ [199:95] ==> public open fun appendTailText(@NotNull p0: String, p1: Boolean): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'it' @ [199:110] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda.<no name provided>.renderElement.<anonymous>[ValueParameterDescriptorImpl]

'Normal' @ [203:45] ==> public constructor Normal(callType: CallType<*>, inputTypeArguments: Boolean, inputValueArguments: Boolean, argumentText: String = ..., lambdaInfo: GenerateLambdaInfo? = ..., argumentsOnly: Boolean = ...) defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[ClassConstructorDescriptorImpl]

'callType' @ [203:52] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'inputTypeArguments' @ [203:62] ==> val inputTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[LocalVariableDescriptor]

'lambdaInfo' @ [203:124] ==> val lambdaInfo: GenerateLambdaInfo defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[LocalVariableDescriptor]

'handleInsert' @ [203:136] ==> public open fun handleInsert(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[SimpleFunctionDescriptorImpl]

'context' @ [203:149] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'this' @ [203:158] ==> <this> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda.<no name provided>[LazyClassReceiverParameterDescriptor]

'lookupElement' @ [207:16] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithLambda[LocalVariableDescriptor]

'descriptor' @ [211:13] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createSuperFunctionCallWithArguments[ValueParameterDescriptorImpl]

'valueParameters' @ [211:24] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [211:40] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [212:13] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createSuperFunctionCallWithArguments[ValueParameterDescriptorImpl]

'findOriginalTopMostOverriddenDescriptors' @ [212:24] ==> public fun <D : CallableDescriptor> FunctionDescriptor.findOriginalTopMostOverriddenDescriptors(): Set<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> FunctionDescriptor

'none' @ [212:67] ==> public inline fun <T> Iterable<FunctionDescriptor>.none(predicate: (FunctionDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'it' @ [212:74] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createSuperFunctionCallWithArguments.<anonymous>[ValueParameterDescriptorImpl]

'superFunctions' @ [212:80] ==> private final val superFunctions: Set<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'descriptor' @ [214:28] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createSuperFunctionCallWithArguments[ValueParameterDescriptorImpl]

'valueParameters' @ [214:39] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'joinToString' @ [214:55] ==> public fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((ValueParameterDescriptor..ValueParameterDescriptor?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'+' @ [215:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (it.varargElementType != null) "*" else ""' @ [215:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [215:18] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createSuperFunctionCallWithArguments.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [215:21] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'it' @ [215:63] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createSuperFunctionCallWithArguments.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [215:66] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'render' @ [215:71] ==> public fun Name.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'createFunctionCallElementWithArguments' @ [218:29] ==> private final fun createFunctionCallElementWithArguments(descriptor: FunctionDescriptor, argumentText: String, useReceiverTypes: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [218:68] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createSuperFunctionCallWithArguments[ValueParameterDescriptorImpl]

'argumentText' @ [218:80] ==> val argumentText: String defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createSuperFunctionCallWithArguments[LocalVariableDescriptor]

'lookupElement' @ [219:9] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createSuperFunctionCallWithArguments[LocalVariableDescriptor]

'assignPriority' @ [219:23] ==> public fun LookupElement.assignPriority(priority: ItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'SUPER_METHOD_WITH_ARGUMENTS' @ [219:51] ==> enum entry SUPER_METHOD_WITH_ARGUMENTS defined in org.jetbrains.kotlin.idea.completion.ItemPriority[FakeCallableDescriptorForObject]

'lookupElement' @ [220:9] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createSuperFunctionCallWithArguments[LocalVariableDescriptor]

'putUserData' @ [220:23] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Unit..Unit?)>, @Nullable p1: Unit?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'SUPPRESS_ITEM_SELECTION_BY_CHARS_ON_TYPING' @ [220:62] ==> public final val SUPPRESS_ITEM_SELECTION_BY_CHARS_ON_TYPING: Key<Unit> defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.Companion[PropertyDescriptorImpl]

'Unit' @ [220:106] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'lookupElement' @ [221:16] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createSuperFunctionCallWithArguments[LocalVariableDescriptor]

'createLookupElement' @ [225:29] ==> public open fun createLookupElement(descriptor: DeclarationDescriptor, useReceiverTypes: Boolean, qualifyNestedClasses: Boolean, includeClassTypeArguments: Boolean, parametersAndTypeGrayed: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [225:49] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithArguments[ValueParameterDescriptorImpl]

'useReceiverTypes' @ [225:61] ==> value-parameter useReceiverTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithArguments[ValueParameterDescriptorImpl]

'insertHandlerProvider' @ [227:34] ==> public final val insertHandlerProvider: InsertHandlerProvider defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'insertHandler' @ [227:56] ==> public final fun insertHandler(descriptor: DeclarationDescriptor): InsertHandler<LookupElement> defined in org.jetbrains.kotlin.idea.completion.InsertHandlerProvider[SimpleFunctionDescriptorImpl]

'descriptor' @ [227:70] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithArguments[ValueParameterDescriptorImpl]

'inputTypeArguments' @ [227:121] ==> public final val inputTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[PropertyDescriptorImpl]

'FunctionCallWithArgumentsLookupElement' @ [228:16] ==> public constructor FunctionCallWithArgumentsLookupElement(originalLookupElement: LookupElement, descriptor: FunctionDescriptor, argumentText: String, needTypeArguments: Boolean) defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement[ClassConstructorDescriptorImpl]

'lookupElement' @ [228:55] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithArguments[LocalVariableDescriptor]

'descriptor' @ [228:70] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithArguments[ValueParameterDescriptorImpl]

'argumentText' @ [228:82] ==> value-parameter argumentText: String defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithArguments[ValueParameterDescriptorImpl]

'needTypeArguments' @ [228:96] ==> val needTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createFunctionCallElementWithArguments[LocalVariableDescriptor]

'LookupElementDecorator<LookupElement>' @ [236:9] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'originalLookupElement' @ [236:47] ==> value-parameter originalLookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement.<init>[ValueParameterDescriptorImpl]

'other' @ [238:44] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement.equals[ValueParameterDescriptorImpl]

'delegate' @ [238:95] ==> public final val LookupElementFactory.FunctionCallWithArgumentsLookupElement.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'other' @ [238:107] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement.equals[ValueParameterDescriptorImpl]

'delegate' @ [238:113] ==> public final val LookupElementFactory.FunctionCallWithArgumentsLookupElement.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'argumentText' @ [238:125] ==> private final val argumentText: String defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement[PropertyDescriptorImpl]

'other' @ [238:141] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement.equals[ValueParameterDescriptorImpl]

'argumentText' @ [238:147] ==> private final val argumentText: String defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement[PropertyDescriptorImpl]

'delegate' @ [239:35] ==> public final val LookupElementFactory.FunctionCallWithArgumentsLookupElement.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'hashCode' @ [239:44] ==> public open fun hashCode(): Int defined in com.intellij.codeInsight.lookup.LookupElement[DeserializedSimpleFunctionDescriptor]

'argumentText' @ [239:62] ==> private final val argumentText: String defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement[PropertyDescriptorImpl]

'hashCode' @ [239:75] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'super' @ [242:13] ==> <this> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement[LazyClassReceiverParameterDescriptor]

'renderElement' @ [242:19] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'presentation' @ [242:33] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement.renderElement[ValueParameterDescriptorImpl]

'presentation' @ [244:13] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement.renderElement[ValueParameterDescriptorImpl]

'clearTail' @ [244:26] ==> public open fun clearTail(): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'presentation' @ [245:13] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement.renderElement[ValueParameterDescriptorImpl]

'appendTailText' @ [245:26] ==> public open fun appendTailText(@NotNull p0: String, p1: Boolean): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'argumentText' @ [245:44] ==> private final val argumentText: String defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement[PropertyDescriptorImpl]

'basicFactory' @ [246:13] ==> public final val basicFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'appendContainerAndReceiverInformation' @ [246:26] ==> public final fun appendContainerAndReceiverInformation(descriptor: CallableDescriptor, appendTailText: (String) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [246:64] ==> private final val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement[PropertyDescriptorImpl]

'presentation' @ [246:78] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement.renderElement[ValueParameterDescriptorImpl]

'appendTailText' @ [246:91] ==> public open fun appendTailText(@NotNull p0: String, p1: Boolean): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'it' @ [246:106] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement.renderElement.<anonymous>[ValueParameterDescriptorImpl]

'Normal' @ [250:41] ==> public constructor Normal(callType: CallType<*>, inputTypeArguments: Boolean, inputValueArguments: Boolean, argumentText: String = ..., lambdaInfo: GenerateLambdaInfo? = ..., argumentsOnly: Boolean = ...) defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[ClassConstructorDescriptorImpl]

'callType' @ [250:48] ==> private final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'needTypeArguments' @ [250:79] ==> private final val needTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement[PropertyDescriptorImpl]

'argumentText' @ [250:142] ==> private final val argumentText: String defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement[PropertyDescriptorImpl]

'handleInsert' @ [251:22] ==> public open fun handleInsert(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.KotlinFunctionInsertHandler.Normal[SimpleFunctionDescriptorImpl]

'context' @ [251:35] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement.handleInsert[ValueParameterDescriptorImpl]

'this' @ [251:44] ==> <this> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.FunctionCallWithArgumentsLookupElement[LazyClassReceiverParameterDescriptor]

'basicFactory' @ [262:23] ==> public final val basicFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'createLookupElement' @ [262:36] ==> public final fun createLookupElement(descriptor: DeclarationDescriptor, qualifyNestedClasses: Boolean = ..., includeClassTypeArguments: Boolean = ..., parametersAndTypeGrayed: Boolean = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [262:56] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createLookupElement[ValueParameterDescriptorImpl]

'qualifyNestedClasses' @ [262:68] ==> value-parameter qualifyNestedClasses: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createLookupElement[ValueParameterDescriptorImpl]

'includeClassTypeArguments' @ [262:90] ==> value-parameter includeClassTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createLookupElement[ValueParameterDescriptorImpl]

'parametersAndTypeGrayed' @ [262:117] ==> value-parameter parametersAndTypeGrayed: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createLookupElement[ValueParameterDescriptorImpl]

'useReceiverTypes' @ [264:13] ==> value-parameter useReceiverTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createLookupElement[ValueParameterDescriptorImpl]

'callableWeight' @ [265:26] ==> private final fun callableWeight(descriptor: DeclarationDescriptor): CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [265:41] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createLookupElement[ValueParameterDescriptorImpl]

'weight' @ [266:17] ==> val weight: CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createLookupElement[LocalVariableDescriptor]

'element' @ [267:17] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createLookupElement[LocalVariableDescriptor]

'putUserData' @ [267:25] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(CallableWeight..CallableWeight?)>, @Nullable p1: CallableWeight?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.completion.CallableWeight..org.jetbrains.kotlin.idea.completion.CallableWeight?)

'CALLABLE_WEIGHT_KEY' @ [267:37] ==> public val CALLABLE_WEIGHT_KEY: Key<CallableWeight> defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'weight' @ [267:58] ==> val weight: CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createLookupElement[LocalVariableDescriptor]

'element' @ [270:13] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createLookupElement[LocalVariableDescriptor]

'element' @ [270:23] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createLookupElement[LocalVariableDescriptor]

'boldIfImmediate' @ [270:31] ==> private final fun LookupElement.boldIfImmediate(weight: CallableWeight?): LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'weight' @ [270:47] ==> val weight: CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createLookupElement[LocalVariableDescriptor]

'element' @ [272:16] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.createLookupElement[LocalVariableDescriptor]

'when (weight?.enum) {
            CallableWeightEnum.thisClassMember, CallableWeightEnum.thisTypeExtension -> Style.BOLD
            CallableWeightEnum.receiverCastRequired -> Style.GRAYED
            else -> Style.NORMAL
        }' @ [276:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LookupElementFactory.Style, entry1: LookupElementFactory.Style, entry2: LookupElementFactory.Style): LookupElementFactory.Style[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Style

'weight' @ [276:27] ==> value-parameter weight: CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.boldIfImmediate[ValueParameterDescriptorImpl]

'enum' @ [276:35] ==> public final val enum: CallableWeightEnum defined in org.jetbrains.kotlin.idea.completion.CallableWeight[PropertyDescriptorImpl]

'thisClassMember' @ [277:32] ==> enum entry thisClassMember defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'thisTypeExtension' @ [277:68] ==> enum entry thisTypeExtension defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'BOLD' @ [277:95] ==> enum entry BOLD defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.Style[FakeCallableDescriptorForObject]

'receiverCastRequired' @ [278:32] ==> enum entry receiverCastRequired defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'GRAYED' @ [278:62] ==> enum entry GRAYED defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.Style[FakeCallableDescriptorForObject]

'NORMAL' @ [279:27] ==> enum entry NORMAL defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.Style[FakeCallableDescriptorForObject]

'if (style != Style.NORMAL) {
            object : LookupElementDecorator<LookupElement>(this) {
                override fun renderElement(presentation: LookupElementPresentation) {
                    super.renderElement(presentation)
                    if (style == Style.BOLD) {
                        presentation.isItemTextBold = true
                    }
                    else {
                        presentation.itemTextForeground = LookupCellRenderer.getGrayedForeground(false)
                        // gray all tail fragments too:
                        val fragments = presentation.tailFragments
                        presentation.clearTail()
                        for (fragment in fragments) {
                            presentation.appendTailText(fragment.text, true)
                        }
                    }
                }
            }
        }
        else {
            this
        }' @ [281:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LookupElement, elseBranch: LookupElement): LookupElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LookupElement

'style' @ [281:20] ==> val style: LookupElementFactory.Style defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.boldIfImmediate[LocalVariableDescriptor]

'NORMAL' @ [281:35] ==> enum entry NORMAL defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.Style[FakeCallableDescriptorForObject]

'LookupElementDecorator<LookupElement>' @ [282:22] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'this' @ [282:60] ==> <this> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.boldIfImmediate[ReceiverParameterDescriptorImpl]

'super' @ [284:21] ==> <this> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.boldIfImmediate.<no name provided>[LazyClassReceiverParameterDescriptor]

'renderElement' @ [284:27] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'presentation' @ [284:41] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.boldIfImmediate.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'if (style == Style.BOLD) {
                        presentation.isItemTextBold = true
                    }
                    else {
                        presentation.itemTextForeground = LookupCellRenderer.getGrayedForeground(false)
                        // gray all tail fragments too:
                        val fragments = presentation.tailFragments
                        presentation.clearTail()
                        for (fragment in fragments) {
                            presentation.appendTailText(fragment.text, true)
                        }
                    }' @ [285:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'style' @ [285:25] ==> val style: LookupElementFactory.Style defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.boldIfImmediate[LocalVariableDescriptor]

'BOLD' @ [285:40] ==> enum entry BOLD defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.Style[FakeCallableDescriptorForObject]

'presentation' @ [286:25] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.boldIfImmediate.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'isItemTextBold' @ [286:38] ==> public final var LookupElementPresentation.isItemTextBold: Boolean[MyPropertyDescriptor]

'presentation' @ [289:25] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.boldIfImmediate.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'itemTextForeground' @ [289:38] ==> public final var LookupElementPresentation.itemTextForeground: Color[MyPropertyDescriptor]

'getGrayedForeground' @ [289:78] ==> public open fun getGrayedForeground(p0: Boolean): (Color..Color?) defined in com.intellij.codeInsight.lookup.impl.LookupCellRenderer[JavaMethodDescriptor]

'presentation' @ [291:41] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.boldIfImmediate.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'tailFragments' @ [291:54] ==> public final val LookupElementPresentation.tailFragments: (MutableList<(LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?)>..List<(LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?)>)[MyPropertyDescriptor]

'presentation' @ [292:25] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.boldIfImmediate.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'clearTail' @ [292:38] ==> public open fun clearTail(): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'fragments' @ [293:42] ==> val fragments: (MutableList<(LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?)>..List<(LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?)>) defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.boldIfImmediate.<no name provided>.renderElement[LocalVariableDescriptor]

'presentation' @ [294:29] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.boldIfImmediate.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'appendTailText' @ [294:42] ==> public open fun appendTailText(@NotNull p0: String, p1: Boolean): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'fragment' @ [294:57] ==> val fragment: (LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?) defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.boldIfImmediate.<no name provided>.renderElement[LocalVariableDescriptor]

'text' @ [294:66] ==> public final val text: (String..String?) defined in com.intellij.codeInsight.lookup.LookupElementPresentation.TextFragment[JavaPropertyDescriptor]

'this' @ [301:13] ==> <this> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.boldIfImmediate[ReceiverParameterDescriptorImpl]

'receiverTypes' @ [312:13] ==> private final val receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'descriptor' @ [313:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeight[ValueParameterDescriptorImpl]

'descriptor' @ [316:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeight[ValueParameterDescriptorImpl]

'callableWeight' @ [317:20] ==> private final fun callableWeight(descriptor: DeclarationDescriptor): CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [317:35] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeight[ValueParameterDescriptorImpl]

'getMethod' @ [317:46] ==> public abstract val getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'descriptor' @ [319:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeight[ValueParameterDescriptorImpl]

'callableWeight' @ [320:20] ==> private final fun callableWeight(descriptor: DeclarationDescriptor): CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [320:35] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeight[ValueParameterDescriptorImpl]

'baseDescriptorForSynthetic' @ [320:46] ==> public abstract val baseDescriptorForSynthetic: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterExtensionFunctionDescriptor[DeserializedPropertyDescriptor]

'descriptor' @ [323:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeight[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [323:24] ==> public final val CallableDescriptor.overriddenDescriptors: (MutableCollection<out (CallableDescriptor..CallableDescriptor?)>..Collection<(CallableDescriptor..CallableDescriptor?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [323:46] ==> @InlineOnly public inline fun <T> Collection<(CallableDescriptor..CallableDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'descriptor' @ [325:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeight[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [325:24] ==> public final val CallableDescriptor.overriddenDescriptors: (MutableCollection<out (CallableDescriptor..CallableDescriptor?)>..Collection<(CallableDescriptor..CallableDescriptor?)>)[MyPropertyDescriptor]

'mapNotNull' @ [326:22] ==> public inline fun <T, R : Any> Iterable<(CallableDescriptor..CallableDescriptor?)>.mapNotNull(transform: ((CallableDescriptor..CallableDescriptor?)) -> CallableWeight?): List<CallableWeight> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)
    <R : Any> -> CallableWeight

'it' @ [326:35] ==> value-parameter it: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeight.<anonymous>[ValueParameterDescriptorImpl]

'callableWeightBasedOnReceiver' @ [326:38] ==> private final fun CallableDescriptor.callableWeightBasedOnReceiver(receiverTypes: Collection<ReceiverType>, onReceiverTypeMismatch: CallableWeight?): CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'receiverTypes' @ [326:68] ==> private final val receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'minBy' @ [327:22] ==> public inline fun <T, R : Comparable<CallableWeightEnum>> Iterable<CallableWeight>.minBy(selector: (CallableWeight) -> CallableWeightEnum): CallableWeight? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableWeight
    <R : Comparable<R>> -> CallableWeightEnum

'it' @ [327:30] ==> value-parameter it: CallableWeight defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeight.<anonymous>[ValueParameterDescriptorImpl]

'enum' @ [327:33] ==> public final val enum: CallableWeightEnum defined in org.jetbrains.kotlin.idea.completion.CallableWeight[PropertyDescriptorImpl]

'let' @ [328:23] ==> @InlineOnly public inline fun <T, R> CallableWeight.let(block: (CallableWeight) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableWeight
    <R> -> Nothing

'it' @ [328:36] ==> value-parameter it: CallableWeight defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeight.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [330:30] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeight[ValueParameterDescriptorImpl]

'overriddenTreeUniqueAsSequence' @ [330:41] ==> public fun <D : CallableDescriptor> CallableDescriptor.overriddenTreeUniqueAsSequence(useOriginal: Boolean): Sequence<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> CallableDescriptor

'overridden' @ [331:20] ==> val overridden: Sequence<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeight[LocalVariableDescriptor]

'map' @ [332:22] ==> public fun <T, R> Sequence<CallableDescriptor>.map(transform: (CallableDescriptor) -> CallableWeight): Sequence<CallableWeight> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R> -> CallableWeight

'callableWeightBasic' @ [332:28] ==> private final fun callableWeightBasic(descriptor: CallableDescriptor, receiverTypes: Collection<ReceiverType>): CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'it' @ [332:48] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeight.<anonymous>[ValueParameterDescriptorImpl]

'receiverTypes' @ [332:52] ==> private final val receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'minBy' @ [333:22] ==> public inline fun <T, R : Comparable<CallableWeightEnum>> Sequence<CallableWeight>.minBy(selector: (CallableWeight) -> CallableWeightEnum): CallableWeight? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableWeight
    <R : Comparable<R>> -> CallableWeightEnum

'it' @ [333:30] ==> value-parameter it: CallableWeight defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeight.<anonymous>[ValueParameterDescriptorImpl]

'enum' @ [333:33] ==> public final val enum: CallableWeightEnum defined in org.jetbrains.kotlin.idea.completion.CallableWeight[PropertyDescriptorImpl]

'callableWeightBasic' @ [336:16] ==> private final fun callableWeightBasic(descriptor: CallableDescriptor, receiverTypes: Collection<ReceiverType>): CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [336:36] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeight[ValueParameterDescriptorImpl]

'receiverTypes' @ [336:48] ==> private final val receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[PropertyDescriptorImpl]

'descriptor' @ [340:9] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasic[ValueParameterDescriptorImpl]

'callableWeightBasedOnReceiver' @ [340:20] ==> private final fun CallableDescriptor.callableWeightBasedOnReceiver(receiverTypes: Collection<ReceiverType>, onReceiverTypeMismatch: CallableWeight?): CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'receiverTypes' @ [340:50] ==> value-parameter receiverTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasic[ValueParameterDescriptorImpl]

'receiverCastRequired' @ [340:80] ==> public final val receiverCastRequired: CallableWeight defined in org.jetbrains.kotlin.idea.completion.CallableWeight.Companion[PropertyDescriptorImpl]

'let' @ [340:103] ==> @InlineOnly public inline fun <T, R> CallableWeight.let(block: (CallableWeight) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableWeight
    <R> -> Nothing

'it' @ [340:116] ==> value-parameter it: CallableWeight defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasic.<anonymous>[ValueParameterDescriptorImpl]

'when (descriptor.containingDeclaration) {
            is PackageFragmentDescriptor, is ClassifierDescriptor -> CallableWeight.globalOrStatic
            else -> CallableWeight.local
        }' @ [342:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallableWeight?, entry1: CallableWeight?): CallableWeight?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallableWeight?

'descriptor' @ [342:22] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasic[ValueParameterDescriptorImpl]

'containingDeclaration' @ [342:33] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'globalOrStatic' @ [343:85] ==> public final val globalOrStatic: CallableWeight defined in org.jetbrains.kotlin.idea.completion.CallableWeight.Companion[PropertyDescriptorImpl]

'local' @ [344:36] ==> public final val local: CallableWeight defined in org.jetbrains.kotlin.idea.completion.CallableWeight.Companion[PropertyDescriptorImpl]

'listOfNotNull' @ [353:29] ==> public fun <T : Any> listOfNotNull(vararg elements: ReceiverParameterDescriptor?): List<ReceiverParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ReceiverParameterDescriptor

'extensionReceiverParameter' @ [353:43] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'dispatchReceiverParameter' @ [353:71] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'receiverTypes' @ [355:45] ==> value-parameter receiverTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[ValueParameterDescriptorImpl]

'filterNot' @ [355:59] ==> public inline fun <T> Iterable<ReceiverType>.filterNot(predicate: (ReceiverType) -> Boolean): List<ReceiverType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverType

'it' @ [355:71] ==> value-parameter it: ReceiverType defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver.<anonymous>[ValueParameterDescriptorImpl]

'implicit' @ [355:74] ==> public final val implicit: Boolean defined in org.jetbrains.kotlin.idea.util.ReceiverType[DeserializedPropertyDescriptor]

'ifEmpty' @ [355:85] ==> public inline fun <T, C : Collection<ReceiverType>> Collection<ReceiverType>.ifEmpty(body: () -> Collection<ReceiverType>): Collection<ReceiverType> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverType
    <C : Collection<T>> -> Collection<ReceiverType>

'receiverTypes' @ [355:95] ==> value-parameter receiverTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[ValueParameterDescriptorImpl]

'bothReceivers' @ [357:23] ==> val bothReceivers: List<ReceiverParameterDescriptor> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'zip' @ [357:37] ==> public infix fun <T, R> Iterable<ReceiverParameterDescriptor>.zip(other: Iterable<Collection<ReceiverType>>): List<Pair<ReceiverParameterDescriptor, Collection<ReceiverType>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> Collection<ReceiverType>

'generateSequence' @ [357:41] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: Collection<ReceiverType>?, nextFunction: (Collection<ReceiverType>) -> Collection<ReceiverType>?): Sequence<Collection<ReceiverType>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Collection<ReceiverType>

'receiverTypesForFirstReceiver' @ [357:58] ==> val receiverTypesForFirstReceiver: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'receiverTypes' @ [357:91] ==> value-parameter receiverTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[ValueParameterDescriptorImpl]

'asIterable' @ [357:107] ==> public fun <T> Sequence<Collection<ReceiverType>>.asIterable(): Iterable<Collection<ReceiverType>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<ReceiverType>

'map' @ [358:18] ==> public inline fun <T, R> Iterable<Pair<ReceiverParameterDescriptor, Collection<ReceiverType>>>.map(transform: (Pair<ReceiverParameterDescriptor, Collection<ReceiverType>>) -> CallableWeight?): List<CallableWeight?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ReceiverParameterDescriptor, Collection<ReceiverType>>
    <R> -> CallableWeight?

'component1' @ [358:25] ==> public final operator fun component1(): ReceiverParameterDescriptor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [358:44] ==> public final operator fun component2(): Collection<ReceiverType> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'callableWeightBasedOnReceiver' @ [359:21] ==> private final fun CallableDescriptor.callableWeightBasedOnReceiver(receiverTypes: Collection<ReceiverType>, onReceiverTypeMismatch: CallableWeight?, receiverParameter: ReceiverParameterDescriptor): CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'receiverTypes' @ [359:51] ==> val receiverTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver.<anonymous>[LocalVariableDescriptor]

'onReceiverTypeMismatch' @ [359:66] ==> value-parameter onReceiverTypeMismatch: CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[ValueParameterDescriptorImpl]

'receiverParameter' @ [359:90] ==> val receiverParameter: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver.<anonymous>[LocalVariableDescriptor]

'weights' @ [362:13] ==> val weights: List<CallableWeight?> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'any' @ [362:21] ==> public inline fun <T> Iterable<CallableWeight?>.any(predicate: (CallableWeight?) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableWeight?

'it' @ [362:27] ==> value-parameter it: CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver.<anonymous>[ValueParameterDescriptorImpl]

'onReceiverTypeMismatch' @ [362:33] ==> value-parameter onReceiverTypeMismatch: CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[ValueParameterDescriptorImpl]

'onReceiverTypeMismatch' @ [362:66] ==> value-parameter onReceiverTypeMismatch: CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[ValueParameterDescriptorImpl]

'weights' @ [363:16] ==> val weights: List<CallableWeight?> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'firstOrNull' @ [363:24] ==> public fun <T> List<CallableWeight?>.firstOrNull(): CallableWeight? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableWeight?

'==' @ [371:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'receiverParameter' @ [371:14] ==> value-parameter receiverParameter: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[ValueParameterDescriptorImpl]

'value' @ [371:32] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'type' @ [371:62] ==> public final val TransientReceiver.type: KotlinType[MyPropertyDescriptor]

'isFunctionType' @ [371:68] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'HashSet' @ [373:39] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Int

'receiverTypes' @ [376:30] ==> value-parameter receiverTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[ValueParameterDescriptorImpl]

'callableWeightForReceiverType' @ [377:26] ==> private final fun CallableDescriptor.callableWeightForReceiverType(receiverType: KotlinType, receiverParameterType: KotlinType): CallableWeightEnum? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'receiverType' @ [377:56] ==> val receiverType: ReceiverType defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'type' @ [377:69] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.ReceiverType[DeserializedPropertyDescriptor]

'receiverParameter' @ [377:75] ==> value-parameter receiverParameter: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[ValueParameterDescriptorImpl]

'type' @ [377:93] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'weight' @ [378:17] ==> val weight: CallableWeightEnum? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'bestWeight' @ [379:21] ==> var bestWeight: CallableWeightEnum? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'weight' @ [379:43] ==> val weight: CallableWeightEnum? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'bestWeight' @ [379:52] ==> var bestWeight: CallableWeightEnum? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'bestWeight' @ [380:21] ==> var bestWeight: CallableWeightEnum? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'weight' @ [380:34] ==> val weight: CallableWeightEnum? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'bestReceiverType' @ [381:21] ==> var bestReceiverType: ReceiverType? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'receiverType' @ [381:40] ==> val receiverType: ReceiverType defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'matchingReceiverIndices' @ [383:17] ==> val matchingReceiverIndices: HashSet<Int> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'add' @ [383:41] ==> public open fun add(element: Int): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'receiverType' @ [383:45] ==> val receiverType: ReceiverType defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'receiverIndex' @ [383:58] ==> public final val receiverIndex: Int defined in org.jetbrains.kotlin.idea.util.ReceiverType[DeserializedPropertyDescriptor]

'bestWeight' @ [387:13] ==> var bestWeight: CallableWeightEnum? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'onReceiverTypeMismatch' @ [387:40] ==> value-parameter onReceiverTypeMismatch: CallableWeight? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[ValueParameterDescriptorImpl]

'bestReceiverType' @ [389:29] ==> var bestReceiverType: ReceiverType? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'receiverIndex' @ [389:48] ==> public final val receiverIndex: Int defined in org.jetbrains.kotlin.idea.util.ReceiverType[DeserializedPropertyDescriptor]

'receiverIndex' @ [391:40] ==> val receiverIndex: Int defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'receiverTypes' @ [392:32] ==> value-parameter receiverTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[ValueParameterDescriptorImpl]

'map' @ [392:46] ==> public inline fun <T, R> Iterable<ReceiverType>.map(transform: (ReceiverType) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverType
    <R> -> Int

'it' @ [392:52] ==> value-parameter it: ReceiverType defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver.<anonymous>[ValueParameterDescriptorImpl]

'receiverIndex' @ [392:55] ==> public final val receiverIndex: Int defined in org.jetbrains.kotlin.idea.util.ReceiverType[DeserializedPropertyDescriptor]

'max' @ [392:71] ==> public fun <T : Comparable<Int>> Iterable<Int>.max(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'maxReceiverIndex' @ [393:13] ==> val maxReceiverIndex: Int defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'..' @ [394:40] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'maxReceiverIndex' @ [394:43] ==> val maxReceiverIndex: Int defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'all' @ [394:61] ==> public inline fun <T> Iterable<Int>.all(predicate: (Int) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [394:67] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver.<anonymous>[ValueParameterDescriptorImpl]

'matchingReceiverIndices' @ [394:73] ==> val matchingReceiverIndices: HashSet<Int> defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'matchesAllReceivers' @ [395:17] ==> val matchesAllReceivers: Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'receiverIndexToUse' @ [396:17] ==> var receiverIndexToUse: Int? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'CallableWeight' @ [400:16] ==> public constructor CallableWeight(enum: CallableWeightEnum, receiverIndex: Int?) defined in org.jetbrains.kotlin.idea.completion.CallableWeight[ClassConstructorDescriptorImpl]

'bestWeight' @ [400:31] ==> var bestWeight: CallableWeightEnum? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'receiverIndexToUse' @ [400:43] ==> var receiverIndexToUse: Int? defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightBasedOnReceiver[LocalVariableDescriptor]

'when {
        TypeUtils.equalTypes(receiverType, receiverParameterType) -> when {
            isExtensionForTypeParameter() -> CallableWeightEnum.typeParameterExtension
            isExtension -> CallableWeightEnum.thisTypeExtension
            else -> CallableWeightEnum.thisClassMember
        }
        receiverType.isSubtypeOf(receiverParameterType) -> if (isExtension) CallableWeightEnum.baseTypeExtension else CallableWeightEnum.baseClassMember
        else -> null
    }' @ [406:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallableWeightEnum?, entry1: CallableWeightEnum?, entry2: CallableWeightEnum?): CallableWeightEnum?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallableWeightEnum?

'equalTypes' @ [407:19] ==> public open fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'receiverType' @ [407:30] ==> value-parameter receiverType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightForReceiverType[ValueParameterDescriptorImpl]

'receiverParameterType' @ [407:44] ==> value-parameter receiverParameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightForReceiverType[ValueParameterDescriptorImpl]

'when {
            isExtensionForTypeParameter() -> CallableWeightEnum.typeParameterExtension
            isExtension -> CallableWeightEnum.thisTypeExtension
            else -> CallableWeightEnum.thisClassMember
        }' @ [407:70] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallableWeightEnum, entry1: CallableWeightEnum, entry2: CallableWeightEnum): CallableWeightEnum[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallableWeightEnum

'isExtensionForTypeParameter' @ [408:13] ==> private final fun CallableDescriptor.isExtensionForTypeParameter(): Boolean defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'typeParameterExtension' @ [408:65] ==> enum entry typeParameterExtension defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'isExtension' @ [409:13] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'thisTypeExtension' @ [409:47] ==> enum entry thisTypeExtension defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'thisClassMember' @ [410:40] ==> enum entry thisClassMember defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'receiverType' @ [412:9] ==> value-parameter receiverType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightForReceiverType[ValueParameterDescriptorImpl]

'isSubtypeOf' @ [412:22] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'receiverParameterType' @ [412:34] ==> value-parameter receiverParameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.callableWeightForReceiverType[ValueParameterDescriptorImpl]

'if (isExtension) CallableWeightEnum.baseTypeExtension else CallableWeightEnum.baseClassMember' @ [412:60] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableWeightEnum, elseBranch: CallableWeightEnum): CallableWeightEnum[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableWeightEnum

'isExtension' @ [412:64] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'baseTypeExtension' @ [412:96] ==> enum entry baseTypeExtension defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'baseClassMember' @ [412:138] ==> enum entry baseClassMember defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'original' @ [417:33] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'extensionReceiverParameter' @ [417:42] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'receiverParameter' @ [418:29] ==> val receiverParameter: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.isExtensionForTypeParameter[LocalVariableDescriptor]

'type' @ [418:47] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [418:52] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [418:64] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'typeParameter' @ [419:16] ==> val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory.isExtensionForTypeParameter[LocalVariableDescriptor]

'containingDeclaration' @ [419:30] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'original' @ [419:55] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

