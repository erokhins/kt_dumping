'ir2stringWhole' @ [40:41] ==> public fun ir2stringWhole(ir: IrElement?, withDescriptors: Boolean = ...): String defined in org.jetbrains.kotlin.backend.common.ir in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'ir' @ [40:56] ==> value-parameter ir: IrElement? defined in org.jetbrains.kotlin.backend.common.ir.ir2string[ValueParameterDescriptorImpl]

'takeWhile' @ [40:60] ==> public inline fun String.takeWhile(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [40:72] ==> value-parameter it: Char defined in org.jetbrains.kotlin.backend.common.ir.ir2string.<anonymous>[ValueParameterDescriptorImpl]

'StringWriter' @ [43:21] ==> public constructor StringWriter() defined in java.io.StringWriter[JavaClassConstructorDescriptor]

'if (withDescriptors)
        ir?.accept(DumpIrTreeWithDescriptorsVisitor(strWriter), "")
    else
        ir?.accept(DumpIrTreeVisitor(strWriter), "")' @ [45:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'withDescriptors' @ [45:9] ==> value-parameter withDescriptors: Boolean = ... defined in org.jetbrains.kotlin.backend.common.ir.ir2stringWhole[ValueParameterDescriptorImpl]

'ir' @ [46:9] ==> value-parameter ir: IrElement? defined in org.jetbrains.kotlin.backend.common.ir.ir2stringWhole[ValueParameterDescriptorImpl]

'accept' @ [46:13] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.IrElement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit
    <D> -> String

'DumpIrTreeWithDescriptorsVisitor' @ [46:20] ==> public constructor DumpIrTreeWithDescriptorsVisitor(out: Appendable /* = Appendable */) defined in org.jetbrains.kotlin.backend.common.DumpIrTreeWithDescriptorsVisitor[ClassConstructorDescriptorImpl]

'strWriter' @ [46:53] ==> val strWriter: StringWriter defined in org.jetbrains.kotlin.backend.common.ir.ir2stringWhole[LocalVariableDescriptor]

'ir' @ [48:9] ==> value-parameter ir: IrElement? defined in org.jetbrains.kotlin.backend.common.ir.ir2stringWhole[ValueParameterDescriptorImpl]

'accept' @ [48:13] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, String>, data: String): Unit defined in org.jetbrains.kotlin.ir.IrElement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit
    <D> -> String

'DumpIrTreeVisitor' @ [48:20] ==> public constructor DumpIrTreeVisitor(out: Appendable /* = Appendable */) defined in org.jetbrains.kotlin.ir.util.DumpIrTreeVisitor[DeserializedClassConstructorDescriptor]

'strWriter' @ [48:38] ==> val strWriter: StringWriter defined in org.jetbrains.kotlin.backend.common.ir.ir2stringWhole[LocalVariableDescriptor]

'strWriter' @ [49:12] ==> val strWriter: StringWriter defined in org.jetbrains.kotlin.backend.common.ir.ir2stringWhole[LocalVariableDescriptor]

'toString' @ [49:22] ==> public open fun toString(): String defined in java.io.StringWriter[JavaMethodDescriptor]

'when (this) {
        is CallableMemberDescriptor ->
            copy(
                    /* newOwner      = */ owner,
                    /* modality      = */ modality,
                    /* visibility    = */ visibility,
                    /* kind          = */ CallableMemberDescriptor.Kind.FAKE_OVERRIDE,
                    /* copyOverrides = */ true).apply {
                overriddenDescriptors += this@createFakeOverrideDescriptor
            }
        else -> null
    }' @ [54:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'this' @ [54:18] ==> <this> defined in org.jetbrains.kotlin.backend.common.ir.createFakeOverrideDescriptor[ReceiverParameterDescriptorImpl]

'copy' @ [56:13] ==> @NotNull public abstract fun copy(p0: (DeclarationDescriptor..DeclarationDescriptor?), p1: (Modality..Modality?), p2: (Visibility..Visibility?), p3: (CallableMemberDescriptor.Kind..CallableMemberDescriptor.Kind?), p4: Boolean): CallableMemberDescriptor defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor[JavaMethodDescriptor]

