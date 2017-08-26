'getValue' @ [48:19] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'buildSymbol' @ [48:26] ==> protected abstract fun buildSymbol(): S defined in org.jetbrains.kotlin.backend.common.lower.SymbolWithIrBuilder[SimpleFunctionDescriptorImpl]

'getValue' @ [50:28] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'buildIr' @ [50:35] ==> protected abstract fun buildIr(): D defined in org.jetbrains.kotlin.backend.common.lower.SymbolWithIrBuilder[SimpleFunctionDescriptorImpl]

'doInitialize' @ [54:9] ==> protected open fun doInitialize(): Unit defined in org.jetbrains.kotlin.backend.common.lower.SymbolWithIrBuilder[SimpleFunctionDescriptorImpl]

'initialized' @ [55:9] ==> private final var initialized: Boolean defined in org.jetbrains.kotlin.backend.common.lower.SymbolWithIrBuilder[PropertyDescriptorImpl]

'!' @ [60:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'initialized' @ [60:18] ==> private final var initialized: Boolean defined in org.jetbrains.kotlin.backend.common.lower.SymbolWithIrBuilder[PropertyDescriptorImpl]

'Error' @ [61:23] ==> public final fun <init>(p0: (String..String?)): Error /* = Error */ defined in kotlin.Error[TypeAliasConstructorDescriptorImpl]

'builtIr' @ [62:20] ==> private final val builtIr: D defined in org.jetbrains.kotlin.backend.common.lower.SymbolWithIrBuilder[PropertyDescriptorImpl]

'SymbolWithIrBuilder<IrSimpleFunctionSymbol, IrSimpleFunction>' @ [68:19] ==> public constructor SymbolWithIrBuilder<out S : IrSymbol, out D : IrDeclaration>() defined in org.jetbrains.kotlin.backend.common.lower.SymbolWithIrBuilder[ClassConstructorDescriptorImpl]
Inferred types:
    <out S : IrSymbol> -> IrSimpleFunctionSymbol
    <out D : IrDeclaration> -> IrSimpleFunction

'IrSimpleFunctionSymbolImpl' @ [70:34] ==> public constructor IrSimpleFunctionSymbolImpl(descriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrSimpleFunctionSymbolImpl[DeserializedClassConstructorDescriptor]

'PropertyGetterDescriptorImpl' @ [71:13] ==> public constructor PropertyGetterDescriptorImpl(@NotNull p0: PropertyDescriptor, @NotNull p1: Annotations, @NotNull p2: Modality, @NotNull p3: Visibility, p4: Boolean, p5: Boolean, p6: Boolean, @NotNull p7: CallableMemberDescriptor.Kind, @Nullable p8: PropertyGetterDescriptor?, @NotNull p9: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.PropertyGetterDescriptorImpl[JavaClassConstructorDescriptor]

'fieldSymbol' @ [72:51] ==> value-parameter fieldSymbol: IrFieldSymbol defined in org.jetbrains.kotlin.backend.common.lower.createPropertyGetterBuilder[ValueParameterDescriptorImpl]

'descriptor' @ [72:63] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFieldSymbol[DeserializedPropertyDescriptor]

'EMPTY' @ [73:63] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'FINAL' @ [74:60] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'PRIVATE' @ [75:64] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'DECLARATION' @ [79:81] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'NO_SOURCE' @ [81:65] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'symbol' @ [86:26] ==> public final val symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.createPropertyGetterBuilder.<no name provided>[PropertyDescriptorImpl]

'descriptor' @ [86:33] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol[DeserializedPropertyDescriptor]

'descriptor' @ [87:9] ==> val descriptor: PropertyGetterDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.createPropertyGetterBuilder.<no name provided>.doInitialize[LocalVariableDescriptor]

'apply' @ [87:20] ==> @InlineOnly public inline fun <T> PropertyGetterDescriptorImpl.apply(block: PropertyGetterDescriptorImpl.() -> Unit): PropertyGetterDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyGetterDescriptorImpl

'initialize' @ [88:13] ==> public open fun initialize(p0: (KotlinType..KotlinType?)): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyGetterDescriptorImpl[JavaMethodDescriptor]

'type' @ [88:24] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.createPropertyGetterBuilder[ValueParameterDescriptorImpl]

'IrFunctionImpl' @ [92:30] ==> public constructor IrFunctionImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrSimpleFunctionSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [93:27] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertyGetterBuilder[ValueParameterDescriptorImpl]

'endOffset' @ [94:27] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertyGetterBuilder[ValueParameterDescriptorImpl]

'origin' @ [95:27] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.backend.common.lower.createPropertyGetterBuilder[ValueParameterDescriptorImpl]

'symbol' @ [96:27] ==> public final val symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.createPropertyGetterBuilder.<no name provided>[PropertyDescriptorImpl]

'apply' @ [96:35] ==> @InlineOnly public inline fun <T> IrFunctionImpl.apply(block: IrFunctionImpl.() -> Unit): IrFunctionImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFunctionImpl

'createParameterDeclarations' @ [98:9] ==> public fun IrFunction.createParameterDeclarations(): Unit defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'body' @ [100:9] ==> public final var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedPropertyDescriptor]

'createIrBuilder' @ [100:16] ==> public fun BackendContext.createIrBuilder(symbol: IrSymbol, startOffset: Int = ..., endOffset: Int = ...): DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower in file LowerUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [100:32] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.createPropertyGetterBuilder.<no name provided>.buildIr.<anonymous>[ReceiverParameterDescriptorImpl]

'symbol' @ [100:37] ==> public open val symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedPropertyDescriptor]

'startOffset' @ [100:45] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertyGetterBuilder[ValueParameterDescriptorImpl]

'endOffset' @ [100:58] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertyGetterBuilder[ValueParameterDescriptorImpl]

'irBlockBody' @ [100:69] ==> public inline fun IrGeneratorWithScope.irBlockBody(startOffset: Int = ..., endOffset: Int = ..., body: IrBlockBodyBuilder.() -> Unit): IrBlockBody defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'+' @ [101:13] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[DeserializedSimpleFunctionDescriptor]

'irReturn' @ [101:14] ==> public fun IrBuilderWithScope.irReturn(value: IrExpression): IrReturnImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irGetField' @ [101:23] ==> public fun IrBuilderWithScope.irGetField(receiver: IrExpression, symbol: IrFieldSymbol): IrGetFieldImpl defined in org.jetbrains.kotlin.backend.common.lower in file LowerUtils.kt[SimpleFunctionDescriptorImpl]

'irGet' @ [101:34] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'this@apply' @ [101:40] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.createPropertyGetterBuilder.<no name provided>.buildIr.<anonymous>[ReceiverParameterDescriptorImpl]

'dispatchReceiverParameter' @ [101:51] ==> public open var dispatchReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedPropertyDescriptor]

