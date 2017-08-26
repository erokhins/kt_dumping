'irDeclarationContainer' @ [47:9] ==> value-parameter irDeclarationContainer: IrDeclarationContainer defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.lower[ValueParameterDescriptorImpl]

'declarations' @ [47:32] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationContainer[DeserializedPropertyDescriptor]

'transformFlat' @ [47:45] ==> public inline fun <T> MutableList<IrDeclaration>.transformFlat(transformation: (IrDeclaration) -> List<IrDeclaration>?): Unit defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'if (memberDeclaration is IrFunction)
                LocalFunctionsTransformer(memberDeclaration).lowerLocalFunctions()
            else
                null' @ [48:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<IrDeclaration>?, elseBranch: List<IrDeclaration>?): List<IrDeclaration>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<IrDeclaration>?

'memberDeclaration' @ [48:17] ==> value-parameter memberDeclaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'LocalFunctionsTransformer' @ [49:17] ==> public constructor LocalFunctionsTransformer(memberFunction: IrFunction) defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[ClassConstructorDescriptorImpl]

'memberDeclaration' @ [49:43] ==> value-parameter memberDeclaration: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'lowerLocalFunctions' @ [49:62] ==> public final fun lowerLocalFunctions(): List<IrDeclaration>? defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'closure' @ [58:49] ==> public final lateinit var closure: Closure defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'capturedValues' @ [58:57] ==> public final val capturedValues: List<ValueDescriptor> defined in org.jetbrains.kotlin.backend.common.Closure[PropertyDescriptorImpl]

'size' @ [58:72] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'HashMap' @ [62:73] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ValueDescriptor
    <V : (Any..Any?)> -> ParameterDescriptor

'-' @ [64:26] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'declaration' @ [67:45] ==> public final val declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'descriptor' @ [67:57] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'LinkedHashMap' @ [71:84] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FunctionDescriptor
    <V : (Any..Any?)> -> LocalFunctionContext

'HashMap' @ [72:73] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ParameterDescriptor
    <V : (Any..Any?)> -> ValueDescriptor

'collectLocalFunctions' @ [75:13] ==> private final fun collectLocalFunctions(): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'localFunctions' @ [76:17] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalFunctionsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'isEmpty' @ [76:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'collectClosures' @ [78:13] ==> private final fun collectClosures(): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'transformDescriptors' @ [80:13] ==> private final fun transformDescriptors(): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'rewriteBodies' @ [82:13] ==> private final fun rewriteBodies(): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'collectRewrittenDeclarations' @ [84:20] ==> private final fun collectRewrittenDeclarations(): ArrayList<IrDeclaration> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'ArrayList' @ [88:17] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrDeclaration

'localFunctions' @ [88:42] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalFunctionsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'size' @ [88:57] ==> public abstract val size: Int defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'apply' @ [88:67] ==> @InlineOnly public inline fun <T> ArrayList<IrDeclaration>.apply(block: ArrayList<IrDeclaration>.() -> Unit): ArrayList<IrDeclaration> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<IrDeclaration>

'add' @ [89:21] ==> public open fun add(element: IrDeclaration): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'memberFunction' @ [89:25] ==> public final val memberFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'localFunctions' @ [91:21] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalFunctionsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'values' @ [91:36] ==> public abstract val values: MutableCollection<LocalFunctionsLowering.LocalFunctionContext> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'mapTo' @ [91:43] ==> public inline fun <T, R, C : MutableCollection<in IrFunctionImpl>> Iterable<LocalFunctionsLowering.LocalFunctionContext>.mapTo(destination: ArrayList<IrDeclaration>, transform: (LocalFunctionsLowering.LocalFunctionContext) -> IrFunctionImpl): ArrayList<IrDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalFunctionContext
    <R> -> IrFunctionImpl
    <C : MutableCollection<in R>> -> ArrayList<IrDeclaration>

'this' @ [91:49] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectRewrittenDeclarations.<anonymous>[ReceiverParameterDescriptorImpl]

'it' @ [92:40] ==> value-parameter it: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [92:43] ==> public final val declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'IrFunctionImpl' @ [93:25] ==> public constructor IrFunctionImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor, body: IrBody?) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedClassConstructorDescriptor]

'original' @ [94:33] ==> val original: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [94:42] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'original' @ [94:55] ==> val original: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [94:64] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'original' @ [94:75] ==> val original: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'origin' @ [94:84] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'it' @ [95:33] ==> value-parameter it: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'transformedDescriptor' @ [95:36] ==> public final lateinit var transformedDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'original' @ [96:33] ==> val original: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectRewrittenDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'body' @ [96:42] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'IrElementTransformerVoid' @ [101:103] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'declaration' @ [105:24] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitClass[ValueParameterDescriptorImpl]

'IrCompositeImpl' @ [110:24] ==> public constructor IrCompositeImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCompositeImpl[DeserializedClassConstructorDescriptor]

'declaration' @ [110:40] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunction[ValueParameterDescriptorImpl]

'startOffset' @ [110:52] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'declaration' @ [110:65] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunction[ValueParameterDescriptorImpl]

'endOffset' @ [110:77] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'context' @ [110:88] ==> public final val context: BackendContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering[PropertyDescriptorImpl]

