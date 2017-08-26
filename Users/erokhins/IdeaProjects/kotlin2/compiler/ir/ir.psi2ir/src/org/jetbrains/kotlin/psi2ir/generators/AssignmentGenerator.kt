'StatementGeneratorExtension' @ [37:69] ==> public constructor StatementGeneratorExtension(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension[ClassConstructorDescriptorImpl]

'statementGenerator' @ [37:97] ==> value-parameter statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.<init>[ValueParameterDescriptorImpl]

'expression' @ [39:22] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignment[ValueParameterDescriptorImpl]

'left' @ [39:33] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'statementGenerator' @ [40:21] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'generateExpression' @ [40:40] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [40:59] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignment[ValueParameterDescriptorImpl]

'right' @ [40:70] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'generateAssignmentReceiver' @ [41:36] ==> public final fun generateAssignmentReceiver(ktLeft: KtExpression, origin: IrStatementOrigin): AssignmentReceiver defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[SimpleFunctionDescriptorImpl]

'ktLeft' @ [41:63] ==> val ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignment[LocalVariableDescriptor]

'EQ' @ [41:89] ==> public object EQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'irAssignmentReceiver' @ [42:16] ==> val irAssignmentReceiver: AssignmentReceiver defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignment[LocalVariableDescriptor]

'assign' @ [42:37] ==> public open fun assign(value: IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.AssignmentReceiver[SimpleFunctionDescriptorImpl]

'irRhs' @ [42:44] ==> val irRhs: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignment[LocalVariableDescriptor]

'getResolvedCall' @ [46:30] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [46:46] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment[ValueParameterDescriptorImpl]

'get' @ [47:34] ==> public fun <K, V : Any> Generator.get(slice: ReadOnlySlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>, key: (KtExpression..KtExpression?)): Boolean? defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : Any> -> (kotlin.Boolean..kotlin.Boolean?)

'VARIABLE_REASSIGNMENT' @ [47:53] ==> public final val VARIABLE_REASSIGNMENT: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [47:76] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment[ValueParameterDescriptorImpl]

'expression' @ [48:22] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment[ValueParameterDescriptorImpl]

'left' @ [48:33] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'expression' @ [49:23] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment[ValueParameterDescriptorImpl]

'right' @ [49:34] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'generateAssignmentReceiver' @ [50:36] ==> public final fun generateAssignmentReceiver(ktLeft: KtExpression, origin: IrStatementOrigin): AssignmentReceiver defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[SimpleFunctionDescriptorImpl]

'ktLeft' @ [50:63] ==> val ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment[LocalVariableDescriptor]

'origin' @ [50:71] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment[ValueParameterDescriptorImpl]

'irAssignmentReceiver' @ [52:16] ==> val irAssignmentReceiver: AssignmentReceiver defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment[LocalVariableDescriptor]

'assign' @ [52:37] ==> public abstract fun assign(withLValue: (LValue) -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.AssignmentReceiver[SimpleFunctionDescriptorImpl]

'statementGenerator' @ [53:26] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'pregenerateCallReceivers' @ [53:45] ==> public fun StatementGenerator.pregenerateCallReceivers(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'opResolvedCall' @ [53:70] ==> val opResolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment[LocalVariableDescriptor]

'opCall' @ [54:13] ==> val opCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment.<anonymous>[LocalVariableDescriptor]

'setExplicitReceiverValue' @ [54:20] ==> public fun CallBuilder.setExplicitReceiverValue(explicitReceiverValue: IntermediateValue): Unit defined in org.jetbrains.kotlin.psi2ir.intermediate in file CallBuilder.kt[SimpleFunctionDescriptorImpl]

'irLValue' @ [54:45] ==> value-parameter irLValue: LValue defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment.<anonymous>[ValueParameterDescriptorImpl]

'opCall' @ [55:13] ==> val opCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment.<anonymous>[LocalVariableDescriptor]

'irValueArgumentsByIndex' @ [55:20] ==> public final val irValueArgumentsByIndex: Array<IrExpression?> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'statementGenerator' @ [55:49] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'generateExpression' @ [55:68] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktRight' @ [55:87] ==> val ktRight: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment[LocalVariableDescriptor]

'CallGenerator' @ [56:28] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [56:42] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'generateCall' @ [56:62] ==> public fun CallGenerator.generateCall(ktElement: KtElement, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators in file CallGenerator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [56:75] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment[ValueParameterDescriptorImpl]

'opCall' @ [56:87] ==> val opCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment.<anonymous>[LocalVariableDescriptor]

'origin' @ [56:95] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment[ValueParameterDescriptorImpl]

'if (isSimpleAssignment) {
                // Set( Op( Get(), RHS ) )
                irLValue.store(irOpCall)
            }
            else {
                // Op( Get(), RHS )
                irOpCall
            }' @ [58:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'isSimpleAssignment' @ [58:17] ==> val isSimpleAssignment: Boolean defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment[LocalVariableDescriptor]

'irLValue' @ [60:17] ==> value-parameter irLValue: LValue defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment.<anonymous>[ValueParameterDescriptorImpl]

'store' @ [60:26] ==> public abstract fun store(irExpression: IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.LValue[SimpleFunctionDescriptorImpl]

'irOpCall' @ [60:32] ==> val irOpCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment.<anonymous>[LocalVariableDescriptor]

'irOpCall' @ [64:17] ==> val irOpCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment.<anonymous>[LocalVariableDescriptor]

'getResolvedCall' @ [70:30] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [70:46] ==> value-parameter expression: KtPrefixExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement[ValueParameterDescriptorImpl]

'expression' @ [71:32] ==> value-parameter expression: KtPrefixExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement[ValueParameterDescriptorImpl]

'baseExpression' @ [71:43] ==> public final val KtPrefixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'generateAssignmentReceiver' @ [72:36] ==> public final fun generateAssignmentReceiver(ktLeft: KtExpression, origin: IrStatementOrigin): AssignmentReceiver defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[SimpleFunctionDescriptorImpl]

'ktBaseExpression' @ [72:63] ==> val ktBaseExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement[LocalVariableDescriptor]

'origin' @ [72:81] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement[ValueParameterDescriptorImpl]

'irAssignmentReceiver' @ [74:16] ==> val irAssignmentReceiver: AssignmentReceiver defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement[LocalVariableDescriptor]

'assign' @ [74:37] ==> public abstract fun assign(withLValue: (LValue) -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.AssignmentReceiver[SimpleFunctionDescriptorImpl]

'irBlock' @ [75:13] ==> public inline fun GeneratorWithScope.irBlock(ktElement: KtElement?, origin: IrStatementOrigin? = ..., resultType: KotlinType? = ..., body: IrBlockBuilder.() -> Unit): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [75:21] ==> value-parameter expression: KtPrefixExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement[ValueParameterDescriptorImpl]

'origin' @ [75:33] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement[ValueParameterDescriptorImpl]

'irLValue' @ [75:41] ==> value-parameter irLValue: LValue defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [75:50] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.psi2ir.intermediate.LValue[PropertyDescriptorImpl]

'statementGenerator' @ [76:30] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'pregenerateCall' @ [76:49] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'opResolvedCall' @ [76:65] ==> val opResolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement[LocalVariableDescriptor]

'opCall' @ [77:17] ==> val opCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement.<anonymous>.<anonymous>[LocalVariableDescriptor]

'setExplicitReceiverValue' @ [77:24] ==> public fun CallBuilder.setExplicitReceiverValue(explicitReceiverValue: IntermediateValue): Unit defined in org.jetbrains.kotlin.psi2ir.intermediate in file CallBuilder.kt[SimpleFunctionDescriptorImpl]

'irLValue' @ [77:49] ==> value-parameter irLValue: LValue defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement.<anonymous>[ValueParameterDescriptorImpl]

'CallGenerator' @ [78:32] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [78:46] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'generateCall' @ [78:66] ==> public fun CallGenerator.generateCall(ktElement: KtElement, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators in file CallGenerator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [78:79] ==> value-parameter expression: KtPrefixExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement[ValueParameterDescriptorImpl]

'opCall' @ [78:91] ==> val opCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement.<anonymous>.<anonymous>[LocalVariableDescriptor]

'origin' @ [78:99] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement[ValueParameterDescriptorImpl]

'+' @ [79:17] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[DeserializedSimpleFunctionDescriptor]

'irLValue' @ [79:18] ==> value-parameter irLValue: LValue defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement.<anonymous>[ValueParameterDescriptorImpl]

'store' @ [79:27] ==> public abstract fun store(irExpression: IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.LValue[SimpleFunctionDescriptorImpl]

'irOpCall' @ [79:33] ==> val irOpCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement.<anonymous>.<anonymous>[LocalVariableDescriptor]

'+' @ [80:17] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[DeserializedSimpleFunctionDescriptor]

'irLValue' @ [80:18] ==> value-parameter irLValue: LValue defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePrefixIncrementDecrement.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [80:27] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.LValue[SimpleFunctionDescriptorImpl]

'getResolvedCall' @ [86:30] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [86:46] ==> value-parameter expression: KtPostfixExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement[ValueParameterDescriptorImpl]

'expression' @ [87:32] ==> value-parameter expression: KtPostfixExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement[ValueParameterDescriptorImpl]

'baseExpression' @ [87:43] ==> public final val KtPostfixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'generateAssignmentReceiver' @ [88:36] ==> public final fun generateAssignmentReceiver(ktLeft: KtExpression, origin: IrStatementOrigin): AssignmentReceiver defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[SimpleFunctionDescriptorImpl]

'ktBaseExpression' @ [88:63] ==> val ktBaseExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement[LocalVariableDescriptor]

'origin' @ [88:81] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement[ValueParameterDescriptorImpl]

'irAssignmentReceiver' @ [90:16] ==> val irAssignmentReceiver: AssignmentReceiver defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement[LocalVariableDescriptor]

'assign' @ [90:37] ==> public abstract fun assign(withLValue: (LValue) -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.AssignmentReceiver[SimpleFunctionDescriptorImpl]

'irBlock' @ [91:13] ==> public inline fun GeneratorWithScope.irBlock(ktElement: KtElement?, origin: IrStatementOrigin? = ..., resultType: KotlinType? = ..., body: IrBlockBuilder.() -> Unit): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [91:21] ==> value-parameter expression: KtPostfixExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement[ValueParameterDescriptorImpl]

'origin' @ [91:33] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement[ValueParameterDescriptorImpl]

'irLValue' @ [91:41] ==> value-parameter irLValue: LValue defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [91:50] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.psi2ir.intermediate.LValue[PropertyDescriptorImpl]

'irTemporary' @ [92:33] ==> public fun <T : IrElement> IrStatementsBuilder<IrBlock>.irTemporary(value: IrExpression, nameHint: String? = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrBlock

'irLValue' @ [92:45] ==> value-parameter irLValue: LValue defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement.<anonymous>[ValueParameterDescriptorImpl]

'load' @ [92:54] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.LValue[SimpleFunctionDescriptorImpl]

'statementGenerator' @ [93:30] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'pregenerateCall' @ [93:49] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'opResolvedCall' @ [93:65] ==> val opResolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement[LocalVariableDescriptor]

'opCall' @ [94:17] ==> val opCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement.<anonymous>.<anonymous>[LocalVariableDescriptor]

'setExplicitReceiverValue' @ [94:24] ==> public fun CallBuilder.setExplicitReceiverValue(explicitReceiverValue: IntermediateValue): Unit defined in org.jetbrains.kotlin.psi2ir.intermediate in file CallBuilder.kt[SimpleFunctionDescriptorImpl]

'VariableLValue' @ [94:49] ==> public constructor VariableLValue(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.psi2ir.intermediate.VariableLValue[ClassConstructorDescriptorImpl]

'startOffset' @ [94:64] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[DeserializedPropertyDescriptor]

'endOffset' @ [94:77] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[DeserializedPropertyDescriptor]

'temporary' @ [94:88] ==> val temporary: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement.<anonymous>.<anonymous>[LocalVariableDescriptor]

'symbol' @ [94:98] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'CallGenerator' @ [95:32] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [95:46] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'generateCall' @ [95:66] ==> public fun CallGenerator.generateCall(ktElement: KtElement, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators in file CallGenerator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [95:79] ==> value-parameter expression: KtPostfixExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement[ValueParameterDescriptorImpl]

'opCall' @ [95:91] ==> val opCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement.<anonymous>.<anonymous>[LocalVariableDescriptor]

'origin' @ [95:99] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement[ValueParameterDescriptorImpl]

'+' @ [96:17] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[DeserializedSimpleFunctionDescriptor]

'irLValue' @ [96:18] ==> value-parameter irLValue: LValue defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement.<anonymous>[ValueParameterDescriptorImpl]

'store' @ [96:27] ==> public abstract fun store(irExpression: IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.LValue[SimpleFunctionDescriptorImpl]

'irOpCall' @ [96:33] ==> val irOpCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement.<anonymous>.<anonymous>[LocalVariableDescriptor]

'+' @ [97:17] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBuilder[DeserializedSimpleFunctionDescriptor]

'irGet' @ [97:18] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'temporary' @ [97:24] ==> val temporary: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generatePostfixIncrementDecrement.<anonymous>.<anonymous>[LocalVariableDescriptor]

'symbol' @ [97:34] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'ktLeft' @ [103:13] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'generateArrayAccessAssignmentReceiver' @ [104:20] ==> private final fun generateArrayAccessAssignmentReceiver(ktLeft: KtArrayAccessExpression, origin: IrStatementOrigin): ArrayAccessAssignmentReceiver defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[SimpleFunctionDescriptorImpl]

'ktLeft' @ [104:58] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'origin' @ [104:66] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'getResolvedCall' @ [107:28] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'ktLeft' @ [107:44] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'TODO' @ [107:55] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [108:26] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[LocalVariableDescriptor]

'resultingDescriptor' @ [108:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'when (descriptor) {
            is SyntheticFieldDescriptor -> {
                val receiverValue = statementGenerator.generateBackingFieldReceiver(ktLeft.startOffset, ktLeft.endOffset, resolvedCall, descriptor)
                createBackingFieldLValue(ktLeft, descriptor.propertyDescriptor, receiverValue, origin)
            }
            is LocalVariableDescriptor ->
                @Suppress("DEPRECATION")
                if (descriptor.isDelegated)
                    DelegatedLocalPropertyLValue(
                            ktLeft.startOffset, ktLeft.endOffset,
                            descriptor.type,
                            descriptor.getter?.let { context.symbolTable.referenceDeclaredFunction(it) },
                            descriptor.setter?.let { context.symbolTable.referenceDeclaredFunction(it) },
                            origin
                    )
                else
                    VariableLValue(
                            ktLeft.startOffset, ktLeft.endOffset,
                            context.symbolTable.referenceVariable(descriptor),
                            origin
                    )
            is PropertyDescriptor ->
                generateAssignmentReceiverForProperty(descriptor, origin, ktLeft, resolvedCall)
            is ValueDescriptor ->
                VariableLValue(
                        ktLeft.startOffset, ktLeft.endOffset,
                        context.symbolTable.referenceValue(descriptor),
                        origin
                )
            else ->
                OnceExpressionValue(statementGenerator.generateExpression(ktLeft))
        }' @ [110:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: AssignmentReceiver, entry1: AssignmentReceiver, entry2: AssignmentReceiver, entry3: AssignmentReceiver, entry4: AssignmentReceiver): AssignmentReceiver[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> AssignmentReceiver

'descriptor' @ [110:22] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[LocalVariableDescriptor]

'statementGenerator' @ [112:37] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'generateBackingFieldReceiver' @ [112:56] ==> public fun StatementGenerator.generateBackingFieldReceiver(startOffset: Int, endOffset: Int, resolvedCall: ResolvedCall<*>?, fieldDescriptor: SyntheticFieldDescriptor): IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'ktLeft' @ [112:85] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'startOffset' @ [112:92] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktLeft' @ [112:105] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'endOffset' @ [112:112] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'resolvedCall' @ [112:123] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[LocalVariableDescriptor]

'descriptor' @ [112:137] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[LocalVariableDescriptor]

'createBackingFieldLValue' @ [113:17] ==> private final fun createBackingFieldLValue(ktExpression: KtExpression, descriptor: PropertyDescriptor, receiverValue: IntermediateValue?, origin: IrStatementOrigin?): BackingFieldLValue defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[SimpleFunctionDescriptorImpl]

'ktLeft' @ [113:42] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'descriptor' @ [113:50] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[LocalVariableDescriptor]

'propertyDescriptor' @ [113:61] ==> public final val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.descriptors.impl.SyntheticFieldDescriptor[DeserializedPropertyDescriptor]

'receiverValue' @ [113:81] ==> val receiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[LocalVariableDescriptor]

'origin' @ [113:96] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'Suppress' @ [116:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'if (descriptor.isDelegated)
                    DelegatedLocalPropertyLValue(
                            ktLeft.startOffset, ktLeft.endOffset,
                            descriptor.type,
                            descriptor.getter?.let { context.symbolTable.referenceDeclaredFunction(it) },
                            descriptor.setter?.let { context.symbolTable.referenceDeclaredFunction(it) },
                            origin
                    )
                else
                    VariableLValue(
                            ktLeft.startOffset, ktLeft.endOffset,
                            context.symbolTable.referenceVariable(descriptor),
                            origin
                    )' @ [117:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AssignmentReceiver, elseBranch: AssignmentReceiver): AssignmentReceiver[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AssignmentReceiver

'descriptor' @ [117:21] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[LocalVariableDescriptor]

'isDelegated' @ [117:32] ==> public open val isDelegated: Boolean defined in org.jetbrains.kotlin.descriptors.impl.LocalVariableDescriptor[JavaPropertyDescriptor]

'DelegatedLocalPropertyLValue' @ [118:21] ==> public constructor DelegatedLocalPropertyLValue(startOffset: Int, endOffset: Int, type: KotlinType, getterSymbol: IrSimpleFunctionSymbol?, setterSymbol: IrSimpleFunctionSymbol?, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.psi2ir.intermediate.DelegatedLocalPropertyLValue[ClassConstructorDescriptorImpl]

'ktLeft' @ [119:29] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'startOffset' @ [119:36] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktLeft' @ [119:49] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'endOffset' @ [119:56] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'descriptor' @ [120:29] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[LocalVariableDescriptor]

'type' @ [120:40] ==> public final val LocalVariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'descriptor' @ [121:29] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[LocalVariableDescriptor]

'getter' @ [121:40] ==> public open val getter: LocalVariableAccessorDescriptor.Getter? defined in org.jetbrains.kotlin.descriptors.impl.LocalVariableDescriptor[JavaPropertyDescriptor]

'let' @ [121:48] ==> @InlineOnly public inline fun <T, R> LocalVariableAccessorDescriptor.Getter.let(block: (LocalVariableAccessorDescriptor.Getter) -> IrSimpleFunctionSymbol): IrSimpleFunctionSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Getter
    <R> -> IrSimpleFunctionSymbol

'context' @ [121:54] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'symbolTable' @ [121:62] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceDeclaredFunction' @ [121:74] ==> public final fun referenceDeclaredFunction(descriptor: FunctionDescriptor): IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'it' @ [121:100] ==> value-parameter it: LocalVariableAccessorDescriptor.Getter defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [122:29] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[LocalVariableDescriptor]

'setter' @ [122:40] ==> public open val setter: LocalVariableAccessorDescriptor.Setter? defined in org.jetbrains.kotlin.descriptors.impl.LocalVariableDescriptor[JavaPropertyDescriptor]

'let' @ [122:48] ==> @InlineOnly public inline fun <T, R> LocalVariableAccessorDescriptor.Setter.let(block: (LocalVariableAccessorDescriptor.Setter) -> IrSimpleFunctionSymbol): IrSimpleFunctionSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Setter
    <R> -> IrSimpleFunctionSymbol

'context' @ [122:54] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'symbolTable' @ [122:62] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceDeclaredFunction' @ [122:74] ==> public final fun referenceDeclaredFunction(descriptor: FunctionDescriptor): IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'it' @ [122:100] ==> value-parameter it: LocalVariableAccessorDescriptor.Setter defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver.<anonymous>[ValueParameterDescriptorImpl]

'origin' @ [123:29] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'VariableLValue' @ [126:21] ==> public constructor VariableLValue(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.psi2ir.intermediate.VariableLValue[ClassConstructorDescriptorImpl]

'ktLeft' @ [127:29] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'startOffset' @ [127:36] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktLeft' @ [127:49] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'endOffset' @ [127:56] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [128:29] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'symbolTable' @ [128:37] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceVariable' @ [128:49] ==> public final fun referenceVariable(descriptor: VariableDescriptor): IrVariableSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [128:67] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[LocalVariableDescriptor]

'origin' @ [129:29] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'generateAssignmentReceiverForProperty' @ [132:17] ==> private final fun generateAssignmentReceiverForProperty(descriptor: PropertyDescriptor, origin: IrStatementOrigin, ktLeft: KtExpression, resolvedCall: ResolvedCall<*>): AssignmentReceiver defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [132:55] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[LocalVariableDescriptor]

'origin' @ [132:67] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'ktLeft' @ [132:75] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'resolvedCall' @ [132:83] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[LocalVariableDescriptor]

'VariableLValue' @ [134:17] ==> public constructor VariableLValue(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.psi2ir.intermediate.VariableLValue[ClassConstructorDescriptorImpl]

'ktLeft' @ [135:25] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'startOffset' @ [135:32] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktLeft' @ [135:45] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'endOffset' @ [135:52] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [136:25] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'symbolTable' @ [136:33] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceValue' @ [136:45] ==> public final fun referenceValue(value: ValueDescriptor): IrValueSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [136:60] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[LocalVariableDescriptor]

'origin' @ [137:25] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'OnceExpressionValue' @ [140:17] ==> public constructor OnceExpressionValue(irExpression: IrExpression) defined in org.jetbrains.kotlin.psi2ir.intermediate.OnceExpressionValue[ClassConstructorDescriptorImpl]

'statementGenerator' @ [140:37] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'generateExpression' @ [140:56] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktLeft' @ [140:75] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiver[ValueParameterDescriptorImpl]

'BackingFieldLValue' @ [150:13] ==> public constructor BackingFieldLValue(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrFieldSymbol, receiver: IntermediateValue?, origin: IrStatementOrigin?) defined in org.jetbrains.kotlin.psi2ir.intermediate.BackingFieldLValue[ClassConstructorDescriptorImpl]

'ktExpression' @ [151:21] ==> value-parameter ktExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createBackingFieldLValue[ValueParameterDescriptorImpl]

'startOffset' @ [151:34] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktExpression' @ [151:47] ==> value-parameter ktExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createBackingFieldLValue[ValueParameterDescriptorImpl]

'endOffset' @ [151:60] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'descriptor' @ [152:21] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createBackingFieldLValue[ValueParameterDescriptorImpl]

'type' @ [152:32] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'context' @ [153:21] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'symbolTable' @ [153:29] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceField' @ [153:41] ==> public final fun referenceField(descriptor: PropertyDescriptor): IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [153:56] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createBackingFieldLValue[ValueParameterDescriptorImpl]

'receiverValue' @ [154:21] ==> value-parameter receiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createBackingFieldLValue[ValueParameterDescriptorImpl]

'origin' @ [154:36] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createBackingFieldLValue[ValueParameterDescriptorImpl]

'if (isValInitializationInConstructor(descriptor, resolvedCall)) {
                val thisClass = getThisClass()
                val irThis = IrGetValueImpl(
                        ktLeft.startOffset, ktLeft.endOffset,
                        context.symbolTable.referenceValueParameter(thisClass.thisAsReceiverParameter)
                )
                createBackingFieldLValue(ktLeft, descriptor, RematerializableValue(irThis), null)
            }
            else {
                val propertyReceiver = statementGenerator.generateCallReceiver(
                        ktLeft, descriptor, resolvedCall.dispatchReceiver, resolvedCall.extensionReceiver,
                        isSafe = resolvedCall.call.isSafeCall(),
                        isAssignmentReceiver = true)

                val superQualifier = getSuperQualifier(resolvedCall)

                createPropertyLValue(ktLeft, descriptor, propertyReceiver, getTypeArguments(resolvedCall), origin, superQualifier)
            }' @ [163:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AssignmentReceiver, elseBranch: AssignmentReceiver): AssignmentReceiver[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AssignmentReceiver

'isValInitializationInConstructor' @ [163:17] ==> private final fun isValInitializationInConstructor(descriptor: PropertyDescriptor, resolvedCall: ResolvedCall<*>): Boolean defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [163:50] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'resolvedCall' @ [163:62] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'getThisClass' @ [164:33] ==> private final fun getThisClass(): ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[SimpleFunctionDescriptorImpl]

'IrGetValueImpl' @ [165:30] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'ktLeft' @ [166:25] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'startOffset' @ [166:32] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktLeft' @ [166:45] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'endOffset' @ [166:52] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [167:25] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'symbolTable' @ [167:33] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceValueParameter' @ [167:45] ==> public final fun referenceValueParameter(descriptor: ParameterDescriptor): IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'thisClass' @ [167:69] ==> val thisClass: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[LocalVariableDescriptor]

'thisAsReceiverParameter' @ [167:79] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'createBackingFieldLValue' @ [169:17] ==> private final fun createBackingFieldLValue(ktExpression: KtExpression, descriptor: PropertyDescriptor, receiverValue: IntermediateValue?, origin: IrStatementOrigin?): BackingFieldLValue defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[SimpleFunctionDescriptorImpl]

'ktLeft' @ [169:42] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'descriptor' @ [169:50] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'RematerializableValue' @ [169:62] ==> public constructor RematerializableValue(irExpression: IrExpressionWithCopy) defined in org.jetbrains.kotlin.psi2ir.intermediate.RematerializableValue[ClassConstructorDescriptorImpl]

'irThis' @ [169:84] ==> val irThis: IrGetValueImpl defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[LocalVariableDescriptor]

'statementGenerator' @ [172:40] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'generateCallReceiver' @ [172:59] ==> public fun StatementGenerator.generateCallReceiver(ktDefaultElement: KtElement, calleeDescriptor: CallableDescriptor, dispatchReceiver: ReceiverValue?, extensionReceiver: ReceiverValue?, isSafe: Boolean, isAssignmentReceiver: Boolean = ...): CallReceiver defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'ktLeft' @ [173:25] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'descriptor' @ [173:33] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'resolvedCall' @ [173:45] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [173:58] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'resolvedCall' @ [173:76] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'extensionReceiver' @ [173:89] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'resolvedCall' @ [174:34] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'call' @ [174:47] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'isSafeCall' @ [174:52] ==> public fun Call.isSafeCall(): Boolean defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'getSuperQualifier' @ [177:38] ==> public fun Generator.getSuperQualifier(resolvedCall: ResolvedCall<*>): ClassDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [177:56] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'createPropertyLValue' @ [179:17] ==> private final fun createPropertyLValue(ktExpression: KtExpression, descriptor: PropertyDescriptor, propertyReceiver: CallReceiver, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin?, superQualifier: ClassDescriptor?): PropertyLValueBase defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[SimpleFunctionDescriptorImpl]

'ktLeft' @ [179:38] ==> value-parameter ktLeft: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'descriptor' @ [179:46] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'propertyReceiver' @ [179:58] ==> val propertyReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[LocalVariableDescriptor]

'getTypeArguments' @ [179:76] ==> public fun getTypeArguments(resolvedCall: ResolvedCall<*>?): Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [179:93] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'origin' @ [179:108] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[ValueParameterDescriptorImpl]

'superQualifier' @ [179:116] ==> val superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAssignmentReceiverForProperty[LocalVariableDescriptor]

'superQualifier' @ [190:36] ==> value-parameter superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[ValueParameterDescriptorImpl]

'let' @ [190:52] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> IrClassSymbol): IrClassSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> IrClassSymbol

'context' @ [190:58] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'symbolTable' @ [190:66] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceClass' @ [190:78] ==> public final fun referenceClass(descriptor: ClassDescriptor): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'it' @ [190:93] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [192:32] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[ValueParameterDescriptorImpl]

'getter' @ [192:43] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'getterDescriptor' @ [193:28] ==> val getterDescriptor: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[LocalVariableDescriptor]

'let' @ [193:46] ==> @InlineOnly public inline fun <T, R> PropertyGetterDescriptor.let(block: (PropertyGetterDescriptor) -> IrFunctionSymbol): IrFunctionSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyGetterDescriptor
    <R> -> IrFunctionSymbol

'context' @ [193:52] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'symbolTable' @ [193:60] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [193:72] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'it' @ [193:90] ==> value-parameter it: PropertyGetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [193:93] ==> public final val PropertyGetterDescriptor.original: PropertyGetterDescriptor[MyPropertyDescriptor]

'descriptor' @ [195:32] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[ValueParameterDescriptorImpl]

'setter' @ [195:43] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'setterDescriptor' @ [196:28] ==> val setterDescriptor: PropertySetterDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[LocalVariableDescriptor]

'let' @ [196:46] ==> @InlineOnly public inline fun <T, R> PropertySetterDescriptor.let(block: (PropertySetterDescriptor) -> IrFunctionSymbol): IrFunctionSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertySetterDescriptor
    <R> -> IrFunctionSymbol

'context' @ [196:52] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'symbolTable' @ [196:60] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [196:72] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'it' @ [196:90] ==> value-parameter it: PropertySetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [196:93] ==> public final val PropertySetterDescriptor.original: PropertySetterDescriptor[MyPropertyDescriptor]

'if (getterSymbol != null || setterSymbol != null) {
            AccessorPropertyLValue(
                    scope,
                    ktExpression.startOffset, ktExpression.endOffset, origin,
                    descriptor.type,
                    getterSymbol,
                    getterDescriptor,
                    setterSymbol,
                    setterDescriptor,
                    typeArguments,
                    propertyReceiver,
                    superQualifierSymbol
            )
        }
        else
            FieldPropertyLValue(
                    scope,
                    ktExpression.startOffset, ktExpression.endOffset, origin,
                    context.symbolTable.referenceField(descriptor),
                    propertyReceiver,
                    superQualifierSymbol
            )' @ [198:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PropertyLValueBase, elseBranch: PropertyLValueBase): PropertyLValueBase[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PropertyLValueBase

'getterSymbol' @ [198:20] ==> val getterSymbol: IrFunctionSymbol? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[LocalVariableDescriptor]

'setterSymbol' @ [198:44] ==> val setterSymbol: IrFunctionSymbol? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[LocalVariableDescriptor]

'AccessorPropertyLValue' @ [199:13] ==> public constructor AccessorPropertyLValue(scope: Scope, startOffset: Int, endOffset: Int, origin: IrStatementOrigin?, type: KotlinType, getter: IrFunctionSymbol?, getterDescriptor: FunctionDescriptor?, setter: IrFunctionSymbol?, setterDescriptor: FunctionDescriptor?, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, callReceiver: CallReceiver, superQualifier: IrClassSymbol?) defined in org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue[ClassConstructorDescriptorImpl]

'scope' @ [200:21] ==> public open val scope: Scope defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'ktExpression' @ [201:21] ==> value-parameter ktExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[ValueParameterDescriptorImpl]

'startOffset' @ [201:34] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktExpression' @ [201:47] ==> value-parameter ktExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[ValueParameterDescriptorImpl]

'endOffset' @ [201:60] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'origin' @ [201:71] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[ValueParameterDescriptorImpl]

'descriptor' @ [202:21] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[ValueParameterDescriptorImpl]

'type' @ [202:32] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'getterSymbol' @ [203:21] ==> val getterSymbol: IrFunctionSymbol? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[LocalVariableDescriptor]

'getterDescriptor' @ [204:21] ==> val getterDescriptor: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[LocalVariableDescriptor]

'setterSymbol' @ [205:21] ==> val setterSymbol: IrFunctionSymbol? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[LocalVariableDescriptor]

'setterDescriptor' @ [206:21] ==> val setterDescriptor: PropertySetterDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[LocalVariableDescriptor]

'typeArguments' @ [207:21] ==> value-parameter typeArguments: Map<TypeParameterDescriptor, KotlinType>? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[ValueParameterDescriptorImpl]

'propertyReceiver' @ [208:21] ==> value-parameter propertyReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[ValueParameterDescriptorImpl]

'superQualifierSymbol' @ [209:21] ==> val superQualifierSymbol: IrClassSymbol? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[LocalVariableDescriptor]

'FieldPropertyLValue' @ [213:13] ==> public constructor FieldPropertyLValue(scope: Scope, startOffset: Int, endOffset: Int, origin: IrStatementOrigin?, field: IrFieldSymbol, callReceiver: CallReceiver, superQualifier: IrClassSymbol?) defined in org.jetbrains.kotlin.psi2ir.intermediate.FieldPropertyLValue[ClassConstructorDescriptorImpl]

'scope' @ [214:21] ==> public open val scope: Scope defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'ktExpression' @ [215:21] ==> value-parameter ktExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[ValueParameterDescriptorImpl]

'startOffset' @ [215:34] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktExpression' @ [215:47] ==> value-parameter ktExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[ValueParameterDescriptorImpl]

'endOffset' @ [215:60] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'origin' @ [215:71] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[ValueParameterDescriptorImpl]

'context' @ [216:21] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'symbolTable' @ [216:29] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceField' @ [216:41] ==> public final fun referenceField(descriptor: PropertyDescriptor): IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [216:56] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[ValueParameterDescriptorImpl]

'propertyReceiver' @ [217:21] ==> value-parameter propertyReceiver: CallReceiver defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[ValueParameterDescriptorImpl]

'superQualifierSymbol' @ [218:21] ==> val superQualifierSymbol: IrClassSymbol? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.createPropertyLValue[LocalVariableDescriptor]

'!' @ [223:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [223:14] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.isValInitializationInConstructor[ValueParameterDescriptorImpl]

'isVar' @ [223:25] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'descriptor' @ [224:13] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.isValInitializationInConstructor[ValueParameterDescriptorImpl]

'kind' @ [224:24] ==> public final val PropertyDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [224:62] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'statementGenerator' @ [225:13] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'scopeOwner' @ [225:32] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'let' @ [225:43] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Boolean

'it' @ [225:49] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.isValInitializationInConstructor.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [225:80] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.isValInitializationInConstructor.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [226:13] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.isValInitializationInConstructor[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [226:26] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'statementGenerator' @ [229:26] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'scopeOwner' @ [229:45] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'when (scopeOwner) {
            is ClassConstructorDescriptor -> scopeOwner.containingDeclaration
            is ClassDescriptor -> scopeOwner
            else -> scopeOwner.containingDeclaration as ClassDescriptor
        }' @ [230:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassDescriptor, entry1: ClassDescriptor, entry2: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassDescriptor

'scopeOwner' @ [230:22] ==> val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.getThisClass[LocalVariableDescriptor]

'scopeOwner' @ [231:46] ==> val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.getThisClass[LocalVariableDescriptor]

'containingDeclaration' @ [231:57] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'scopeOwner' @ [232:35] ==> val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.getThisClass[LocalVariableDescriptor]

'scopeOwner' @ [233:21] ==> val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.getThisClass[LocalVariableDescriptor]

'containingDeclaration' @ [233:32] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'statementGenerator' @ [238:23] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'generateExpression' @ [238:42] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktLeft' @ [238:61] ==> value-parameter ktLeft: KtArrayAccessExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver[ValueParameterDescriptorImpl]

'arrayExpression' @ [238:68] ==> public final val KtArrayAccessExpression.arrayExpression: KtExpression?[MyPropertyDescriptor]

'ktLeft' @ [239:34] ==> value-parameter ktLeft: KtArrayAccessExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver[ValueParameterDescriptorImpl]

'indexExpressions' @ [239:41] ==> public final val KtArrayAccessExpression.indexExpressions: (MutableList<(KtExpression..KtExpression?)>..List<(KtExpression..KtExpression?)>)[MyPropertyDescriptor]

'map' @ [239:58] ==> public inline fun <T, R> Iterable<(KtExpression..KtExpression?)>.map(transform: ((KtExpression..KtExpression?)) -> IrExpression): List<IrExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <R> -> IrExpression

'statementGenerator' @ [239:64] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'generateExpression' @ [239:83] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'it' @ [239:102] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [241:38] ==> public fun <K, V : Any> Generator.get(slice: ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>, key: (KtExpression..KtExpression?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : Any> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'INDEXED_LVALUE_GET' @ [241:57] ==> public final val INDEXED_LVALUE_GET: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktLeft' @ [241:77] ==> value-parameter ktLeft: KtArrayAccessExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver[ValueParameterDescriptorImpl]

'indexedGetResolvedCall' @ [242:30] ==> val indexedGetResolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver[LocalVariableDescriptor]

'let' @ [242:54] ==> @InlineOnly public inline fun <T, R> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.let(block: (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>) -> CallBuilder): CallBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>
    <R> -> CallBuilder

'statementGenerator' @ [242:60] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'pregenerateCallReceivers' @ [242:79] ==> public fun StatementGenerator.pregenerateCallReceivers(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [242:104] ==> value-parameter it: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [244:38] ==> public fun <K, V : Any> Generator.get(slice: ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>, key: (KtExpression..KtExpression?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : Any> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'INDEXED_LVALUE_SET' @ [244:57] ==> public final val INDEXED_LVALUE_SET: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktLeft' @ [244:77] ==> value-parameter ktLeft: KtArrayAccessExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver[ValueParameterDescriptorImpl]

'indexedSetResolvedCall' @ [245:30] ==> val indexedSetResolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver[LocalVariableDescriptor]

'let' @ [245:54] ==> @InlineOnly public inline fun <T, R> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.let(block: (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>) -> CallBuilder): CallBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>
    <R> -> CallBuilder

'statementGenerator' @ [245:60] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'pregenerateCallReceivers' @ [245:79] ==> public fun StatementGenerator.pregenerateCallReceivers(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [245:104] ==> value-parameter it: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver.<anonymous>[ValueParameterDescriptorImpl]

'ArrayAccessAssignmentReceiver' @ [247:16] ==> public constructor ArrayAccessAssignmentReceiver(irArray: IrExpression, irIndices: List<IrExpression>, indexedGetCall: CallBuilder?, indexedSetCall: CallBuilder?, callGenerator: CallGenerator, startOffset: Int, endOffset: Int, origin: IrStatementOrigin) defined in org.jetbrains.kotlin.psi2ir.intermediate.ArrayAccessAssignmentReceiver[ClassConstructorDescriptorImpl]

'irArray' @ [247:46] ==> val irArray: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver[LocalVariableDescriptor]

'irIndexExpressions' @ [247:55] ==> val irIndexExpressions: List<IrExpression> defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver[LocalVariableDescriptor]

'indexedGetCall' @ [247:75] ==> val indexedGetCall: CallBuilder? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver[LocalVariableDescriptor]

'indexedSetCall' @ [247:91] ==> val indexedSetCall: CallBuilder? defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver[LocalVariableDescriptor]

'CallGenerator' @ [248:46] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [248:60] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator[PropertyDescriptorImpl]

'ktLeft' @ [249:46] ==> value-parameter ktLeft: KtArrayAccessExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver[ValueParameterDescriptorImpl]

'startOffset' @ [249:53] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktLeft' @ [249:66] ==> value-parameter ktLeft: KtArrayAccessExpression defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver[ValueParameterDescriptorImpl]

'endOffset' @ [249:73] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'origin' @ [249:84] ==> value-parameter origin: IrStatementOrigin defined in org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateArrayAccessAssignmentReceiver[ValueParameterDescriptorImpl]