'symbol' @ [101:79] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'fieldSymbol' @ [101:88] ==> value-parameter fieldSymbol: IrFieldSymbol defined in org.jetbrains.kotlin.backend.common.lower.createPropertyGetterBuilder[ValueParameterDescriptorImpl]

'SymbolWithIrBuilder<IrSimpleFunctionSymbol, IrSimpleFunction>' @ [108:19] ==> public constructor SymbolWithIrBuilder<out S : IrSymbol, out D : IrDeclaration>() defined in org.jetbrains.kotlin.backend.common.lower.SymbolWithIrBuilder[ClassConstructorDescriptorImpl]
Inferred types:
    <out S : IrSymbol> -> IrSimpleFunctionSymbol
    <out D : IrDeclaration> -> IrSimpleFunction

'IrSimpleFunctionSymbolImpl' @ [110:34] ==> public constructor IrSimpleFunctionSymbolImpl(descriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrSimpleFunctionSymbolImpl[DeserializedClassConstructorDescriptor]

'PropertySetterDescriptorImpl' @ [111:13] ==> public constructor PropertySetterDescriptorImpl(@NotNull p0: PropertyDescriptor, @NotNull p1: Annotations, @NotNull p2: Modality, @NotNull p3: Visibility, p4: Boolean, p5: Boolean, p6: Boolean, @NotNull p7: CallableMemberDescriptor.Kind, @Nullable p8: PropertySetterDescriptor?, @NotNull p9: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.PropertySetterDescriptorImpl[JavaClassConstructorDescriptor]

'fieldSymbol' @ [112:51] ==> value-parameter fieldSymbol: IrFieldSymbol defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder[ValueParameterDescriptorImpl]

'descriptor' @ [112:63] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFieldSymbol[DeserializedPropertyDescriptor]

'EMPTY' @ [113:63] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'FINAL' @ [114:60] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'PRIVATE' @ [115:64] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'DECLARATION' @ [119:81] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'NO_SOURCE' @ [121:65] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'symbol' @ [128:26] ==> public final val symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder.<no name provided>[PropertyDescriptorImpl]

'descriptor' @ [128:33] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol[DeserializedPropertyDescriptor]

'descriptor' @ [129:9] ==> val descriptor: PropertySetterDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder.<no name provided>.doInitialize[LocalVariableDescriptor]

'apply' @ [129:20] ==> @InlineOnly public inline fun <T> PropertySetterDescriptorImpl.apply(block: PropertySetterDescriptorImpl.() -> Unit): PropertySetterDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertySetterDescriptorImpl

'valueParameterDescriptor' @ [130:13] ==> public final lateinit var valueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder.<no name provided>[PropertyDescriptorImpl]

'ValueParameterDescriptorImpl' @ [130:40] ==> public constructor ValueParameterDescriptorImpl(containingDeclaration: CallableDescriptor, original: ValueParameterDescriptor?, index: Int, annotations: Annotations, name: Name, outType: KotlinType, declaresDefaultValue: Boolean, isCrossinline: Boolean, isNoinline: Boolean, varargElementType: KotlinType?, source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.ValueParameterDescriptorImpl[DeserializedClassConstructorDescriptor]

'this' @ [131:45] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder.<no name provided>.doInitialize.<anonymous>[ReceiverParameterDescriptorImpl]

'EMPTY' @ [134:57] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'identifier' @ [135:50] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'type' @ [136:45] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder[ValueParameterDescriptorImpl]

'NO_SOURCE' @ [141:59] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'initialize' @ [144:13] ==> public open fun initialize(@NotNull p0: ValueParameterDescriptor): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertySetterDescriptorImpl[JavaMethodDescriptor]

'valueParameterDescriptor' @ [144:24] ==> public final lateinit var valueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder.<no name provided>[PropertyDescriptorImpl]

'IrFunctionImpl' @ [148:30] ==> public constructor IrFunctionImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrSimpleFunctionSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [149:27] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder[ValueParameterDescriptorImpl]

'endOffset' @ [150:27] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder[ValueParameterDescriptorImpl]

'origin' @ [151:27] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder[ValueParameterDescriptorImpl]

'symbol' @ [152:27] ==> public final val symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder.<no name provided>[PropertyDescriptorImpl]

'apply' @ [152:35] ==> @InlineOnly public inline fun <T> IrFunctionImpl.apply(block: IrFunctionImpl.() -> Unit): IrFunctionImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrFunctionImpl

'createParameterDeclarations' @ [154:9] ==> public fun IrFunction.createParameterDeclarations(): Unit defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'body' @ [156:9] ==> public final var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedPropertyDescriptor]

'createIrBuilder' @ [156:16] ==> public fun BackendContext.createIrBuilder(symbol: IrSymbol, startOffset: Int = ..., endOffset: Int = ...): DeclarationIrBuilder defined in org.jetbrains.kotlin.backend.common.lower in file LowerUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [156:32] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder.<no name provided>.buildIr.<anonymous>[ReceiverParameterDescriptorImpl]

'symbol' @ [156:37] ==> public open val symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedPropertyDescriptor]

'startOffset' @ [156:45] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder[ValueParameterDescriptorImpl]

'endOffset' @ [156:58] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder[ValueParameterDescriptorImpl]

'irBlockBody' @ [156:69] ==> public inline fun IrGeneratorWithScope.irBlockBody(startOffset: Int = ..., endOffset: Int = ..., body: IrBlockBodyBuilder.() -> Unit): IrBlockBody defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'+' @ [157:13] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[DeserializedSimpleFunctionDescriptor]

'irSetField' @ [157:14] ==> public fun IrBuilderWithScope.irSetField(receiver: IrExpression, symbol: IrFieldSymbol, value: IrExpression): IrSetFieldImpl defined in org.jetbrains.kotlin.backend.common.lower in file LowerUtils.kt[SimpleFunctionDescriptorImpl]

'irGet' @ [157:25] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'this@apply' @ [157:31] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder.<no name provided>.buildIr.<anonymous>[ReceiverParameterDescriptorImpl]

'dispatchReceiverParameter' @ [157:42] ==> public open var dispatchReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedPropertyDescriptor]