'builtIns' @ [110:96] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.BackendContext[PropertyDescriptorImpl]

'unitType' @ [110:105] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'localFunctionContext' @ [114:32] ==> public final val localFunctionContext: LocalFunctionsLowering.LocalFunctionContext? defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter[PropertyDescriptorImpl]

'let' @ [114:54] ==> @InlineOnly public inline fun <T, R> LocalFunctionsLowering.LocalFunctionContext.let(block: (LocalFunctionsLowering.LocalFunctionContext) -> ParameterDescriptor?): ParameterDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalFunctionContext
    <R> -> ParameterDescriptor?

'it' @ [114:60] ==> value-parameter it: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitGetValue.<anonymous>[ValueParameterDescriptorImpl]

'old2new' @ [114:63] ==> public final val old2new: MutableMap<ValueDescriptor, ParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'expression' @ [114:71] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitGetValue[ValueParameterDescriptorImpl]

'descriptor' @ [114:82] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'if (remapped == null)
                    expression
                else
                    IrGetValueImpl(expression.startOffset, expression.endOffset, remapped, expression.origin)' @ [115:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'remapped' @ [115:28] ==> val remapped: ParameterDescriptor? defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitGetValue[LocalVariableDescriptor]

'expression' @ [116:21] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitGetValue[ValueParameterDescriptorImpl]

'IrGetValueImpl' @ [118:21] ==> @Deprecated public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, descriptor: ValueDescriptor, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'expression' @ [118:36] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitGetValue[ValueParameterDescriptorImpl]

'startOffset' @ [118:47] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'expression' @ [118:60] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitGetValue[ValueParameterDescriptorImpl]

'endOffset' @ [118:71] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'remapped' @ [118:82] ==> val remapped: ParameterDescriptor? defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitGetValue[LocalVariableDescriptor]

'expression' @ [118:92] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitGetValue[ValueParameterDescriptorImpl]

