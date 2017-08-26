'irDeclarationContainer' @ [49:9] ==> value-parameter irDeclarationContainer: IrDeclarationContainer defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower[ValueParameterDescriptorImpl]

'declarations' @ [49:32] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationContainer[DeserializedPropertyDescriptor]

'forEach' @ [49:45] ==> @HidesMembers public inline fun <T> Iterable<IrDeclaration>.forEach(action: (IrDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'when (it) {
                is IrField    -> lower(it.symbol, it.initializer)
                is IrFunction -> lower(it.symbol, it.body)
                is IrProperty -> {
                    it.backingField?.let { field ->
                        lower(field.symbol, field)
                    }
                    it.getter?.let { getter ->
                        lower(getter.symbol, getter)
                    }
                    it.setter?.let { setter ->
                        lower(setter.symbol, setter)
                    }
                }
            }' @ [50:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?, entry2: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'it' @ [50:19] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'lower' @ [51:34] ==> private final fun lower(owner: IrSymbol, element: IrElement?): Unit defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'it' @ [51:40] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [51:43] ==> public abstract val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'it' @ [51:51] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'initializer' @ [51:54] ==> public abstract var initializer: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'lower' @ [52:34] ==> private final fun lower(owner: IrSymbol, element: IrElement?): Unit defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'it' @ [52:40] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [52:43] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'it' @ [52:51] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [52:54] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'it' @ [54:21] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'backingField' @ [54:24] ==> public abstract var backingField: IrField? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'let' @ [54:38] ==> @InlineOnly public inline fun <T, R> IrField.let(block: (IrField) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrField
    <R> -> Unit

'lower' @ [55:25] ==> private final fun lower(owner: IrSymbol, element: IrElement?): Unit defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'field' @ [55:31] ==> value-parameter field: IrField defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [55:37] ==> public abstract val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'field' @ [55:45] ==> value-parameter field: IrField defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [57:21] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'getter' @ [57:24] ==> public abstract var getter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'let' @ [57:32] ==> @InlineOnly public inline fun <T, R> IrFunction.let(block: (IrFunction) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFunction
    <R> -> Unit

'lower' @ [58:25] ==> private final fun lower(owner: IrSymbol, element: IrElement?): Unit defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'getter' @ [58:31] ==> value-parameter getter: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [58:38] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'getter' @ [58:46] ==> value-parameter getter: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [60:21] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'setter' @ [60:24] ==> public abstract var setter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.IrProperty[DeserializedPropertyDescriptor]

'let' @ [60:32] ==> @InlineOnly public inline fun <T, R> IrFunction.let(block: (IrFunction) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFunction
    <R> -> Unit

'lower' @ [61:25] ==> private final fun lower(owner: IrSymbol, element: IrElement?): Unit defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'setter' @ [61:31] ==> value-parameter setter: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [61:38] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'setter' @ [61:46] ==> value-parameter setter: IrFunction defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [69:9] ==> value-parameter element: IrElement? defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [69:18] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'IrElementTransformerVoid' @ [69:48] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'this' @ [70:31] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>[LazyClassReceiverParameterDescriptor]

'log' @ [73:17] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'expression' @ [73:33] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray[ValueParameterDescriptorImpl]

'descriptor' @ [73:44] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'context' @ [74:17] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'createIrBuilder' @ [74:25] ==> public fun BackendContext.createIrBuilder(symbol: IrSymbol, startOffset: Int = ..., endOffset: Int = ...): DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]

'owner' @ [74:41] ==> value-parameter owner: IrSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower[ValueParameterDescriptorImpl]

'expression' @ [74:48] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray[ValueParameterDescriptorImpl]

'startOffset' @ [74:59] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'expression' @ [74:72] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray[ValueParameterDescriptorImpl]

'endOffset' @ [74:83] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'apply' @ [74:94] ==> @InlineOnly public inline fun <T> DeclarationIrBuilder.apply(block: DeclarationIrBuilder.() -> Unit): DeclarationIrBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationIrBuilder

'expression' @ [75:21] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray[ValueParameterDescriptorImpl]

'descriptor' @ [75:32] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'valueParameters' @ [75:43] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'forEach' @ [75:59] ==> @HidesMembers public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.forEach(action: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'log' @ [76:25] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'it' @ [76:51] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [76:54] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'ir2string' @ [76:81] ==> public fun ir2string(ir: IrElement?): String defined in org.jetbrains.kotlin.backend.common.ir in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'expression' @ [76:91] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray[ValueParameterDescriptorImpl]

'getValueArgument' @ [76:102] ==> public fun IrMemberAccessExpression.getValueArgument(valueParameterDescriptor: ValueParameterDescriptor): IrExpression? defined in org.jetbrains.kotlin.ir.expressions[DeserializedSimpleFunctionDescriptor]

'it' @ [76:119] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [78:21] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray[ValueParameterDescriptorImpl]

'descriptor' @ [78:32] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'valueParameters' @ [78:43] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'filter' @ [78:59] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.filter(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [78:68] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [78:71] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'expression' @ [78:100] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray[ValueParameterDescriptorImpl]

'getValueArgument' @ [78:111] ==> public fun IrMemberAccessExpression.getValueArgument(valueParameterDescriptor: ValueParameterDescriptor): IrExpression? defined in org.jetbrains.kotlin.ir.expressions[DeserializedSimpleFunctionDescriptor]

'it' @ [78:128] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [78:142] ==> @HidesMembers public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.forEach(action: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'expression' @ [79:25] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray[ValueParameterDescriptorImpl]

'putValueArgument' @ [79:36] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedSimpleFunctionDescriptor]

'it' @ [79:53] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [79:56] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'IrVarargImpl' @ [80:33] ==> public constructor IrVarargImpl(startOffset: Int, endOffset: Int, type: KotlinType, varargElementType: KotlinType) defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [80:66] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder[DeserializedPropertyDescriptor]

'endOffset' @ [81:66] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder[DeserializedPropertyDescriptor]

'it' @ [82:66] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [82:69] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'it' @ [83:66] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [83:69] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'expression' @ [87:17] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.replaceEmptyParameterWithEmptyArray[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [87:28] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [87:50] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>[LazyClassReceiverParameterDescriptor]

'replaceEmptyParameterWithEmptyArray' @ [91:17] ==> private final fun replaceEmptyParameterWithEmptyArray(expression: IrMemberAccessExpression): Unit defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [91:53] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'expression' @ [92:24] ==> value-parameter expression: IrCall defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitCall[ValueParameterDescriptorImpl]

'replaceEmptyParameterWithEmptyArray' @ [96:17] ==> private final fun replaceEmptyParameterWithEmptyArray(expression: IrMemberAccessExpression): Unit defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [96:53] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'expression' @ [97:24] ==> value-parameter expression: IrDelegatingConstructorCall defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitDelegatingConstructorCall[ValueParameterDescriptorImpl]

'expression' @ [101:17] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [101:28] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'transformer' @ [101:50] ==> public final val transformer: <no name provided> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>[PropertyDescriptorImpl]

'hasSpreadElement' @ [102:40] ==> private final fun hasSpreadElement(expression: IrVararg?): Boolean defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'expression' @ [102:57] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[ValueParameterDescriptorImpl]

'!' @ [103:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasSpreadElement' @ [103:22] ==> val hasSpreadElement: Boolean defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[LocalVariableDescriptor]

'expression' @ [103:42] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[ValueParameterDescriptorImpl]

'elements' @ [103:53] ==> public abstract val elements: List<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'all' @ [103:62] ==> public inline fun <T> Iterable<IrVarargElement>.all(predicate: (IrVarargElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVarargElement

'it' @ [103:68] ==> value-parameter it: IrVarargElement defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[ValueParameterDescriptorImpl]

'isString' @ [103:103] ==> public open fun isString(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [103:112] ==> value-parameter it: IrVarargElement defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [103:115] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrConst[DeserializedPropertyDescriptor]

'log' @ [104:21] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'expression' @ [105:28] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[ValueParameterDescriptorImpl]

'context' @ [107:33] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'createIrBuilder' @ [107:41] ==> public fun BackendContext.createIrBuilder(symbol: IrSymbol, startOffset: Int = ..., endOffset: Int = ...): DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]

'owner' @ [107:57] ==> value-parameter owner: IrSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower[ValueParameterDescriptorImpl]

'expression' @ [107:64] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[ValueParameterDescriptorImpl]

'startOffset' @ [107:75] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'expression' @ [107:88] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[ValueParameterDescriptorImpl]

'endOffset' @ [107:99] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'irBuilder' @ [108:17] ==> val irBuilder: DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[LocalVariableDescriptor]

'run' @ [108:27] ==> @InlineOnly public inline fun <T, R> DeclarationIrBuilder.run(block: DeclarationIrBuilder.() -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationIrBuilder
    <R> -> Nothing

'expression' @ [109:32] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[ValueParameterDescriptorImpl]

'varargElementType' @ [109:43] ==> public abstract val varargElementType: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'log' @ [110:21] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'expression' @ [110:27] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[ValueParameterDescriptorImpl]

'type' @ [110:51] ==> val type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'!' @ [110:82] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isArray' @ [110:98] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expression' @ [110:106] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[ValueParameterDescriptorImpl]

'type' @ [110:117] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'arrayType' @ [111:39] ==> private final fun arrayType(type: KotlinType): VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'expression' @ [111:49] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[ValueParameterDescriptorImpl]

'type' @ [111:60] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'arrayHandle' @ [112:44] ==> val arrayHandle: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'arraySymbol' @ [112:56] ==> public final val arraySymbol: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.ArrayHandle[PropertyDescriptorImpl]

'constructors' @ [112:68] ==> public val IrClassSymbol.constructors: Sequence<IrConstructorSymbol> defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'find' @ [112:81] ==> @InlineOnly public inline fun <T> Sequence<IrConstructorSymbol>.find(predicate: (IrConstructorSymbol) -> Boolean): IrConstructorSymbol? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrConstructorSymbol

'it' @ [112:88] ==> value-parameter it: IrConstructorSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [112:91] ==> public abstract val owner: IrConstructor defined in org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol[DeserializedPropertyDescriptor]

'valueParameters' @ [112:97] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'size' @ [112:113] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'irBlock' @ [113:33] ==> private fun IrBuilderWithScope.irBlock(type: KotlinType): IrBlock defined in org.jetbrains.kotlin.backend.common.lower in file VarargLowering.kt[SimpleFunctionDescriptorImpl]

'arrayHandle' @ [113:41] ==> val arrayHandle: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'arraySymbol' @ [113:53] ==> public final val arraySymbol: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.ArrayHandle[PropertyDescriptorImpl]

'owner' @ [113:65] ==> public abstract val owner: IrClass defined in org.jetbrains.kotlin.ir.symbols.IrClassSymbol[DeserializedPropertyDescriptor]

'defaultType' @ [113:71] ==> public val IrClass.defaultType: KotlinType defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'if (arrayConstructor.owner.typeParameters.isEmpty()) {
                        irCall(arrayConstructor)
                    } else {
                        irCall(arrayConstructor, listOf(type))
                    }' @ [114:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrCall, elseBranch: IrCall): IrCall[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrCall

'arrayConstructor' @ [114:52] ==> val arrayConstructor: IrConstructorSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'owner' @ [114:69] ==> public abstract val owner: IrConstructor defined in org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol[DeserializedPropertyDescriptor]

'typeParameters' @ [114:75] ==> public abstract val typeParameters: MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'isEmpty' @ [114:90] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irCall' @ [115:25] ==> public fun IrBuilderWithScope.irCall(callee: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'arrayConstructor' @ [115:32] ==> val arrayConstructor: IrConstructorSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'irCall' @ [117:25] ==> public fun IrBuilderWithScope.irCall(symbol: IrFunctionSymbol, typeArguments: List<KotlinType>): IrCallImpl defined in org.jetbrains.kotlin.ir.builders[SimpleFunctionDescriptorImpl]

'arrayConstructor' @ [117:32] ==> val arrayConstructor: IrConstructorSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'listOf' @ [117:50] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'type' @ [117:57] ==> val type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'expression' @ [121:32] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[ValueParameterDescriptorImpl]

'elements' @ [121:43] ==> public abstract val elements: List<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'map' @ [121:52] ==> public inline fun <T, R> Iterable<IrVarargElement>.map(transform: (IrVarargElement) -> Pair<IrVarargElement, IrVariable>): List<Pair<IrVarargElement, IrVariable>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVarargElement
    <R> -> Pair<IrVarargElement, IrVariable>

'scope' @ [122:39] ==> public open val scope: Scope defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder[DeserializedPropertyDescriptor]

'createTemporaryVariable' @ [122:45] ==> public final fun createTemporaryVariable(irExpression: IrExpression, nameHint: String? = ..., isMutable: Boolean = ..., origin: IrDeclarationOrigin = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedSimpleFunctionDescriptor]

'?:' @ [123:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: IrExpression?, right: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> IrExpression

'it' @ [123:34] ==> value-parameter it: IrVarargElement defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [123:59] ==> public abstract var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSpreadElement[DeserializedPropertyDescriptor]

'it' @ [123:73] ==> value-parameter it: IrVarargElement defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'synthesizedString' @ [124:40] ==> public val String.synthesizedString: String defined in org.jetbrains.kotlin.backend.common.descriptors in file utils.kt[PropertyDescriptorImpl]

'block' @ [125:25] ==> val block: IrBlock defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'statements' @ [125:31] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'add' @ [125:42] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'initVar' @ [125:46] ==> val initVar: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [126:25] ==> value-parameter it: IrVarargElement defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'initVar' @ [126:31] ==> val initVar: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toMap' @ [127:23] ==> public fun <K, V> Iterable<Pair<IrVarargElement, IrVariable>>.toMap(): Map<IrVarargElement, IrVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrVarargElement
    <V> -> IrVariable

'arrayConstructorCall' @ [128:21] ==> val arrayConstructorCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'putValueArgument' @ [128:42] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'calculateArraySize' @ [128:62] ==> private final fun calculateArraySize(arrayHandle: VarargInjectionLowering.ArrayHandle, hasSpreadElement: Boolean, scope: Scope, expression: IrVararg, vars: Map<IrVarargElement, IrVariable>): IrExpression? defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'arrayHandle' @ [128:81] ==> val arrayHandle: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'hasSpreadElement' @ [128:94] ==> val hasSpreadElement: Boolean defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[LocalVariableDescriptor]

'scope' @ [128:112] ==> public open val scope: Scope defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder[DeserializedPropertyDescriptor]

'expression' @ [128:119] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[ValueParameterDescriptorImpl]

'vars' @ [128:131] ==> val vars: Map<IrVarargElement, IrVariable> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'scope' @ [129:44] ==> public open val scope: Scope defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder[DeserializedPropertyDescriptor]

'createTemporaryVariable' @ [129:50] ==> public final fun createTemporaryVariable(irExpression: IrExpression, nameHint: String? = ..., isMutable: Boolean = ..., origin: IrDeclarationOrigin = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedSimpleFunctionDescriptor]

'arrayConstructorCall' @ [129:74] ==> val arrayConstructorCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'synthesizedString' @ [129:104] ==> public val String.synthesizedString: String defined in org.jetbrains.kotlin.backend.common.descriptors in file utils.kt[PropertyDescriptorImpl]

'scope' @ [130:44] ==> public open val scope: Scope defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder[DeserializedPropertyDescriptor]

'createTemporaryVariable' @ [130:50] ==> public final fun createTemporaryVariable(irExpression: IrExpression, nameHint: String? = ..., isMutable: Boolean = ..., origin: IrDeclarationOrigin = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedSimpleFunctionDescriptor]

'kIntZero' @ [130:74] ==> private val IrBuilderWithScope.kIntZero: IrConst<Int> defined in org.jetbrains.kotlin.backend.common.lower in file VarargLowering.kt[PropertyDescriptorImpl]

'synthesizedString' @ [130:92] ==> public val String.synthesizedString: String defined in org.jetbrains.kotlin.backend.common.descriptors in file utils.kt[PropertyDescriptorImpl]

'block' @ [131:21] ==> val block: IrBlock defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'statements' @ [131:27] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'add' @ [131:38] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'arrayTmpVariable' @ [131:42] ==> val arrayTmpVariable: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'hasSpreadElement' @ [132:25] ==> val hasSpreadElement: Boolean defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[LocalVariableDescriptor]

'block' @ [133:25] ==> val block: IrBlock defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'statements' @ [133:31] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'add' @ [133:42] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'indexTmpVariable' @ [133:46] ==> val indexTmpVariable: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'expression' @ [135:21] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[ValueParameterDescriptorImpl]

'elements' @ [135:32] ==> public abstract val elements: List<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'forEachIndexed' @ [135:41] ==> public inline fun <T> Iterable<IrVarargElement>.forEachIndexed(action: (index: Int, IrVarargElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVarargElement

'irBuilder' @ [136:25] ==> val irBuilder: DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[LocalVariableDescriptor]

'startOffset' @ [136:35] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder[DeserializedPropertyDescriptor]

'element' @ [136:49] ==> value-parameter element: IrVarargElement defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [136:57] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrVarargElement[DeserializedPropertyDescriptor]

'irBuilder' @ [137:25] ==> val irBuilder: DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[LocalVariableDescriptor]

'endOffset' @ [137:35] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder[DeserializedPropertyDescriptor]

'element' @ [137:49] ==> value-parameter element: IrVarargElement defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'endOffset' @ [137:57] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrVarargElement[DeserializedPropertyDescriptor]

'irBuilder' @ [138:25] ==> val irBuilder: DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[LocalVariableDescriptor]

'apply' @ [138:35] ==> @InlineOnly public inline fun <T> DeclarationIrBuilder.apply(block: DeclarationIrBuilder.() -> Unit): DeclarationIrBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationIrBuilder

'log' @ [139:29] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'i' @ [139:43] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ir2string' @ [139:48] ==> public fun ir2string(ir: IrElement?): String defined in org.jetbrains.kotlin.backend.common.ir in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [139:58] ==> value-parameter element: IrVarargElement defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'vars' @ [140:39] ==> val vars: Map<IrVarargElement, IrVariable> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'element' @ [140:44] ==> value-parameter element: IrVarargElement defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (element !is IrSpreadElement) {
                                val setArrayElementCall = irCall(arrayHandle.setMethodSymbol)
                                setArrayElementCall.dispatchReceiver = irGet(arrayTmpVariable.symbol)
                                setArrayElementCall.putValueArgument(0, if (hasSpreadElement) irGet(indexTmpVariable.symbol) else irConstInt(i))
                                setArrayElementCall.putValueArgument(1, irGet(dst.symbol))
                                block.statements.add(setArrayElementCall)
                                if (hasSpreadElement) {
                                    block.statements.add(incrementVariable(indexTmpVariable.symbol, kIntOne))
                                }
                            } else {
                                val arraySizeVariable = scope.createTemporaryVariable(irArraySize(arrayHandle, irGet(dst.symbol)), "length".synthesizedString)
                                block.statements.add(arraySizeVariable)
                                val copyCall = irCall(arrayHandle.copyRangeToSymbol).apply {
                                    extensionReceiver = irGet(dst.symbol)
                                    putValueArgument(0, irGet(arrayTmpVariable.symbol))  /* destination */
                                    putValueArgument(1, kIntZero)                            /* fromIndex */
                                    putValueArgument(2, irGet(arraySizeVariable.symbol)) /* toIndex */
                                    putValueArgument(3, irGet(indexTmpVariable.symbol))  /* destinationIndex */
                                }
                                block.statements.add(copyCall)
                                block.statements.add(incrementVariable(indexTmpVariable.symbol,
                                        irGet(arraySizeVariable.symbol)))
                                log("element:$i:spread element> ${ir2string(element.expression)}")
                            }' @ [141:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'element' @ [141:33] ==> value-parameter element: IrVarargElement defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'irCall' @ [142:59] ==> public fun IrBuilderWithScope.irCall(callee: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'arrayHandle' @ [142:66] ==> val arrayHandle: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'setMethodSymbol' @ [142:78] ==> public final val setMethodSymbol: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.ArrayHandle[PropertyDescriptorImpl]

'setArrayElementCall' @ [143:33] ==> val setArrayElementCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'dispatchReceiver' @ [143:53] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'irGet' @ [143:72] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'arrayTmpVariable' @ [143:78] ==> val arrayTmpVariable: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'symbol' @ [143:95] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'setArrayElementCall' @ [144:33] ==> val setArrayElementCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'putValueArgument' @ [144:53] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'if (hasSpreadElement) irGet(indexTmpVariable.symbol) else irConstInt(i)' @ [144:73] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpressionWithCopy, elseBranch: IrExpressionWithCopy): IrExpressionWithCopy[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpressionWithCopy

'hasSpreadElement' @ [144:77] ==> val hasSpreadElement: Boolean defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[LocalVariableDescriptor]

'irGet' @ [144:95] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'indexTmpVariable' @ [144:101] ==> val indexTmpVariable: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'symbol' @ [144:118] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'irConstInt' @ [144:131] ==> private fun IrBuilderWithScope.irConstInt(value: Int): IrConst<Int> defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]

'i' @ [144:142] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'setArrayElementCall' @ [145:33] ==> val setArrayElementCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'putValueArgument' @ [145:53] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'irGet' @ [145:73] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'dst' @ [145:79] ==> val dst: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'symbol' @ [145:83] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'block' @ [146:33] ==> val block: IrBlock defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'statements' @ [146:39] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'add' @ [146:50] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'setArrayElementCall' @ [146:54] ==> val setArrayElementCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'hasSpreadElement' @ [147:37] ==> val hasSpreadElement: Boolean defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg[LocalVariableDescriptor]

'block' @ [148:37] ==> val block: IrBlock defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'statements' @ [148:43] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'add' @ [148:54] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'incrementVariable' @ [148:58] ==> private final fun IrBuilderWithScope.incrementVariable(symbol: IrVariableSymbol, value: IrExpression): IrExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'indexTmpVariable' @ [148:76] ==> val indexTmpVariable: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'symbol' @ [148:93] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'kIntOne' @ [148:101] ==> private val IrBuilderWithScope.kIntOne: IrConst<Int> defined in org.jetbrains.kotlin.backend.common.lower in file VarargLowering.kt[PropertyDescriptorImpl]

'scope' @ [151:57] ==> public open val scope: Scope defined in org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder[DeserializedPropertyDescriptor]

'createTemporaryVariable' @ [151:63] ==> public final fun createTemporaryVariable(irExpression: IrExpression, nameHint: String? = ..., isMutable: Boolean = ..., origin: IrDeclarationOrigin = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedSimpleFunctionDescriptor]

'irArraySize' @ [151:87] ==> private final fun IrBuilderWithScope.irArraySize(arrayHandle: VarargInjectionLowering.ArrayHandle, expression: IrExpression): IrExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'arrayHandle' @ [151:99] ==> val arrayHandle: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'irGet' @ [151:112] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'dst' @ [151:118] ==> val dst: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'symbol' @ [151:122] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'synthesizedString' @ [151:141] ==> public val String.synthesizedString: String defined in org.jetbrains.kotlin.backend.common.descriptors in file utils.kt[PropertyDescriptorImpl]

'block' @ [152:33] ==> val block: IrBlock defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'statements' @ [152:39] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'add' @ [152:50] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'arraySizeVariable' @ [152:54] ==> val arraySizeVariable: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'irCall' @ [153:48] ==> public fun IrBuilderWithScope.irCall(callee: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'arrayHandle' @ [153:55] ==> val arrayHandle: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'copyRangeToSymbol' @ [153:67] ==> public final val copyRangeToSymbol: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.ArrayHandle[PropertyDescriptorImpl]

'apply' @ [153:86] ==> @InlineOnly public inline fun <T> IrCall.apply(block: IrCall.() -> Unit): IrCall defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCall

'extensionReceiver' @ [154:37] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'irGet' @ [154:57] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'dst' @ [154:63] ==> val dst: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'symbol' @ [154:67] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'putValueArgument' @ [155:37] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'irGet' @ [155:57] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'arrayTmpVariable' @ [155:63] ==> val arrayTmpVariable: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'symbol' @ [155:80] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'putValueArgument' @ [156:37] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'kIntZero' @ [156:57] ==> private val IrBuilderWithScope.kIntZero: IrConst<Int> defined in org.jetbrains.kotlin.backend.common.lower in file VarargLowering.kt[PropertyDescriptorImpl]

'putValueArgument' @ [157:37] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'irGet' @ [157:57] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'arraySizeVariable' @ [157:63] ==> val arraySizeVariable: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'symbol' @ [157:81] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'putValueArgument' @ [158:37] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'irGet' @ [158:57] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'indexTmpVariable' @ [158:63] ==> val indexTmpVariable: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'symbol' @ [158:80] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'block' @ [160:33] ==> val block: IrBlock defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'statements' @ [160:39] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'add' @ [160:50] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'copyCall' @ [160:54] ==> val copyCall: IrCall defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'block' @ [161:33] ==> val block: IrBlock defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'statements' @ [161:39] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'add' @ [161:50] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'incrementVariable' @ [161:54] ==> private final fun IrBuilderWithScope.incrementVariable(symbol: IrVariableSymbol, value: IrExpression): IrExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'indexTmpVariable' @ [161:72] ==> val indexTmpVariable: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'symbol' @ [161:89] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'irGet' @ [162:41] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'arraySizeVariable' @ [162:47] ==> val arraySizeVariable: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'symbol' @ [162:65] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'log' @ [163:33] ==> private final fun log(msg: String): Unit defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'i' @ [163:47] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ir2string' @ [163:67] ==> public fun ir2string(ir: IrElement?): String defined in org.jetbrains.kotlin.backend.common.ir in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [163:77] ==> value-parameter element: IrVarargElement defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [163:85] ==> public abstract var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrSpreadElement[DeserializedPropertyDescriptor]

'block' @ [167:21] ==> val block: IrBlock defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'statements' @ [167:27] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlock[DeserializedPropertyDescriptor]

'add' @ [167:38] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irGet' @ [167:42] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'arrayTmpVariable' @ [167:48] ==> val arrayTmpVariable: IrVariable defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'symbol' @ [167:65] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'block' @ [168:28] ==> val block: IrBlock defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.lower.<no name provided>.visitVararg.<anonymous>[LocalVariableDescriptor]

'context' @ [174:27] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'ir' @ [174:35] ==> public abstract val ir: Ir<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'symbols' @ [174:38] ==> public abstract val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.ir.Ir[PropertyDescriptorImpl]

'symbols' @ [175:30] ==> private final val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'intPlusInt' @ [175:38] ==> public final val intPlusInt: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'when {
        KotlinBuiltIns.isPrimitiveArray(type) -> {
            val primitiveType = KotlinBuiltIns.getPrimitiveArrayType(type.constructor.declarationDescriptor!!)
            when (primitiveType) {
                PrimitiveType.BYTE    -> kByteArrayHandler
                PrimitiveType.SHORT   -> kShortArrayHandler
                PrimitiveType.CHAR    -> kCharArrayHandler
                PrimitiveType.INT     -> kIntArrayHandler
                PrimitiveType.LONG    -> kLongArrayHandler
                PrimitiveType.FLOAT   -> kFloatArrayHandler
                PrimitiveType.DOUBLE  -> kDoubleArrayHandler
                PrimitiveType.BOOLEAN -> kBooleanArrayHandler
                else                  -> TODO("unsupported type: $primitiveType")
            }
        }
        else -> kArrayHandler
    }' @ [177:60] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: VarargInjectionLowering.ArrayHandle, entry1: VarargInjectionLowering.ArrayHandle): VarargInjectionLowering.ArrayHandle[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ArrayHandle

'isPrimitiveArray' @ [178:24] ==> public open fun isPrimitiveArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [178:41] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.arrayType[ValueParameterDescriptorImpl]

'getPrimitiveArrayType' @ [179:48] ==> @Nullable public open fun getPrimitiveArrayType(@NotNull p0: DeclarationDescriptor): PrimitiveType? defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [179:70] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.arrayType[ValueParameterDescriptorImpl]

'constructor' @ [179:75] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [179:87] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'when (primitiveType) {
                PrimitiveType.BYTE    -> kByteArrayHandler
                PrimitiveType.SHORT   -> kShortArrayHandler
                PrimitiveType.CHAR    -> kCharArrayHandler
                PrimitiveType.INT     -> kIntArrayHandler
                PrimitiveType.LONG    -> kLongArrayHandler
                PrimitiveType.FLOAT   -> kFloatArrayHandler
                PrimitiveType.DOUBLE  -> kDoubleArrayHandler
                PrimitiveType.BOOLEAN -> kBooleanArrayHandler
                else                  -> TODO("unsupported type: $primitiveType")
            }' @ [180:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: VarargInjectionLowering.ArrayHandle, entry1: VarargInjectionLowering.ArrayHandle, entry2: VarargInjectionLowering.ArrayHandle, entry3: VarargInjectionLowering.ArrayHandle, entry4: VarargInjectionLowering.ArrayHandle, entry5: VarargInjectionLowering.ArrayHandle, entry6: VarargInjectionLowering.ArrayHandle, entry7: VarargInjectionLowering.ArrayHandle, entry8: VarargInjectionLowering.ArrayHandle): VarargInjectionLowering.ArrayHandle[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ArrayHandle

'primitiveType' @ [180:19] ==> val primitiveType: PrimitiveType? defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.arrayType[LocalVariableDescriptor]

'BYTE' @ [181:31] ==> enum entry BYTE defined in org.jetbrains.kotlin.builtins.PrimitiveType[FakeCallableDescriptorForObject]

'kByteArrayHandler' @ [181:42] ==> public final val kByteArrayHandler: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'SHORT' @ [182:31] ==> enum entry SHORT defined in org.jetbrains.kotlin.builtins.PrimitiveType[FakeCallableDescriptorForObject]

'kShortArrayHandler' @ [182:42] ==> public final val kShortArrayHandler: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'CHAR' @ [183:31] ==> enum entry CHAR defined in org.jetbrains.kotlin.builtins.PrimitiveType[FakeCallableDescriptorForObject]

'kCharArrayHandler' @ [183:42] ==> public final val kCharArrayHandler: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'INT' @ [184:31] ==> enum entry INT defined in org.jetbrains.kotlin.builtins.PrimitiveType[FakeCallableDescriptorForObject]

'kIntArrayHandler' @ [184:42] ==> public final val kIntArrayHandler: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'LONG' @ [185:31] ==> enum entry LONG defined in org.jetbrains.kotlin.builtins.PrimitiveType[FakeCallableDescriptorForObject]

'kLongArrayHandler' @ [185:42] ==> public final val kLongArrayHandler: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'FLOAT' @ [186:31] ==> enum entry FLOAT defined in org.jetbrains.kotlin.builtins.PrimitiveType[FakeCallableDescriptorForObject]

'kFloatArrayHandler' @ [186:42] ==> public final val kFloatArrayHandler: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'DOUBLE' @ [187:31] ==> enum entry DOUBLE defined in org.jetbrains.kotlin.builtins.PrimitiveType[FakeCallableDescriptorForObject]

'kDoubleArrayHandler' @ [187:42] ==> public final val kDoubleArrayHandler: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'BOOLEAN' @ [188:31] ==> enum entry BOOLEAN defined in org.jetbrains.kotlin.builtins.PrimitiveType[FakeCallableDescriptorForObject]

'kBooleanArrayHandler' @ [188:42] ==> public final val kBooleanArrayHandler: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'TODO' @ [189:42] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'primitiveType' @ [189:67] ==> val primitiveType: PrimitiveType? defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.arrayType[LocalVariableDescriptor]

'kArrayHandler' @ [192:17] ==> public final val kArrayHandler: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'irCall' @ [195:48] ==> public fun IrBuilderWithScope.irCall(callee: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'intPlusInt' @ [195:55] ==> private final val intPlusInt: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'intPlus' @ [197:16] ==> private final fun IrBuilderWithScope.intPlus(): IrCall defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'apply' @ [197:26] ==> @InlineOnly public inline fun <T> IrCall.apply(block: IrCall.() -> Unit): IrCall defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCall

'dispatchReceiver' @ [198:13] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [198:32] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.increment[ValueParameterDescriptorImpl]

'putValueArgument' @ [199:13] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'value' @ [199:33] ==> value-parameter value: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.increment[ValueParameterDescriptorImpl]

'irSetVar' @ [204:16] ==> public fun IrBuilderWithScope.irSetVar(variable: IrVariableSymbol, value: IrExpression): IrSetVariableImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'symbol' @ [204:25] ==> value-parameter symbol: IrVariableSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.incrementVariable[ValueParameterDescriptorImpl]

'intPlus' @ [204:33] ==> private final fun IrBuilderWithScope.intPlus(): IrCall defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'apply' @ [204:43] ==> @InlineOnly public inline fun <T> IrCall.apply(block: IrCall.() -> Unit): IrCall defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCall

'dispatchReceiver' @ [205:13] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'irGet' @ [205:32] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'symbol' @ [205:38] ==> value-parameter symbol: IrVariableSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.incrementVariable[ValueParameterDescriptorImpl]

'putValueArgument' @ [206:13] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'value' @ [206:33] ==> value-parameter value: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.incrementVariable[ValueParameterDescriptorImpl]

'context' @ [210:9] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'createIrBuilder' @ [210:17] ==> public fun BackendContext.createIrBuilder(symbol: IrSymbol, startOffset: Int = ..., endOffset: Int = ...): DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]

'scope' @ [210:33] ==> value-parameter scope: Scope defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.calculateArraySize[ValueParameterDescriptorImpl]

'scopeOwnerSymbol' @ [210:39] ==> public final val scopeOwnerSymbol: IrSymbol defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedPropertyDescriptor]

'expression' @ [210:57] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.calculateArraySize[ValueParameterDescriptorImpl]

'startOffset' @ [210:68] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'expression' @ [210:81] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.calculateArraySize[ValueParameterDescriptorImpl]

'endOffset' @ [210:92] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'run' @ [210:103] ==> @InlineOnly public inline fun <T, R> DeclarationIrBuilder.run(block: DeclarationIrBuilder.() -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationIrBuilder
    <R> -> Nothing

'!' @ [211:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasSpreadElement' @ [211:18] ==> value-parameter hasSpreadElement: Boolean defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.calculateArraySize[ValueParameterDescriptorImpl]

'irConstInt' @ [212:24] ==> private fun IrBuilderWithScope.irConstInt(value: Int): IrConst<Int> defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]

'expression' @ [212:35] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.calculateArraySize[ValueParameterDescriptorImpl]

'elements' @ [212:46] ==> public abstract val elements: List<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'size' @ [212:55] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'expression' @ [213:41] ==> value-parameter expression: IrVararg defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.calculateArraySize[ValueParameterDescriptorImpl]

'elements' @ [213:52] ==> public abstract val elements: List<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'filter' @ [213:61] ==> public inline fun <T> Iterable<IrVarargElement>.filter(predicate: (IrVarargElement) -> Boolean): List<IrVarargElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVarargElement

'it' @ [213:70] ==> value-parameter it: IrVarargElement defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.calculateArraySize.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [213:94] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'irConstInt' @ [214:32] ==> private fun IrBuilderWithScope.irConstInt(value: Int): IrConst<Int> defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]

'notSpreadElementCount' @ [214:43] ==> val notSpreadElementCount: Int defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.calculateArraySize.<anonymous>[LocalVariableDescriptor]

'vars' @ [215:20] ==> value-parameter vars: Map<IrVarargElement, IrVariable> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.calculateArraySize[ValueParameterDescriptorImpl]

'filter' @ [215:25] ==> public inline fun <K, V> Map<out IrVarargElement, IrVariable>.filter(predicate: (Map.Entry<IrVarargElement, IrVariable>) -> Boolean): Map<IrVarargElement, IrVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrVarargElement
    <V> -> IrVariable

'it' @ [215:32] ==> value-parameter it: Map.Entry<IrVarargElement, IrVariable> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.calculateArraySize.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [215:35] ==> public abstract val key: IrVarargElement defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'toList' @ [215:59] ==> public fun <K, V> Map<out IrVarargElement, IrVariable>.toList(): List<Pair<IrVarargElement, IrVariable>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrVarargElement
    <V> -> IrVariable

'fold' @ [215:68] ==> public inline fun <T, R> Iterable<Pair<IrVarargElement, IrVariable>>.fold(initial: IrExpression, operation: (IrExpression, Pair<IrVarargElement, IrVariable>) -> IrExpression): IrExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<IrVarargElement, IrVariable>
    <R> -> IrExpression

'initialValue' @ [215:84] ==> val initialValue: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.calculateArraySize.<anonymous>[LocalVariableDescriptor]

'irArraySize' @ [216:33] ==> private final fun IrBuilderWithScope.irArraySize(arrayHandle: VarargInjectionLowering.ArrayHandle, expression: IrExpression): IrExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'arrayHandle' @ [216:45] ==> value-parameter arrayHandle: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.calculateArraySize[ValueParameterDescriptorImpl]

'irGet' @ [216:58] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'it' @ [216:64] ==> value-parameter it: Pair<IrVarargElement, IrVariable> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.calculateArraySize.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [216:67] ==> public final val second: IrVariable defined in kotlin.Pair[DeserializedPropertyDescriptor]

'symbol' @ [216:74] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'increment' @ [217:17] ==> private final fun IrBuilderWithScope.increment(expression: IrExpression, value: IrExpression): IrExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'result' @ [217:27] ==> value-parameter result: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.calculateArraySize.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'arraySize' @ [217:35] ==> val arraySize: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.calculateArraySize.<anonymous>.<anonymous>[LocalVariableDescriptor]

'irCall' @ [223:25] ==> public fun IrBuilderWithScope.irCall(callee: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'arrayHandle' @ [223:32] ==> value-parameter arrayHandle: VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.irArraySize[ValueParameterDescriptorImpl]

'sizeGetterSymbol' @ [223:44] ==> public final val sizeGetterSymbol: IrFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.ArrayHandle[PropertyDescriptorImpl]

'apply' @ [223:62] ==> @InlineOnly public inline fun <T> IrCall.apply(block: IrCall.() -> Unit): IrCall defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCall

'dispatchReceiver' @ [224:13] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'expression' @ [224:32] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.irArraySize[ValueParameterDescriptorImpl]

'arraySize' @ [226:16] ==> val arraySize: IrCall defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.irArraySize[LocalVariableDescriptor]

'expression' @ [230:59] ==> value-parameter expression: IrVararg? defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.hasSpreadElement[ValueParameterDescriptorImpl]

'elements' @ [230:71] ==> public abstract val elements: List<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.IrVararg[DeserializedPropertyDescriptor]

'any' @ [230:81] ==> public inline fun <T> Iterable<IrVarargElement>.any(predicate: (IrVarargElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVarargElement

'it' @ [230:87] ==> value-parameter it: IrVarargElement defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.hasSpreadElement.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [233:9] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'log' @ [233:17] ==> public abstract fun log(message: () -> String): Unit defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[SimpleFunctionDescriptorImpl]

'msg' @ [233:43] ==> value-parameter msg: String defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.log[ValueParameterDescriptorImpl]

'handle' @ [241:32] ==> private final fun handle(symbol: IrClassSymbol): VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'symbols' @ [241:39] ==> private final val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'byteArray' @ [241:47] ==> public final val byteArray: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'handle' @ [242:32] ==> private final fun handle(symbol: IrClassSymbol): VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'symbols' @ [242:39] ==> private final val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'charArray' @ [242:47] ==> public final val charArray: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'handle' @ [243:32] ==> private final fun handle(symbol: IrClassSymbol): VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'symbols' @ [243:39] ==> private final val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'shortArray' @ [243:47] ==> public final val shortArray: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'handle' @ [244:32] ==> private final fun handle(symbol: IrClassSymbol): VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'symbols' @ [244:39] ==> private final val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'intArray' @ [244:47] ==> public final val intArray: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'handle' @ [245:32] ==> private final fun handle(symbol: IrClassSymbol): VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'symbols' @ [245:39] ==> private final val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'longArray' @ [245:47] ==> public final val longArray: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'handle' @ [246:32] ==> private final fun handle(symbol: IrClassSymbol): VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'symbols' @ [246:39] ==> private final val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'floatArray' @ [246:47] ==> public final val floatArray: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'handle' @ [247:32] ==> private final fun handle(symbol: IrClassSymbol): VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'symbols' @ [247:39] ==> private final val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'doubleArray' @ [247:47] ==> public final val doubleArray: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'handle' @ [248:32] ==> private final fun handle(symbol: IrClassSymbol): VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'symbols' @ [248:39] ==> private final val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'booleanArray' @ [248:47] ==> public final val booleanArray: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'handle' @ [249:32] ==> private final fun handle(symbol: IrClassSymbol): VarargInjectionLowering.ArrayHandle defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[SimpleFunctionDescriptorImpl]

'symbols' @ [249:39] ==> private final val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'array' @ [249:47] ==> public final val array: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'ArrayHandle' @ [251:49] ==> public constructor ArrayHandle(arraySymbol: IrClassSymbol, setMethodSymbol: IrFunctionSymbol, sizeGetterSymbol: IrFunctionSymbol, copyRangeToSymbol: IrFunctionSymbol) defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.ArrayHandle[ClassConstructorDescriptorImpl]

'symbol' @ [252:27] ==> value-parameter symbol: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.handle[ValueParameterDescriptorImpl]

'symbol' @ [253:31] ==> value-parameter symbol: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.handle[ValueParameterDescriptorImpl]

'functions' @ [253:38] ==> public val IrClassSymbol.functions: Sequence<IrSimpleFunctionSymbol> defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[PropertyDescriptorImpl]

'single' @ [253:48] ==> public inline fun <T> Sequence<IrSimpleFunctionSymbol>.single(predicate: (IrSimpleFunctionSymbol) -> Boolean): IrSimpleFunctionSymbol defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrSimpleFunctionSymbol

'it' @ [253:57] ==> value-parameter it: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.handle.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [253:60] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol[DeserializedPropertyDescriptor]

'name' @ [253:71] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'OperatorNameConventions' @ [253:79] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'SET' @ [253:103] ==> @field:JvmField public final val SET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'symbol' @ [254:32] ==> value-parameter symbol: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.handle[ValueParameterDescriptorImpl]

'getPropertyGetter' @ [254:39] ==> public fun IrClassSymbol.getPropertyGetter(name: String): IrFunctionSymbol? defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'symbols' @ [255:33] ==> private final val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering[PropertyDescriptorImpl]

'copyRangeTo' @ [255:41] ==> public abstract val copyRangeTo: Map<ClassDescriptor, IrSimpleFunctionSymbol> defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'symbol' @ [255:53] ==> value-parameter symbol: IrClassSymbol defined in org.jetbrains.kotlin.backend.common.lower.VarargInjectionLowering.handle[ValueParameterDescriptorImpl]

'descriptor' @ [255:60] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrClassSymbol[DeserializedPropertyDescriptor]

'IrConstImpl' @ [260:71] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'int' @ [260:83] ==> public final fun int(startOffset: Int, endOffset: Int, type: KotlinType, value: Int): IrConstImpl<Int> defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'startOffset' @ [260:87] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'endOffset' @ [260:100] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'context' @ [260:111] ==> public open val context: IrGeneratorContext defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'builtIns' @ [260:119] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.ir.builders.IrGeneratorContext[DeserializedPropertyDescriptor]

'intType' @ [260:128] ==> public final val KotlinBuiltIns.intType: SimpleType[MyPropertyDescriptor]

'value' @ [260:137] ==> value-parameter value: Int defined in org.jetbrains.kotlin.backend.common.lower.irConstInt[ValueParameterDescriptorImpl]

'IrBlockImpl' @ [261:69] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [261:81] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'endOffset' @ [261:94] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBuilderWithScope[DeserializedPropertyDescriptor]

'type' @ [261:105] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.irBlock[ValueParameterDescriptorImpl]

'irConstInt' @ [262:49] ==> private fun IrBuilderWithScope.irConstInt(value: Int): IrConst<Int> defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]

'irConstInt' @ [263:48] ==> private fun IrBuilderWithScope.irConstInt(value: Int): IrConst<Int> defined in org.jetbrains.kotlin.backend.common.lower[SimpleFunctionDescriptorImpl]