'symbol' @ [157:70] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'fieldSymbol' @ [157:79] ==> value-parameter fieldSymbol: IrFieldSymbol defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder[ValueParameterDescriptorImpl]

'irGet' @ [157:92] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'this@apply' @ [157:98] ==> <this> defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder.<no name provided>.buildIr.<anonymous>[ReceiverParameterDescriptorImpl]

'valueParameters' @ [157:109] ==> public open val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedPropertyDescriptor]

'single' @ [157:125] ==> public fun <T> List<IrValueParameter>.single(): IrValueParameter defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameter

'symbol' @ [157:134] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'SymbolWithIrBuilder<IrFieldSymbol, IrProperty>' @ [164:19] ==> public constructor SymbolWithIrBuilder<out S : IrSymbol, out D : IrDeclaration>() defined in org.jetbrains.kotlin.backend.common.lower.SymbolWithIrBuilder[ClassConstructorDescriptorImpl]
Inferred types:
    <out S : IrSymbol> -> IrFieldSymbol
    <out D : IrDeclaration> -> IrProperty

'IrFieldSymbolImpl' @ [169:34] ==> public constructor IrFieldSymbolImpl(descriptor: PropertyDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrFieldSymbolImpl[DeserializedClassConstructorDescriptor]

'create' @ [170:36] ==> @NotNull public open fun create(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, @NotNull p2: Modality, @NotNull p3: Visibility, p4: Boolean, @NotNull p5: Name, @NotNull p6: CallableMemberDescriptor.Kind, @NotNull p7: SourceElement, p8: Boolean, p9: Boolean, p10: Boolean, p11: Boolean, p12: Boolean, p13: Boolean): PropertyDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'owner' @ [171:51] ==> value-parameter owner: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'EMPTY' @ [172:63] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'FINAL' @ [173:60] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'PRIVATE' @ [174:64] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'isMutable' @ [175:51] ==> value-parameter isMutable: Boolean defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'name' @ [176:51] ==> value-parameter name: Name defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'DECLARATION' @ [177:81] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'NO_SOURCE' @ [178:65] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'symbol' @ [189:26] ==> public final val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder.<no name provided>[PropertyDescriptorImpl]

'descriptor' @ [189:33] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFieldSymbol[DeserializedPropertyDescriptor]

'getterBuilder' @ [190:9] ==> private final lateinit var getterBuilder: SymbolWithIrBuilder<IrSimpleFunctionSymbol, IrSimpleFunction> defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder.<no name provided>[PropertyDescriptorImpl]

'createPropertyGetterBuilder' @ [190:25] ==> public fun BackendContext.createPropertyGetterBuilder(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, fieldSymbol: IrFieldSymbol, type: KotlinType): SymbolWithIrBuilder<IrSimpleFunctionSymbol, IrSimpleFunction> defined in org.jetbrains.kotlin.backend.common.lower in file IrBuildUtils.kt[SimpleFunctionDescriptorImpl]

'startOffset' @ [190:53] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'endOffset' @ [190:66] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'origin' @ [190:77] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'symbol' @ [190:85] ==> public final val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder.<no name provided>[PropertyDescriptorImpl]

'type' @ [190:93] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'apply' @ [190:99] ==> @InlineOnly public inline fun <T> SymbolWithIrBuilder<IrSimpleFunctionSymbol, IrSimpleFunction>.apply(block: SymbolWithIrBuilder<IrSimpleFunctionSymbol, IrSimpleFunction>.() -> Unit): SymbolWithIrBuilder<IrSimpleFunctionSymbol, IrSimpleFunction> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SymbolWithIrBuilder<IrSimpleFunctionSymbol, IrSimpleFunction>

'initialize' @ [190:107] ==> public final fun initialize(): Unit defined in org.jetbrains.kotlin.backend.common.lower.SymbolWithIrBuilder[SimpleFunctionDescriptorImpl]

'isMutable' @ [191:13] ==> value-parameter isMutable: Boolean defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'setterBuilder' @ [192:13] ==> private final var setterBuilder: SymbolWithIrBuilder<IrSimpleFunctionSymbol, IrSimpleFunction>? defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder.<no name provided>[PropertyDescriptorImpl]

'createPropertySetterBuilder' @ [192:29] ==> private fun BackendContext.createPropertySetterBuilder(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, fieldSymbol: IrFieldSymbol, type: KotlinType): <no name provided> defined in org.jetbrains.kotlin.backend.common.lower in file IrBuildUtils.kt[SimpleFunctionDescriptorImpl]

'startOffset' @ [192:57] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'endOffset' @ [192:70] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'origin' @ [192:81] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'symbol' @ [192:89] ==> public final val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder.<no name provided>[PropertyDescriptorImpl]

'type' @ [192:97] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'apply' @ [192:103] ==> @InlineOnly public inline fun <T> <no name provided>.apply(block: <no name provided>.() -> Unit): <no name provided> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> <no name provided>

'initialize' @ [192:111] ==> public final fun initialize(): Unit defined in org.jetbrains.kotlin.backend.common.lower.createPropertySetterBuilder.<no name provided>[SimpleFunctionDescriptorImpl]

'descriptor' @ [193:9] ==> val descriptor: PropertyDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder.<no name provided>.doInitialize[LocalVariableDescriptor]

'initialize' @ [193:20] ==> public open fun initialize(@Nullable p0: PropertyGetterDescriptorImpl?, @Nullable p1: PropertySetterDescriptor?): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'getterBuilder' @ [194:32] ==> private final lateinit var getterBuilder: SymbolWithIrBuilder<IrSimpleFunctionSymbol, IrSimpleFunction> defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder.<no name provided>[PropertyDescriptorImpl]

'symbol' @ [194:46] ==> public final val symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.SymbolWithIrBuilder[PropertyDescriptorImpl]

'descriptor' @ [194:53] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol[DeserializedPropertyDescriptor]

'setterBuilder' @ [195:32] ==> private final var setterBuilder: SymbolWithIrBuilder<IrSimpleFunctionSymbol, IrSimpleFunction>? defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder.<no name provided>[PropertyDescriptorImpl]

'symbol' @ [195:47] ==> public final val symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.lower.SymbolWithIrBuilder[PropertyDescriptorImpl]

'descriptor' @ [195:55] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol[DeserializedPropertyDescriptor]

'descriptor' @ [197:9] ==> val descriptor: PropertyDescriptorImpl defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder.<no name provided>.doInitialize[LocalVariableDescriptor]

'setType' @ [197:20] ==> public open fun setType(@NotNull p0: KotlinType, @ReadOnly @NotNull p1: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, @Nullable p2: ReceiverParameterDescriptor?, @Nullable p3: KotlinType?): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaMethodDescriptor]

