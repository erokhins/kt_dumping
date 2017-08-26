'StatementGeneratorExtension' @ [38:62] ==> public constructor StatementGeneratorExtension(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension[ClassConstructorDescriptorImpl]

'statementGenerator' @ [38:90] ==> value-parameter statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.<init>[ValueParameterDescriptorImpl]

'call' @ [40:26] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[ValueParameterDescriptorImpl]

'descriptor' @ [40:31] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'when (descriptor) {
            is PropertyDescriptor ->
                generatePropertyGetterCall(descriptor, startOffset, endOffset, call)
            is FunctionDescriptor ->
                generateFunctionCall(descriptor, startOffset, endOffset, origin, call)
            else ->
                call.callReceiver.call { _, _ ->
                    generateValueReference(startOffset, endOffset, descriptor, call.original, origin)
                }
        }' @ [42:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'descriptor' @ [42:22] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[LocalVariableDescriptor]

'generatePropertyGetterCall' @ [44:17] ==> private final fun generatePropertyGetterCall(descriptor: PropertyDescriptor, startOffset: Int, endOffset: Int, call: CallBuilder): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [44:44] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[LocalVariableDescriptor]

'startOffset' @ [44:56] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[ValueParameterDescriptorImpl]

'endOffset' @ [44:69] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[ValueParameterDescriptorImpl]

'call' @ [44:80] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[ValueParameterDescriptorImpl]

'generateFunctionCall' @ [46:17] ==> private final fun generateFunctionCall(functionDescriptor: FunctionDescriptor, startOffset: Int, endOffset: Int, origin: IrStatementOrigin?, call: CallBuilder): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [46:38] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[LocalVariableDescriptor]

'startOffset' @ [46:50] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[ValueParameterDescriptorImpl]

'endOffset' @ [46:63] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[ValueParameterDescriptorImpl]

'origin' @ [46:74] ==> value-parameter origin: IrStatementOrigin? = ... defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[ValueParameterDescriptorImpl]

'call' @ [46:82] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[ValueParameterDescriptorImpl]

'call' @ [48:17] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[ValueParameterDescriptorImpl]

'callReceiver' @ [48:22] ==> public final lateinit var callReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'call' @ [48:35] ==> public abstract fun call(withDispatchAndExtensionReceivers: (IntermediateValue?, IntermediateValue?) -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.CallReceiver[SimpleFunctionDescriptorImpl]

'generateValueReference' @ [49:21] ==> public final fun generateValueReference(startOffset: Int, endOffset: Int, descriptor: DeclarationDescriptor, resolvedCall: ResolvedCall<*>?, origin: IrStatementOrigin?): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'startOffset' @ [49:44] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[ValueParameterDescriptorImpl]

'endOffset' @ [49:57] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[ValueParameterDescriptorImpl]

'descriptor' @ [49:68] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[LocalVariableDescriptor]

'call' @ [49:80] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[ValueParameterDescriptorImpl]

'original' @ [49:85] ==> public final val original: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'origin' @ [49:95] ==> value-parameter origin: IrStatementOrigin? = ... defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall[ValueParameterDescriptorImpl]

'when (descriptor) {
                is FakeCallableDescriptorForObject ->
                    generateValueReference(startOffset, endOffset, descriptor.getReferencedDescriptor(), resolvedCall, origin)
                is TypeAliasDescriptor ->
                    generateValueReference(startOffset, endOffset, descriptor.classDescriptor!!, null, origin)
                is ClassDescriptor -> {
                    val classValueType = descriptor.classValueType!!
                    statementGenerator.generateSingletonReference(descriptor, startOffset, endOffset, classValueType)
                }
                is PropertyDescriptor -> {
                    generateCall(startOffset, endOffset, statementGenerator.pregenerateCall(resolvedCall!!))
                }
                is SyntheticFieldDescriptor -> {
                    val receiver = statementGenerator.generateBackingFieldReceiver(startOffset, endOffset, resolvedCall, descriptor)
                    val field = statementGenerator.context.symbolTable.referenceField(descriptor.propertyDescriptor)
                    IrGetFieldImpl(startOffset, endOffset, field, receiver?.load())
                }
                is VariableDescriptor ->
                    generateGetVariable(startOffset, endOffset, descriptor, getTypeArguments(resolvedCall), origin)
                else ->
                    TODO("Unexpected callable descriptor: $descriptor ${descriptor::class.java.simpleName}")
            }' @ [61:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression, entry3: IrExpression, entry4: IrExpression, entry5: IrExpression, entry6: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'descriptor' @ [61:19] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'generateValueReference' @ [63:21] ==> public final fun generateValueReference(startOffset: Int, endOffset: Int, descriptor: DeclarationDescriptor, resolvedCall: ResolvedCall<*>?, origin: IrStatementOrigin?): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'startOffset' @ [63:44] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'endOffset' @ [63:57] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'descriptor' @ [63:68] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'getReferencedDescriptor' @ [63:79] ==> public open fun getReferencedDescriptor(): ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.calls.util.FakeCallableDescriptorForObject[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [63:106] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'origin' @ [63:120] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'generateValueReference' @ [65:21] ==> public final fun generateValueReference(startOffset: Int, endOffset: Int, descriptor: DeclarationDescriptor, resolvedCall: ResolvedCall<*>?, origin: IrStatementOrigin?): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'startOffset' @ [65:44] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'endOffset' @ [65:57] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'descriptor' @ [65:68] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'classDescriptor' @ [65:79] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'origin' @ [65:104] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'descriptor' @ [67:42] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'classValueType' @ [67:53] ==> public val ClassDescriptor.classValueType: KotlinType? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'statementGenerator' @ [68:21] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'generateSingletonReference' @ [68:40] ==> public fun StatementGenerator.generateSingletonReference(descriptor: ClassDescriptor, startOffset: Int, endOffset: Int, type: KotlinType): IrDeclarationReference defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [68:67] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'startOffset' @ [68:79] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'endOffset' @ [68:92] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'classValueType' @ [68:103] ==> val classValueType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[LocalVariableDescriptor]