'origin' @ [118:103] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'expression' @ [122:17] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitCall[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [122:28] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [122:50] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter[LazyClassReceiverParameterDescriptor]

'expression' @ [124:33] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitCall[ValueParameterDescriptorImpl]

'descriptor' @ [124:44] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'original' @ [124:55] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'localFunctions' @ [125:41] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalFunctionsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'oldCallee' @ [125:56] ==> val oldCallee: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitCall[LocalVariableDescriptor]

'expression' @ [125:77] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitCall[ValueParameterDescriptorImpl]

'localFunctionData' @ [127:33] ==> val localFunctionData: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitCall[LocalVariableDescriptor]

'transformedDescriptor' @ [127:51] ==> public final lateinit var transformedDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'createNewCall' @ [129:24] ==> private final fun createNewCall(oldCall: IrCall, newCallee: FunctionDescriptor): IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'expression' @ [129:38] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitCall[ValueParameterDescriptorImpl]

'newCallee' @ [129:50] ==> val newCallee: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitCall[LocalVariableDescriptor]

'fillArguments' @ [129:61] ==> private final fun <T : IrMemberAccessExpression> IrCall.fillArguments(calleeContext: LocalFunctionsLowering.LocalFunctionContext, oldExpression: IrMemberAccessExpression): IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrMemberAccessExpression> -> IrCall

'localFunctionData' @ [129:75] ==> val localFunctionData: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitCall[LocalVariableDescriptor]

'expression' @ [129:94] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitCall[ValueParameterDescriptorImpl]

'calleeContext' @ [133:46] ==> value-parameter calleeContext: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments[ValueParameterDescriptorImpl]

'closureParametersCount' @ [133:60] ==> public final val closureParametersCount: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'mapValueParametersIndexed' @ [135:17] ==> public inline fun <T : IrMemberAccessExpression> T.mapValueParametersIndexed(transform: (Int, ValueParameterDescriptor) -> IrExpression?): T defined in org.jetbrains.kotlin.ir.expressions[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrMemberAccessExpression> -> T

'new2old' @ [136:51] ==> public final val new2old: MutableMap<ParameterDescriptor, ValueDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'newValueParameterDescriptor' @ [136:59] ==> value-parameter newValueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [137:57] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'newValueParameterDescriptor' @ [137:95] ==> value-parameter newValueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[ValueParameterDescriptorImpl]

'if (index >= closureParametersCount)
                        oldExpression.getValueArgument(capturedValueDescriptor as ValueParameterDescriptor)
                    else {
                        val remappedValueDescriptor = localFunctionContext?.let { it.old2new[capturedValueDescriptor] }
                        IrGetValueImpl(oldExpression.startOffset, oldExpression.endOffset,
                                       remappedValueDescriptor ?: capturedValueDescriptor)
                    }' @ [138:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression?, elseBranch: IrExpression?): IrExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression?

'index' @ [138:25] ==> value-parameter index: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[ValueParameterDescriptorImpl]

'closureParametersCount' @ [138:34] ==> val closureParametersCount: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments[LocalVariableDescriptor]

'oldExpression' @ [139:25] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments[ValueParameterDescriptorImpl]

'getValueArgument' @ [139:39] ==> public fun IrMemberAccessExpression.getValueArgument(valueParameterDescriptor: ValueParameterDescriptor): IrExpression? defined in org.jetbrains.kotlin.ir.expressions[DeserializedSimpleFunctionDescriptor]

'capturedValueDescriptor' @ [139:56] ==> val capturedValueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[LocalVariableDescriptor]

'localFunctionContext' @ [141:55] ==> public final val localFunctionContext: LocalFunctionsLowering.LocalFunctionContext? defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter[PropertyDescriptorImpl]

'let' @ [141:77] ==> @InlineOnly public inline fun <T, R> LocalFunctionsLowering.LocalFunctionContext.let(block: (LocalFunctionsLowering.LocalFunctionContext) -> ParameterDescriptor?): ParameterDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalFunctionContext
    <R> -> ParameterDescriptor?

'it' @ [141:83] ==> value-parameter it: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'old2new' @ [141:86] ==> public final val old2new: MutableMap<ValueDescriptor, ParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'capturedValueDescriptor' @ [141:94] ==> val capturedValueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[LocalVariableDescriptor]

'IrGetValueImpl' @ [142:25] ==> @Deprecated public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, descriptor: ValueDescriptor, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'oldExpression' @ [142:40] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments[ValueParameterDescriptorImpl]

'startOffset' @ [142:54] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'oldExpression' @ [142:67] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments[ValueParameterDescriptorImpl]

'endOffset' @ [142:81] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'remappedValueDescriptor' @ [143:40] ==> val remappedValueDescriptor: ParameterDescriptor? defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[LocalVariableDescriptor]

'capturedValueDescriptor' @ [143:67] ==> val capturedValueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments.<anonymous>[LocalVariableDescriptor]

'dispatchReceiver' @ [148:17] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'oldExpression' @ [148:36] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [148:50] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'extensionReceiver' @ [149:17] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'oldExpression' @ [149:37] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments[ValueParameterDescriptorImpl]

'extensionReceiver' @ [149:51] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'this' @ [151:24] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.fillArguments[ReceiverParameterDescriptorImpl]

'expression' @ [155:17] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [155:28] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [155:50] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter[LazyClassReceiverParameterDescriptor]

'expression' @ [157:33] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'descriptor' @ [157:44] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[DeserializedPropertyDescriptor]

'original' @ [157:55] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'localFunctions' @ [158:41] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalFunctionsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'oldCallee' @ [158:56] ==> val oldCallee: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunctionReference[LocalVariableDescriptor]

'expression' @ [158:77] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'localFunctionData' @ [159:33] ==> val localFunctionData: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunctionReference[LocalVariableDescriptor]

'transformedDescriptor' @ [159:51] ==> public final lateinit var transformedDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'IrFunctionReferenceImpl' @ [161:24] ==> @Deprecated public constructor IrFunctionReferenceImpl(startOffset: Int, endOffset: Int, type: KotlinType, descriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrFunctionReferenceImpl[DeserializedClassConstructorDescriptor]

'expression' @ [162:25] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'startOffset' @ [162:36] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[DeserializedPropertyDescriptor]

'expression' @ [162:49] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'endOffset' @ [162:60] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[DeserializedPropertyDescriptor]

'expression' @ [163:25] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'type' @ [163:36] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[DeserializedPropertyDescriptor]

'newCallee' @ [164:25] ==> val newCallee: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunctionReference[LocalVariableDescriptor]

'remapTypeArguments' @ [165:25] ==> private final fun remapTypeArguments(oldExpression: IrMemberAccessExpression, newCallee: FunctionDescriptor): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'expression' @ [165:44] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'newCallee' @ [165:56] ==> val newCallee: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunctionReference[LocalVariableDescriptor]

'expression' @ [166:25] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'origin' @ [166:36] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[DeserializedPropertyDescriptor]

'fillArguments' @ [167:19] ==> private final fun <T : IrMemberAccessExpression> IrFunctionReferenceImpl.fillArguments(calleeContext: LocalFunctionsLowering.LocalFunctionContext, oldExpression: IrMemberAccessExpression): IrFunctionReferenceImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrMemberAccessExpression> -> IrFunctionReferenceImpl

'localFunctionData' @ [167:33] ==> val localFunctionData: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunctionReference[LocalVariableDescriptor]

'expression' @ [167:52] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitFunctionReference[ValueParameterDescriptorImpl]

'expression' @ [171:17] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitReturn[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [171:28] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [171:50] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter[LazyClassReceiverParameterDescriptor]

'expression' @ [173:39] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitReturn[ValueParameterDescriptorImpl]

'returnTarget' @ [173:50] ==> public abstract val returnTarget: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'localFunctions' @ [174:41] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalFunctionsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'oldReturnTarget' @ [174:56] ==> val oldReturnTarget: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitReturn[LocalVariableDescriptor]

'expression' @ [174:83] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitReturn[ValueParameterDescriptorImpl]

'localFunctionData' @ [175:39] ==> val localFunctionData: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitReturn[LocalVariableDescriptor]

'transformedDescriptor' @ [175:57] ==> public final lateinit var transformedDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'IrReturnImpl' @ [177:24] ==> @Deprecated public constructor IrReturnImpl(startOffset: Int, endOffset: Int, returnTargetDescriptor: FunctionDescriptor, value: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl[DeserializedClassConstructorDescriptor]

'expression' @ [177:37] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitReturn[ValueParameterDescriptorImpl]

'startOffset' @ [177:48] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'expression' @ [177:61] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitReturn[ValueParameterDescriptorImpl]

'endOffset' @ [177:72] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'newReturnTarget' @ [178:37] ==> val newReturnTarget: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitReturn[LocalVariableDescriptor]

'expression' @ [179:37] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter.visitReturn[ValueParameterDescriptorImpl]

'value' @ [179:48] ==> public abstract var value: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'irFunction' @ [184:13] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.rewriteFunctionDeclaration[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [184:24] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'FunctionBodiesRewriter' @ [184:46] ==> public constructor FunctionBodiesRewriter(localFunctionContext: LocalFunctionsLowering.LocalFunctionContext?) defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.FunctionBodiesRewriter[ClassConstructorDescriptorImpl]

'localFunctionContext' @ [184:69] ==> value-parameter localFunctionContext: LocalFunctionsLowering.LocalFunctionContext? defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.rewriteFunctionDeclaration[ValueParameterDescriptorImpl]

'localFunctions' @ [188:13] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalFunctionsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'values' @ [188:28] ==> public abstract val values: MutableCollection<LocalFunctionsLowering.LocalFunctionContext> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'forEach' @ [188:35] ==> @HidesMembers public inline fun <T> Iterable<LocalFunctionsLowering.LocalFunctionContext>.forEach(action: (LocalFunctionsLowering.LocalFunctionContext) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalFunctionContext

'rewriteFunctionDeclaration' @ [189:17] ==> private final fun rewriteFunctionDeclaration(irFunction: IrFunction, localFunctionContext: LocalFunctionsLowering.LocalFunctionContext?): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'it' @ [189:44] ==> value-parameter it: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.rewriteBodies.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [189:47] ==> public final val declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'it' @ [189:60] ==> value-parameter it: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.rewriteBodies.<anonymous>[ValueParameterDescriptorImpl]

'rewriteFunctionDeclaration' @ [192:13] ==> private final fun rewriteFunctionDeclaration(irFunction: IrFunction, localFunctionContext: LocalFunctionsLowering.LocalFunctionContext?): Unit defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'memberFunction' @ [192:40] ==> public final val memberFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'when (oldCall) {
                    is IrCallWithShallowCopy ->
                        oldCall.shallowCopy(oldCall.origin, newCallee, oldCall.superQualifier)
                    else ->
                        IrCallImpl(
                                oldCall.startOffset, oldCall.endOffset,
                                newCallee,
                                remapTypeArguments(oldCall, newCallee),
                                oldCall.origin, oldCall.superQualifier
                        )
                }' @ [196:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrCall, entry1: IrCall): IrCall[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrCall

'oldCall' @ [196:23] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createNewCall[ValueParameterDescriptorImpl]

'oldCall' @ [198:25] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createNewCall[ValueParameterDescriptorImpl]

'shallowCopy' @ [198:33] ==> @Deprecated public abstract fun shallowCopy(newOrigin: IrStatementOrigin?, newCallee: FunctionDescriptor, newSuperQualifier: ClassDescriptor?): IrCall defined in org.jetbrains.kotlin.ir.expressions.IrCallWithShallowCopy[DeserializedSimpleFunctionDescriptor]

'oldCall' @ [198:45] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createNewCall[ValueParameterDescriptorImpl]

'origin' @ [198:53] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'newCallee' @ [198:61] ==> value-parameter newCallee: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createNewCall[ValueParameterDescriptorImpl]

'oldCall' @ [198:72] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createNewCall[ValueParameterDescriptorImpl]

'superQualifier' @ [198:80] ==> public abstract val superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'IrCallImpl' @ [200:25] ==> @Deprecated public constructor IrCallImpl(startOffset: Int, endOffset: Int, calleeDescriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ..., origin: IrStatementOrigin? = ..., superQualifierDescriptor: ClassDescriptor? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedClassConstructorDescriptor]

'oldCall' @ [201:33] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createNewCall[ValueParameterDescriptorImpl]

'startOffset' @ [201:41] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'oldCall' @ [201:54] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createNewCall[ValueParameterDescriptorImpl]

'endOffset' @ [201:62] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'newCallee' @ [202:33] ==> value-parameter newCallee: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createNewCall[ValueParameterDescriptorImpl]

'remapTypeArguments' @ [203:33] ==> private final fun remapTypeArguments(oldExpression: IrMemberAccessExpression, newCallee: FunctionDescriptor): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'oldCall' @ [203:52] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createNewCall[ValueParameterDescriptorImpl]

'newCallee' @ [203:61] ==> value-parameter newCallee: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createNewCall[ValueParameterDescriptorImpl]

'oldCall' @ [204:33] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createNewCall[ValueParameterDescriptorImpl]

'origin' @ [204:41] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'oldCall' @ [204:49] ==> value-parameter oldCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createNewCall[ValueParameterDescriptorImpl]

'superQualifier' @ [204:57] ==> public abstract val superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'oldExpression' @ [209:29] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.remapTypeArguments[ValueParameterDescriptorImpl]

'descriptor' @ [209:43] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'if (oldCallee.typeParameters.isEmpty())
                null
            else oldCallee.original.typeParameters.associateBy(
                    { newCallee.typeParameters[it.index] },
                    { oldExpression.getTypeArgument(it)!! }
            )' @ [211:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Map<TypeParameterDescriptor, KotlinType>?, elseBranch: Map<TypeParameterDescriptor, KotlinType>?): Map<TypeParameterDescriptor, KotlinType>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Map<TypeParameterDescriptor, KotlinType>?

'oldCallee' @ [211:24] ==> val oldCallee: CallableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.remapTypeArguments[LocalVariableDescriptor]

'typeParameters' @ [211:34] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [211:49] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'oldCallee' @ [213:18] ==> val oldCallee: CallableDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.remapTypeArguments[LocalVariableDescriptor]

'original' @ [213:28] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'typeParameters' @ [213:37] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'associateBy' @ [213:52] ==> public inline fun <T, K, V> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.associateBy(keySelector: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> TypeParameterDescriptor, valueTransform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> KotlinType): Map<TypeParameterDescriptor, KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <K> -> TypeParameterDescriptor
    <V> -> KotlinType

'newCallee' @ [214:23] ==> value-parameter newCallee: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.remapTypeArguments[ValueParameterDescriptorImpl]

'typeParameters' @ [214:33] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'it' @ [214:48] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.remapTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [214:51] ==> public final val TypeParameterDescriptor.index: Int[MyPropertyDescriptor]

'oldExpression' @ [215:23] ==> value-parameter oldExpression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.remapTypeArguments[ValueParameterDescriptorImpl]

'getTypeArgument' @ [215:37] ==> public abstract fun getTypeArgument(typeParameterDescriptor: TypeParameterDescriptor): KotlinType? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedSimpleFunctionDescriptor]

'it' @ [215:53] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.remapTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'localFunctions' @ [220:13] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalFunctionsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'values' @ [220:28] ==> public abstract val values: MutableCollection<LocalFunctionsLowering.LocalFunctionContext> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'forEach' @ [220:35] ==> @HidesMembers public inline fun <T> Iterable<LocalFunctionsLowering.LocalFunctionContext>.forEach(action: (LocalFunctionsLowering.LocalFunctionContext) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalFunctionContext

'it' @ [221:17] ==> value-parameter it: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.transformDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'transformedDescriptor' @ [221:20] ==> public final lateinit var transformedDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'createTransformedDescriptor' @ [221:44] ==> private final fun createTransformedDescriptor(localFunctionContext: LocalFunctionsLowering.LocalFunctionContext): FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'it' @ [221:72] ==> value-parameter it: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.transformDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'localFunctions' @ [226:40] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalFunctionsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'descriptor' @ [226:55] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.suggestLocalName[ValueParameterDescriptorImpl]

'if (localFunctionContext != null && localFunctionContext.index >= 0)
                "lambda-${localFunctionContext.index}"
            else
                descriptor.name.asString()' @ [227:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'localFunctionContext' @ [227:24] ==> val localFunctionContext: LocalFunctionsLowering.LocalFunctionContext? defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.suggestLocalName[LocalVariableDescriptor]

'localFunctionContext' @ [227:56] ==> val localFunctionContext: LocalFunctionsLowering.LocalFunctionContext? defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.suggestLocalName[LocalVariableDescriptor]

'index' @ [227:77] ==> public final var index: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'localFunctionContext' @ [228:27] ==> val localFunctionContext: LocalFunctionsLowering.LocalFunctionContext? defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.suggestLocalName[LocalVariableDescriptor]

'index' @ [228:48] ==> public final var index: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'descriptor' @ [230:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.suggestLocalName[ValueParameterDescriptorImpl]

'name' @ [230:28] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [230:33] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'identifier' @ [234:22] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'functionDescriptor' @ [235:25] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.generateNameForLiftedFunction[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [235:44] ==> public val DeclarationDescriptor.parentsWithSelf: Sequence<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [236:34] ==> public fun <T> Sequence<DeclarationDescriptor>.takeWhile(predicate: (DeclarationDescriptor) -> Boolean): Sequence<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [236:46] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.generateNameForLiftedFunction.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [237:34] ==> public fun <T> Sequence<DeclarationDescriptor>.toList(): List<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'reversed' @ [237:43] ==> public fun <T> Iterable<DeclarationDescriptor>.reversed(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'joinToString' @ [238:34] ==> public fun <T> Iterable<DeclarationDescriptor>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((DeclarationDescriptor) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'suggestLocalName' @ [238:66] ==> private final fun suggestLocalName(descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'it' @ [238:83] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.generateNameForLiftedFunction.<anonymous>[ValueParameterDescriptorImpl]

'localFunctionContext' @ [242:33] ==> value-parameter localFunctionContext: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[ValueParameterDescriptorImpl]

'declaration' @ [242:54] ==> public final val declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'descriptor' @ [242:66] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'memberFunction' @ [244:31] ==> public final val memberFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'descriptor' @ [244:46] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'containingDeclaration' @ [244:57] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'create' @ [245:62] ==> @NotNull public open fun create(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, @NotNull p2: Name, @NotNull p3: CallableMemberDescriptor.Kind, @NotNull p4: SourceElement): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaMethodDescriptor]

'memberOwner' @ [246:21] ==> val memberOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'oldDescriptor' @ [247:21] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'annotations' @ [247:35] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[DeserializedPropertyDescriptor]

'generateNameForLiftedFunction' @ [248:21] ==> private final fun generateNameForLiftedFunction(functionDescriptor: FunctionDescriptor): Name defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'oldDescriptor' @ [248:51] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'SYNTHESIZED' @ [249:51] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'oldDescriptor' @ [250:21] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'source' @ [250:35] ==> public final val FunctionDescriptor.source: SourceElement[MyPropertyDescriptor]

'localFunctionContext' @ [253:42] ==> value-parameter localFunctionContext: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[ValueParameterDescriptorImpl]

'closureParametersCount' @ [253:63] ==> public final val closureParametersCount: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'closureParametersCount' @ [254:43] ==> val closureParametersCount: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'oldDescriptor' @ [254:68] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'valueParameters' @ [254:82] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [254:98] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'if (memberOwner is ClassDescriptor && oldDescriptor.dispatchReceiverParameter != null)
                        memberOwner.thisAsReceiverParameter
                    else
                        null' @ [257:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReceiverParameterDescriptor?, elseBranch: ReceiverParameterDescriptor?): ReceiverParameterDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReceiverParameterDescriptor?

'memberOwner' @ [257:25] ==> val memberOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'oldDescriptor' @ [257:59] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [257:73] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'memberOwner' @ [258:25] ==> val memberOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'thisAsReceiverParameter' @ [258:37] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'oldDescriptor' @ [263:37] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'typeParameters' @ [263:51] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'ArrayList' @ [265:38] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ValueParameterDescriptor

'newValueParametersCount' @ [265:74] ==> val newValueParametersCount: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'apply' @ [265:99] ==> @InlineOnly public inline fun <T> ArrayList<ValueParameterDescriptor>.apply(block: ArrayList<ValueParameterDescriptor>.() -> Unit): ArrayList<ValueParameterDescriptor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<ValueParameterDescriptor>

'localFunctionContext' @ [266:17] ==> value-parameter localFunctionContext: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[ValueParameterDescriptorImpl]

'closure' @ [266:38] ==> public final lateinit var closure: Closure defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'capturedValues' @ [266:46] ==> public final val capturedValues: List<ValueDescriptor> defined in org.jetbrains.kotlin.backend.common.Closure[PropertyDescriptorImpl]

'mapIndexedTo' @ [266:61] ==> public inline fun <T, R, C : MutableCollection<in ValueParameterDescriptor>> Iterable<ValueDescriptor>.mapIndexedTo(destination: ArrayList<ValueParameterDescriptor>, transform: (index: Int, ValueDescriptor) -> ValueParameterDescriptor): ArrayList<ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueDescriptor
    <R> -> ValueParameterDescriptor
    <C : MutableCollection<in R>> -> ArrayList<ValueParameterDescriptor>

'this' @ [266:74] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor.<anonymous>[ReceiverParameterDescriptorImpl]

'createUnsubstitutedCapturedValueParameter' @ [267:21] ==> private final fun createUnsubstitutedCapturedValueParameter(newParameterOwner: CallableMemberDescriptor, valueDescriptor: ValueDescriptor, index: Int): ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'newDescriptor' @ [267:63] ==> val newDescriptor: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'capturedValueDescriptor' @ [267:78] ==> value-parameter capturedValueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'i' @ [267:103] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'apply' @ [267:106] ==> @InlineOnly public inline fun <T> ValueParameterDescriptor.apply(block: ValueParameterDescriptor.() -> Unit): ValueParameterDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'localFunctionContext' @ [268:25] ==> value-parameter localFunctionContext: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[ValueParameterDescriptorImpl]

'recordRemapped' @ [268:46] ==> private final fun LocalFunctionsLowering.LocalFunctionContext.recordRemapped(oldDescriptor: ValueDescriptor, newDescriptor: ParameterDescriptor): ParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'capturedValueDescriptor' @ [268:61] ==> value-parameter capturedValueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [268:86] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'oldDescriptor' @ [272:17] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'valueParameters' @ [272:31] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'mapIndexedTo' @ [272:47] ==> public inline fun <T, R, C : MutableCollection<in ValueParameterDescriptor>> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.mapIndexedTo(destination: ArrayList<ValueParameterDescriptor>, transform: (index: Int, (ValueParameterDescriptor..ValueParameterDescriptor?)) -> ValueParameterDescriptor): ArrayList<ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> ValueParameterDescriptor
    <C : MutableCollection<in R>> -> ArrayList<ValueParameterDescriptor>

'this' @ [272:60] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor.<anonymous>[ReceiverParameterDescriptorImpl]

'createUnsubstitutedParameter' @ [273:21] ==> private final fun createUnsubstitutedParameter(newParameterOwner: CallableMemberDescriptor, valueParameterDescriptor: ValueParameterDescriptor, newIndex: Int): ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'newDescriptor' @ [273:50] ==> val newDescriptor: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'oldValueParameterDescriptor' @ [273:65] ==> value-parameter oldValueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'closureParametersCount' @ [273:94] ==> val closureParametersCount: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'i' @ [273:119] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'apply' @ [273:122] ==> @InlineOnly public inline fun <T> ValueParameterDescriptor.apply(block: ValueParameterDescriptor.() -> Unit): ValueParameterDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'localFunctionContext' @ [274:25] ==> value-parameter localFunctionContext: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[ValueParameterDescriptorImpl]

'recordRemapped' @ [274:46] ==> private final fun LocalFunctionsLowering.LocalFunctionContext.recordRemapped(oldDescriptor: ValueDescriptor, newDescriptor: ParameterDescriptor): ParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'oldValueParameterDescriptor' @ [274:61] ==> value-parameter oldValueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [274:90] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'newDescriptor' @ [279:13] ==> val newDescriptor: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'initialize' @ [279:27] ==> @NotNull public open fun initialize(@Nullable p0: KotlinType?, @Nullable p1: ReceiverParameterDescriptor?, @NotNull p2: (MutableList<out (TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>), @NotNull p3: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @Nullable p4: KotlinType?, @Nullable p5: Modality?, @NotNull p6: Visibility): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaMethodDescriptor]

'oldDescriptor' @ [280:21] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'extensionReceiverParameter' @ [280:35] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [280:63] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'newDispatchReceiverParameter' @ [281:21] ==> val newDispatchReceiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'newTypeParameters' @ [282:21] ==> val newTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'newValueParameters' @ [283:21] ==> val newValueParameters: ArrayList<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'oldDescriptor' @ [284:21] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'returnType' @ [284:35] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'Modality' @ [285:21] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [285:30] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'PRIVATE' @ [286:34] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'oldDescriptor' @ [289:13] ==> val oldDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'extensionReceiverParameter' @ [289:27] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'let' @ [289:55] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> ParameterDescriptor): ParameterDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> ParameterDescriptor

'localFunctionContext' @ [290:17] ==> value-parameter localFunctionContext: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[ValueParameterDescriptorImpl]

'recordRemapped' @ [290:38] ==> private final fun LocalFunctionsLowering.LocalFunctionContext.recordRemapped(oldDescriptor: ValueDescriptor, newDescriptor: ParameterDescriptor): ParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'it' @ [290:53] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'newDescriptor' @ [290:57] ==> val newDescriptor: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'extensionReceiverParameter' @ [290:71] ==> public final val SimpleFunctionDescriptorImpl.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'newDescriptor' @ [293:20] ==> val newDescriptor: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createTransformedDescriptor[LocalVariableDescriptor]

'old2new' @ [297:13] ==> public final val old2new: MutableMap<ValueDescriptor, ParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'oldDescriptor' @ [297:21] ==> value-parameter oldDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.recordRemapped[ValueParameterDescriptorImpl]

'newDescriptor' @ [297:38] ==> value-parameter newDescriptor: ParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.recordRemapped[ValueParameterDescriptorImpl]

'new2old' @ [298:13] ==> public final val new2old: MutableMap<ParameterDescriptor, ValueDescriptor> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'newDescriptor' @ [298:21] ==> value-parameter newDescriptor: ParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.recordRemapped[ValueParameterDescriptorImpl]

'oldDescriptor' @ [298:38] ==> value-parameter oldDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.recordRemapped[ValueParameterDescriptorImpl]

'newDescriptor' @ [299:20] ==> value-parameter newDescriptor: ParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.recordRemapped[ValueParameterDescriptorImpl]

'if (valueDescriptor.name.isSpecial) {
                    val oldNameStr = valueDescriptor.name.asString()
                    Name.identifier("$" + oldNameStr.substring(1, oldNameStr.length - 1))
                }
                else
                    valueDescriptor.name' @ [303:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name, elseBranch: Name): Name[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name

'valueDescriptor' @ [303:21] ==> value-parameter valueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.suggestNameForCapturedValueParameter[ValueParameterDescriptorImpl]

'name' @ [303:37] ==> public final val ValueDescriptor.name: Name[MyPropertyDescriptor]

'isSpecial' @ [303:42] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'valueDescriptor' @ [304:38] ==> value-parameter valueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.suggestNameForCapturedValueParameter[ValueParameterDescriptorImpl]

'name' @ [304:54] ==> public final val ValueDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [304:59] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'identifier' @ [305:26] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'+' @ [305:37] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'oldNameStr' @ [305:43] ==> val oldNameStr: String defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.suggestNameForCapturedValueParameter[LocalVariableDescriptor]

'substring' @ [305:54] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'oldNameStr' @ [305:67] ==> val oldNameStr: String defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.suggestNameForCapturedValueParameter[LocalVariableDescriptor]

'length' @ [305:78] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'valueDescriptor' @ [308:21] ==> value-parameter valueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.suggestNameForCapturedValueParameter[ValueParameterDescriptorImpl]

'name' @ [308:37] ==> public final val ValueDescriptor.name: Name[MyPropertyDescriptor]

'ValueParameterDescriptorImpl' @ [315:17] ==> public constructor ValueParameterDescriptorImpl(containingDeclaration: CallableDescriptor, original: ValueParameterDescriptor?, index: Int, annotations: Annotations, name: Name, outType: KotlinType, declaresDefaultValue: Boolean, isCrossinline: Boolean, isNoinline: Boolean, varargElementType: KotlinType?, source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.ValueParameterDescriptorImpl[DeserializedClassConstructorDescriptor]

'newParameterOwner' @ [316:25] ==> value-parameter newParameterOwner: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createUnsubstitutedCapturedValueParameter[ValueParameterDescriptorImpl]

'index' @ [316:50] ==> value-parameter index: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createUnsubstitutedCapturedValueParameter[ValueParameterDescriptorImpl]

'valueDescriptor' @ [317:25] ==> value-parameter valueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createUnsubstitutedCapturedValueParameter[ValueParameterDescriptorImpl]

'annotations' @ [317:41] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ValueDescriptor[DeserializedPropertyDescriptor]

'suggestNameForCapturedValueParameter' @ [318:25] ==> private final fun suggestNameForCapturedValueParameter(valueDescriptor: ValueDescriptor): Name defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[SimpleFunctionDescriptorImpl]

'valueDescriptor' @ [318:62] ==> value-parameter valueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createUnsubstitutedCapturedValueParameter[ValueParameterDescriptorImpl]

'valueDescriptor' @ [319:25] ==> value-parameter valueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createUnsubstitutedCapturedValueParameter[ValueParameterDescriptorImpl]

'type' @ [319:41] ==> public final val ValueDescriptor.type: KotlinType[MyPropertyDescriptor]

'valueDescriptor' @ [320:52] ==> value-parameter valueDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createUnsubstitutedCapturedValueParameter[ValueParameterDescriptorImpl]

'source' @ [320:68] ==> public final val ValueDescriptor.source: SourceElement[MyPropertyDescriptor]

'valueParameterDescriptor' @ [328:17] ==> value-parameter valueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createUnsubstitutedParameter[ValueParameterDescriptorImpl]

'copy' @ [328:42] ==> public abstract fun copy(newOwner: CallableDescriptor, newName: Name, newIndex: Int): ValueParameterDescriptor defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'newParameterOwner' @ [328:47] ==> value-parameter newParameterOwner: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createUnsubstitutedParameter[ValueParameterDescriptorImpl]

'valueParameterDescriptor' @ [328:66] ==> value-parameter valueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createUnsubstitutedParameter[ValueParameterDescriptorImpl]

'name' @ [328:91] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'newIndex' @ [328:97] ==> value-parameter newIndex: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.createUnsubstitutedParameter[ValueParameterDescriptorImpl]

'memberFunction' @ [332:13] ==> public final val memberFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'acceptChildrenVoid' @ [332:28] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'AbstractClosureAnnotator' @ [332:56] ==> public constructor AbstractClosureAnnotator() defined in org.jetbrains.kotlin.backend.common.AbstractClosureAnnotator[ClassConstructorDescriptorImpl]

'localFunctions' @ [339:21] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalFunctionsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'functionDescriptor' @ [339:36] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectClosures.<no name provided>.recordFunctionClosure[ValueParameterDescriptorImpl]

'closure' @ [339:57] ==> public final lateinit var closure: Closure defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'closure' @ [339:67] ==> value-parameter closure: Closure defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectClosures.<no name provided>.recordFunctionClosure[ValueParameterDescriptorImpl]

'memberFunction' @ [349:13] ==> public final val memberFunction: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'acceptChildrenVoid' @ [349:28] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'element' @ [353:21] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectLocalFunctions.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [353:29] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [353:48] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectLocalFunctions.<no name provided>[LazyClassReceiverParameterDescriptor]

'declaration' @ [357:21] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectLocalFunctions.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [357:33] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [357:52] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectLocalFunctions.<no name provided>[LazyClassReceiverParameterDescriptor]

'LocalFunctionContext' @ [358:48] ==> public constructor LocalFunctionContext(declaration: IrFunction) defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[ClassConstructorDescriptorImpl]

'declaration' @ [358:69] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectLocalFunctions.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'localFunctions' @ [359:21] ==> public final val localFunctions: MutableMap<FunctionDescriptor, LocalFunctionsLowering.LocalFunctionContext> defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer[PropertyDescriptorImpl]

'declaration' @ [359:36] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectLocalFunctions.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'descriptor' @ [359:48] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'localFunctionContext' @ [359:62] ==> val localFunctionContext: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectLocalFunctions.<no name provided>.visitFunction[LocalVariableDescriptor]

'declaration' @ [360:25] ==> value-parameter declaration: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectLocalFunctions.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'descriptor' @ [360:37] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'name' @ [360:48] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'isSpecial' @ [360:53] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'localFunctionContext' @ [361:25] ==> val localFunctionContext: LocalFunctionsLowering.LocalFunctionContext defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectLocalFunctions.<no name provided>.visitFunction[LocalVariableDescriptor]

'index' @ [361:46] ==> public final var index: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionContext[PropertyDescriptorImpl]

'lambdasCount' @ [361:54] ==> public final var lambdasCount: Int defined in org.jetbrains.kotlin.backend.common.lower.LocalFunctionsLowering.LocalFunctionsTransformer.collectLocalFunctions.<no name provided>[PropertyDescriptorImpl]

