'IrDeclarationOriginImpl' @ [44:13] ==> public constructor IrDeclarationOriginImpl(name: String) defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOriginImpl[DeserializedClassConstructorDescriptor]

'IrStatementOriginImpl' @ [47:13] ==> public constructor IrStatementOriginImpl(debugName: String) defined in org.jetbrains.kotlin.ir.expressions.IrStatementOriginImpl[DeserializedClassConstructorDescriptor]

'irDeclarationContainer' @ [50:13] ==> value-parameter irDeclarationContainer: IrDeclarationContainer defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.lower[ValueParameterDescriptorImpl]

'irDeclarationContainer' @ [51:17] ==> value-parameter irDeclarationContainer: IrDeclarationContainer defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.lower[ValueParameterDescriptorImpl]

'descriptor' @ [51:40] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[DeserializedPropertyDescriptor]

'parents' @ [51:51] ==> public val DeclarationDescriptor.parents: Sequence<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'any' @ [51:59] ==> public inline fun <T> Sequence<DeclarationDescriptor>.any(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [51:65] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'lambdasCount' @ [59:9] ==> private final var lambdasCount: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering[PropertyDescriptorImpl]

'irDeclarationContainer' @ [61:9] ==> value-parameter irDeclarationContainer: IrDeclarationContainer defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.lower[ValueParameterDescriptorImpl]

'declarations' @ [61:32] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationContainer[DeserializedPropertyDescriptor]

'transformFlat' @ [61:45] ==> public inline fun <T> MutableList<IrDeclaration>.transformFlat(transformation: (IrDeclaration) -> List<IrDeclaration>?): Unit defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'when (memberDeclaration) {
                is IrFunction -> LocalDeclarationsTransformer(memberDeclaration).lowerLocalDeclarations()
                is IrProperty -> LocalDeclarationsTransformer(memberDeclaration).lowerLocalDeclarations()
                is IrField -> LocalDeclarationsTransformer(memberDeclaration).lowerLocalDeclarations()
                is IrAnonymousInitializer -> LocalDeclarationsTransformer(memberDeclaration).lowerLocalDeclarations()
                else -> null
            }' @ [63:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<IrDeclaration>?, entry1: List<IrDeclaration>?, entry2: List<IrDeclaration>?, entry3: List<IrDeclaration>?, entry4: List<IrDeclaration>?): List<IrDeclaration>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<IrDeclaration>?

'memberDeclaration' @ [63:19] ==> value-parameter memberDeclaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'LocalDeclarationsTransformer' @ [64:34] ==> public constructor LocalDeclarationsTransformer(memberDeclaration: IrDeclaration) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[ClassConstructorDescriptorImpl]

'memberDeclaration' @ [64:63] ==> value-parameter memberDeclaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'lowerLocalDeclarations' @ [64:82] ==> public final fun lowerLocalDeclarations(): List<IrDeclaration>? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'LocalDeclarationsTransformer' @ [65:34] ==> public constructor LocalDeclarationsTransformer(memberDeclaration: IrDeclaration) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[ClassConstructorDescriptorImpl]

'memberDeclaration' @ [65:63] ==> value-parameter memberDeclaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'lowerLocalDeclarations' @ [65:82] ==> public final fun lowerLocalDeclarations(): List<IrDeclaration>? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'LocalDeclarationsTransformer' @ [66:31] ==> public constructor LocalDeclarationsTransformer(memberDeclaration: IrDeclaration) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[ClassConstructorDescriptorImpl]

'memberDeclaration' @ [66:60] ==> value-parameter memberDeclaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'lowerLocalDeclarations' @ [66:79] ==> public final fun lowerLocalDeclarations(): List<IrDeclaration>? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'LocalDeclarationsTransformer' @ [67:46] ==> public constructor LocalDeclarationsTransformer(memberDeclaration: IrDeclaration) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[ClassConstructorDescriptorImpl]

'memberDeclaration' @ [67:75] ==> value-parameter memberDeclaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'lowerLocalDeclarations' @ [67:94] ==> public final fun lowerLocalDeclarations(): List<IrDeclaration>? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'LocalContext' @ [82:66] ==> public constructor LocalContext() defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalContext[ClassConstructorDescriptorImpl]

'declaration' @ [86:21] ==> public abstract val declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalContextWithClosureAsParameters[PropertyDescriptorImpl]

'descriptor' @ [86:33] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'HashMap' @ [91:93] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ValueDescriptor
    <V : (Any..Any?)> -> IrValueParameterSymbol

'capturedValueToParameter' @ [94:29] ==> public final val capturedValueToParameter: MutableMap<ValueDescriptor, IrValueParameterSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalContextWithClosureAsParameters[PropertyDescriptorImpl]

'descriptor' @ [94:54] ==> value-parameter descriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalContextWithClosureAsParameters.irGet[ValueParameterDescriptorImpl]

'IrGetValueImpl' @ [96:20] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [96:35] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalContextWithClosureAsParameters.irGet[ValueParameterDescriptorImpl]

'endOffset' @ [96:48] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalContextWithClosureAsParameters.irGet[ValueParameterDescriptorImpl]

'newSymbol' @ [96:59] ==> val newSymbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalContextWithClosureAsParameters.irGet[LocalVariableDescriptor]

'LocalContextWithClosureAsParameters' @ [100:80] ==> public constructor LocalContextWithClosureAsParameters() defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalContextWithClosureAsParameters[ClassConstructorDescriptorImpl]

'-' @ [106:26] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [109:44] ==> public open val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'LocalContextWithClosureAsParameters' @ [112:91] ==> public constructor LocalContextWithClosureAsParameters() defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalContextWithClosureAsParameters[ClassConstructorDescriptorImpl]

'declaration' @ [114:21] ==> public open val declaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassConstructorContext[PropertyDescriptorImpl]

'descriptor' @ [114:33] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'descriptor' @ [120:52] ==> public open val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassConstructorContext[PropertyDescriptorImpl]

'LocalContext' @ [123:65] ==> public constructor LocalContext() defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalContext[ClassConstructorDescriptorImpl]

'declaration' @ [125:21] ==> public final val declaration: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[PropertyDescriptorImpl]

'descriptor' @ [125:33] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'HashMap' @ [129:74] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ValueDescriptor
    <V : (Any..Any?)> -> IrField

'capturedValueToField' @ [132:25] ==> public final val capturedValueToField: MutableMap<ValueDescriptor, IrField> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[PropertyDescriptorImpl]

'descriptor' @ [132:46] ==> value-parameter descriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext.irGet[ValueParameterDescriptorImpl]