'generateCall' @ [71:21] ==> public final fun generateCall(startOffset: Int, endOffset: Int, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'startOffset' @ [71:34] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'endOffset' @ [71:47] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'statementGenerator' @ [71:58] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'pregenerateCall' @ [71:77] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [71:93] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'statementGenerator' @ [74:36] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'generateBackingFieldReceiver' @ [74:55] ==> public fun StatementGenerator.generateBackingFieldReceiver(startOffset: Int, endOffset: Int, resolvedCall: ResolvedCall<*>?, fieldDescriptor: SyntheticFieldDescriptor): IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'startOffset' @ [74:84] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'endOffset' @ [74:97] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'resolvedCall' @ [74:108] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'descriptor' @ [74:122] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'statementGenerator' @ [75:33] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'context' @ [75:52] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'symbolTable' @ [75:60] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceField' @ [75:72] ==> public final fun referenceField(descriptor: PropertyDescriptor): IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [75:87] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [75:98] ==> public final val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.descriptors.impl.SyntheticFieldDescriptor[DeserializedPropertyDescriptor]

'IrGetFieldImpl' @ [76:21] ==> public constructor IrGetFieldImpl(startOffset: Int, endOffset: Int, symbol: IrFieldSymbol, receiver: IrExpression?, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetFieldImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [76:36] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'endOffset' @ [76:49] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'field' @ [76:60] ==> val field: IrFieldSymbol defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[LocalVariableDescriptor]

'receiver' @ [76:67] ==> val receiver: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[LocalVariableDescriptor]

'load' @ [76:77] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'generateGetVariable' @ [79:21] ==> private final fun generateGetVariable(startOffset: Int, endOffset: Int, descriptor: VariableDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'startOffset' @ [79:41] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'endOffset' @ [79:54] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'descriptor' @ [79:65] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'getTypeArguments' @ [79:77] ==> public fun getTypeArguments(resolvedCall: ResolvedCall<*>?): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [79:94] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'origin' @ [79:109] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'TODO' @ [81:21] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [81:60] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'descriptor' @ [81:73] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateValueReference[ValueParameterDescriptorImpl]

'java' @ [81:91] ==> public val <T> KClass<out DeclarationDescriptor>.java: Class<out DeclarationDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'simpleName' @ [81:96] ==> public final val <T : (Any..Any?)> Class<out DeclarationDescriptor>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DeclarationDescriptor

'Suppress' @ [91:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'if (descriptor is LocalVariableDescriptor && descriptor.isDelegated) {
                val getterDescriptor = descriptor.getter!!
                val getterSymbol = context.symbolTable.referenceFunction(getterDescriptor.original)
                IrCallImpl(startOffset, endOffset, descriptor.type, getterSymbol, getterDescriptor,
                           typeArguments, origin ?: IrStatementOrigin.GET_LOCAL_PROPERTY)
            }
            else
                IrGetValueImpl(startOffset, endOffset, context.symbolTable.referenceValue(descriptor), origin)' @ [92:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: {IrDeclarationReference & IrExpressionBase}, elseBranch: {IrDeclarationReference & IrExpressionBase}): {IrDeclarationReference & IrExpressionBase}[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> {IrDeclarationReference & IrExpressionBase}

'descriptor' @ [92:17] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateGetVariable[ValueParameterDescriptorImpl]

'descriptor' @ [92:58] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateGetVariable[ValueParameterDescriptorImpl]

'isDelegated' @ [92:69] ==> public open val isDelegated: Boolean defined in org.jetbrains.kotlin.descriptors.impl.LocalVariableDescriptor[JavaPropertyDescriptor]

'descriptor' @ [93:40] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateGetVariable[ValueParameterDescriptorImpl]

'getter' @ [93:51] ==> public open val getter: LocalVariableAccessorDescriptor.Getter? defined in org.jetbrains.kotlin.descriptors.impl.LocalVariableDescriptor[JavaPropertyDescriptor]

'context' @ [94:36] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'symbolTable' @ [94:44] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [94:56] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'getterDescriptor' @ [94:74] ==> val getterDescriptor: LocalVariableAccessorDescriptor.Getter defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateGetVariable[LocalVariableDescriptor]

'original' @ [94:91] ==> public final val LocalVariableAccessorDescriptor.Getter.original: SimpleFunctionDescriptor[MyPropertyDescriptor]

'IrCallImpl' @ [95:17] ==> public constructor IrCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrFunctionSymbol, descriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [95:28] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateGetVariable[ValueParameterDescriptorImpl]

'endOffset' @ [95:41] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateGetVariable[ValueParameterDescriptorImpl]

'descriptor' @ [95:52] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateGetVariable[ValueParameterDescriptorImpl]

'type' @ [95:63] ==> public final val LocalVariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'getterSymbol' @ [95:69] ==> val getterSymbol: IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateGetVariable[LocalVariableDescriptor]

'getterDescriptor' @ [95:83] ==> val getterDescriptor: LocalVariableAccessorDescriptor.Getter defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateGetVariable[LocalVariableDescriptor]

'typeArguments' @ [96:28] ==> value-parameter typeArguments: Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateGetVariable[ValueParameterDescriptorImpl]

'origin' @ [96:43] ==> value-parameter origin: IrStatementOrigin? = ... defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateGetVariable[ValueParameterDescriptorImpl]

'GET_LOCAL_PROPERTY' @ [96:71] ==> public object GET_LOCAL_PROPERTY : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'IrGetValueImpl' @ [99:17] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [99:32] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateGetVariable[ValueParameterDescriptorImpl]

'endOffset' @ [99:45] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateGetVariable[ValueParameterDescriptorImpl]

'context' @ [99:56] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'symbolTable' @ [99:64] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceValue' @ [99:76] ==> public final fun referenceValue(value: ValueDescriptor): IrValueSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [99:91] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateGetVariable[ValueParameterDescriptorImpl]

'origin' @ [99:104] ==> value-parameter origin: IrStatementOrigin? = ... defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateGetVariable[ValueParameterDescriptorImpl]

'call' @ [102:13] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall[ValueParameterDescriptorImpl]

'callReceiver' @ [102:18] ==> public final lateinit var callReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'call' @ [102:31] ==> public abstract fun call(withDispatchAndExtensionReceivers: (IntermediateValue?, IntermediateValue?) -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.CallReceiver[SimpleFunctionDescriptorImpl]

'call' @ [103:34] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall[ValueParameterDescriptorImpl]

'descriptor' @ [103:39] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'AssertionError' @ [104:43] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'call' @ [104:89] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall[ValueParameterDescriptorImpl]

'descriptor' @ [104:94] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'context' @ [105:41] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'symbolTable' @ [105:49] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceConstructor' @ [105:61] ==> public final fun referenceConstructor(descriptor: ClassConstructorDescriptor): IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [105:82] ==> val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall.<anonymous>[LocalVariableDescriptor]

'original' @ [105:93] ==> public final val ClassConstructorDescriptor.original: ClassConstructorDescriptor[MyPropertyDescriptor]

'IrDelegatingConstructorCallImpl' @ [106:30] ==> public constructor IrDelegatingConstructorCallImpl(startOffset: Int, endOffset: Int, symbol: IrConstructorSymbol, descriptor: ClassConstructorDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [106:62] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall[ValueParameterDescriptorImpl]

'endOffset' @ [106:75] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall[ValueParameterDescriptorImpl]

'constructorSymbol' @ [106:86] ==> val constructorSymbol: IrConstructorSymbol defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [106:105] ==> val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall.<anonymous>[LocalVariableDescriptor]

'getTypeArguments' @ [106:117] ==> public fun getTypeArguments(resolvedCall: ResolvedCall<*>?): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'call' @ [106:134] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall[ValueParameterDescriptorImpl]

'original' @ [106:139] ==> public final val original: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'irCall' @ [107:17] ==> val irCall: IrDelegatingConstructorCallImpl defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall.<anonymous>[LocalVariableDescriptor]

'dispatchReceiver' @ [107:24] ==> public open var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedPropertyDescriptor]

'dispatchReceiver' @ [107:43] ==> value-parameter dispatchReceiver: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [107:61] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'irCall' @ [108:17] ==> val irCall: IrDelegatingConstructorCallImpl defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall.<anonymous>[LocalVariableDescriptor]

'extensionReceiver' @ [108:24] ==> public open var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedPropertyDescriptor]

'extensionReceiver' @ [108:44] ==> value-parameter extensionReceiver: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [108:63] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'addParametersToCall' @ [109:17] ==> private final fun addParametersToCall(startOffset: Int, endOffset: Int, call: CallBuilder, irCall: IrFunctionAccessExpression, returnType: KotlinType): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'startOffset' @ [109:37] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall[ValueParameterDescriptorImpl]

'endOffset' @ [109:50] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall[ValueParameterDescriptorImpl]

'call' @ [109:61] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall[ValueParameterDescriptorImpl]

'irCall' @ [109:67] ==> val irCall: IrDelegatingConstructorCallImpl defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [109:75] ==> val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateDelegatingConstructorCall.<anonymous>[LocalVariableDescriptor]

'builtIns' @ [109:86] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'unitType' @ [109:95] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'call' @ [113:37] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall[ValueParameterDescriptorImpl]

'descriptor' @ [113:42] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'constructorDescriptor' @ [114:13] ==> val constructorDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall[LocalVariableDescriptor]

'AssertionError' @ [114:73] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'constructorDescriptor' @ [114:112] ==> val constructorDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall[LocalVariableDescriptor]

'constructorDescriptor' @ [115:31] ==> val constructorDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall[LocalVariableDescriptor]

'containingDeclaration' @ [115:53] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'classDescriptor' @ [116:13] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall[LocalVariableDescriptor]

'kind' @ [116:29] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [116:47] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'AssertionError' @ [116:65] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'classDescriptor' @ [116:115] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall[LocalVariableDescriptor]

'call' @ [118:16] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall[ValueParameterDescriptorImpl]

'callReceiver' @ [118:21] ==> public final lateinit var callReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'call' @ [118:34] ==> public abstract fun call(withDispatchAndExtensionReceivers: (IntermediateValue?, IntermediateValue?) -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.CallReceiver[SimpleFunctionDescriptorImpl]

'dispatchReceiver' @ [119:17] ==> value-parameter dispatchReceiver: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [119:49] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'dispatchReceiver' @ [119:100] ==> value-parameter dispatchReceiver: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall.<anonymous>[ValueParameterDescriptorImpl]

'extensionReceiver' @ [120:17] ==> value-parameter extensionReceiver: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [120:50] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'extensionReceiver' @ [120:102] ==> value-parameter extensionReceiver: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [121:37] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'symbolTable' @ [121:45] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceConstructor' @ [121:57] ==> public final fun referenceConstructor(descriptor: ClassConstructorDescriptor): IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'constructorDescriptor' @ [121:78] ==> val constructorDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall[LocalVariableDescriptor]

'original' @ [121:100] ==> public final val ClassConstructorDescriptor.original: ClassConstructorDescriptor[MyPropertyDescriptor]

'IrEnumConstructorCallImpl' @ [122:26] ==> public constructor IrEnumConstructorCallImpl(startOffset: Int, endOffset: Int, symbol: IrConstructorSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrEnumConstructorCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [122:52] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall[ValueParameterDescriptorImpl]

'endOffset' @ [122:65] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall[ValueParameterDescriptorImpl]

'constructorSymbol' @ [122:76] ==> val constructorSymbol: IrConstructorSymbol defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall.<anonymous>[LocalVariableDescriptor]

'addParametersToCall' @ [123:13] ==> private final fun addParametersToCall(startOffset: Int, endOffset: Int, call: CallBuilder, irCall: IrFunctionAccessExpression, returnType: KotlinType): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'startOffset' @ [123:33] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall[ValueParameterDescriptorImpl]

'endOffset' @ [123:46] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall[ValueParameterDescriptorImpl]

'call' @ [123:57] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall[ValueParameterDescriptorImpl]

'irCall' @ [123:63] ==> val irCall: IrEnumConstructorCallImpl defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall.<anonymous>[LocalVariableDescriptor]

'constructorDescriptor' @ [123:71] ==> val constructorDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateEnumConstructorSuperCall[LocalVariableDescriptor]

'returnType' @ [123:93] ==> public final val ClassConstructorDescriptor.returnType: KotlinType[MyPropertyDescriptor]

'call' @ [133:16] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall[ValueParameterDescriptorImpl]

'callReceiver' @ [133:21] ==> public final lateinit var callReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'call' @ [133:34] ==> public abstract fun call(withDispatchAndExtensionReceivers: (IntermediateValue?, IntermediateValue?) -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.CallReceiver[SimpleFunctionDescriptorImpl]

'call' @ [134:40] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall[ValueParameterDescriptorImpl]

'superQualifier' @ [134:45] ==> public final var superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'let' @ [134:61] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> IrClassSymbol): IrClassSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> IrClassSymbol

'context' @ [134:67] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'symbolTable' @ [134:75] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceClass' @ [134:87] ==> public final fun referenceClass(descriptor: ClassDescriptor): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'it' @ [134:102] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [136:36] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall[ValueParameterDescriptorImpl]

'getter' @ [136:47] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'if (getterDescriptor != null) {
                val getterSymbol = context.symbolTable.referenceFunction(getterDescriptor.original)
                IrGetterCallImpl(
                        startOffset, endOffset,
                        getterSymbol,
                        getterDescriptor,
                        getTypeArguments(call.original),
                        dispatchReceiverValue?.load(),
                        extensionReceiverValue?.load(),
                        IrStatementOrigin.GET_PROPERTY,
                        superQualifierSymbol
                )
            }
            else {
                val fieldSymbol = context.symbolTable.referenceField(descriptor)
                IrGetFieldImpl(
                        startOffset, endOffset,
                        fieldSymbol,
                        dispatchReceiverValue?.load(),
                        IrStatementOrigin.GET_PROPERTY,
                        superQualifierSymbol
                )
            }' @ [137:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'getterDescriptor' @ [137:17] ==> val getterDescriptor: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall.<anonymous>[LocalVariableDescriptor]

'context' @ [138:36] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'symbolTable' @ [138:44] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [138:56] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'getterDescriptor' @ [138:74] ==> val getterDescriptor: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall.<anonymous>[LocalVariableDescriptor]

'original' @ [138:91] ==> public final val PropertyGetterDescriptor.original: PropertyGetterDescriptor[MyPropertyDescriptor]

'IrGetterCallImpl' @ [139:17] ==> public constructor IrGetterCallImpl(startOffset: Int, endOffset: Int, symbol: IrFunctionSymbol, descriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, dispatchReceiver: IrExpression?, extensionReceiver: IrExpression?, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetterCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [140:25] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall[ValueParameterDescriptorImpl]

'endOffset' @ [140:38] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall[ValueParameterDescriptorImpl]

'getterSymbol' @ [141:25] ==> val getterSymbol: IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall.<anonymous>[LocalVariableDescriptor]

'getterDescriptor' @ [142:25] ==> val getterDescriptor: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall.<anonymous>[LocalVariableDescriptor]

'getTypeArguments' @ [143:25] ==> public fun getTypeArguments(resolvedCall: ResolvedCall<*>?): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'call' @ [143:42] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall[ValueParameterDescriptorImpl]

'original' @ [143:47] ==> public final val original: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'dispatchReceiverValue' @ [144:25] ==> value-parameter dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [144:48] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'extensionReceiverValue' @ [145:25] ==> value-parameter extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [145:49] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'GET_PROPERTY' @ [146:43] ==> public object GET_PROPERTY : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'superQualifierSymbol' @ [147:25] ==> val superQualifierSymbol: IrClassSymbol? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall.<anonymous>[LocalVariableDescriptor]

'context' @ [151:35] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'symbolTable' @ [151:43] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceField' @ [151:55] ==> public final fun referenceField(descriptor: PropertyDescriptor): IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [151:70] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall[ValueParameterDescriptorImpl]

'IrGetFieldImpl' @ [152:17] ==> public constructor IrGetFieldImpl(startOffset: Int, endOffset: Int, symbol: IrFieldSymbol, receiver: IrExpression?, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetFieldImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [153:25] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall[ValueParameterDescriptorImpl]

'endOffset' @ [153:38] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall[ValueParameterDescriptorImpl]

'fieldSymbol' @ [154:25] ==> val fieldSymbol: IrFieldSymbol defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall.<anonymous>[LocalVariableDescriptor]

'dispatchReceiverValue' @ [155:25] ==> value-parameter dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [155:48] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'GET_PROPERTY' @ [156:43] ==> public object GET_PROPERTY : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'superQualifierSymbol' @ [157:25] ==> val superQualifierSymbol: IrClassSymbol? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generatePropertyGetterCall.<anonymous>[LocalVariableDescriptor]

'call' @ [170:13] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall[ValueParameterDescriptorImpl]

'callReceiver' @ [170:18] ==> public final lateinit var callReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'call' @ [170:31] ==> public abstract fun call(withDispatchAndExtensionReceivers: (IntermediateValue?, IntermediateValue?) -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.CallReceiver[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [171:34] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall[ValueParameterDescriptorImpl]

'returnType' @ [171:53] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'context' @ [172:38] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'symbolTable' @ [172:46] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [172:58] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [172:76] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall[ValueParameterDescriptorImpl]

'original' @ [172:95] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'call' @ [173:44] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall[ValueParameterDescriptorImpl]

'superQualifier' @ [173:49] ==> public final var superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'let' @ [173:65] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> IrClassSymbol): IrClassSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> IrClassSymbol

'context' @ [173:71] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'symbolTable' @ [173:79] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceClass' @ [173:91] ==> public final fun referenceClass(descriptor: ClassDescriptor): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'it' @ [173:106] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'IrCallImpl' @ [174:30] ==> public constructor IrCallImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrFunctionSymbol, descriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [175:25] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall[ValueParameterDescriptorImpl]

'endOffset' @ [175:38] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall[ValueParameterDescriptorImpl]

'returnType' @ [176:25] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall.<anonymous>[LocalVariableDescriptor]

'functionSymbol' @ [177:25] ==> val functionSymbol: IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall.<anonymous>[LocalVariableDescriptor]

'functionDescriptor' @ [178:25] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall[ValueParameterDescriptorImpl]

'getTypeArguments' @ [179:25] ==> public fun getTypeArguments(resolvedCall: ResolvedCall<*>?): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'call' @ [179:42] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall[ValueParameterDescriptorImpl]

'original' @ [179:47] ==> public final val original: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'origin' @ [180:25] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall[ValueParameterDescriptorImpl]

'superQualifierSymbol' @ [181:25] ==> val superQualifierSymbol: IrClassSymbol? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall.<anonymous>[LocalVariableDescriptor]

'irCall' @ [183:17] ==> val irCall: IrCallImpl defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall.<anonymous>[LocalVariableDescriptor]

'dispatchReceiver' @ [183:24] ==> public open var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'dispatchReceiverValue' @ [183:43] ==> value-parameter dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [183:66] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'irCall' @ [184:17] ==> val irCall: IrCallImpl defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall.<anonymous>[LocalVariableDescriptor]

'extensionReceiver' @ [184:24] ==> public open var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'extensionReceiverValue' @ [184:44] ==> value-parameter extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [184:68] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'addParametersToCall' @ [186:17] ==> private final fun addParametersToCall(startOffset: Int, endOffset: Int, call: CallBuilder, irCall: IrFunctionAccessExpression, returnType: KotlinType): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'startOffset' @ [186:37] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall[ValueParameterDescriptorImpl]

'endOffset' @ [186:50] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall[ValueParameterDescriptorImpl]

'call' @ [186:61] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall[ValueParameterDescriptorImpl]

'irCall' @ [186:67] ==> val irCall: IrCallImpl defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall.<anonymous>[LocalVariableDescriptor]

'returnType' @ [186:75] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall.<anonymous>[LocalVariableDescriptor]

'if (call.isValueArgumentReorderingRequired()) {
                generateCallWithArgumentReordering(irCall, startOffset, endOffset, call, returnType)
            }
            else {
                val valueArguments = call.getValueArgumentsInParameterOrder()
                for ((index, valueArgument) in valueArguments.withIndex()) {
                    irCall.putValueArgument(index, valueArgument)
                }
                irCall
            }' @ [190:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'call' @ [190:17] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.addParametersToCall[ValueParameterDescriptorImpl]

'isValueArgumentReorderingRequired' @ [190:22] ==> public fun CallBuilder.isValueArgumentReorderingRequired(): Boolean defined in org.jetbrains.kotlin.psi2ir.intermediate[SimpleFunctionDescriptorImpl]

'generateCallWithArgumentReordering' @ [191:17] ==> private final fun generateCallWithArgumentReordering(irCall: IrFunctionAccessExpression, startOffset: Int, endOffset: Int, call: CallBuilder, resultType: KotlinType): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'irCall' @ [191:52] ==> value-parameter irCall: IrFunctionAccessExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.addParametersToCall[ValueParameterDescriptorImpl]

'startOffset' @ [191:60] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.addParametersToCall[ValueParameterDescriptorImpl]

'endOffset' @ [191:73] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.addParametersToCall[ValueParameterDescriptorImpl]

'call' @ [191:84] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.addParametersToCall[ValueParameterDescriptorImpl]

'returnType' @ [191:90] ==> value-parameter returnType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.addParametersToCall[ValueParameterDescriptorImpl]

'call' @ [194:38] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.addParametersToCall[ValueParameterDescriptorImpl]

'getValueArgumentsInParameterOrder' @ [194:43] ==> public fun CallBuilder.getValueArgumentsInParameterOrder(): List<IrExpression?> defined in org.jetbrains.kotlin.psi2ir.intermediate[SimpleFunctionDescriptorImpl]

'component1' @ [195:23] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [195:30] ==> public final operator fun component2(): IrExpression? defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'valueArguments' @ [195:48] ==> val valueArguments: List<IrExpression?> defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.addParametersToCall[LocalVariableDescriptor]

'withIndex' @ [195:63] ==> public fun <T> Iterable<IrExpression?>.withIndex(): Iterable<IndexedValue<IrExpression?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression?

'irCall' @ [196:21] ==> value-parameter irCall: IrFunctionAccessExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.addParametersToCall[ValueParameterDescriptorImpl]

'putValueArgument' @ [196:28] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrFunctionAccessExpression[DeserializedSimpleFunctionDescriptor]

'index' @ [196:45] ==> val index: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.addParametersToCall[LocalVariableDescriptor]

'valueArgument' @ [196:52] ==> val valueArgument: IrExpression? defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.addParametersToCall[LocalVariableDescriptor]

'irCall' @ [198:17] ==> value-parameter irCall: IrFunctionAccessExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.addParametersToCall[ValueParameterDescriptorImpl]

'call' @ [208:28] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[ValueParameterDescriptorImpl]

'original' @ [208:33] ==> public final val original: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'resolvedCall' @ [210:47] ==> val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'valueArguments' @ [210:60] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'values' @ [210:75] ==> public abstract val values: MutableCollection<(ResolvedValueArgument..ResolvedValueArgument?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'resolvedCall' @ [211:31] ==> val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'resultingDescriptor' @ [211:44] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'valueParameters' @ [211:64] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'IrBlockImpl' @ [213:23] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [213:35] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[ValueParameterDescriptorImpl]

'endOffset' @ [213:48] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[ValueParameterDescriptorImpl]

'resultType' @ [213:59] ==> value-parameter resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[ValueParameterDescriptorImpl]

'ARGUMENTS_REORDERING_FOR_CALL' @ [213:89] ==> public object ARGUMENTS_REORDERING_FOR_CALL : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'HashMap' @ [215:47] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ResolvedValueArgument
    <V : (Any..Any?)> -> ValueParameterDescriptor

'component1' @ [216:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [216:22] ==> public final operator fun component2(): (ResolvedValueArgument..ResolvedValueArgument?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [216:40] ==> val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'valueArgumentsByIndex' @ [216:53] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.valueArgumentsByIndex: (MutableList<(ResolvedValueArgument..ResolvedValueArgument?)>?..List<(ResolvedValueArgument..ResolvedValueArgument?)>?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'withIndex' @ [216:77] ==> public fun <T> Iterable<(ResolvedValueArgument..ResolvedValueArgument?)>.withIndex(): Iterable<IndexedValue<(ResolvedValueArgument..ResolvedValueArgument?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'valueParameters' @ [217:34] ==> val valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'index' @ [217:50] ==> val index: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'valueArgumentsToValueParameters' @ [218:13] ==> val valueArgumentsToValueParameters: HashMap<ResolvedValueArgument, ValueParameterDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'valueArgument' @ [218:45] ==> val valueArgument: (ResolvedValueArgument..ResolvedValueArgument?) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'valueParameter' @ [218:62] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'HashMap' @ [221:32] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ValueParameterDescriptor
    <V : (Any..Any?)> -> IntermediateValue

'valueArgumentsInEvaluationOrder' @ [223:31] ==> val valueArgumentsInEvaluationOrder: MutableCollection<(ResolvedValueArgument..ResolvedValueArgument?)> defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'valueArgumentsToValueParameters' @ [224:34] ==> val valueArgumentsToValueParameters: HashMap<ResolvedValueArgument, ValueParameterDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'valueArgument' @ [224:66] ==> val valueArgument: (ResolvedValueArgument..ResolvedValueArgument?) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'call' @ [225:30] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[ValueParameterDescriptorImpl]

'getValueArgument' @ [225:35] ==> public final fun getValueArgument(valueParameterDescriptor: ValueParameterDescriptor): IrExpression? defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[SimpleFunctionDescriptorImpl]

'valueParameter' @ [225:52] ==> val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'scope' @ [226:35] ==> public open val scope: Scope defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[PropertyDescriptorImpl]

'createTemporaryVariableInBlock' @ [226:41] ==> public fun Scope.createTemporaryVariableInBlock(irExpression: IrExpression, block: IrContainerExpressionBase, nameHint: String? = ...): IntermediateValue defined in org.jetbrains.kotlin.psi2ir.intermediate in file RematerializableValue.kt[SimpleFunctionDescriptorImpl]

'irArgument' @ [226:72] ==> val irArgument: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'irBlock' @ [226:84] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'valueParameter' @ [226:93] ==> val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'name' @ [226:108] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [226:113] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'irArgumentValues' @ [227:13] ==> val irArgumentValues: HashMap<ValueParameterDescriptor, IntermediateValue> defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'valueParameter' @ [227:30] ==> val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'irArgumentValue' @ [227:48] ==> val irArgumentValue: IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'resolvedCall' @ [230:9] ==> val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'valueArgumentsByIndex' @ [230:22] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.valueArgumentsByIndex: (MutableList<(ResolvedValueArgument..ResolvedValueArgument?)>?..List<(ResolvedValueArgument..ResolvedValueArgument?)>?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'forEachIndexed' @ [230:46] ==> public inline fun <T> Iterable<(ResolvedValueArgument..ResolvedValueArgument?)>.forEachIndexed(action: (index: Int, (ResolvedValueArgument..ResolvedValueArgument?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'valueParameters' @ [231:34] ==> val valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'index' @ [231:50] ==> value-parameter index: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering.<anonymous>[ValueParameterDescriptorImpl]

'irCall' @ [232:13] ==> value-parameter irCall: IrFunctionAccessExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[ValueParameterDescriptorImpl]

'putValueArgument' @ [232:20] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrFunctionAccessExpression[DeserializedSimpleFunctionDescriptor]

'index' @ [232:37] ==> value-parameter index: Int defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering.<anonymous>[ValueParameterDescriptorImpl]

'irArgumentValues' @ [232:44] ==> val irArgumentValues: HashMap<ValueParameterDescriptor, IntermediateValue> defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'valueParameter' @ [232:61] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering.<anonymous>[LocalVariableDescriptor]

'load' @ [232:78] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'irBlock' @ [235:9] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'statements' @ [235:17] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedPropertyDescriptor]

'add' @ [235:28] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irCall' @ [235:32] ==> value-parameter irCall: IrFunctionAccessExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[ValueParameterDescriptorImpl]

'irBlock' @ [237:16] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCallWithArgumentReordering[LocalVariableDescriptor]

'generateCall' @ [242:9] ==> public final fun generateCall(startOffset: Int, endOffset: Int, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'ktElement' @ [242:22] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.generateCall[ValueParameterDescriptorImpl]

'startOffset' @ [242:32] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktElement' @ [242:45] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.generateCall[ValueParameterDescriptorImpl]

'endOffset' @ [242:55] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'call' @ [242:66] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.generateCall[ValueParameterDescriptorImpl]

'origin' @ [242:72] ==> value-parameter origin: IrStatementOrigin? = ... defined in org.jetbrains.kotlin.psi2ir.generators.generateCall[ValueParameterDescriptorImpl]

'generateCall' @ [245:9] ==> public final fun generateCall(startOffset: Int, endOffset: Int, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'irExpression' @ [245:22] ==> value-parameter irExpression: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.generateCall[ValueParameterDescriptorImpl]

'startOffset' @ [245:35] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'irExpression' @ [245:48] ==> value-parameter irExpression: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.generateCall[ValueParameterDescriptorImpl]

'endOffset' @ [245:61] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'call' @ [245:72] ==> value-parameter call: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.generateCall[ValueParameterDescriptorImpl]

'origin' @ [245:78] ==> value-parameter origin: IrStatementOrigin? = ... defined in org.jetbrains.kotlin.psi2ir.generators.generateCall[ValueParameterDescriptorImpl]

