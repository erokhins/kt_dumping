'mutableSetOf' @ [34:15] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<IrElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrElement

'ensureAllNodesAreDifferent' @ [37:13] ==> public final val ensureAllNodesAreDifferent: Boolean defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'set' @ [38:17] ==> public final val set: MutableSet<IrElement> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'contains' @ [38:21] ==> public abstract fun contains(element: IrElement): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'element' @ [38:30] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitElement[ValueParameterDescriptorImpl]

'invoke' @ [39:17] ==> public abstract operator fun invoke(element: @ParameterName IrElement, message: @ParameterName String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'element' @ [39:29] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitElement[ValueParameterDescriptorImpl]

'set' @ [40:13] ==> public final val set: MutableSet<IrElement> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'add' @ [40:17] ==> public abstract fun add(element: IrElement): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'element' @ [40:21] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitElement[ValueParameterDescriptorImpl]

'expectedType' @ [46:13] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.ensureTypeIs[ValueParameterDescriptorImpl]

'type' @ [46:29] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'invoke' @ [47:13] ==> public abstract operator fun invoke(element: @ParameterName IrElement, message: @ParameterName String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'this' @ [47:25] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.ensureTypeIs[ReceiverParameterDescriptorImpl]

'expectedType' @ [47:70] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.ensureTypeIs[ValueParameterDescriptorImpl]

'type' @ [47:90] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'!' @ [52:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'this' @ [52:14] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.ensureBound[ReceiverParameterDescriptorImpl]

'isBound' @ [52:19] ==> public abstract val isBound: Boolean defined in org.jetbrains.kotlin.ir.symbols.IrSymbol[DeserializedPropertyDescriptor]

'invoke' @ [53:13] ==> public abstract operator fun invoke(element: @ParameterName IrElement, message: @ParameterName String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'expression' @ [53:25] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.ensureBound[ValueParameterDescriptorImpl]

'this' @ [53:55] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.ensureBound[ReceiverParameterDescriptorImpl]

'super' @ [58:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitConst' @ [58:15] ==> public open fun <T> visitConst(expression: IrConst<T>): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'expression' @ [58:26] ==> value-parameter expression: IrConst<T> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitConst[ValueParameterDescriptorImpl]

'when (expression.kind) {
            IrConstKind.Null -> builtIns.nullableNothingType
            IrConstKind.Boolean -> builtIns.booleanType
            IrConstKind.Char -> builtIns.charType
            IrConstKind.Byte -> builtIns.byteType
            IrConstKind.Short -> builtIns.shortType
            IrConstKind.Int -> builtIns.intType
            IrConstKind.Long -> builtIns.longType
            IrConstKind.String -> builtIns.stringType
            IrConstKind.Float -> builtIns.floatType
            IrConstKind.Double -> builtIns.doubleType
        }' @ [60:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SimpleType, entry1: SimpleType, entry2: SimpleType, entry3: SimpleType, entry4: SimpleType, entry5: SimpleType, entry6: SimpleType, entry7: SimpleType, entry8: SimpleType, entry9: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SimpleType

'expression' @ [60:33] ==> value-parameter expression: IrConst<T> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitConst[ValueParameterDescriptorImpl]

'kind' @ [60:44] ==> public abstract val kind: IrConstKind<T> defined in org.jetbrains.kotlin.ir.expressions.IrConst[DeserializedPropertyDescriptor]

'Null' @ [61:25] ==> public object Null : IrConstKind<Nothing?> defined in org.jetbrains.kotlin.ir.expressions.IrConstKind[FakeCallableDescriptorForObject]

'builtIns' @ [61:33] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'nullableNothingType' @ [61:42] ==> public final val KotlinBuiltIns.nullableNothingType: SimpleType[MyPropertyDescriptor]

'Boolean' @ [62:25] ==> public object Boolean : IrConstKind<Boolean> defined in org.jetbrains.kotlin.ir.expressions.IrConstKind[FakeCallableDescriptorForObject]

'builtIns' @ [62:36] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'booleanType' @ [62:45] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'Char' @ [63:25] ==> public object Char : IrConstKind<Char> defined in org.jetbrains.kotlin.ir.expressions.IrConstKind[FakeCallableDescriptorForObject]

'builtIns' @ [63:33] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'charType' @ [63:42] ==> public final val KotlinBuiltIns.charType: SimpleType[MyPropertyDescriptor]

'Byte' @ [64:25] ==> public object Byte : IrConstKind<Byte> defined in org.jetbrains.kotlin.ir.expressions.IrConstKind[FakeCallableDescriptorForObject]

'builtIns' @ [64:33] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'byteType' @ [64:42] ==> public final val KotlinBuiltIns.byteType: SimpleType[MyPropertyDescriptor]

'Short' @ [65:25] ==> public object Short : IrConstKind<Short> defined in org.jetbrains.kotlin.ir.expressions.IrConstKind[FakeCallableDescriptorForObject]

'builtIns' @ [65:34] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'shortType' @ [65:43] ==> public final val KotlinBuiltIns.shortType: SimpleType[MyPropertyDescriptor]

'Int' @ [66:25] ==> public object Int : IrConstKind<Int> defined in org.jetbrains.kotlin.ir.expressions.IrConstKind[FakeCallableDescriptorForObject]

'builtIns' @ [66:32] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'intType' @ [66:41] ==> public final val KotlinBuiltIns.intType: SimpleType[MyPropertyDescriptor]

'Long' @ [67:25] ==> public object Long : IrConstKind<Long> defined in org.jetbrains.kotlin.ir.expressions.IrConstKind[FakeCallableDescriptorForObject]

'builtIns' @ [67:33] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'longType' @ [67:42] ==> public final val KotlinBuiltIns.longType: SimpleType[MyPropertyDescriptor]

'String' @ [68:25] ==> public object String : IrConstKind<String> defined in org.jetbrains.kotlin.ir.expressions.IrConstKind[FakeCallableDescriptorForObject]

'builtIns' @ [68:35] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'stringType' @ [68:44] ==> public final val KotlinBuiltIns.stringType: SimpleType[MyPropertyDescriptor]

'Float' @ [69:25] ==> public object Float : IrConstKind<Float> defined in org.jetbrains.kotlin.ir.expressions.IrConstKind[FakeCallableDescriptorForObject]

'builtIns' @ [69:34] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'floatType' @ [69:43] ==> public final val KotlinBuiltIns.floatType: SimpleType[MyPropertyDescriptor]

'Double' @ [70:25] ==> public object Double : IrConstKind<Double> defined in org.jetbrains.kotlin.ir.expressions.IrConstKind[FakeCallableDescriptorForObject]

'builtIns' @ [70:35] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'doubleType' @ [70:44] ==> public final val KotlinBuiltIns.doubleType: SimpleType[MyPropertyDescriptor]

'expression' @ [73:9] ==> value-parameter expression: IrConst<T> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitConst[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [73:20] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'naturalType' @ [73:33] ==> val naturalType: SimpleType defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitConst[LocalVariableDescriptor]

'super' @ [77:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitStringConcatenation' @ [77:15] ==> public open fun visitStringConcatenation(expression: IrStringConcatenation): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [77:40] ==> value-parameter expression: IrStringConcatenation defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitStringConcatenation[ValueParameterDescriptorImpl]

'expression' @ [79:9] ==> value-parameter expression: IrStringConcatenation defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitStringConcatenation[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [79:20] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'builtIns' @ [79:33] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'stringType' @ [79:42] ==> public final val KotlinBuiltIns.stringType: SimpleType[MyPropertyDescriptor]

'super' @ [83:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitGetObjectValue' @ [83:15] ==> public open fun visitGetObjectValue(expression: IrGetObjectValue): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [83:35] ==> value-parameter expression: IrGetObjectValue defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitGetObjectValue[ValueParameterDescriptorImpl]

'expression' @ [85:9] ==> value-parameter expression: IrGetObjectValue defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitGetObjectValue[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [85:20] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [85:33] ==> value-parameter expression: IrGetObjectValue defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitGetObjectValue[ValueParameterDescriptorImpl]

'descriptor' @ [85:44] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrGetObjectValue[DeserializedPropertyDescriptor]

'defaultType' @ [85:55] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'super' @ [91:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitGetValue' @ [91:15] ==> public open fun visitGetValue(expression: IrGetValue): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [91:29] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitGetValue[ValueParameterDescriptorImpl]

'expression' @ [93:9] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitGetValue[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [93:20] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [93:33] ==> value-parameter expression: IrGetValue defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitGetValue[ValueParameterDescriptorImpl]

'descriptor' @ [93:44] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrGetValue[DeserializedPropertyDescriptor]

'type' @ [93:55] ==> public final val ValueDescriptor.type: KotlinType[MyPropertyDescriptor]

'super' @ [97:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitSetVariable' @ [97:15] ==> public open fun visitSetVariable(expression: IrSetVariable): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [97:32] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitSetVariable[ValueParameterDescriptorImpl]

'expression' @ [99:9] ==> value-parameter expression: IrSetVariable defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitSetVariable[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [99:20] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'builtIns' @ [99:33] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'unitType' @ [99:42] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'super' @ [103:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitGetField' @ [103:15] ==> public open fun visitGetField(expression: IrGetField): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [103:29] ==> value-parameter expression: IrGetField defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitGetField[ValueParameterDescriptorImpl]

'expression' @ [105:9] ==> value-parameter expression: IrGetField defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitGetField[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [105:20] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [105:33] ==> value-parameter expression: IrGetField defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitGetField[ValueParameterDescriptorImpl]

'descriptor' @ [105:44] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrGetField[DeserializedPropertyDescriptor]

'type' @ [105:55] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'super' @ [109:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitSetField' @ [109:15] ==> public open fun visitSetField(expression: IrSetField): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [109:29] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitSetField[ValueParameterDescriptorImpl]

'expression' @ [111:9] ==> value-parameter expression: IrSetField defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitSetField[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [111:20] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'builtIns' @ [111:33] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'unitType' @ [111:42] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'super' @ [115:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitCall' @ [115:15] ==> public open fun visitCall(expression: IrCall): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [115:25] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitCall[ValueParameterDescriptorImpl]

'expression' @ [117:26] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitCall[ValueParameterDescriptorImpl]

'descriptor' @ [117:37] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'returnType' @ [117:48] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'if (returnType == null) {
            reportError(expression, "${expression.descriptor} return type is null")
        } else {
            expression.ensureTypeIs(returnType)
        }' @ [118:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'returnType' @ [118:13] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitCall[LocalVariableDescriptor]

'invoke' @ [119:13] ==> public abstract operator fun invoke(element: @ParameterName IrElement, message: @ParameterName String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'expression' @ [119:25] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitCall[ValueParameterDescriptorImpl]

'expression' @ [119:40] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitCall[ValueParameterDescriptorImpl]

'descriptor' @ [119:51] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [121:13] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitCall[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [121:24] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'returnType' @ [121:37] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitCall[LocalVariableDescriptor]

'expression' @ [124:9] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitCall[ValueParameterDescriptorImpl]

'superQualifierSymbol' @ [124:20] ==> public abstract val superQualifierSymbol: IrClassSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'ensureBound' @ [124:42] ==> private final fun IrSymbol.ensureBound(expression: IrExpression): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [124:54] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitCall[ValueParameterDescriptorImpl]

'super' @ [128:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitDelegatingConstructorCall' @ [128:15] ==> public open fun visitDelegatingConstructorCall(expression: IrDelegatingConstructorCall): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [128:46] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'expression' @ [130:9] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [130:20] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'builtIns' @ [130:33] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'unitType' @ [130:42] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'super' @ [134:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitEnumConstructorCall' @ [134:15] ==> public open fun visitEnumConstructorCall(expression: IrEnumConstructorCall): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [134:40] ==> value-parameter expression: IrEnumConstructorCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitEnumConstructorCall[ValueParameterDescriptorImpl]

'expression' @ [136:9] ==> value-parameter expression: IrEnumConstructorCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitEnumConstructorCall[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [136:20] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'builtIns' @ [136:33] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'unitType' @ [136:42] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'super' @ [140:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitInstanceInitializerCall' @ [140:15] ==> public open fun visitInstanceInitializerCall(expression: IrInstanceInitializerCall): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [140:44] ==> value-parameter expression: IrInstanceInitializerCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitInstanceInitializerCall[ValueParameterDescriptorImpl]

'expression' @ [142:9] ==> value-parameter expression: IrInstanceInitializerCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitInstanceInitializerCall[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [142:20] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'builtIns' @ [142:33] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'unitType' @ [142:42] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'expression' @ [143:9] ==> value-parameter expression: IrInstanceInitializerCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitInstanceInitializerCall[ValueParameterDescriptorImpl]

'classSymbol' @ [143:20] ==> public abstract val classSymbol: IrClassSymbol defined in org.jetbrains.kotlin.ir.expressions.IrInstanceInitializerCall[DeserializedPropertyDescriptor]

'ensureBound' @ [143:32] ==> private final fun IrSymbol.ensureBound(expression: IrExpression): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [143:44] ==> value-parameter expression: IrInstanceInitializerCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitInstanceInitializerCall[ValueParameterDescriptorImpl]

'super' @ [147:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitTypeOperator' @ [147:15] ==> public open fun visitTypeOperator(expression: IrTypeOperatorCall): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [147:33] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitTypeOperator[ValueParameterDescriptorImpl]

'expression' @ [149:24] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitTypeOperator[ValueParameterDescriptorImpl]

'operator' @ [149:35] ==> public abstract val operator: IrTypeOperator defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'expression' @ [150:27] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitTypeOperator[ValueParameterDescriptorImpl]

'typeOperand' @ [150:38] ==> public abstract val typeOperand: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall[DeserializedPropertyDescriptor]

'when (operator) {
            IrTypeOperator.CAST,
            IrTypeOperator.IMPLICIT_CAST,
            IrTypeOperator.IMPLICIT_NOTNULL,
            IrTypeOperator.IMPLICIT_COERCION_TO_UNIT,
            IrTypeOperator.IMPLICIT_INTEGER_COERCION -> typeOperand

            IrTypeOperator.SAFE_CAST -> typeOperand.makeNullable()

            IrTypeOperator.INSTANCEOF, IrTypeOperator.NOT_INSTANCEOF -> builtIns.booleanType
        }' @ [152:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType, entry1: KotlinType, entry2: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType

'operator' @ [152:33] ==> val operator: IrTypeOperator defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitTypeOperator[LocalVariableDescriptor]

'CAST' @ [153:28] ==> enum entry CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'IMPLICIT_CAST' @ [154:28] ==> enum entry IMPLICIT_CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'IMPLICIT_NOTNULL' @ [155:28] ==> enum entry IMPLICIT_NOTNULL defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'IMPLICIT_COERCION_TO_UNIT' @ [156:28] ==> enum entry IMPLICIT_COERCION_TO_UNIT defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'IMPLICIT_INTEGER_COERCION' @ [157:28] ==> enum entry IMPLICIT_INTEGER_COERCION defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'typeOperand' @ [157:57] ==> val typeOperand: KotlinType defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitTypeOperator[LocalVariableDescriptor]

'SAFE_CAST' @ [159:28] ==> enum entry SAFE_CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'typeOperand' @ [159:41] ==> val typeOperand: KotlinType defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitTypeOperator[LocalVariableDescriptor]

'makeNullable' @ [159:53] ==> public fun KotlinType.makeNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'INSTANCEOF' @ [161:28] ==> enum entry INSTANCEOF defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'NOT_INSTANCEOF' @ [161:55] ==> enum entry NOT_INSTANCEOF defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'builtIns' @ [161:73] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'booleanType' @ [161:82] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'operator' @ [164:13] ==> val operator: IrTypeOperator defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitTypeOperator[LocalVariableDescriptor]

'IMPLICIT_COERCION_TO_UNIT' @ [164:40] ==> enum entry IMPLICIT_COERCION_TO_UNIT defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'typeOperand' @ [164:69] ==> val typeOperand: KotlinType defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitTypeOperator[LocalVariableDescriptor]

'builtIns' @ [164:84] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'unitType' @ [164:93] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'invoke' @ [165:13] ==> public abstract operator fun invoke(element: @ParameterName IrElement, message: @ParameterName String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'expression' @ [165:25] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitTypeOperator[ValueParameterDescriptorImpl]

'typeOperand' @ [165:54] ==> val typeOperand: KotlinType defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitTypeOperator[LocalVariableDescriptor]

'expression' @ [170:9] ==> value-parameter expression: IrTypeOperatorCall defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitTypeOperator[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [170:20] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'naturalType' @ [170:33] ==> val naturalType: KotlinType defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitTypeOperator[LocalVariableDescriptor]

'super' @ [174:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitLoop' @ [174:15] ==> public open fun visitLoop(loop: IrLoop): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'loop' @ [174:25] ==> value-parameter loop: IrLoop defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitLoop[ValueParameterDescriptorImpl]

'loop' @ [176:9] ==> value-parameter loop: IrLoop defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitLoop[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [176:14] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'builtIns' @ [176:27] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'unitType' @ [176:36] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'super' @ [180:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitBreakContinue' @ [180:15] ==> public open fun visitBreakContinue(jump: IrBreakContinue): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'jump' @ [180:34] ==> value-parameter jump: IrBreakContinue defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitBreakContinue[ValueParameterDescriptorImpl]

'jump' @ [182:9] ==> value-parameter jump: IrBreakContinue defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitBreakContinue[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [182:14] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'builtIns' @ [182:27] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'nothingType' @ [182:36] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'super' @ [186:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitReturn' @ [186:15] ==> public open fun visitReturn(expression: IrReturn): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [186:27] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitReturn[ValueParameterDescriptorImpl]

'expression' @ [188:9] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitReturn[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [188:20] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'builtIns' @ [188:33] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'nothingType' @ [188:42] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'expression' @ [189:9] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitReturn[ValueParameterDescriptorImpl]

'returnTargetSymbol' @ [189:20] ==> public abstract val returnTargetSymbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.expressions.IrReturn[DeserializedPropertyDescriptor]

'ensureBound' @ [189:39] ==> private final fun IrSymbol.ensureBound(expression: IrExpression): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [189:51] ==> value-parameter expression: IrReturn defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitReturn[ValueParameterDescriptorImpl]

'super' @ [193:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitThrow' @ [193:15] ==> public open fun visitThrow(expression: IrThrow): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [193:26] ==> value-parameter expression: IrThrow defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitThrow[ValueParameterDescriptorImpl]

'expression' @ [195:9] ==> value-parameter expression: IrThrow defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitThrow[ValueParameterDescriptorImpl]

'ensureTypeIs' @ [195:20] ==> private final fun IrExpression.ensureTypeIs(expectedType: KotlinType): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'builtIns' @ [195:33] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[PropertyDescriptorImpl]

'nothingType' @ [195:42] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'super' @ [199:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitClass' @ [199:15] ==> public open fun visitClass(declaration: IrClass): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [199:26] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitClass[ValueParameterDescriptorImpl]

'declaration' @ [201:13] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitClass[ValueParameterDescriptorImpl]

'descriptor' @ [201:25] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'kind' @ [201:36] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ANNOTATION_CLASS' @ [201:54] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'declaration' @ [205:34] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitClass[ValueParameterDescriptorImpl]

'descriptor' @ [205:46] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'unsubstitutedMemberScope' @ [205:57] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedDescriptors' @ [206:22] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'filterIsInstance' @ [206:50] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> CallableMemberDescriptor

'declaration' @ [208:38] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitClass[ValueParameterDescriptorImpl]

'declarations' @ [208:50] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'map' @ [208:63] ==> public inline fun <T, R> Iterable<IrDeclaration>.map(transform: (IrDeclaration) -> DeclarationDescriptor): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration
    <R> -> DeclarationDescriptor

'it' @ [208:69] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitClass.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [208:72] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[DeserializedPropertyDescriptor]

'allDescriptors' @ [210:38] ==> val allDescriptors: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitClass[LocalVariableDescriptor]

'presentDescriptors' @ [210:55] ==> val presentDescriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitClass[LocalVariableDescriptor]

'missingDescriptors' @ [212:17] ==> val missingDescriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitClass[LocalVariableDescriptor]

'isNotEmpty' @ [212:36] ==> @InlineOnly public inline fun <T> Collection<DeclarationDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'invoke' @ [213:17] ==> public abstract operator fun invoke(element: @ParameterName IrElement, message: @ParameterName String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'declaration' @ [213:29] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitClass[ValueParameterDescriptorImpl]

'+' @ [213:42] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'missingDescriptors' @ [214:25] ==> val missingDescriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitClass[LocalVariableDescriptor]

'joinToString' @ [214:44] ==> public fun <T> Iterable<DeclarationDescriptor>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((DeclarationDescriptor) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'super' @ [220:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitDeclarationReference' @ [220:15] ==> public open fun visitDeclarationReference(expression: IrDeclarationReference): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [220:41] ==> value-parameter expression: IrDeclarationReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitDeclarationReference[ValueParameterDescriptorImpl]

'expression' @ [222:9] ==> value-parameter expression: IrDeclarationReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitDeclarationReference[ValueParameterDescriptorImpl]

'symbol' @ [222:20] ==> public abstract val symbol: IrSymbol defined in org.jetbrains.kotlin.ir.expressions.IrDeclarationReference[DeserializedPropertyDescriptor]

'ensureBound' @ [222:27] ==> private final fun IrSymbol.ensureBound(expression: IrExpression): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [222:39] ==> value-parameter expression: IrDeclarationReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitDeclarationReference[ValueParameterDescriptorImpl]

'super' @ [226:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitFunctionAccess' @ [226:15] ==> public open fun visitFunctionAccess(expression: IrFunctionAccessExpression): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [226:35] ==> value-parameter expression: IrFunctionAccessExpression defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitFunctionAccess[ValueParameterDescriptorImpl]

'expression' @ [228:9] ==> value-parameter expression: IrFunctionAccessExpression defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitFunctionAccess[ValueParameterDescriptorImpl]

'symbol' @ [228:20] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.expressions.IrFunctionAccessExpression[DeserializedPropertyDescriptor]

'ensureBound' @ [228:27] ==> private final fun IrSymbol.ensureBound(expression: IrExpression): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [228:39] ==> value-parameter expression: IrFunctionAccessExpression defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitFunctionAccess[ValueParameterDescriptorImpl]

'super' @ [232:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitFunctionReference' @ [232:15] ==> public open fun visitFunctionReference(expression: IrFunctionReference): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [232:38] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitFunctionReference[ValueParameterDescriptorImpl]

'expression' @ [234:9] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitFunctionReference[ValueParameterDescriptorImpl]

'symbol' @ [234:20] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.expressions.IrFunctionReference[DeserializedPropertyDescriptor]

'ensureBound' @ [234:27] ==> private final fun IrSymbol.ensureBound(expression: IrExpression): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [234:39] ==> value-parameter expression: IrFunctionReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitFunctionReference[ValueParameterDescriptorImpl]

'super' @ [238:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitPropertyReference' @ [238:15] ==> public open fun visitPropertyReference(expression: IrPropertyReference): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [238:38] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitPropertyReference[ValueParameterDescriptorImpl]

'expression' @ [240:9] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitPropertyReference[ValueParameterDescriptorImpl]

'field' @ [240:20] ==> public abstract val field: IrFieldSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[DeserializedPropertyDescriptor]

'ensureBound' @ [240:27] ==> private final fun IrSymbol.ensureBound(expression: IrExpression): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [240:39] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitPropertyReference[ValueParameterDescriptorImpl]

'expression' @ [241:9] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitPropertyReference[ValueParameterDescriptorImpl]

'getter' @ [241:20] ==> public abstract val getter: IrFunctionSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[DeserializedPropertyDescriptor]

'ensureBound' @ [241:28] ==> private final fun IrSymbol.ensureBound(expression: IrExpression): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [241:40] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitPropertyReference[ValueParameterDescriptorImpl]

'expression' @ [242:9] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitPropertyReference[ValueParameterDescriptorImpl]

'setter' @ [242:20] ==> public abstract val setter: IrFunctionSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrPropertyReference[DeserializedPropertyDescriptor]

'ensureBound' @ [242:28] ==> private final fun IrSymbol.ensureBound(expression: IrExpression): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [242:40] ==> value-parameter expression: IrPropertyReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitPropertyReference[ValueParameterDescriptorImpl]

'super' @ [246:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[LazyClassReceiverParameterDescriptor]

'visitLocalDelegatedPropertyReference' @ [246:15] ==> public open fun visitLocalDelegatedPropertyReference(expression: IrLocalDelegatedPropertyReference): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'expression' @ [246:52] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'expression' @ [248:9] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'delegate' @ [248:20] ==> public abstract val delegate: IrVariableSymbol defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[DeserializedPropertyDescriptor]

'ensureBound' @ [248:29] ==> private final fun IrSymbol.ensureBound(expression: IrExpression): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [248:41] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'expression' @ [249:9] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'getter' @ [249:20] ==> public abstract val getter: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[DeserializedPropertyDescriptor]

'ensureBound' @ [249:27] ==> private final fun IrSymbol.ensureBound(expression: IrExpression): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [249:39] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'expression' @ [250:9] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'setter' @ [250:20] ==> public abstract val setter: IrFunctionSymbol? defined in org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference[DeserializedPropertyDescriptor]

'ensureBound' @ [250:28] ==> private final fun IrSymbol.ensureBound(expression: IrExpression): Unit defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [250:40] ==> value-parameter expression: IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