'IrGetFieldImpl' @ [134:20] ==> public constructor IrGetFieldImpl(startOffset: Int, endOffset: Int, symbol: IrFieldSymbol, receiver: IrExpression?, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetFieldImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [134:35] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext.irGet[ValueParameterDescriptorImpl]

'endOffset' @ [134:48] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext.irGet[ValueParameterDescriptorImpl]

'field' @ [134:59] ==> val field: IrField defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext.irGet[LocalVariableDescriptor]

'symbol' @ [134:65] ==> public abstract val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'IrGetValueImpl' @ [135:32] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [135:47] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext.irGet[ValueParameterDescriptorImpl]

'endOffset' @ [135:60] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext.irGet[ValueParameterDescriptorImpl]

'declaration' @ [135:71] ==> public final val declaration: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[PropertyDescriptorImpl]

'thisReceiver' @ [135:83] ==> public abstract var thisReceiver: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'symbol' @ [135:98] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'descriptor' @ [140:42] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[PropertyDescriptorImpl]

'LinkedHashMap' @ [144:84] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FunctionDescriptor
    <V : (Any..Any?)> -> LocalFunctionContext

'LinkedHashMap' @ [145:76] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ClassDescriptor
    <V : (Any..Any?)> -> LocalClassContext

'LinkedHashMap' @ [146:108] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ClassConstructorDescriptor
    <V : (Any..Any?)> -> LocalClassConstructorContext

'mutableMapOf' @ [148:39] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<DeclarationDescriptor, IrSymbol> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DeclarationDescriptor
    <V> -> IrSymbol

'transformedDeclarations' @ [151:21] ==> public final val transformedDeclarations: MutableMap<DeclarationDescriptor, IrSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'this' @ [151:45] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.transformed[ReceiverParameterDescriptorImpl]

'HashMap' @ [153:90] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ParameterDescriptor
    <V : (Any..Any?)> -> IrValueParameterSymbol

'HashMap' @ [154:87] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ParameterDescriptor
    <V : (Any..Any?)> -> ParameterDescriptor

'HashMap' @ [155:91] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ValueParameterDescriptor
    <V : (Any..Any?)> -> IrValueSymbol

'collectLocalDeclarations' @ [158:13] ==> private final fun collectLocalDeclarations(): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'localFunctions' @ [159:17] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalDeclarationsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'isEmpty' @ [159:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'localClasses' @ [159:45] ==> public final val localClasses: MutableMap<ClassDescriptor, LocalDeclarationsLowering.LocalClassContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'isEmpty' @ [159:58] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'collectClosures' @ [161:13] ==> private final fun collectClosures(): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'transformDescriptors' @ [163:13] ==> private final fun transformDescriptors(): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'rewriteDeclarations' @ [165:13] ==> private final fun rewriteDeclarations(): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'collectRewrittenDeclarations' @ [167:26] ==> private final fun collectRewrittenDeclarations(): ArrayList<IrDeclaration> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'result' @ [168:20] ==> val result: ArrayList<IrDeclaration> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.lowerLocalDeclarations[LocalVariableDescriptor]

'ArrayList' @ [172:17] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrDeclaration

'localFunctions' @ [172:42] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalDeclarationsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'size' @ [172:57] ==> public abstract val size: Int defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'localClasses' @ [172:64] ==> public final val localClasses: MutableMap<ClassDescriptor, LocalDeclarationsLowering.LocalClassContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'size' @ [172:77] ==> public abstract val size: Int defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'apply' @ [172:87] ==> @InlineOnly public inline fun <T> ArrayList<IrDeclaration>.apply(block: ArrayList<IrDeclaration>.() -> Unit): ArrayList<IrDeclaration> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<IrDeclaration>

'add' @ [173:21] ==> public open fun add(element: IrDeclaration): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'memberDeclaration' @ [173:25] ==> public final val memberDeclaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'localFunctions' @ [175:21] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalDeclarationsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'values' @ [175:36] ==> public abstract val values: MutableCollection<LocalDeclarationsLowering.LocalFunctionContext> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'mapTo' @ [175:43] ==> public inline fun <T, R, C : MutableCollection<in IrSimpleFunction>> Iterable<LocalDeclarationsLowering.LocalFunctionContext>.mapTo(destination: ArrayList<IrDeclaration>, transform: (LocalDeclarationsLowering.LocalFunctionContext) -> IrSimpleFunction): ArrayList<IrDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalFunctionContext
    <R> -> IrSimpleFunction
    <C : MutableCollection<in R>> -> ArrayList<IrDeclaration>

'this' @ [175:49] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectRewrittenDeclarations.<anonymous>[ReceiverParameterDescriptorImpl]

'it' @ [176:40] ==> value-parameter it: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [176:43] ==> public open val declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'it' @ [177:25] ==> value-parameter it: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'transformedDeclaration' @ [177:28] ==> public open lateinit var transformedDeclaration: IrSimpleFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'apply' @ [177:51] ==> @InlineOnly public inline fun <T> IrSimpleFunction.apply(block: IrSimpleFunction.() -> Unit): IrSimpleFunction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrSimpleFunction

'this' @ [178:29] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'body' @ [178:34] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'original' @ [178:41] ==> val original: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'body' @ [178:50] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'original' @ [180:29] ==> val original: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [180:38] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'valueParameters' @ [180:49] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'filter' @ [180:65] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.filter(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [180:74] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'declaresDefaultValue' @ [180:77] ==> public abstract fun declaresDefaultValue(): Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'forEach' @ [180:102] ==> @HidesMembers public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.forEach(action: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'original' @ [181:44] ==> val original: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getDefault' @ [181:53] ==> public fun IrFunction.getDefault(parameter: ValueParameterDescriptor): IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'argument' @ [181:64] ==> value-parameter argument: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'oldParameterToNew' @ [182:33] ==> public final val oldParameterToNew: MutableMap<ParameterDescriptor, IrValueParameterSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'argument' @ [182:51] ==> value-parameter argument: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [182:63] ==> public abstract val owner: IrValueParameter defined in org.jetbrains.kotlin.ir.symbols.IrValueParameterSymbol[DeserializedPropertyDescriptor]

'defaultValue' @ [182:69] ==> public abstract var defaultValue: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'body' @ [182:84] ==> val body: IrExpressionBody defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'localClasses' @ [187:21] ==> public final val localClasses: MutableMap<ClassDescriptor, LocalDeclarationsLowering.LocalClassContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'values' @ [187:34] ==> public abstract val values: MutableCollection<LocalDeclarationsLowering.LocalClassContext> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'mapTo' @ [187:41] ==> public inline fun <T, R, C : MutableCollection<in IrClass>> Iterable<LocalDeclarationsLowering.LocalClassContext>.mapTo(destination: ArrayList<IrDeclaration>, transform: (LocalDeclarationsLowering.LocalClassContext) -> IrClass): ArrayList<IrDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalClassContext
    <R> -> IrClass
    <C : MutableCollection<in R>> -> ArrayList<IrDeclaration>

'this' @ [187:47] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectRewrittenDeclarations.<anonymous>[ReceiverParameterDescriptorImpl]

'it' @ [188:25] ==> value-parameter it: LocalDeclarationsLowering.LocalClassContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [188:28] ==> public final val declaration: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[PropertyDescriptorImpl]

'IrElementTransformerVoid' @ [192:87] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'if (declaration.descriptor in localClasses) {
                    // Replace local class definition with an empty composite.
                    return IrCompositeImpl(declaration.startOffset, declaration.endOffset, context.builtIns.unitType)
                } else {
                    return super.visitClass(declaration)
                }' @ [195:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'declaration' @ [195:21] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitClass[ValueParameterDescriptorImpl]

'descriptor' @ [195:33] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'localClasses' @ [195:47] ==> public final val localClasses: MutableMap<ClassDescriptor, LocalDeclarationsLowering.LocalClassContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'IrCompositeImpl' @ [197:28] ==> public constructor IrCompositeImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCompositeImpl[DeserializedClassConstructorDescriptor]

'declaration' @ [197:44] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitClass[ValueParameterDescriptorImpl]

'startOffset' @ [197:56] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'declaration' @ [197:69] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitClass[ValueParameterDescriptorImpl]

'endOffset' @ [197:81] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'context' @ [197:92] ==> public final val context: BackendContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering[PropertyDescriptorImpl]

'builtIns' @ [197:100] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.BackendContext[PropertyDescriptorImpl]

'unitType' @ [197:109] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'super' @ [199:28] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[LazyClassReceiverParameterDescriptor]

'visitClass' @ [199:34] ==> public open fun visitClass(declaration: IrClass): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [199:45] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitClass[ValueParameterDescriptorImpl]

'if (declaration.descriptor in localFunctions) {
                    // Replace local function definition with an empty composite.
                    return IrCompositeImpl(declaration.startOffset, declaration.endOffset, context.builtIns.unitType)
                } else {
                    return super.visitFunction(declaration)
                }' @ [204:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'declaration' @ [204:21] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunction[ValueParameterDescriptorImpl]

'descriptor' @ [204:33] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'localFunctions' @ [204:47] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalDeclarationsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'IrCompositeImpl' @ [206:28] ==> public constructor IrCompositeImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCompositeImpl[DeserializedClassConstructorDescriptor]

'declaration' @ [206:44] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunction[ValueParameterDescriptorImpl]

'startOffset' @ [206:56] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'declaration' @ [206:69] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunction[ValueParameterDescriptorImpl]

'endOffset' @ [206:81] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'context' @ [206:92] ==> public final val context: BackendContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering[PropertyDescriptorImpl]

'builtIns' @ [206:100] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.BackendContext[PropertyDescriptorImpl]

'unitType' @ [206:109] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'super' @ [208:28] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[LazyClassReceiverParameterDescriptor]

'visitFunction' @ [208:34] ==> public open fun visitFunction(declaration: IrFunction): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [208:48] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunction[ValueParameterDescriptorImpl]

'localClassConstructors' @ [215:42] ==> public final val localClassConstructors: MutableMap<ClassConstructorDescriptor, LocalDeclarationsLowering.LocalClassConstructorContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'declaration' @ [215:65] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitConstructor[ValueParameterDescriptorImpl]

'descriptor' @ [215:77] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'if (constructorContext != null) {
                    return constructorContext.transformedDeclaration.apply {
                        this.body = declaration.body!!

                        declaration.descriptor.valueParameters.filter { it.declaresDefaultValue() }.forEach { argument ->
                            val body = declaration.getDefault(argument)!!
                            oldParameterToNew[argument]!!.owner.defaultValue = body
                        }
                    }
                } else {
                    return super.visitConstructor(declaration)
                }' @ [216:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'constructorContext' @ [216:21] ==> val constructorContext: LocalDeclarationsLowering.LocalClassConstructorContext? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitConstructor[LocalVariableDescriptor]

'constructorContext' @ [217:28] ==> val constructorContext: LocalDeclarationsLowering.LocalClassConstructorContext? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitConstructor[LocalVariableDescriptor]

'transformedDeclaration' @ [217:47] ==> public open lateinit var transformedDeclaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassConstructorContext[PropertyDescriptorImpl]

'apply' @ [217:70] ==> @InlineOnly public inline fun <T> IrConstructor.apply(block: IrConstructor.() -> Unit): IrConstructor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrConstructor

'this' @ [218:25] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitConstructor.<anonymous>[ReceiverParameterDescriptorImpl]

'body' @ [218:30] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'declaration' @ [218:37] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitConstructor[ValueParameterDescriptorImpl]

'body' @ [218:49] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'declaration' @ [220:25] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitConstructor[ValueParameterDescriptorImpl]

'descriptor' @ [220:37] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'valueParameters' @ [220:48] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'filter' @ [220:64] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.filter(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [220:73] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'declaresDefaultValue' @ [220:76] ==> public abstract fun declaresDefaultValue(): Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'forEach' @ [220:101] ==> @HidesMembers public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.forEach(action: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'declaration' @ [221:40] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitConstructor[ValueParameterDescriptorImpl]

'getDefault' @ [221:52] ==> public fun IrFunction.getDefault(parameter: ValueParameterDescriptor): IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'argument' @ [221:63] ==> value-parameter argument: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'oldParameterToNew' @ [222:29] ==> public final val oldParameterToNew: MutableMap<ParameterDescriptor, IrValueParameterSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'argument' @ [222:47] ==> value-parameter argument: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [222:59] ==> public abstract val owner: IrValueParameter defined in org.jetbrains.kotlin.ir.symbols.IrValueParameterSymbol[DeserializedPropertyDescriptor]

'defaultValue' @ [222:65] ==> public abstract var defaultValue: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'body' @ [222:80] ==> val body: IrExpressionBody defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitConstructor.<anonymous>.<anonymous>[LocalVariableDescriptor]

'super' @ [226:28] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[LazyClassReceiverParameterDescriptor]

'visitConstructor' @ [226:34] ==> public open fun visitConstructor(declaration: IrConstructor): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [226:51] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitConstructor[ValueParameterDescriptorImpl]

'expression' @ [231:34] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitGetValue[ValueParameterDescriptorImpl]

'descriptor' @ [231:45] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'localContext' @ [233:17] ==> public final val localContext: LocalDeclarationsLowering.LocalContext? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[PropertyDescriptorImpl]

'irGet' @ [233:31] ==> public abstract fun irGet(startOffset: Int, endOffset: Int, descriptor: ValueDescriptor): IrExpression? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalContext[SimpleFunctionDescriptorImpl]

'expression' @ [233:37] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitGetValue[ValueParameterDescriptorImpl]

'startOffset' @ [233:48] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'expression' @ [233:61] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitGetValue[ValueParameterDescriptorImpl]

'endOffset' @ [233:72] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'descriptor' @ [233:83] ==> val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitGetValue[LocalVariableDescriptor]

'let' @ [233:96] ==> @InlineOnly public inline fun <T, R> IrExpression.let(block: (IrExpression) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression
    <R> -> Nothing

'it' @ [234:28] ==> value-parameter it: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitGetValue.<anonymous>[ValueParameterDescriptorImpl]

'oldParameterToNew' @ [237:17] ==> public final val oldParameterToNew: MutableMap<ParameterDescriptor, IrValueParameterSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'descriptor' @ [237:35] ==> val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitGetValue[LocalVariableDescriptor]

'let' @ [237:48] ==> @InlineOnly public inline fun <T, R> IrValueParameterSymbol.let(block: (IrValueParameterSymbol) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameterSymbol
    <R> -> Nothing

'IrGetValueImpl' @ [238:28] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'expression' @ [238:43] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitGetValue[ValueParameterDescriptorImpl]

'startOffset' @ [238:54] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'expression' @ [238:67] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitGetValue[ValueParameterDescriptorImpl]

'endOffset' @ [238:78] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'it' @ [238:89] ==> value-parameter it: IrValueParameterSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitGetValue.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [241:24] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitGetValue[ValueParameterDescriptorImpl]

'expression' @ [245:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitCall[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [245:28] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [245:50] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[LazyClassReceiverParameterDescriptor]

'expression' @ [247:33] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitCall[ValueParameterDescriptorImpl]

'descriptor' @ [247:44] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'original' @ [247:55] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'oldCallee' @ [248:33] ==> val oldCallee: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitCall[LocalVariableDescriptor]

'transformed' @ [248:43] ==> public final val FunctionDescriptor.transformed: IrFunctionSymbol? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'expression' @ [248:65] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitCall[ValueParameterDescriptorImpl]

'createNewCall' @ [250:31] ==> private final fun createNewCall(oldCall: IrCall, newCallee: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'expression' @ [250:45] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitCall[ValueParameterDescriptorImpl]

'newCallee' @ [250:57] ==> val newCallee: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitCall[LocalVariableDescriptor]

'fillArguments' @ [250:68] ==> private final fun <T : IrMemberAccessExpression> IrCall.fillArguments(oldExpression: IrMemberAccessExpression): IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrMemberAccessExpression> -> IrCall

'expression' @ [250:82] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitCall[ValueParameterDescriptorImpl]

'newCall' @ [252:24] ==> val newCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitCall[LocalVariableDescriptor]

'expression' @ [256:17] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [256:28] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [256:50] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[LazyClassReceiverParameterDescriptor]

'expression' @ [258:33] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'descriptor' @ [258:44] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'original' @ [258:55] ==> public final val ClassConstructorDescriptor.original: ClassConstructorDescriptor[MyPropertyDescriptor]

'transformedDeclarations' @ [259:33] ==> public final val transformedDeclarations: MutableMap<DeclarationDescriptor, IrSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'oldCallee' @ [259:57] ==> val oldCallee: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDelegatingConstructorCall[LocalVariableDescriptor]

'expression' @ [259:102] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'IrDelegatingConstructorCallImpl' @ [261:37] ==> public constructor IrDelegatingConstructorCallImpl(startOffset: Int, endOffset: Int, symbol: IrConstructorSymbol, descriptor: ClassConstructorDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedClassConstructorDescriptor]

'expression' @ [262:25] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'startOffset' @ [262:36] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'expression' @ [262:49] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'endOffset' @ [262:60] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall[DeserializedPropertyDescriptor]

'newCallee' @ [263:25] ==> val newCallee: IrConstructorSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDelegatingConstructorCall[LocalVariableDescriptor]

'newCallee' @ [264:25] ==> val newCallee: IrConstructorSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDelegatingConstructorCall[LocalVariableDescriptor]

'descriptor' @ [264:35] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol[DeserializedPropertyDescriptor]

'remapTypeArguments' @ [265:25] ==> private final fun remapTypeArguments(oldExpression: IrMemberAccessExpression, newCallee: CallableDescriptor): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'expression' @ [265:44] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'newCallee' @ [265:56] ==> val newCallee: IrConstructorSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDelegatingConstructorCall[LocalVariableDescriptor]

'descriptor' @ [265:66] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol[DeserializedPropertyDescriptor]

'fillArguments' @ [266:19] ==> private final fun <T : IrMemberAccessExpression> IrDelegatingConstructorCallImpl.fillArguments(oldExpression: IrMemberAccessExpression): IrDelegatingConstructorCallImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrMemberAccessExpression> -> IrDelegatingConstructorCallImpl

'expression' @ [266:33] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'newExpression' @ [268:24] ==> val newExpression: IrDelegatingConstructorCallImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDelegatingConstructorCall[LocalVariableDescriptor]

'mapValueParameters' @ [273:17] ==> public inline fun <T : IrMemberAccessExpression> T.mapValueParameters(transform: (ValueParameterDescriptor) -> IrExpression?): T defined in org.jetbrains.kotlin.ir.expressions[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrMemberAccessExpression> -> T

'newParameterToOld' @ [274:40] ==> public final val newParameterToOld: MutableMap<ParameterDescriptor, ParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'newValueParameterDescriptor' @ [274:58] ==> value-parameter newValueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[ValueParameterDescriptorImpl]

'if (oldParameter != null) {
                        oldExpression.getValueArgument(oldParameter as ValueParameterDescriptor)
                    } else {
                        // The callee expects captured value as argument.
                        val capturedValueSymbol =
                                newParameterToCaptured[newValueParameterDescriptor] ?:
                                        throw AssertionError("Non-mapped parameter $newValueParameterDescriptor")

                        val capturedValueDescriptor = capturedValueSymbol.descriptor
                        localContext?.irGet(
                                oldExpression.startOffset, oldExpression.endOffset,
                                capturedValueDescriptor
                        ) ?:
                                // Captured value is directly available for the caller.
                                IrGetValueImpl(oldExpression.startOffset, oldExpression.endOffset,
                                        oldParameterToNew[capturedValueDescriptor] ?: capturedValueSymbol)
                    }' @ [276:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression?, elseBranch: IrExpression?): IrExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression?

'oldParameter' @ [276:25] ==> val oldParameter: ParameterDescriptor? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[LocalVariableDescriptor]

'oldExpression' @ [277:25] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments[ValueParameterDescriptorImpl]

'getValueArgument' @ [277:39] ==> public fun IrMemberAccessExpression.getValueArgument(valueParameterDescriptor: ValueParameterDescriptor): IrExpression? defined in org.jetbrains.kotlin.ir.expressions[DeserializedSimpleFunctionDescriptor]

'oldParameter' @ [277:56] ==> val oldParameter: ParameterDescriptor? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[LocalVariableDescriptor]

'newParameterToCaptured' @ [281:33] ==> public final val newParameterToCaptured: MutableMap<ValueParameterDescriptor, IrValueSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'newValueParameterDescriptor' @ [281:56] ==> value-parameter newValueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [282:47] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'newValueParameterDescriptor' @ [282:85] ==> value-parameter newValueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[ValueParameterDescriptorImpl]

'capturedValueSymbol' @ [284:55] ==> val capturedValueSymbol: IrValueSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [284:75] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrValueSymbol[DeserializedPropertyDescriptor]

'localContext' @ [285:25] ==> public final val localContext: LocalDeclarationsLowering.LocalContext? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[PropertyDescriptorImpl]

'irGet' @ [285:39] ==> public abstract fun irGet(startOffset: Int, endOffset: Int, descriptor: ValueDescriptor): IrExpression? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalContext[SimpleFunctionDescriptorImpl]

'oldExpression' @ [286:33] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments[ValueParameterDescriptorImpl]

'startOffset' @ [286:47] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'oldExpression' @ [286:60] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments[ValueParameterDescriptorImpl]

'endOffset' @ [286:74] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'capturedValueDescriptor' @ [287:33] ==> val capturedValueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[LocalVariableDescriptor]

'IrGetValueImpl' @ [290:33] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'oldExpression' @ [290:48] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments[ValueParameterDescriptorImpl]

'startOffset' @ [290:62] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'oldExpression' @ [290:75] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments[ValueParameterDescriptorImpl]

'endOffset' @ [290:89] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'oldParameterToNew' @ [291:41] ==> public final val oldParameterToNew: MutableMap<ParameterDescriptor, IrValueParameterSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'capturedValueDescriptor' @ [291:59] ==> val capturedValueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[LocalVariableDescriptor]

'capturedValueSymbol' @ [291:87] ==> val capturedValueSymbol: IrValueSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[LocalVariableDescriptor]

'dispatchReceiver' @ [296:17] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'oldExpression' @ [296:36] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [296:50] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'extensionReceiver' @ [297:17] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'oldExpression' @ [297:37] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments[ValueParameterDescriptorImpl]

'extensionReceiver' @ [297:51] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'this' @ [299:24] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.fillArguments[ReceiverParameterDescriptorImpl]

'expression' @ [303:17] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [303:28] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [303:50] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[LazyClassReceiverParameterDescriptor]

'expression' @ [305:33] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'descriptor' @ [305:44] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[DeserializedPropertyDescriptor]

'original' @ [305:55] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'oldCallee' @ [306:33] ==> val oldCallee: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunctionReference[LocalVariableDescriptor]

'transformed' @ [306:43] ==> public final val FunctionDescriptor.transformed: IrFunctionSymbol? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'expression' @ [306:65] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'IrFunctionReferenceImpl' @ [308:44] ==> public constructor IrFunctionReferenceImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrFunctionSymbol, descriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrFunctionReferenceImpl[DeserializedClassConstructorDescriptor]

'expression' @ [309:25] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'startOffset' @ [309:36] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[DeserializedPropertyDescriptor]

'expression' @ [309:49] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'endOffset' @ [309:60] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[DeserializedPropertyDescriptor]

'expression' @ [310:25] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'type' @ [310:36] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[DeserializedPropertyDescriptor]

'newCallee' @ [311:25] ==> val newCallee: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunctionReference[LocalVariableDescriptor]

'newCallee' @ [312:25] ==> val newCallee: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunctionReference[LocalVariableDescriptor]

'descriptor' @ [312:35] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol[DeserializedPropertyDescriptor]

'remapTypeArguments' @ [313:25] ==> private final fun remapTypeArguments(oldExpression: IrMemberAccessExpression, newCallee: CallableDescriptor): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'expression' @ [313:44] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'newCallee' @ [313:56] ==> val newCallee: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunctionReference[LocalVariableDescriptor]

'descriptor' @ [313:66] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol[DeserializedPropertyDescriptor]

'expression' @ [314:25] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'origin' @ [314:36] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[DeserializedPropertyDescriptor]

'fillArguments' @ [315:19] ==> private final fun <T : IrMemberAccessExpression> IrFunctionReferenceImpl.fillArguments(oldExpression: IrMemberAccessExpression): IrFunctionReferenceImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrMemberAccessExpression> -> IrFunctionReferenceImpl

'expression' @ [315:33] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'newCallableReference' @ [317:24] ==> val newCallableReference: IrFunctionReferenceImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitFunctionReference[LocalVariableDescriptor]

'expression' @ [321:17] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitReturn[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [321:28] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [321:50] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[LazyClassReceiverParameterDescriptor]

'expression' @ [323:39] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitReturn[ValueParameterDescriptorImpl]

'returnTarget' @ [323:50] ==> public abstract val returnTarget: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'oldReturnTarget' @ [324:39] ==> val oldReturnTarget: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitReturn[LocalVariableDescriptor]

'transformed' @ [324:55] ==> public final val FunctionDescriptor.transformed: IrFunctionSymbol? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'expression' @ [324:77] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitReturn[ValueParameterDescriptorImpl]

'IrReturnImpl' @ [326:24] ==> public constructor IrReturnImpl(startOffset: Int, endOffset: Int, returnTargetSymbol: IrFunctionSymbol, value: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl[DeserializedClassConstructorDescriptor]

'expression' @ [326:37] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitReturn[ValueParameterDescriptorImpl]

'startOffset' @ [326:48] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'expression' @ [326:61] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitReturn[ValueParameterDescriptorImpl]

'endOffset' @ [326:72] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'newReturnTarget' @ [326:83] ==> val newReturnTarget: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitReturn[LocalVariableDescriptor]

'expression' @ [326:100] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitReturn[ValueParameterDescriptorImpl]

'value' @ [326:111] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'expression' @ [330:21] ==> value-parameter expression: IrDeclarationReference defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDeclarationReference[ValueParameterDescriptorImpl]

'descriptor' @ [330:32] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrDeclarationReference[DeserializedPropertyDescriptor]

'transformedDeclarations' @ [330:46] ==> public final val transformedDeclarations: MutableMap<DeclarationDescriptor, IrSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'TODO' @ [331:21] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'super' @ [333:24] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[LazyClassReceiverParameterDescriptor]

'visitDeclarationReference' @ [333:30] ==> public open fun visitDeclarationReference(expression: IrDeclarationReference): IrExpression defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [333:56] ==> value-parameter expression: IrDeclarationReference defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDeclarationReference[ValueParameterDescriptorImpl]

'declaration' @ [337:21] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [337:33] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[DeserializedPropertyDescriptor]

'transformedDeclarations' @ [337:47] ==> public final val transformedDeclarations: MutableMap<DeclarationDescriptor, IrSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'TODO' @ [338:21] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'super' @ [340:24] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[LazyClassReceiverParameterDescriptor]

'visitDeclaration' @ [340:30] ==> public open fun visitDeclaration(declaration: IrDeclaration): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [340:47] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter.visitDeclaration[ValueParameterDescriptorImpl]

'irDeclaration' @ [345:13] ==> value-parameter irDeclaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteFunctionBody[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [345:27] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'FunctionBodiesRewriter' @ [345:49] ==> public constructor FunctionBodiesRewriter(localContext: LocalDeclarationsLowering.LocalContext?) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[ClassConstructorDescriptorImpl]

'localContext' @ [345:72] ==> value-parameter localContext: LocalDeclarationsLowering.LocalContext? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteFunctionBody[ValueParameterDescriptorImpl]

'irClass' @ [349:13] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [349:21] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'FunctionBodiesRewriter' @ [349:43] ==> public constructor FunctionBodiesRewriter(localContext: LocalDeclarationsLowering.LocalContext?) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.FunctionBodiesRewriter[ClassConstructorDescriptorImpl]

'localClassContext' @ [349:66] ==> value-parameter localClassContext: LocalDeclarationsLowering.LocalClassContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers[ValueParameterDescriptorImpl]

'irClass' @ [351:35] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers[ValueParameterDescriptorImpl]

'descriptor' @ [351:43] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'classDescriptor' @ [352:44] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers[LocalVariableDescriptor]

'constructors' @ [352:60] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'map' @ [353:22] ==> public inline fun <T, R> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.map(transform: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> LocalDeclarationsLowering.LocalClassConstructorContext): List<LocalDeclarationsLowering.LocalClassConstructorContext> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)
    <R> -> LocalClassConstructorContext

'localClassConstructors' @ [353:28] ==> public final val localClassConstructors: MutableMap<ClassConstructorDescriptor, LocalDeclarationsLowering.LocalClassConstructorContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'it' @ [353:51] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [354:22] ==> public inline fun <T> Iterable<LocalDeclarationsLowering.LocalClassConstructorContext>.filter(predicate: (LocalDeclarationsLowering.LocalClassConstructorContext) -> Boolean): List<LocalDeclarationsLowering.LocalClassConstructorContext> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalClassConstructorContext

'it' @ [354:31] ==> value-parameter it: LocalDeclarationsLowering.LocalClassConstructorContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [354:34] ==> public open val declaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassConstructorContext[PropertyDescriptorImpl]

'callsSuper' @ [354:46] ==> public fun IrConstructor.callsSuper(): Boolean defined in org.jetbrains.kotlin.backend.common.lower in file LowerUtils.kt[SimpleFunctionDescriptorImpl]

'assert' @ [355:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'constructorsCallingSuper' @ [355:20] ==> val constructorsCallingSuper: List<LocalDeclarationsLowering.LocalClassConstructorContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers[LocalVariableDescriptor]

'any' @ [355:45] ==> public fun <T> Iterable<LocalDeclarationsLowering.LocalClassConstructorContext>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalClassConstructorContext

'classDescriptor' @ [355:112] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers[LocalVariableDescriptor]

'localClassContext' @ [357:13] ==> value-parameter localClassContext: LocalDeclarationsLowering.LocalClassContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers[ValueParameterDescriptorImpl]

'capturedValueToField' @ [357:31] ==> public final val capturedValueToField: MutableMap<ValueDescriptor, IrField> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[PropertyDescriptorImpl]

'forEach' @ [357:52] ==> public final fun forEach(p0: (ValueDescriptor, IrField) -> Unit): Unit defined in kotlin.collections.MutableMap[MyFunctionDescriptor]

'irClass' @ [358:35] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers[ValueParameterDescriptorImpl]

'startOffset' @ [358:43] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'irClass' @ [359:33] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers[ValueParameterDescriptorImpl]

'endOffset' @ [359:41] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'irClass' @ [360:17] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers[ValueParameterDescriptorImpl]

'declarations' @ [360:25] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'add' @ [360:38] ==> public abstract fun add(element: IrDeclaration): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'field' @ [360:42] ==> value-parameter field: IrField defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[ValueParameterDescriptorImpl]

'constructorsCallingSuper' @ [362:44] ==> val constructorsCallingSuper: List<LocalDeclarationsLowering.LocalClassConstructorContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers[LocalVariableDescriptor]

'constructorContext' @ [363:37] ==> val constructorContext: LocalDeclarationsLowering.LocalClassConstructorContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[LocalVariableDescriptor]

'declaration' @ [363:56] ==> public open val declaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassConstructorContext[PropertyDescriptorImpl]

'body' @ [363:68] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'AssertionError' @ [364:38] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'constructorContext' @ [364:85] ==> val constructorContext: LocalDeclarationsLowering.LocalClassConstructorContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[LocalVariableDescriptor]

'declaration' @ [364:104] ==> public open val declaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassConstructorContext[PropertyDescriptorImpl]

'body' @ [364:116] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'constructorContext' @ [365:51] ==> val constructorContext: LocalDeclarationsLowering.LocalClassConstructorContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[LocalVariableDescriptor]

'irGet' @ [365:70] ==> public open fun irGet(startOffset: Int, endOffset: Int, descriptor: ValueDescriptor): IrExpression? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassConstructorContext[SimpleFunctionDescriptorImpl]

'startOffset' @ [365:76] ==> val startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [365:89] ==> val endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[LocalVariableDescriptor]

'capturedValue' @ [365:100] ==> value-parameter capturedValue: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[ValueParameterDescriptorImpl]

'blockBody' @ [366:21] ==> val blockBody: IrBlockBody defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[LocalVariableDescriptor]

'statements' @ [366:31] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlockBody[DeserializedPropertyDescriptor]

'add' @ [366:42] ==> public abstract fun add(index: Int, element: IrStatement): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrSetFieldImpl' @ [367:29] ==> public constructor IrSetFieldImpl(startOffset: Int, endOffset: Int, symbol: IrFieldSymbol, receiver: IrExpression?, value: IrExpression, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSetFieldImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [367:44] ==> val startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [367:57] ==> val endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[LocalVariableDescriptor]

'field' @ [367:68] ==> value-parameter field: IrField defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [367:74] ==> public abstract val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'IrGetValueImpl' @ [368:37] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [368:52] ==> val startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [368:65] ==> val endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[LocalVariableDescriptor]

'irClass' @ [368:76] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers[ValueParameterDescriptorImpl]

'thisReceiver' @ [368:84] ==> public abstract var thisReceiver: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'symbol' @ [368:99] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'capturedValueExpression' @ [369:37] ==> val capturedValueExpression: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteClassMembers.<anonymous>[LocalVariableDescriptor]

'STATEMENT_ORIGIN_INITIALIZER_OF_FIELD_FOR_CAPTURED_VALUE' @ [369:62] ==> private object STATEMENT_ORIGIN_INITIALIZER_OF_FIELD_FOR_CAPTURED_VALUE : IrStatementOriginImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering[FakeCallableDescriptorForObject]

'localFunctions' @ [375:13] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalDeclarationsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'values' @ [375:28] ==> public abstract val values: MutableCollection<LocalDeclarationsLowering.LocalFunctionContext> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'forEach' @ [375:35] ==> @HidesMembers public inline fun <T> Iterable<LocalDeclarationsLowering.LocalFunctionContext>.forEach(action: (LocalDeclarationsLowering.LocalFunctionContext) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalFunctionContext

'rewriteFunctionBody' @ [376:17] ==> private final fun rewriteFunctionBody(irDeclaration: IrDeclaration, localContext: LocalDeclarationsLowering.LocalContext?): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'it' @ [376:37] ==> value-parameter it: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [376:40] ==> public open val declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'it' @ [376:53] ==> value-parameter it: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'localClassConstructors' @ [379:13] ==> public final val localClassConstructors: MutableMap<ClassConstructorDescriptor, LocalDeclarationsLowering.LocalClassConstructorContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'values' @ [379:36] ==> public abstract val values: MutableCollection<LocalDeclarationsLowering.LocalClassConstructorContext> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'forEach' @ [379:43] ==> @HidesMembers public inline fun <T> Iterable<LocalDeclarationsLowering.LocalClassConstructorContext>.forEach(action: (LocalDeclarationsLowering.LocalClassConstructorContext) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalClassConstructorContext

'rewriteFunctionBody' @ [380:17] ==> private final fun rewriteFunctionBody(irDeclaration: IrDeclaration, localContext: LocalDeclarationsLowering.LocalContext?): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'it' @ [380:37] ==> value-parameter it: LocalDeclarationsLowering.LocalClassConstructorContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [380:40] ==> public open val declaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassConstructorContext[PropertyDescriptorImpl]

'it' @ [380:53] ==> value-parameter it: LocalDeclarationsLowering.LocalClassConstructorContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'localClasses' @ [383:13] ==> public final val localClasses: MutableMap<ClassDescriptor, LocalDeclarationsLowering.LocalClassContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'values' @ [383:26] ==> public abstract val values: MutableCollection<LocalDeclarationsLowering.LocalClassContext> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'forEach' @ [383:33] ==> @HidesMembers public inline fun <T> Iterable<LocalDeclarationsLowering.LocalClassContext>.forEach(action: (LocalDeclarationsLowering.LocalClassContext) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalClassContext

'rewriteClassMembers' @ [384:17] ==> private final fun rewriteClassMembers(irClass: IrClass, localClassContext: LocalDeclarationsLowering.LocalClassContext): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'it' @ [384:37] ==> value-parameter it: LocalDeclarationsLowering.LocalClassContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [384:40] ==> public final val declaration: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[PropertyDescriptorImpl]

'it' @ [384:53] ==> value-parameter it: LocalDeclarationsLowering.LocalClassContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.rewriteDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'rewriteFunctionBody' @ [387:13] ==> private final fun rewriteFunctionBody(irDeclaration: IrDeclaration, localContext: LocalDeclarationsLowering.LocalContext?): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'memberDeclaration' @ [387:33] ==> public final val memberDeclaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'if (oldCall is IrCallWithShallowCopy)
                    oldCall.shallowCopy(oldCall.origin, newCallee, oldCall.superQualifierSymbol)
                else
                    IrCallImpl(
                            oldCall.startOffset, oldCall.endOffset,
                            newCallee,
                            newCallee.descriptor,
                            remapTypeArguments(oldCall, newCallee.descriptor),
                            oldCall.origin, oldCall.superQualifierSymbol
                    )' @ [391:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrCall, elseBranch: IrCall): IrCall[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrCall

'oldCall' @ [391:21] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createNewCall[ValueParameterDescriptorImpl]

'oldCall' @ [392:21] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createNewCall[ValueParameterDescriptorImpl]

'shallowCopy' @ [392:29] ==> public abstract fun shallowCopy(newOrigin: IrStatementOrigin?, newCallee: IrFunctionSymbol, newSuperQualifier: IrClassSymbol?): IrCall defined in org.jetbrains.kotlin.ir.expressions.IrCallWithShallowCopy[DeserializedSimpleFunctionDescriptor]

'oldCall' @ [392:41] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createNewCall[ValueParameterDescriptorImpl]

'origin' @ [392:49] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'newCallee' @ [392:57] ==> value-parameter newCallee: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createNewCall[ValueParameterDescriptorImpl]

'oldCall' @ [392:68] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createNewCall[ValueParameterDescriptorImpl]

'superQualifierSymbol' @ [392:76] ==> public abstract val superQualifierSymbol: IrClassSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'IrCallImpl' @ [394:21] ==> public constructor IrCallImpl(startOffset: Int, endOffset: Int, symbol: IrFunctionSymbol, descriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ..., origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedClassConstructorDescriptor]

'oldCall' @ [395:29] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createNewCall[ValueParameterDescriptorImpl]

'startOffset' @ [395:37] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'oldCall' @ [395:50] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createNewCall[ValueParameterDescriptorImpl]

'endOffset' @ [395:58] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'newCallee' @ [396:29] ==> value-parameter newCallee: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createNewCall[ValueParameterDescriptorImpl]

'newCallee' @ [397:29] ==> value-parameter newCallee: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createNewCall[ValueParameterDescriptorImpl]

'descriptor' @ [397:39] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol[DeserializedPropertyDescriptor]

'remapTypeArguments' @ [398:29] ==> private final fun remapTypeArguments(oldExpression: IrMemberAccessExpression, newCallee: CallableDescriptor): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'oldCall' @ [398:48] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createNewCall[ValueParameterDescriptorImpl]

'newCallee' @ [398:57] ==> value-parameter newCallee: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createNewCall[ValueParameterDescriptorImpl]

'descriptor' @ [398:67] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol[DeserializedPropertyDescriptor]

'oldCall' @ [399:29] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createNewCall[ValueParameterDescriptorImpl]

'origin' @ [399:37] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'oldCall' @ [399:45] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createNewCall[ValueParameterDescriptorImpl]

'superQualifierSymbol' @ [399:53] ==> public abstract val superQualifierSymbol: IrClassSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'oldExpression' @ [403:29] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.remapTypeArguments[ValueParameterDescriptorImpl]

'descriptor' @ [403:43] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'original' @ [403:54] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'if (oldCallee.typeParameters.isEmpty())
                null
            else oldCallee.typeParameters.associateBy(
                    { newCallee.typeParameters[it.index] },
                    { oldExpression.getTypeArgumentOrDefault(it) }
            )' @ [405:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Map<TypeParameterDescriptor, KotlinType>?, elseBranch: Map<TypeParameterDescriptor, KotlinType>?): Map<TypeParameterDescriptor, KotlinType>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Map<TypeParameterDescriptor, KotlinType>?

'oldCallee' @ [405:24] ==> val oldCallee: CallableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.remapTypeArguments[LocalVariableDescriptor]

'typeParameters' @ [405:34] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [405:49] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'oldCallee' @ [407:18] ==> val oldCallee: CallableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.remapTypeArguments[LocalVariableDescriptor]

'typeParameters' @ [407:28] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'associateBy' @ [407:43] ==> public inline fun <T, K, V> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.associateBy(keySelector: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> TypeParameterDescriptor, valueTransform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> KotlinType): Map<TypeParameterDescriptor, KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <K> -> TypeParameterDescriptor
    <V> -> KotlinType

'newCallee' @ [408:23] ==> value-parameter newCallee: CallableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.remapTypeArguments[ValueParameterDescriptorImpl]

'typeParameters' @ [408:33] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'it' @ [408:48] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.remapTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [408:51] ==> public final val TypeParameterDescriptor.index: Int[MyPropertyDescriptor]

'oldExpression' @ [409:23] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.remapTypeArguments[ValueParameterDescriptorImpl]

'getTypeArgumentOrDefault' @ [409:37] ==> public fun IrMemberAccessExpression.getTypeArgumentOrDefault(typeParameterDescriptor: TypeParameterDescriptor): KotlinType defined in org.jetbrains.kotlin.ir.expressions[DeserializedSimpleFunctionDescriptor]

'it' @ [409:62] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.remapTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'localFunctions' @ [414:13] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalDeclarationsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'values' @ [414:28] ==> public abstract val values: MutableCollection<LocalDeclarationsLowering.LocalFunctionContext> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'forEach' @ [414:35] ==> @HidesMembers public inline fun <T> Iterable<LocalDeclarationsLowering.LocalFunctionContext>.forEach(action: (LocalDeclarationsLowering.LocalFunctionContext) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalFunctionContext

'createLiftedDescriptor' @ [415:17] ==> private final fun createLiftedDescriptor(localFunctionContext: LocalDeclarationsLowering.LocalFunctionContext): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'it' @ [415:40] ==> value-parameter it: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.transformDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'localClasses' @ [418:13] ==> public final val localClasses: MutableMap<ClassDescriptor, LocalDeclarationsLowering.LocalClassContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'values' @ [418:26] ==> public abstract val values: MutableCollection<LocalDeclarationsLowering.LocalClassContext> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'forEach' @ [418:33] ==> @HidesMembers public inline fun <T> Iterable<LocalDeclarationsLowering.LocalClassContext>.forEach(action: (LocalDeclarationsLowering.LocalClassContext) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalClassContext

'createFieldsForCapturedValues' @ [419:17] ==> private final fun createFieldsForCapturedValues(localClassContext: LocalDeclarationsLowering.LocalClassContext): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'it' @ [419:47] ==> value-parameter it: LocalDeclarationsLowering.LocalClassContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.transformDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'localClassConstructors' @ [422:13] ==> public final val localClassConstructors: MutableMap<ClassConstructorDescriptor, LocalDeclarationsLowering.LocalClassConstructorContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'values' @ [422:36] ==> public abstract val values: MutableCollection<LocalDeclarationsLowering.LocalClassConstructorContext> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'forEach' @ [422:43] ==> @HidesMembers public inline fun <T> Iterable<LocalDeclarationsLowering.LocalClassConstructorContext>.forEach(action: (LocalDeclarationsLowering.LocalClassConstructorContext) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalClassConstructorContext

'createTransformedConstructorDescriptor' @ [423:17] ==> private final fun createTransformedConstructorDescriptor(constructorContext: LocalDeclarationsLowering.LocalClassConstructorContext): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'it' @ [423:56] ==> value-parameter it: LocalDeclarationsLowering.LocalClassConstructorContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.transformDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'localFunctions' @ [428:13] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalDeclarationsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'descriptor' @ [428:28] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.suggestLocalName[ValueParameterDescriptorImpl]

'let' @ [428:41] ==> @InlineOnly public inline fun <T, R> LocalDeclarationsLowering.LocalFunctionContext.let(block: (LocalDeclarationsLowering.LocalFunctionContext) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalFunctionContext
    <R> -> Unit

'it' @ [429:21] ==> value-parameter it: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.suggestLocalName.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [429:24] ==> public final var index: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'it' @ [430:38] ==> value-parameter it: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.suggestLocalName.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [430:41] ==> public final var index: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'descriptor' @ [433:20] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.suggestLocalName[ValueParameterDescriptorImpl]

'name' @ [433:31] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [433:36] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'identifier' @ [438:22] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'descriptor' @ [439:25] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.generateNameForLiftedDeclaration[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [439:36] ==> public val DeclarationDescriptor.parentsWithSelf: Sequence<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [440:34] ==> public fun <T> Sequence<DeclarationDescriptor>.takeWhile(predicate: (DeclarationDescriptor) -> Boolean): Sequence<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [440:46] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.generateNameForLiftedDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'newOwner' @ [440:52] ==> value-parameter newOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.generateNameForLiftedDeclaration[ValueParameterDescriptorImpl]

'toList' @ [441:34] ==> public fun <T> Sequence<DeclarationDescriptor>.toList(): List<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'reversed' @ [441:43] ==> public fun <T> Iterable<DeclarationDescriptor>.reversed(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'map' @ [442:34] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> String

'suggestLocalName' @ [442:40] ==> private final fun suggestLocalName(descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'it' @ [442:57] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.generateNameForLiftedDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [443:34] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'localFunctionContext' @ [447:33] ==> value-parameter localFunctionContext: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [447:54] ==> public open val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'memberDeclaration' @ [449:31] ==> public final val memberDeclaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'descriptor' @ [449:49] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[DeserializedPropertyDescriptor]

'containingDeclaration' @ [449:60] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'create' @ [450:62] ==> @NotNull public open fun create(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, @NotNull p2: Name, @NotNull p3: CallableMemberDescriptor.Kind, @NotNull p4: SourceElement): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaMethodDescriptor]

'memberOwner' @ [451:21] ==> val memberOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'oldDescriptor' @ [452:21] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'annotations' @ [452:35] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[DeserializedPropertyDescriptor]

'generateNameForLiftedDeclaration' @ [453:21] ==> private final fun generateNameForLiftedDeclaration(descriptor: DeclarationDescriptor, newOwner: DeclarationDescriptor): Name defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [453:54] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'memberOwner' @ [453:69] ==> val memberOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'SYNTHESIZED' @ [454:51] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'oldDescriptor' @ [455:21] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'source' @ [455:35] ==> public final val FunctionDescriptor.source: SourceElement[MyPropertyDescriptor]

'apply' @ [456:15] ==> @InlineOnly public inline fun <T> SimpleFunctionDescriptorImpl.apply(block: (SimpleFunctionDescriptorImpl).() -> Unit): SimpleFunctionDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptorImpl

'isTailrec' @ [457:17] ==> public final var SimpleFunctionDescriptorImpl.isTailrec: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [457:29] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'isTailrec' @ [457:43] ==> public final val FunctionDescriptor.isTailrec: Boolean[MyPropertyDescriptor]

'isSuspend' @ [458:17] ==> public final var SimpleFunctionDescriptorImpl.isSuspend: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [458:29] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'isSuspend' @ [458:43] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'localFunctionContext' @ [462:13] ==> value-parameter localFunctionContext: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[ValueParameterDescriptorImpl]

'transformedDescriptor' @ [462:34] ==> public open lateinit var transformedDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'newDescriptor' @ [462:58] ==> val newDescriptor: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'oldDescriptor' @ [464:17] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [464:31] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'AssertionError' @ [465:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'oldDescriptor' @ [471:37] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'typeParameters' @ [471:51] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'localFunctionContext' @ [474:34] ==> value-parameter localFunctionContext: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[ValueParameterDescriptorImpl]

'closure' @ [474:55] ==> public final lateinit var closure: Closure defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'capturedValues' @ [474:63] ==> public final val capturedValues: List<IrValueSymbol> defined in org.jetbrains.kotlin.backend.common.lower.Closure[PropertyDescriptorImpl]

'createTransformedValueParameters' @ [476:38] ==> private final fun createTransformedValueParameters(localContext: LocalDeclarationsLowering.LocalContextWithClosureAsParameters, capturedValues: List<IrValueSymbol>): List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'localFunctionContext' @ [476:71] ==> value-parameter localFunctionContext: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[ValueParameterDescriptorImpl]

'capturedValues' @ [476:93] ==> val capturedValues: List<IrValueSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'newDescriptor' @ [478:13] ==> val newDescriptor: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'initialize' @ [478:27] ==> @NotNull public open fun initialize(@Nullable p0: KotlinType?, @Nullable p1: ReceiverParameterDescriptor?, @NotNull p2: (MutableList<out (TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>), @NotNull p3: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @Nullable p4: KotlinType?, @Nullable p5: Modality?, @NotNull p6: Visibility): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaMethodDescriptor]

'oldDescriptor' @ [479:21] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'extensionReceiverParameter' @ [479:35] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [479:63] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'newDispatchReceiverParameter' @ [480:21] ==> val newDispatchReceiverParameter: Nothing? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'newTypeParameters' @ [481:21] ==> val newTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'newValueParameters' @ [482:21] ==> val newValueParameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'oldDescriptor' @ [483:21] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'returnType' @ [483:35] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'FINAL' @ [484:30] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'PRIVATE' @ [485:34] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'oldDescriptor' @ [488:13] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'extensionReceiverParameter' @ [488:27] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'let' @ [488:55] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> Unit

'newParameterToOld' @ [489:17] ==> public final val newParameterToOld: MutableMap<ParameterDescriptor, ParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'putAbsentOrSame' @ [489:35] ==> private final fun <K, V> MutableMap<ParameterDescriptor, ParameterDescriptor>.putAbsentOrSame(key: ParameterDescriptor, value: ParameterDescriptor): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> ParameterDescriptor
    <V> -> ParameterDescriptor

'newDescriptor' @ [489:51] ==> val newDescriptor: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'extensionReceiverParameter' @ [489:65] ==> public final val SimpleFunctionDescriptorImpl.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'it' @ [489:95] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'localFunctionContext' @ [492:13] ==> value-parameter localFunctionContext: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[ValueParameterDescriptorImpl]

'transformedDeclaration' @ [492:34] ==> public open lateinit var transformedDeclaration: IrSimpleFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'with' @ [492:59] ==> @InlineOnly public inline fun <T, R> with(receiver: IrFunction, block: IrFunction.() -> IrFunctionImpl): IrFunctionImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFunction
    <R> -> IrFunctionImpl

'localFunctionContext' @ [492:64] ==> value-parameter localFunctionContext: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[ValueParameterDescriptorImpl]

'declaration' @ [492:85] ==> public open val declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'IrFunctionImpl' @ [493:17] ==> public constructor IrFunctionImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [493:32] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'endOffset' @ [493:45] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'origin' @ [493:56] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'newDescriptor' @ [493:64] ==> val newDescriptor: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'apply' @ [494:15] ==> @InlineOnly public inline fun <T> IrFunctionImpl.apply(block: IrFunctionImpl.() -> Unit): IrFunctionImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFunctionImpl

'createParameterDeclarations' @ [495:17] ==> public fun IrFunction.createParameterDeclarations(): Unit defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'recordTransformedValueParameters' @ [496:17] ==> private final fun IrFunction.recordTransformedValueParameters(localContext: LocalDeclarationsLowering.LocalContextWithClosureAsParameters): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'localFunctionContext' @ [496:50] ==> value-parameter localFunctionContext: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[ValueParameterDescriptorImpl]

'transformedDeclarations' @ [497:17] ==> public final val transformedDeclarations: MutableMap<DeclarationDescriptor, IrSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'oldDescriptor' @ [497:41] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor[LocalVariableDescriptor]

'this' @ [497:58] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createLiftedDescriptor.<anonymous>[ReceiverParameterDescriptorImpl]

'symbol' @ [497:63] ==> public open val symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedPropertyDescriptor]

'localContext' @ [505:33] ==> value-parameter localContext: LocalDeclarationsLowering.LocalContextWithClosureAsParameters defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters[ValueParameterDescriptorImpl]

'descriptor' @ [505:46] ==> public open val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalContextWithClosureAsParameters[PropertyDescriptorImpl]

'localContext' @ [506:33] ==> value-parameter localContext: LocalDeclarationsLowering.LocalContextWithClosureAsParameters defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters[ValueParameterDescriptorImpl]

'transformedDescriptor' @ [506:46] ==> public abstract val transformedDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalContextWithClosureAsParameters[PropertyDescriptorImpl]

'capturedValues' @ [508:42] ==> value-parameter capturedValues: List<IrValueSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters[ValueParameterDescriptorImpl]

'size' @ [508:57] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'closureParametersCount' @ [509:43] ==> val closureParametersCount: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters[LocalVariableDescriptor]

'oldDescriptor' @ [509:68] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters[LocalVariableDescriptor]

'valueParameters' @ [509:82] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [509:98] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'ArrayList' @ [511:38] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ValueParameterDescriptor

'newValueParametersCount' @ [511:74] ==> val newValueParametersCount: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters[LocalVariableDescriptor]

'apply' @ [511:99] ==> @InlineOnly public inline fun <T> ArrayList<ValueParameterDescriptor>.apply(block: ArrayList<ValueParameterDescriptor>.() -> Unit): ArrayList<ValueParameterDescriptor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<ValueParameterDescriptor>

'capturedValues' @ [512:17] ==> value-parameter capturedValues: List<IrValueSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters[ValueParameterDescriptorImpl]

'mapIndexedTo' @ [512:32] ==> public inline fun <T, R, C : MutableCollection<in ValueParameterDescriptor>> Iterable<IrValueSymbol>.mapIndexedTo(destination: ArrayList<ValueParameterDescriptor>, transform: (index: Int, IrValueSymbol) -> ValueParameterDescriptor): ArrayList<ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueSymbol
    <R> -> ValueParameterDescriptor
    <C : MutableCollection<in R>> -> ArrayList<ValueParameterDescriptor>

'this' @ [512:45] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters.<anonymous>[ReceiverParameterDescriptorImpl]

'createUnsubstitutedCapturedValueParameter' @ [513:21] ==> private final fun createUnsubstitutedCapturedValueParameter(newParameterOwner: CallableMemberDescriptor, valueDescriptor: ValueDescriptor, index: Int): ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'newDescriptor' @ [513:63] ==> val newDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters[LocalVariableDescriptor]

'capturedValue' @ [513:78] ==> value-parameter capturedValue: IrValueSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [513:92] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrValueSymbol[DeserializedPropertyDescriptor]

'i' @ [513:104] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'apply' @ [513:107] ==> @InlineOnly public inline fun <T> ValueParameterDescriptor.apply(block: ValueParameterDescriptor.() -> Unit): ValueParameterDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'newParameterToCaptured' @ [514:25] ==> public final val newParameterToCaptured: MutableMap<ValueParameterDescriptor, IrValueSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'this' @ [514:48] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'capturedValue' @ [514:56] ==> value-parameter capturedValue: IrValueSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'oldDescriptor' @ [518:17] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters[LocalVariableDescriptor]

'valueParameters' @ [518:31] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'mapIndexedTo' @ [518:47] ==> public inline fun <T, R, C : MutableCollection<in ValueParameterDescriptor>> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.mapIndexedTo(destination: ArrayList<ValueParameterDescriptor>, transform: (index: Int, (ValueParameterDescriptor..ValueParameterDescriptor?)) -> ValueParameterDescriptor): ArrayList<ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> ValueParameterDescriptor
    <C : MutableCollection<in R>> -> ArrayList<ValueParameterDescriptor>

'this' @ [518:60] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters.<anonymous>[ReceiverParameterDescriptorImpl]

'createUnsubstitutedParameter' @ [519:21] ==> private final fun createUnsubstitutedParameter(newParameterOwner: CallableMemberDescriptor, valueParameterDescriptor: ValueParameterDescriptor, newIndex: Int): ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'newDescriptor' @ [519:50] ==> val newDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters[LocalVariableDescriptor]

'oldValueParameterDescriptor' @ [519:65] ==> value-parameter oldValueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'closureParametersCount' @ [519:94] ==> val closureParametersCount: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters[LocalVariableDescriptor]

'i' @ [519:119] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'apply' @ [519:122] ==> @InlineOnly public inline fun <T> ValueParameterDescriptor.apply(block: ValueParameterDescriptor.() -> Unit): ValueParameterDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'newParameterToOld' @ [520:25] ==> public final val newParameterToOld: MutableMap<ParameterDescriptor, ParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'putAbsentOrSame' @ [520:43] ==> private final fun <K, V> MutableMap<ParameterDescriptor, ParameterDescriptor>.putAbsentOrSame(key: ParameterDescriptor, value: ParameterDescriptor): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> ParameterDescriptor
    <V> -> ParameterDescriptor

'this' @ [520:59] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'oldValueParameterDescriptor' @ [520:65] ==> value-parameter oldValueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'newValueParameters' @ [524:20] ==> val newValueParameters: ArrayList<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedValueParameters[LocalVariableDescriptor]

'valueParameters' @ [529:13] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'forEach' @ [529:29] ==> @HidesMembers public inline fun <T> Iterable<IrValueParameter>.forEach(action: (IrValueParameter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameter

'newParameterToCaptured' @ [530:37] ==> public final val newParameterToCaptured: MutableMap<ValueParameterDescriptor, IrValueSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'it' @ [530:60] ==> value-parameter it: IrValueParameter defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.recordTransformedValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [530:63] ==> public abstract val descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'capturedValue' @ [531:21] ==> val capturedValue: IrValueSymbol? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.recordTransformedValueParameters.<anonymous>[LocalVariableDescriptor]

'localContext' @ [532:21] ==> value-parameter localContext: LocalDeclarationsLowering.LocalContextWithClosureAsParameters defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.recordTransformedValueParameters[ValueParameterDescriptorImpl]

'capturedValueToParameter' @ [532:34] ==> public final val capturedValueToParameter: MutableMap<ValueDescriptor, IrValueParameterSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalContextWithClosureAsParameters[PropertyDescriptorImpl]

'capturedValue' @ [532:59] ==> val capturedValue: IrValueSymbol? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.recordTransformedValueParameters.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [532:73] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrValueSymbol[DeserializedPropertyDescriptor]

'it' @ [532:87] ==> value-parameter it: IrValueParameter defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.recordTransformedValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [532:90] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'listOfNotNull' @ [536:14] ==> public fun <T : Any> listOfNotNull(vararg elements: IrValueParameter?): List<IrValueParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> IrValueParameter

'dispatchReceiverParameter' @ [536:28] ==> public abstract var dispatchReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'extensionReceiverParameter' @ [536:55] ==> public abstract var extensionReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'valueParameters' @ [536:85] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'forEach' @ [536:102] ==> @HidesMembers public inline fun <T> Iterable<IrValueParameter>.forEach(action: (IrValueParameter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameter

'newParameterToOld' @ [537:36] ==> public final val newParameterToOld: MutableMap<ParameterDescriptor, ParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'it' @ [537:54] ==> value-parameter it: IrValueParameter defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.recordTransformedValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [537:57] ==> public abstract val descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'oldParameter' @ [538:21] ==> val oldParameter: ParameterDescriptor? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.recordTransformedValueParameters.<anonymous>[LocalVariableDescriptor]

'oldParameterToNew' @ [539:21] ==> public final val oldParameterToNew: MutableMap<ParameterDescriptor, IrValueParameterSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'putAbsentOrSame' @ [539:39] ==> private final fun <K, V> MutableMap<ParameterDescriptor, IrValueParameterSymbol>.putAbsentOrSame(key: ParameterDescriptor, value: IrValueParameterSymbol): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> ParameterDescriptor
    <V> -> IrValueParameterSymbol

'oldParameter' @ [539:55] ==> val oldParameter: ParameterDescriptor? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.recordTransformedValueParameters.<anonymous>[LocalVariableDescriptor]

'it' @ [539:69] ==> value-parameter it: IrValueParameter defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.recordTransformedValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [539:72] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'constructorContext' @ [546:33] ==> value-parameter constructorContext: LocalDeclarationsLowering.LocalClassConstructorContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [546:52] ==> public open val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassConstructorContext[PropertyDescriptorImpl]

'localClasses' @ [547:37] ==> public final val localClasses: MutableMap<ClassDescriptor, LocalDeclarationsLowering.LocalClassContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'oldDescriptor' @ [547:50] ==> val oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'containingDeclaration' @ [547:64] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'create' @ [548:64] ==> @NotNull public open fun create(@NotNull p0: ClassDescriptor, @NotNull p1: Annotations, p2: Boolean, @NotNull p3: SourceElement): ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl[JavaMethodDescriptor]

'localClassContext' @ [549:21] ==> val localClassContext: LocalDeclarationsLowering.LocalClassContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'descriptor' @ [549:39] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[PropertyDescriptorImpl]

'EMPTY' @ [550:33] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'oldDescriptor' @ [550:40] ==> val oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'isPrimary' @ [550:54] ==> public final val ClassConstructorDescriptor.isPrimary: Boolean[MyPropertyDescriptor]

'oldDescriptor' @ [550:65] ==> val oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'source' @ [550:79] ==> public final val ClassConstructorDescriptor.source: SourceElement[MyPropertyDescriptor]

'constructorContext' @ [552:13] ==> value-parameter constructorContext: LocalDeclarationsLowering.LocalClassConstructorContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[ValueParameterDescriptorImpl]

'transformedDescriptor' @ [552:32] ==> public open lateinit var transformedDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassConstructorContext[PropertyDescriptorImpl]

'newDescriptor' @ [552:56] ==> val newDescriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'oldDescriptor' @ [555:37] ==> val oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'typeParameters' @ [555:51] ==> public final val ClassConstructorDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'localClasses' @ [557:34] ==> public final val localClasses: MutableMap<ClassDescriptor, LocalDeclarationsLowering.LocalClassContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'oldDescriptor' @ [557:47] ==> val oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'containingDeclaration' @ [557:61] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'closure' @ [557:86] ==> public final lateinit var closure: Closure defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[PropertyDescriptorImpl]

'capturedValues' @ [557:94] ==> public final val capturedValues: List<IrValueSymbol> defined in org.jetbrains.kotlin.backend.common.lower.Closure[PropertyDescriptorImpl]

'createTransformedValueParameters' @ [559:38] ==> private final fun createTransformedValueParameters(localContext: LocalDeclarationsLowering.LocalContextWithClosureAsParameters, capturedValues: List<IrValueSymbol>): List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'constructorContext' @ [559:71] ==> value-parameter constructorContext: LocalDeclarationsLowering.LocalClassConstructorContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[ValueParameterDescriptorImpl]

'capturedValues' @ [559:91] ==> val capturedValues: List<IrValueSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'newDescriptor' @ [561:13] ==> val newDescriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'initialize' @ [561:27] ==> public open fun initialize(@NotNull p0: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @NotNull p1: Visibility, @NotNull p2: (MutableList<(TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>)): (ClassConstructorDescriptorImpl..ClassConstructorDescriptorImpl?) defined in org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl[JavaMethodDescriptor]

'newValueParameters' @ [562:21] ==> val newValueParameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'PRIVATE' @ [563:34] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'newTypeParameters' @ [564:21] ==> val newTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'newDescriptor' @ [566:13] ==> val newDescriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'returnType' @ [566:27] ==> public final var ClassConstructorDescriptorImpl.returnType: KotlinType[MyPropertyDescriptor]

'oldDescriptor' @ [566:40] ==> val oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'returnType' @ [566:54] ==> public final val ClassConstructorDescriptor.returnType: KotlinType[MyPropertyDescriptor]

'oldDescriptor' @ [568:13] ==> val oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [568:27] ==> public final val ClassConstructorDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'let' @ [568:54] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> Unit

'newParameterToOld' @ [569:17] ==> public final val newParameterToOld: MutableMap<ParameterDescriptor, ParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'putAbsentOrSame' @ [569:35] ==> private final fun <K, V> MutableMap<ParameterDescriptor, ParameterDescriptor>.putAbsentOrSame(key: ParameterDescriptor, value: ParameterDescriptor): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> ParameterDescriptor
    <V> -> ParameterDescriptor

'newDescriptor' @ [569:51] ==> val newDescriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [569:65] ==> public final val ClassConstructorDescriptorImpl.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'it' @ [569:94] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'oldDescriptor' @ [572:13] ==> val oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'extensionReceiverParameter' @ [572:27] ==> public final val ClassConstructorDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'let' @ [572:55] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> Nothing

'AssertionError' @ [573:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'constructorContext' @ [576:13] ==> value-parameter constructorContext: LocalDeclarationsLowering.LocalClassConstructorContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[ValueParameterDescriptorImpl]

'transformedDeclaration' @ [576:32] ==> public open lateinit var transformedDeclaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassConstructorContext[PropertyDescriptorImpl]

'with' @ [576:57] ==> @InlineOnly public inline fun <T, R> with(receiver: IrConstructor, block: IrConstructor.() -> IrConstructorImpl): IrConstructorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrConstructor
    <R> -> IrConstructorImpl

'constructorContext' @ [576:62] ==> value-parameter constructorContext: LocalDeclarationsLowering.LocalClassConstructorContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[ValueParameterDescriptorImpl]

'declaration' @ [576:81] ==> public open val declaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassConstructorContext[PropertyDescriptorImpl]

'IrConstructorImpl' @ [577:17] ==> public constructor IrConstructorImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ClassConstructorDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrConstructorImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [577:35] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'endOffset' @ [577:48] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'origin' @ [577:59] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'newDescriptor' @ [577:67] ==> val newDescriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'apply' @ [578:15] ==> @InlineOnly public inline fun <T> IrConstructorImpl.apply(block: IrConstructorImpl.() -> Unit): IrConstructorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrConstructorImpl

'createParameterDeclarations' @ [579:17] ==> public fun IrFunction.createParameterDeclarations(): Unit defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'recordTransformedValueParameters' @ [580:17] ==> private final fun IrFunction.recordTransformedValueParameters(localContext: LocalDeclarationsLowering.LocalContextWithClosureAsParameters): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'constructorContext' @ [580:50] ==> value-parameter constructorContext: LocalDeclarationsLowering.LocalClassConstructorContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[ValueParameterDescriptorImpl]

'transformedDeclarations' @ [581:17] ==> public final val transformedDeclarations: MutableMap<DeclarationDescriptor, IrSymbol> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'oldDescriptor' @ [581:41] ==> val oldDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor[LocalVariableDescriptor]

'this' @ [581:58] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createTransformedConstructorDescriptor.<anonymous>[ReceiverParameterDescriptorImpl]

'symbol' @ [581:63] ==> public open val symbol: IrConstructorSymbol defined in org.jetbrains.kotlin.ir.declarations.impl.IrConstructorImpl[DeserializedPropertyDescriptor]

'localClassContext' @ [586:35] ==> value-parameter localClassContext: LocalDeclarationsLowering.LocalClassContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createFieldsForCapturedValues[ValueParameterDescriptorImpl]

'descriptor' @ [586:53] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[PropertyDescriptorImpl]

'localClassContext' @ [588:13] ==> value-parameter localClassContext: LocalDeclarationsLowering.LocalClassContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createFieldsForCapturedValues[ValueParameterDescriptorImpl]

'closure' @ [588:31] ==> public final lateinit var closure: Closure defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[PropertyDescriptorImpl]

'capturedValues' @ [588:39] ==> public final val capturedValues: List<IrValueSymbol> defined in org.jetbrains.kotlin.backend.common.lower.Closure[PropertyDescriptorImpl]

'forEach' @ [588:54] ==> @HidesMembers public inline fun <T> Iterable<IrValueSymbol>.forEach(action: (IrValueSymbol) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueSymbol

'create' @ [589:62] ==> @NotNull public open fun create(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, @NotNull p2: Modality, @NotNull p3: Visibility, p4: Boolean, @NotNull p5: Name, @NotNull p6: CallableMemberDescriptor.Kind, @NotNull p7: SourceElement, p8: Boolean, p9: Boolean, p10: Boolean, p11: Boolean, p12: Boolean, p13: Boolean): PropertyDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'classDescriptor' @ [590:25] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createFieldsForCapturedValues[LocalVariableDescriptor]

'EMPTY' @ [591:37] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'FINAL' @ [592:34] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'PRIVATE' @ [593:38] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'suggestNameForCapturedValue' @ [595:25] ==> private final fun suggestNameForCapturedValue(valueDescriptor: ValueDescriptor): Name defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'capturedValue' @ [595:53] ==> value-parameter capturedValue: IrValueSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createFieldsForCapturedValues.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [595:67] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrValueSymbol[DeserializedPropertyDescriptor]

'SYNTHESIZED' @ [596:55] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'NO_SOURCE' @ [597:39] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'fieldDescriptor' @ [605:17] ==> val fieldDescriptor: PropertyDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createFieldsForCapturedValues.<anonymous>[LocalVariableDescriptor]

'initialize' @ [605:33] ==> public open fun initialize(@Nullable p0: PropertyGetterDescriptorImpl?, @Nullable p1: PropertySetterDescriptor?): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'fieldDescriptor' @ [609:17] ==> val fieldDescriptor: PropertyDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createFieldsForCapturedValues.<anonymous>[LocalVariableDescriptor]

'setType' @ [609:33] ==> public open fun setType(@NotNull p0: KotlinType, @ReadOnly @NotNull p1: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, @Nullable p2: ReceiverParameterDescriptor?, @Nullable p3: ReceiverParameterDescriptor?): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'capturedValue' @ [610:25] ==> value-parameter capturedValue: IrValueSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createFieldsForCapturedValues.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [610:39] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrValueSymbol[DeserializedPropertyDescriptor]

'type' @ [610:50] ==> public final val ValueDescriptor.type: KotlinType[MyPropertyDescriptor]

'emptyList' @ [611:25] ==> public fun <T> emptyList(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'classDescriptor' @ [612:25] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createFieldsForCapturedValues[LocalVariableDescriptor]

'thisAsReceiverParameter' @ [612:41] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'extensionReceiverParameter' @ [613:25] ==> val extensionReceiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createFieldsForCapturedValues.<anonymous>[LocalVariableDescriptor]

'localClassContext' @ [615:17] ==> value-parameter localClassContext: LocalDeclarationsLowering.LocalClassContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createFieldsForCapturedValues[ValueParameterDescriptorImpl]

'capturedValueToField' @ [615:35] ==> public final val capturedValueToField: MutableMap<ValueDescriptor, IrField> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[PropertyDescriptorImpl]

'capturedValue' @ [615:56] ==> value-parameter capturedValue: IrValueSymbol defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createFieldsForCapturedValues.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [615:70] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrValueSymbol[DeserializedPropertyDescriptor]

'IrFieldImpl' @ [615:84] ==> public constructor IrFieldImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: PropertyDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFieldImpl[DeserializedClassConstructorDescriptor]

'localClassContext' @ [616:25] ==> value-parameter localClassContext: LocalDeclarationsLowering.LocalClassContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createFieldsForCapturedValues[ValueParameterDescriptorImpl]

'declaration' @ [616:43] ==> public final val declaration: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[PropertyDescriptorImpl]

'startOffset' @ [616:55] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'localClassContext' @ [616:68] ==> value-parameter localClassContext: LocalDeclarationsLowering.LocalClassContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createFieldsForCapturedValues[ValueParameterDescriptorImpl]

'declaration' @ [616:86] ==> public final val declaration: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[PropertyDescriptorImpl]

'endOffset' @ [616:98] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'DECLARATION_ORIGIN_FIELD_FOR_CAPTURED_VALUE' @ [617:25] ==> private object DECLARATION_ORIGIN_FIELD_FOR_CAPTURED_VALUE : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering[FakeCallableDescriptorForObject]

'fieldDescriptor' @ [618:25] ==> val fieldDescriptor: PropertyDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createFieldsForCapturedValues.<anonymous>[LocalVariableDescriptor]

'this' @ [624:27] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.putAbsentOrSame[ReceiverParameterDescriptorImpl]

'getOrPut' @ [624:32] ==> public inline fun <K, V> MutableMap<K, V>.getOrPut(key: K, defaultValue: () -> V): V defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V> -> V

'key' @ [624:41] ==> value-parameter key: K defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.putAbsentOrSame[ValueParameterDescriptorImpl]

'value' @ [624:48] ==> value-parameter value: V defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.putAbsentOrSame[ValueParameterDescriptorImpl]

'current' @ [626:17] ==> val current: V defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.putAbsentOrSame[LocalVariableDescriptor]

'value' @ [626:28] ==> value-parameter value: V defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.putAbsentOrSame[ValueParameterDescriptorImpl]

'error' @ [627:17] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'current' @ [627:25] ==> val current: V defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.putAbsentOrSame[LocalVariableDescriptor]

'value' @ [627:37] ==> value-parameter value: V defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.putAbsentOrSame[ValueParameterDescriptorImpl]

'if (valueDescriptor.name.isSpecial) {
                    val oldNameStr = valueDescriptor.name.asString()
                    oldNameStr.substring(1, oldNameStr.length - 1).synthesizedName
                } else
                    valueDescriptor.name' @ [632:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name, elseBranch: Name): Name[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name

'valueDescriptor' @ [632:21] ==> value-parameter valueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.suggestNameForCapturedValue[ValueParameterDescriptorImpl]

'name' @ [632:37] ==> public final val ValueDescriptor.name: Name[MyPropertyDescriptor]

'isSpecial' @ [632:42] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'valueDescriptor' @ [633:38] ==> value-parameter valueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.suggestNameForCapturedValue[ValueParameterDescriptorImpl]

'name' @ [633:54] ==> public final val ValueDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [633:59] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'oldNameStr' @ [634:21] ==> val oldNameStr: String defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.suggestNameForCapturedValue[LocalVariableDescriptor]

'substring' @ [634:32] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'oldNameStr' @ [634:45] ==> val oldNameStr: String defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.suggestNameForCapturedValue[LocalVariableDescriptor]

'length' @ [634:56] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'synthesizedName' @ [634:68] ==> public val String.synthesizedName: Name defined in org.jetbrains.kotlin.backend.common.descriptors in file utils.kt[PropertyDescriptorImpl]

'valueDescriptor' @ [636:21] ==> value-parameter valueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.suggestNameForCapturedValue[ValueParameterDescriptorImpl]

'name' @ [636:37] ==> public final val ValueDescriptor.name: Name[MyPropertyDescriptor]

'ValueParameterDescriptorImpl' @ [643:17] ==> public constructor ValueParameterDescriptorImpl(containingDeclaration: CallableDescriptor, original: ValueParameterDescriptor?, index: Int, annotations: Annotations, name: Name, outType: KotlinType, declaresDefaultValue: Boolean, isCrossinline: Boolean, isNoinline: Boolean, varargElementType: KotlinType?, source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.ValueParameterDescriptorImpl[DeserializedClassConstructorDescriptor]

'newParameterOwner' @ [644:25] ==> value-parameter newParameterOwner: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createUnsubstitutedCapturedValueParameter[ValueParameterDescriptorImpl]

'index' @ [644:50] ==> value-parameter index: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createUnsubstitutedCapturedValueParameter[ValueParameterDescriptorImpl]

'valueDescriptor' @ [645:25] ==> value-parameter valueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createUnsubstitutedCapturedValueParameter[ValueParameterDescriptorImpl]

'annotations' @ [645:41] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ValueDescriptor[DeserializedPropertyDescriptor]

'suggestNameForCapturedValue' @ [646:25] ==> private final fun suggestNameForCapturedValue(valueDescriptor: ValueDescriptor): Name defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[SimpleFunctionDescriptorImpl]

'valueDescriptor' @ [646:53] ==> value-parameter valueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createUnsubstitutedCapturedValueParameter[ValueParameterDescriptorImpl]

'valueDescriptor' @ [647:25] ==> value-parameter valueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createUnsubstitutedCapturedValueParameter[ValueParameterDescriptorImpl]

'type' @ [647:41] ==> public final val ValueDescriptor.type: KotlinType[MyPropertyDescriptor]

'valueDescriptor' @ [648:52] ==> value-parameter valueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createUnsubstitutedCapturedValueParameter[ValueParameterDescriptorImpl]

'source' @ [648:68] ==> public final val ValueDescriptor.source: SourceElement[MyPropertyDescriptor]

'valueParameterDescriptor' @ [656:17] ==> value-parameter valueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createUnsubstitutedParameter[ValueParameterDescriptorImpl]

'copy' @ [656:42] ==> public abstract fun copy(newOwner: CallableDescriptor, newName: Name, newIndex: Int): ValueParameterDescriptor defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'newParameterOwner' @ [656:47] ==> value-parameter newParameterOwner: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createUnsubstitutedParameter[ValueParameterDescriptorImpl]

'valueParameterDescriptor' @ [656:66] ==> value-parameter valueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createUnsubstitutedParameter[ValueParameterDescriptorImpl]

'name' @ [656:91] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'newIndex' @ [656:97] ==> value-parameter newIndex: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.createUnsubstitutedParameter[ValueParameterDescriptorImpl]

'ClosureAnnotator' @ [660:29] ==> public constructor ClosureAnnotator(declaration: IrDeclaration) defined in org.jetbrains.kotlin.backend.common.lower.ClosureAnnotator[ClassConstructorDescriptorImpl]

'memberDeclaration' @ [660:46] ==> public final val memberDeclaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'localFunctions' @ [661:13] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalDeclarationsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'forEach' @ [661:28] ==> public final fun forEach(p0: (FunctionDescriptor, LocalDeclarationsLowering.LocalFunctionContext) -> Unit): Unit defined in kotlin.collections.MutableMap[MyFunctionDescriptor]

'context' @ [662:17] ==> value-parameter context: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectClosures.<anonymous>[ValueParameterDescriptorImpl]

'closure' @ [662:25] ==> public final lateinit var closure: Closure defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'annotator' @ [662:35] ==> val annotator: ClosureAnnotator defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectClosures[LocalVariableDescriptor]

'getFunctionClosure' @ [662:45] ==> public final fun getFunctionClosure(descriptor: FunctionDescriptor): Closure defined in org.jetbrains.kotlin.backend.common.lower.ClosureAnnotator[SimpleFunctionDescriptorImpl]

'descriptor' @ [662:64] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectClosures.<anonymous>[ValueParameterDescriptorImpl]

'localClasses' @ [665:13] ==> public final val localClasses: MutableMap<ClassDescriptor, LocalDeclarationsLowering.LocalClassContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'forEach' @ [665:26] ==> public final fun forEach(p0: (ClassDescriptor, LocalDeclarationsLowering.LocalClassContext) -> Unit): Unit defined in kotlin.collections.MutableMap[MyFunctionDescriptor]

'context' @ [666:17] ==> value-parameter context: LocalDeclarationsLowering.LocalClassContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectClosures.<anonymous>[ValueParameterDescriptorImpl]

'closure' @ [666:25] ==> public final lateinit var closure: Closure defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[PropertyDescriptorImpl]

'annotator' @ [666:35] ==> val annotator: ClosureAnnotator defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectClosures[LocalVariableDescriptor]

'getClassClosure' @ [666:45] ==> public final fun getClassClosure(descriptor: ClassDescriptor): Closure defined in org.jetbrains.kotlin.backend.common.lower.ClosureAnnotator[SimpleFunctionDescriptorImpl]

'descriptor' @ [666:61] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectClosures.<anonymous>[ValueParameterDescriptorImpl]

'memberDeclaration' @ [671:13] ==> public final val memberDeclaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'acceptChildrenVoid' @ [671:31] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'element' @ [674:21] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [674:29] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [674:48] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>[LazyClassReceiverParameterDescriptor]

'when (this.containingDeclaration) {
                    is CallableDescriptor -> true
                    is ClassDescriptor -> false
                    is PackageFragmentDescriptor -> false
                    else -> TODO(this.toString() + "\n" + this.containingDeclaration.toString())
                }' @ [677:74] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [677:80] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.declaredInFunction[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [677:85] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'TODO' @ [681:29] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [681:34] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.declaredInFunction[ReceiverParameterDescriptorImpl]

'toString' @ [681:39] ==> public open fun toString(): String defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedSimpleFunctionDescriptor]

'this' @ [681:59] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.declaredInFunction[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [681:64] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'toString' @ [681:86] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'declaration' @ [685:21] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [685:33] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [685:52] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>[LazyClassReceiverParameterDescriptor]

'declaration' @ [687:38] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'descriptor' @ [687:50] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'descriptor' @ [689:25] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitFunction[LocalVariableDescriptor]

'declaredInFunction' @ [689:36] ==> private final fun DeclarationDescriptor.declaredInFunction(): Boolean defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>[SimpleFunctionDescriptorImpl]

'LocalFunctionContext' @ [690:52] ==> public constructor LocalFunctionContext(declaration: IrFunction) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalFunctionContext[ClassConstructorDescriptorImpl]

'declaration' @ [690:73] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'localFunctions' @ [692:25] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalDeclarationsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'descriptor' @ [692:40] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitFunction[LocalVariableDescriptor]

'localFunctionContext' @ [692:54] ==> val localFunctionContext: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitFunction[LocalVariableDescriptor]

'descriptor' @ [694:29] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitFunction[LocalVariableDescriptor]

'name' @ [694:40] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'isSpecial' @ [694:45] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'localFunctionContext' @ [695:29] ==> val localFunctionContext: LocalDeclarationsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitFunction[LocalVariableDescriptor]

'index' @ [695:50] ==> public final var index: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'lambdasCount' @ [695:58] ==> private final var lambdasCount: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering[PropertyDescriptorImpl]

'declaration' @ [702:21] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitConstructor[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [702:33] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [702:52] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>[LazyClassReceiverParameterDescriptor]

'declaration' @ [704:38] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitConstructor[ValueParameterDescriptorImpl]

'descriptor' @ [704:50] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'assert' @ [705:21] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [705:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [705:29] ==> val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitConstructor[LocalVariableDescriptor]

'declaredInFunction' @ [705:40] ==> private final fun DeclarationDescriptor.declaredInFunction(): Boolean defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>[SimpleFunctionDescriptorImpl]

'descriptor' @ [707:25] ==> val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitConstructor[LocalVariableDescriptor]

'constructedClass' @ [707:36] ==> public final val ClassConstructorDescriptor.constructedClass: ClassDescriptor[MyPropertyDescriptor]

'isInner' @ [707:53] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'localClassConstructors' @ [709:21] ==> public final val localClassConstructors: MutableMap<ClassConstructorDescriptor, LocalDeclarationsLowering.LocalClassConstructorContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'descriptor' @ [709:44] ==> val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitConstructor[LocalVariableDescriptor]

'LocalClassConstructorContext' @ [709:58] ==> public constructor LocalClassConstructorContext(declaration: IrConstructor) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassConstructorContext[ClassConstructorDescriptorImpl]

'declaration' @ [709:87] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitConstructor[ValueParameterDescriptorImpl]

'declaration' @ [713:21] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitClass[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [713:33] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [713:52] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>[LazyClassReceiverParameterDescriptor]

'declaration' @ [715:38] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitClass[ValueParameterDescriptorImpl]

'descriptor' @ [715:50] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'descriptor' @ [717:25] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitClass[LocalVariableDescriptor]

'isInner' @ [717:36] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'assert' @ [720:21] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [720:28] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitClass[LocalVariableDescriptor]

'declaredInFunction' @ [720:39] ==> private final fun DeclarationDescriptor.declaredInFunction(): Boolean defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>[SimpleFunctionDescriptorImpl]

'LocalClassContext' @ [722:45] ==> public constructor LocalClassContext(declaration: IrClass) defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalClassContext[ClassConstructorDescriptorImpl]

'declaration' @ [722:63] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitClass[ValueParameterDescriptorImpl]

'localClasses' @ [723:21] ==> public final val localClasses: MutableMap<ClassDescriptor, LocalDeclarationsLowering.LocalClassContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer[PropertyDescriptorImpl]

'descriptor' @ [723:34] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitClass[LocalVariableDescriptor]

'localClassContext' @ [723:48] ==> val localClassContext: LocalDeclarationsLowering.LocalClassContext defined in org.jetbrains.kotlin.backend.common.lower.LocalDeclarationsLowering.LocalDeclarationsTransformer.collectLocalDeclarations.<no name provided>.visitClass[LocalVariableDescriptor]