'owner' @ [57:43] ==> value-parameter owner: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.ir.createFakeOverrideDescriptor[ValueParameterDescriptorImpl]

'modality' @ [58:43] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'visibility' @ [59:43] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [60:73] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'apply' @ [61:49] ==> @InlineOnly public inline fun <T> CallableMemberDescriptor.apply(block: (CallableMemberDescriptor).() -> Unit): CallableMemberDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'overriddenDescriptors' @ [62:17] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'this@createFakeOverrideDescriptor' @ [62:42] ==> <this> defined in org.jetbrains.kotlin.backend.common.ir.createFakeOverrideDescriptor[ReceiverParameterDescriptorImpl]

'this' @ [69:12] ==> <this> defined in org.jetbrains.kotlin.backend.common.ir.createOverriddenDescriptor[ReceiverParameterDescriptorImpl]

'newCopyBuilder' @ [69:17] ==> @NotNull public abstract fun newCopyBuilder(): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'setOwner' @ [70:14] ==> @NotNull public abstract fun setOwner(@NotNull p0: DeclarationDescriptor): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'owner' @ [70:23] ==> value-parameter owner: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.ir.createOverriddenDescriptor[ValueParameterDescriptorImpl]

'setCopyOverrides' @ [71:14] ==> @NotNull public abstract fun setCopyOverrides(p0: Boolean): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'setModality' @ [72:14] ==> @NotNull public abstract fun setModality(@NotNull p0: Modality): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'if (final) Modality.FINAL else Modality.OPEN' @ [72:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Modality, elseBranch: Modality): Modality[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Modality

'final' @ [72:30] ==> value-parameter final: Boolean = ... defined in org.jetbrains.kotlin.backend.common.ir.createOverriddenDescriptor[ValueParameterDescriptorImpl]

'Modality' @ [72:37] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [72:46] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'Modality' @ [72:57] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'OPEN' @ [72:66] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'setDispatchReceiverParameter' @ [73:14] ==> @NotNull public abstract fun setDispatchReceiverParameter(@Nullable p0: ReceiverParameterDescriptor?): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'owner' @ [73:43] ==> value-parameter owner: ClassDescriptor defined in org.jetbrains.kotlin.backend.common.ir.createOverriddenDescriptor[ValueParameterDescriptorImpl]

'thisAsReceiverParameter' @ [73:49] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'build' @ [74:14] ==> @Nullable public abstract fun build(): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'apply' @ [74:24] ==> @InlineOnly public inline fun <T> FunctionDescriptor.apply(block: FunctionDescriptor.() -> Unit): FunctionDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'overriddenDescriptors' @ [75:9] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'this@createOverriddenDescriptor' @ [75:34] ==> <this> defined in org.jetbrains.kotlin.backend.common.ir.createOverriddenDescriptor[ReceiverParameterDescriptorImpl]

'createSynthesized' @ [81:64] ==> @NotNull public open fun createSynthesized(@NotNull p0: ClassDescriptor, @NotNull p1: Annotations, p2: Boolean, @NotNull p3: SourceElement): ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl[JavaMethodDescriptor]

'this' @ [82:43] ==> <this> defined in org.jetbrains.kotlin.backend.common.ir.createSimpleDelegatingConstructorDescriptor[ReceiverParameterDescriptorImpl]

'Annotations' @ [83:43] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [83:55] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'isPrimary' @ [84:43] ==> value-parameter isPrimary: Boolean = ... defined in org.jetbrains.kotlin.backend.common.ir.createSimpleDelegatingConstructorDescriptor[ValueParameterDescriptorImpl]

'NO_SOURCE' @ [85:57] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'superConstructorDescriptor' @ [86:27] ==> value-parameter superConstructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.ir.createSimpleDelegatingConstructorDescriptor[ValueParameterDescriptorImpl]

'valueParameters' @ [86:54] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [86:70] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> ValueParameterDescriptor): List<ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> ValueParameterDescriptor

