'callReceiver' @ [40:13] ==> public final val callReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase[PropertyDescriptorImpl]

'call' @ [40:26] ==> public abstract fun call(withDispatchAndExtensionReceivers: (IntermediateValue?, IntermediateValue?) -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.CallReceiver[SimpleFunctionDescriptorImpl]

'dispatchReceiverValue' @ [41:49] ==> value-parameter dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [41:72] ==> @InlineOnly public inline fun <T, R> IntermediateValue.let(block: (IntermediateValue) -> IrVariable): IrVariable defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntermediateValue
    <R> -> IrVariable

'scope' @ [42:21] ==> public final val scope: Scope defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase[PropertyDescriptorImpl]

'createTemporaryVariable' @ [42:27] ==> public final fun createTemporaryVariable(irExpression: IrExpression, nameHint: String? = ..., isMutable: Boolean = ..., origin: IrDeclarationOrigin = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedSimpleFunctionDescriptor]

'dispatchReceiverValue' @ [42:51] ==> value-parameter dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [42:73] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'dispatchReceiverVariable2' @ [44:46] ==> val dispatchReceiverVariable2: IrVariable? defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[LocalVariableDescriptor]

'let' @ [44:73] ==> @InlineOnly public inline fun <T, R> IrVariable.let(block: (IrVariable) -> VariableLValue): VariableLValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVariable
    <R> -> VariableLValue

'VariableLValue' @ [44:79] ==> public constructor VariableLValue(irVariable: IrVariable, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.psi2ir.intermediate.VariableLValue[ClassConstructorDescriptorImpl]

'it' @ [44:94] ==> value-parameter it: IrVariable defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'extensionReceiverValue' @ [46:50] ==> value-parameter extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [46:74] ==> @InlineOnly public inline fun <T, R> IntermediateValue.let(block: (IntermediateValue) -> IrVariable): IrVariable defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntermediateValue
    <R> -> IrVariable

'scope' @ [47:21] ==> public final val scope: Scope defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase[PropertyDescriptorImpl]

'createTemporaryVariable' @ [47:27] ==> public final fun createTemporaryVariable(irExpression: IrExpression, nameHint: String? = ..., isMutable: Boolean = ..., origin: IrDeclarationOrigin = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedSimpleFunctionDescriptor]

'extensionReceiverValue' @ [47:51] ==> value-parameter extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [47:74] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'extensionReceiverVariable2' @ [49:47] ==> val extensionReceiverVariable2: IrVariable? defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[LocalVariableDescriptor]

'let' @ [49:75] ==> @InlineOnly public inline fun <T, R> IrVariable.let(block: (IrVariable) -> VariableLValue): VariableLValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVariable
    <R> -> VariableLValue

'VariableLValue' @ [49:81] ==> public constructor VariableLValue(irVariable: IrVariable, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.psi2ir.intermediate.VariableLValue[ClassConstructorDescriptorImpl]

'it' @ [49:96] ==> value-parameter it: IrVariable defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [51:42] ==> public abstract operator fun invoke(p1: LValue): IrExpression defined in kotlin.Function1[FunctionInvokeDescriptor]

'withReceiver' @ [51:53] ==> protected abstract fun withReceiver(dispatchReceiver: VariableLValue?, extensionReceiver: VariableLValue?): PropertyLValueBase defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase[SimpleFunctionDescriptorImpl]

'dispatchReceiverValue2' @ [51:66] ==> val dispatchReceiverValue2: VariableLValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[LocalVariableDescriptor]

'extensionReceiverValue2' @ [51:90] ==> val extensionReceiverValue2: VariableLValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[LocalVariableDescriptor]

'IrBlockImpl' @ [53:31] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [53:43] ==> public final val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase[PropertyDescriptorImpl]

'endOffset' @ [53:56] ==> public final val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase[PropertyDescriptorImpl]

'irResultExpression' @ [53:67] ==> val irResultExpression: IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[LocalVariableDescriptor]

'type' @ [53:86] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'origin' @ [53:92] ==> public final val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase[PropertyDescriptorImpl]

'irBlock' @ [54:17] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[LocalVariableDescriptor]

'addIfNotNull' @ [54:25] ==> public fun IrBlockImpl.addIfNotNull(statement: IrStatement?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl[DeserializedSimpleFunctionDescriptor]

'dispatchReceiverVariable2' @ [54:38] ==> val dispatchReceiverVariable2: IrVariable? defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[LocalVariableDescriptor]

'irBlock' @ [55:17] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[LocalVariableDescriptor]

'addIfNotNull' @ [55:25] ==> public fun IrBlockImpl.addIfNotNull(statement: IrStatement?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl[DeserializedSimpleFunctionDescriptor]

'extensionReceiverVariable2' @ [55:38] ==> val extensionReceiverVariable2: IrVariable? defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[LocalVariableDescriptor]

'irBlock' @ [56:17] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[LocalVariableDescriptor]

'statements' @ [56:25] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedPropertyDescriptor]

'add' @ [56:36] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irResultExpression' @ [56:40] ==> val irResultExpression: IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[LocalVariableDescriptor]

'irBlock' @ [57:17] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign.<anonymous>[LocalVariableDescriptor]

'store' @ [61:13] ==> public abstract fun store(irExpression: IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase[SimpleFunctionDescriptorImpl]

'value' @ [61:19] ==> value-parameter value: IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign[ValueParameterDescriptorImpl]

'PropertyLValueBase' @ [74:5] ==> public constructor PropertyLValueBase(scope: Scope, startOffset: Int, endOffset: Int, origin: IrStatementOrigin?, type: KotlinType, callReceiver: CallReceiver, superQualifier: IrClassSymbol?) defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase[ClassConstructorDescriptorImpl]

'scope' @ [74:24] ==> value-parameter scope: Scope defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue.<init>[ValueParameterDescriptorImpl]

'startOffset' @ [74:31] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [74:44] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue.<init>[ValueParameterDescriptorImpl]

'origin' @ [74:55] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue.<init>[ValueParameterDescriptorImpl]

'field' @ [74:63] ==> value-parameter field: IrFieldSymbol defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [74:69] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFieldSymbol[DeserializedPropertyDescriptor]

'type' @ [74:80] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'callReceiver' @ [74:86] ==> value-parameter callReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue.<init>[ValueParameterDescriptorImpl]

'superQualifier' @ [74:100] ==> value-parameter superQualifier: IrClassSymbol? defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue.<init>[ValueParameterDescriptorImpl]

'callReceiver' @ [76:13] ==> public final val callReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'call' @ [76:26] ==> public abstract fun call(withDispatchAndExtensionReceivers: (IntermediateValue?, IntermediateValue?) -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.CallReceiver[SimpleFunctionDescriptorImpl]

'assert' @ [77:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'extensionReceiverValue' @ [77:24] ==> value-parameter extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue.load.<anonymous>[ValueParameterDescriptorImpl]

'field' @ [77:101] ==> public final val field: IrFieldSymbol defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'descriptor' @ [77:107] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFieldSymbol[DeserializedPropertyDescriptor]

'IrGetFieldImpl' @ [78:17] ==> public constructor IrGetFieldImpl(startOffset: Int, endOffset: Int, symbol: IrFieldSymbol, receiver: IrExpression?, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetFieldImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [79:25] ==> public final val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'endOffset' @ [79:38] ==> public final val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'field' @ [80:25] ==> public final val field: IrFieldSymbol defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'dispatchReceiverValue' @ [81:25] ==> value-parameter dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue.load.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [81:48] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'origin' @ [82:25] ==> public final val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'superQualifier' @ [83:25] ==> public final val superQualifier: IrClassSymbol? defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'callReceiver' @ [88:13] ==> public final val callReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'call' @ [88:26] ==> public abstract fun call(withDispatchAndExtensionReceivers: (IntermediateValue?, IntermediateValue?) -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.CallReceiver[SimpleFunctionDescriptorImpl]

'assert' @ [89:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'extensionReceiverValue' @ [89:24] ==> value-parameter extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue.store.<anonymous>[ValueParameterDescriptorImpl]

'field' @ [89:101] ==> public final val field: IrFieldSymbol defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'descriptor' @ [89:107] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFieldSymbol[DeserializedPropertyDescriptor]

'IrSetFieldImpl' @ [90:17] ==> public constructor IrSetFieldImpl(startOffset: Int, endOffset: Int, symbol: IrFieldSymbol, receiver: IrExpression?, value: IrExpression, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSetFieldImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [91:25] ==> public final val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'endOffset' @ [91:38] ==> public final val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'field' @ [92:25] ==> public final val field: IrFieldSymbol defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'dispatchReceiverValue' @ [93:25] ==> value-parameter dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue.store.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [93:48] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'irExpression' @ [94:25] ==> value-parameter irExpression: IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue.store[ValueParameterDescriptorImpl]

'origin' @ [95:25] ==> public final val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'superQualifier' @ [96:25] ==> public final val superQualifier: IrClassSymbol? defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'FieldPropertyLValue' @ [101:13] ==> public constructor FieldPropertyLValue(scope: Scope, startOffset: Int, endOffset: Int, origin: IrStatementOrigin?, field: IrFieldSymbol, callReceiver: CallReceiver, superQualifier: IrClassSymbol?) defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[ClassConstructorDescriptorImpl]

'scope' @ [102:21] ==> public final val scope: Scope defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'startOffset' @ [102:28] ==> public final val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'endOffset' @ [102:41] ==> public final val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'origin' @ [102:52] ==> public final val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'field' @ [103:21] ==> public final val field: IrFieldSymbol defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'SimpleCallReceiver' @ [104:21] ==> public constructor SimpleCallReceiver(dispatchReceiverValue: IntermediateValue?, extensionReceiverValue: IntermediateValue?) defined in org.jetbrains.kotlin.psi2ir.intermediate.SimpleCallReceiver[ClassConstructorDescriptorImpl]

'dispatchReceiver' @ [104:40] ==> value-parameter dispatchReceiver: VariableLValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue.withReceiver[ValueParameterDescriptorImpl]

'extensionReceiver' @ [104:58] ==> value-parameter extensionReceiver: VariableLValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue.withReceiver[ValueParameterDescriptorImpl]

'superQualifier' @ [105:21] ==> public final val superQualifier: IrClassSymbol? defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[PropertyDescriptorImpl]

'PropertyLValueBase' @ [122:5] ==> public constructor PropertyLValueBase(scope: Scope, startOffset: Int, endOffset: Int, origin: IrStatementOrigin?, type: KotlinType, callReceiver: CallReceiver, superQualifier: IrClassSymbol?) defined in org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase[ClassConstructorDescriptorImpl]

'scope' @ [122:24] ==> value-parameter scope: Scope defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.<init>[ValueParameterDescriptorImpl]

'startOffset' @ [122:31] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [122:44] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.<init>[ValueParameterDescriptorImpl]

'origin' @ [122:55] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.<init>[ValueParameterDescriptorImpl]

'type' @ [122:63] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.<init>[ValueParameterDescriptorImpl]

'callReceiver' @ [122:69] ==> value-parameter callReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.<init>[ValueParameterDescriptorImpl]

'superQualifier' @ [122:83] ==> value-parameter superQualifier: IrClassSymbol? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.<init>[ValueParameterDescriptorImpl]

'callReceiver' @ [124:13] ==> public final val callReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'call' @ [124:26] ==> public abstract fun call(withDispatchAndExtensionReceivers: (IntermediateValue?, IntermediateValue?) -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.CallReceiver[SimpleFunctionDescriptorImpl]

'IrGetterCallImpl' @ [125:17] ==> public constructor IrGetterCallImpl(startOffset: Int, endOffset: Int, symbol: IrFunctionSymbol, descriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, dispatchReceiver: IrExpression?, extensionReceiver: IrExpression?, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetterCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [126:29] ==> public final val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'endOffset' @ [126:42] ==> public final val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'getter' @ [127:29] ==> public final val getter: IrFunctionSymbol? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'getterDescriptor' @ [127:39] ==> public final val getterDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'typeArguments' @ [128:29] ==> public final val typeArguments: Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'dispatchReceiverValue' @ [129:29] ==> value-parameter dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.load.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [129:52] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'extensionReceiverValue' @ [130:29] ==> value-parameter extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.load.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [130:53] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'origin' @ [131:29] ==> public final val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'superQualifier' @ [132:29] ==> public final val superQualifier: IrClassSymbol? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'callReceiver' @ [137:13] ==> public final val callReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'call' @ [137:26] ==> public abstract fun call(withDispatchAndExtensionReceivers: (IntermediateValue?, IntermediateValue?) -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.CallReceiver[SimpleFunctionDescriptorImpl]

'IrSetterCallImpl' @ [138:17] ==> public constructor IrSetterCallImpl(startOffset: Int, endOffset: Int, symbol: IrFunctionSymbol, descriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, dispatchReceiver: IrExpression?, extensionReceiver: IrExpression?, argument: IrExpression, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSetterCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [139:25] ==> public final val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'endOffset' @ [139:38] ==> public final val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'setter' @ [140:25] ==> public final val setter: IrFunctionSymbol? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'setterDescriptor' @ [140:35] ==> public final val setterDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'typeArguments' @ [141:25] ==> public final val typeArguments: Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'dispatchReceiverValue' @ [142:25] ==> value-parameter dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.store.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [142:48] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'extensionReceiverValue' @ [143:25] ==> value-parameter extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.store.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [143:49] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'irExpression' @ [144:25] ==> value-parameter irExpression: IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.store[ValueParameterDescriptorImpl]

'origin' @ [145:25] ==> public final val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'superQualifier' @ [146:25] ==> public final val superQualifier: IrClassSymbol? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'AccessorPropertyLValue' @ [151:13] ==> public constructor AccessorPropertyLValue(scope: Scope, startOffset: Int, endOffset: Int, origin: IrStatementOrigin?, type: KotlinType, getter: IrFunctionSymbol?, getterDescriptor: FunctionDescriptor?, setter: IrFunctionSymbol?, setterDescriptor: FunctionDescriptor?, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, callReceiver: CallReceiver, superQualifier: IrClassSymbol?) defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[ClassConstructorDescriptorImpl]

'scope' @ [152:21] ==> public final val scope: Scope defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'startOffset' @ [152:28] ==> public final val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'endOffset' @ [152:41] ==> public final val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'origin' @ [152:52] ==> public final val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'type' @ [153:21] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'getter' @ [153:27] ==> public final val getter: IrFunctionSymbol? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'getterDescriptor' @ [153:35] ==> public final val getterDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'setter' @ [153:53] ==> public final val setter: IrFunctionSymbol? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'setterDescriptor' @ [153:61] ==> public final val setterDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'typeArguments' @ [154:21] ==> public final val typeArguments: Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

'SimpleCallReceiver' @ [155:21] ==> public constructor SimpleCallReceiver(dispatchReceiverValue: IntermediateValue?, extensionReceiverValue: IntermediateValue?) defined in org.jetbrains.kotlin.psi2ir.intermediate.SimpleCallReceiver[ClassConstructorDescriptorImpl]

'dispatchReceiver' @ [155:40] ==> value-parameter dispatchReceiver: VariableLValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.withReceiver[ValueParameterDescriptorImpl]

'extensionReceiver' @ [155:58] ==> value-parameter extensionReceiver: VariableLValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.withReceiver[ValueParameterDescriptorImpl]

'superQualifier' @ [156:21] ==> public final val superQualifier: IrClassSymbol? defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[PropertyDescriptorImpl]