'type' @ [197:28] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'emptyList' @ [197:34] ==> public fun <T> emptyList(): List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'owner' @ [197:47] ==> value-parameter owner: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'thisAsReceiverParameter' @ [197:53] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'receiverType' @ [197:78] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder.<no name provided>.doInitialize[LocalVariableDescriptor]

'IrFieldImpl' @ [201:28] ==> public constructor IrFieldImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, symbol: IrFieldSymbol) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFieldImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [202:31] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'endOffset' @ [203:31] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'origin' @ [204:31] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'symbol' @ [205:31] ==> public final val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder.<no name provided>[PropertyDescriptorImpl]

'IrPropertyImpl' @ [206:16] ==> public constructor IrPropertyImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, isDelegated: Boolean, descriptor: PropertyDescriptor, backingField: IrField?, getter: IrFunction?, setter: IrFunction?) defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [207:32] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'endOffset' @ [208:32] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'origin' @ [209:32] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder[ValueParameterDescriptorImpl]

'symbol' @ [211:32] ==> public final val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder.<no name provided>[PropertyDescriptorImpl]

'descriptor' @ [211:39] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFieldSymbol[DeserializedPropertyDescriptor]

'backingField' @ [212:32] ==> val backingField: IrFieldImpl defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder.<no name provided>.buildIr[LocalVariableDescriptor]

'getterBuilder' @ [213:32] ==> private final lateinit var getterBuilder: SymbolWithIrBuilder<IrSimpleFunctionSymbol, IrSimpleFunction> defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder.<no name provided>[PropertyDescriptorImpl]

'ir' @ [213:46] ==> public final val ir: IrSimpleFunction defined in org.jetbrains.kotlin.backend.common.lower.SymbolWithIrBuilder[PropertyDescriptorImpl]

'setterBuilder' @ [214:32] ==> private final var setterBuilder: SymbolWithIrBuilder<IrSimpleFunctionSymbol, IrSimpleFunction>? defined in org.jetbrains.kotlin.backend.common.lower.createPropertyWithBackingFieldBuilder.<no name provided>[PropertyDescriptorImpl]

'ir' @ [214:47] ==> public final val ir: IrSimpleFunction defined in org.jetbrains.kotlin.backend.common.lower.SymbolWithIrBuilder[PropertyDescriptorImpl]