'it' @ [87:9] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.ir.createSimpleDelegatingConstructorDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [87:12] ==> public abstract fun copy(newOwner: CallableDescriptor, newName: Name, newIndex: Int): ValueParameterDescriptor defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'constructorDescriptor' @ [87:17] ==> val constructorDescriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.backend.common.ir.createSimpleDelegatingConstructorDescriptor[LocalVariableDescriptor]

'it' @ [87:40] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.ir.createSimpleDelegatingConstructorDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [87:43] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'it' @ [87:49] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.ir.createSimpleDelegatingConstructorDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [87:52] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'constructorDescriptor' @ [89:5] ==> val constructorDescriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.backend.common.ir.createSimpleDelegatingConstructorDescriptor[LocalVariableDescriptor]

'initialize' @ [89:27] ==> public open fun initialize(@NotNull p0: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @NotNull p1: Visibility): (ClassConstructorDescriptorImpl..ClassConstructorDescriptorImpl?) defined in org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl[JavaMethodDescriptor]

'valueParameters' @ [89:38] ==> val valueParameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.ir.createSimpleDelegatingConstructorDescriptor[LocalVariableDescriptor]

'superConstructorDescriptor' @ [89:55] ==> value-parameter superConstructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.ir.createSimpleDelegatingConstructorDescriptor[ValueParameterDescriptorImpl]

'visibility' @ [89:82] ==> public final val ClassConstructorDescriptor.visibility: Visibility[MyPropertyDescriptor]

'constructorDescriptor' @ [90:5] ==> val constructorDescriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.backend.common.ir.createSimpleDelegatingConstructorDescriptor[LocalVariableDescriptor]

'returnType' @ [90:27] ==> public final var ClassConstructorDescriptorImpl.returnType: KotlinType[MyPropertyDescriptor]

'superConstructorDescriptor' @ [90:40] ==> value-parameter superConstructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.ir.createSimpleDelegatingConstructorDescriptor[ValueParameterDescriptorImpl]

'returnType' @ [90:67] ==> public final val ClassConstructorDescriptor.returnType: KotlinType[MyPropertyDescriptor]

'constructorDescriptor' @ [91:12] ==> val constructorDescriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.backend.common.ir.createSimpleDelegatingConstructorDescriptor[LocalVariableDescriptor]

'IrConstructorImpl' @ [99:12] ==> public constructor IrConstructorImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ClassConstructorDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrConstructorImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [99:30] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'endOffset' @ [99:43] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'origin' @ [99:54] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.backend.common.ir.addSimpleDelegatingConstructor[ValueParameterDescriptorImpl]

'constructorDescriptor' @ [99:62] ==> value-parameter constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.backend.common.ir.addSimpleDelegatingConstructor[ValueParameterDescriptorImpl]

'also' @ [99:85] ==> @InlineOnly @SinceKotlin public inline fun <T> IrConstructorImpl.also(block: (IrConstructorImpl) -> Unit): IrConstructorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrConstructorImpl

'constructor' @ [100:9] ==> value-parameter constructor: IrConstructorImpl defined in org.jetbrains.kotlin.backend.common.ir.addSimpleDelegatingConstructor.<anonymous>[ValueParameterDescriptorImpl]

'createParameterDeclarations' @ [100:21] ==> public fun IrFunction.createParameterDeclarations(): Unit defined in org.jetbrains.kotlin.ir.util in file IrUtils.kt[SimpleFunctionDescriptorImpl]

'constructor' @ [102:9] ==> value-parameter constructor: IrConstructorImpl defined in org.jetbrains.kotlin.backend.common.ir.addSimpleDelegatingConstructor.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [102:21] ==> public final var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.impl.IrConstructorImpl[DeserializedPropertyDescriptor]

'IrBlockBodyImpl' @ [102:28] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int, statements: List<IrStatement>) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [102:44] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'endOffset' @ [102:57] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'listOf' @ [103:17] ==> public fun <T> listOf(vararg elements: IrExpressionBase): List<IrExpressionBase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpressionBase

'IrDelegatingConstructorCallImpl' @ [104:25] ==> public constructor IrDelegatingConstructorCallImpl(startOffset: Int, endOffset: Int, symbol: IrConstructorSymbol, descriptor: ClassConstructorDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [105:33] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'endOffset' @ [105:46] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'superConstructorSymbol' @ [106:33] ==> value-parameter superConstructorSymbol: IrConstructorSymbol defined in org.jetbrains.kotlin.backend.common.ir.addSimpleDelegatingConstructor[ValueParameterDescriptorImpl]

'superConstructorSymbol' @ [106:57] ==> value-parameter superConstructorSymbol: IrConstructorSymbol defined in org.jetbrains.kotlin.backend.common.ir.addSimpleDelegatingConstructor[ValueParameterDescriptorImpl]

'descriptor' @ [106:80] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol[DeserializedPropertyDescriptor]

'apply' @ [107:27] ==> @InlineOnly public inline fun <T> IrDelegatingConstructorCallImpl.apply(block: IrDelegatingConstructorCallImpl.() -> Unit): IrDelegatingConstructorCallImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDelegatingConstructorCallImpl

'constructor' @ [108:29] ==> value-parameter constructor: IrConstructorImpl defined in org.jetbrains.kotlin.backend.common.ir.addSimpleDelegatingConstructor.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [108:41] ==> public open val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.impl.IrConstructorImpl[DeserializedPropertyDescriptor]

'forEachIndexed' @ [108:57] ==> public inline fun <T> Iterable<IrValueParameter>.forEachIndexed(action: (index: Int, IrValueParameter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameter

'putValueArgument' @ [109:33] ==> public open fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedSimpleFunctionDescriptor]

'idx' @ [109:50] ==> value-parameter idx: Int defined in org.jetbrains.kotlin.backend.common.ir.addSimpleDelegatingConstructor.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'IrGetValueImpl' @ [109:55] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [109:70] ==> public open val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedPropertyDescriptor]

'endOffset' @ [109:83] ==> public open val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedPropertyDescriptor]

'parameter' @ [109:94] ==> value-parameter parameter: IrValueParameter defined in org.jetbrains.kotlin.backend.common.ir.addSimpleDelegatingConstructor.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [109:104] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'IrInstanceInitializerCallImpl' @ [112:25] ==> public constructor IrInstanceInitializerCallImpl(startOffset: Int, endOffset: Int, classSymbol: IrClassSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrInstanceInitializerCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [112:55] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'endOffset' @ [112:68] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'this' @ [112:79] ==> <this> defined in org.jetbrains.kotlin.backend.common.ir.addSimpleDelegatingConstructor[ReceiverParameterDescriptorImpl]

'symbol' @ [112:84] ==> public abstract val symbol: IrClassSymbol defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'this' @ [116:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.ir.addSimpleDelegatingConstructor[ReceiverParameterDescriptorImpl]

'declarations' @ [116:14] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'add' @ [116:27] ==> public abstract fun add(element: IrDeclaration): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'constructor' @ [116:31] ==> value-parameter constructor: IrConstructorImpl defined in org.jetbrains.kotlin.backend.common.ir.addSimpleDelegatingConstructor.<anonymous>[ValueParameterDescriptorImpl]

'ir' @ [124:35] ==> public abstract val ir: Ir<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'symbols' @ [124:38] ==> public abstract val symbols: Symbols<CommonBackendContext> defined in org.jetbrains.kotlin.backend.common.ir.Ir[PropertyDescriptorImpl]

'arrayOf' @ [124:46] ==> public final val arrayOf: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.ir.Symbols[PropertyDescriptorImpl]

'genericArrayOfFunSymbol' @ [125:29] ==> val genericArrayOfFunSymbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[LocalVariableDescriptor]

'descriptor' @ [125:53] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol[DeserializedPropertyDescriptor]

'genericArrayOfFun' @ [126:26] ==> val genericArrayOfFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[LocalVariableDescriptor]

'typeParameters' @ [126:44] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'create' @ [127:43] ==> @NotNull public open fun create(@NotNull p0: (MutableMap<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>..Map<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>)): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'mapOf' @ [127:50] ==> public fun <K, V> mapOf(pair: Pair<(TypeConstructor..TypeConstructor?), TypeProjectionImpl>): Map<(TypeConstructor..TypeConstructor?), TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.types.TypeConstructor..org.jetbrains.kotlin.types.TypeConstructor?)
    <V> -> TypeProjectionImpl

'typeParameter0' @ [127:56] ==> val typeParameter0: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[LocalVariableDescriptor]

'typeConstructor' @ [127:71] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'TypeProjectionImpl' @ [127:90] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'arrayElementType' @ [127:109] ==> value-parameter arrayElementType: KotlinType defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[ValueParameterDescriptorImpl]

'genericArrayOfFun' @ [128:33] ==> val genericArrayOfFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[LocalVariableDescriptor]

'substitute' @ [128:51] ==> @Nullable public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'typeSubstitutor' @ [128:62] ==> val typeSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[LocalVariableDescriptor]

'mapOf' @ [130:25] ==> public fun <K, V> mapOf(pair: Pair<(TypeParameterDescriptor..TypeParameterDescriptor?), KotlinType>): Map<(TypeParameterDescriptor..TypeParameterDescriptor?), KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <V> -> KotlinType

'typeParameter0' @ [130:31] ==> val typeParameter0: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[LocalVariableDescriptor]

'arrayElementType' @ [130:49] ==> value-parameter arrayElementType: KotlinType defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[ValueParameterDescriptorImpl]

'substitutedArrayOfFun' @ [132:27] ==> val substitutedArrayOfFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[LocalVariableDescriptor]

'valueParameters' @ [132:49] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'valueParameter0' @ [133:26] ==> val valueParameter0: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[LocalVariableDescriptor]

'type' @ [133:42] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'valueParameter0' @ [134:33] ==> val valueParameter0: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[LocalVariableDescriptor]

'varargElementType' @ [134:49] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'IrVarargImpl' @ [135:16] ==> public constructor IrVarargImpl(startOffset: Int, endOffset: Int, type: KotlinType, varargElementType: KotlinType, elements: List<IrVarargElement>) defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [135:29] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[ValueParameterDescriptorImpl]

'endOffset' @ [135:42] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[ValueParameterDescriptorImpl]

'arg0VarargType' @ [135:53] ==> val arg0VarargType: KotlinType defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[LocalVariableDescriptor]

'arg0VarargElementType' @ [135:69] ==> val arg0VarargElementType: KotlinType defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[LocalVariableDescriptor]

'arrayElements' @ [135:92] ==> value-parameter arrayElements: List<IrExpression> defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[ValueParameterDescriptorImpl]

'IrCallImpl' @ [137:12] ==> public constructor IrCallImpl(startOffset: Int, endOffset: Int, symbol: IrFunctionSymbol, descriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ..., origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [137:23] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[ValueParameterDescriptorImpl]

'endOffset' @ [137:36] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[ValueParameterDescriptorImpl]

'genericArrayOfFunSymbol' @ [137:47] ==> val genericArrayOfFunSymbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[LocalVariableDescriptor]

'substitutedArrayOfFun' @ [137:72] ==> val substitutedArrayOfFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[LocalVariableDescriptor]

'typeArguments' @ [137:95] ==> val typeArguments: Map<(TypeParameterDescriptor..TypeParameterDescriptor?), KotlinType> defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[LocalVariableDescriptor]

'apply' @ [137:110] ==> @InlineOnly public inline fun <T> IrCallImpl.apply(block: IrCallImpl.() -> Unit): IrCallImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCallImpl

'putValueArgument' @ [138:9] ==> public open fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedSimpleFunctionDescriptor]

'arg0' @ [138:29] ==> val arg0: IrVarargImpl defined in org.jetbrains.kotlin.backend.common.ir.createArrayOfExpression[LocalVariableDescriptor]

