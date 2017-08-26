'KtVisitor<IrStatement, Nothing?>' @ [50:5] ==> public constructor KtVisitor<R : (Any..Any?), D : (Any..Any?)>() defined in org.jetbrains.kotlin.psi.KtVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <R : (Any..Any?)> -> IrStatement
    <D : (Any..Any?)> -> Nothing?

'bodyGenerator' @ [51:52] ==> public final val bodyGenerator: BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'context' @ [51:66] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'bodyGenerator' @ [52:51] ==> public final val bodyGenerator: BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'scopeOwner' @ [52:65] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'ktElement' @ [55:13] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement[ValueParameterDescriptorImpl]

'genStmt' @ [55:23] ==> private final fun KtElement.genStmt(): IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktStatements' @ [58:13] ==> value-parameter ktStatements: List<KtExpression> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatements[ValueParameterDescriptorImpl]

'mapTo' @ [58:26] ==> public inline fun <T, R, C : MutableCollection<in IrStatement>> Iterable<KtExpression>.mapTo(destination: MutableList<IrStatement>, transform: (KtExpression) -> IrStatement): MutableList<IrStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> IrStatement
    <C : MutableCollection<in R>> -> MutableList<IrStatement>

'to' @ [58:32] ==> value-parameter to: IrStatementContainer defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatements[ValueParameterDescriptorImpl]

'statements' @ [58:35] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrStatementContainer[DeserializedPropertyDescriptor]

'generateStatement' @ [58:49] ==> public final fun generateStatement(ktElement: KtElement): IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'it' @ [58:67] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatements.<anonymous>[ValueParameterDescriptorImpl]

'ktExpression' @ [61:13] ==> value-parameter ktExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpression[ValueParameterDescriptorImpl]

'genExpr' @ [61:26] ==> private final fun KtElement.genExpr(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'deparenthesize' @ [65:17] ==> public fun KtElement.deparenthesize(): KtElement defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[SimpleFunctionDescriptorImpl]

'accept' @ [65:34] ==> public abstract fun <R, D> accept(visitor: KtVisitor<IrStatement, Nothing?>, data: Nothing?): IrStatement defined in org.jetbrains.kotlin.psi.KtElement[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> IrStatement
    <D> -> Nothing?

'this@StatementGenerator' @ [65:41] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'ErrorExpressionGenerator' @ [68:17] ==> public constructor ErrorExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[ClassConstructorDescriptorImpl]

'this@StatementGenerator' @ [68:42] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateErrorExpression' @ [68:67] ==> public final fun generateErrorExpression(ktElement: KtElement, e: Exception /* = Exception */): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[SimpleFunctionDescriptorImpl]

'this' @ [68:91] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.genStmt[ReceiverParameterDescriptorImpl]

'e' @ [68:97] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.genStmt[LocalVariableDescriptor]

'genStmt' @ [72:13] ==> private final fun KtElement.genStmt(): IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'assertCast' @ [72:23] ==> public inline fun <reified T : IrElement> IrElement.assertCast(): IrExpression defined in org.jetbrains.kotlin.ir[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : IrElement> -> IrExpression

'createDummyExpression' @ [75:13] ==> public fun Generator.createDummyExpression(ktExpression: KtExpression, description: String): IrErrorExpressionImpl defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [75:35] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitExpression[ValueParameterDescriptorImpl]

'expression' @ [75:47] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitExpression[ValueParameterDescriptorImpl]

'java' @ [75:65] ==> public val <T> KClass<out KtExpression>.java: Class<out KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'simpleName' @ [75:70] ==> public final val <T : (Any..Any?)> Class<out KtExpression>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtExpression

'getOrFail' @ [78:34] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>, key: (PsiElement..PsiElement?)): (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'VARIABLE' @ [78:59] ==> public final val VARIABLE: (WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'property' @ [78:69] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitProperty[ValueParameterDescriptorImpl]

'property' @ [80:9] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitProperty[ValueParameterDescriptorImpl]

'delegate' @ [80:18] ==> public final val KtProperty.delegate: KtPropertyDelegate?[MyPropertyDescriptor]

'let' @ [80:28] ==> @InlineOnly public inline fun <T, R> KtPropertyDelegate.let(block: (KtPropertyDelegate) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPropertyDelegate
    <R> -> Nothing

'generateLocalDelegatedProperty' @ [81:20] ==> private final fun generateLocalDelegatedProperty(ktProperty: KtProperty, ktDelegate: KtPropertyDelegate, variableDescriptor: VariableDescriptorWithAccessors, scopeOwnerSymbol: IrSymbol): IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'property' @ [81:51] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitProperty[ValueParameterDescriptorImpl]

'ktDelegate' @ [81:61] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitProperty.<anonymous>[ValueParameterDescriptorImpl]

'variableDescriptor' @ [81:73] ==> val variableDescriptor: (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitProperty[LocalVariableDescriptor]

'bodyGenerator' @ [82:51] ==> public final val bodyGenerator: BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'scopeOwnerSymbol' @ [82:65] ==> public final val scopeOwnerSymbol: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'context' @ [85:16] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'symbolTable' @ [85:24] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareVariable' @ [85:36] ==> public final fun declareVariable(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: VariableDescriptor, irInitializerExpression: IrExpression?): IrVariable defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'property' @ [86:17] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitProperty[ValueParameterDescriptorImpl]

'startOffset' @ [86:26] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'property' @ [86:39] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitProperty[ValueParameterDescriptorImpl]

'endOffset' @ [86:48] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DEFINED' @ [86:79] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'variableDescriptor' @ [87:17] ==> val variableDescriptor: (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitProperty[LocalVariableDescriptor]

'property' @ [87:37] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitProperty[ValueParameterDescriptorImpl]

'initializer' @ [87:46] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'genExpr' @ [87:59] ==> private final fun KtElement.genExpr(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'DelegatedPropertyGenerator' @ [97:13] ==> public constructor DelegatedPropertyGenerator(context: GeneratorContext) defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[ClassConstructorDescriptorImpl]

'context' @ [97:40] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'generateLocalDelegatedProperty' @ [98:22] ==> public final fun generateLocalDelegatedProperty(ktProperty: KtProperty, ktDelegate: KtPropertyDelegate, variableDescriptor: VariableDescriptorWithAccessors, scopeOwnerSymbol: IrSymbol): IrLocalDelegatedProperty defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'ktProperty' @ [98:53] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'ktDelegate' @ [98:65] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'variableDescriptor' @ [98:77] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'scopeOwnerSymbol' @ [98:97] ==> value-parameter scopeOwnerSymbol: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'IrCompositeImpl' @ [101:23] ==> public constructor IrCompositeImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCompositeImpl[DeserializedClassConstructorDescriptor]

'multiDeclaration' @ [101:39] ==> value-parameter multiDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'startOffset' @ [101:56] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'multiDeclaration' @ [101:69] ==> value-parameter multiDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'endOffset' @ [101:86] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [102:39] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'builtIns' @ [102:47] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [102:56] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'DESTRUCTURING_DECLARATION' @ [102:84] ==> public object DESTRUCTURING_DECLARATION : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'multiDeclaration' @ [103:29] ==> value-parameter multiDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'initializer' @ [103:46] ==> public final val KtDestructuringDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'scope' @ [104:30] ==> public open val scope: Scope defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'createTemporaryVariableInBlock' @ [104:36] ==> public fun Scope.createTemporaryVariableInBlock(irExpression: IrExpression, block: IrContainerExpressionBase, nameHint: String? = ...): IntermediateValue defined in org.jetbrains.kotlin.psi2ir.intermediate in file RematerializableValue.kt[SimpleFunctionDescriptorImpl]

'ktInitializer' @ [104:67] ==> val ktInitializer: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDestructuringDeclaration[LocalVariableDescriptor]

'genExpr' @ [104:81] ==> private final fun KtElement.genExpr(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'irBlock' @ [104:92] ==> val irBlock: IrCompositeImpl defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDestructuringDeclaration[LocalVariableDescriptor]

'declareComponentVariablesInBlock' @ [106:9] ==> public final fun declareComponentVariablesInBlock(multiDeclaration: KtDestructuringDeclaration, irBlock: IrStatementContainer, containerValue: IntermediateValue): Unit defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'multiDeclaration' @ [106:42] ==> value-parameter multiDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'irBlock' @ [106:60] ==> val irBlock: IrCompositeImpl defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDestructuringDeclaration[LocalVariableDescriptor]

'containerValue' @ [106:69] ==> val containerValue: IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDestructuringDeclaration[LocalVariableDescriptor]

'irBlock' @ [108:16] ==> val irBlock: IrCompositeImpl defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDestructuringDeclaration[LocalVariableDescriptor]

'CallGenerator' @ [112:29] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'this' @ [112:43] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'component1' @ [113:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [113:22] ==> public final operator fun component2(): (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'multiDeclaration' @ [113:34] ==> value-parameter multiDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[ValueParameterDescriptorImpl]

'entries' @ [113:51] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'withIndex' @ [113:59] ==> public fun <T> Iterable<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>.withIndex(): Iterable<IndexedValue<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)

'getOrFail' @ [114:41] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>, key: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)): (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)
    <V : Any> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'COMPONENT_RESOLVED_CALL' @ [114:66] ==> public final val COMPONENT_RESOLVED_CALL: (WritableSlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktEntry' @ [114:91] ==> val ktEntry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[LocalVariableDescriptor]

'pregenerateCall' @ [116:44] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'componentResolvedCall' @ [116:60] ==> val componentResolvedCall: (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[LocalVariableDescriptor]

'componentSubstitutedCall' @ [117:13] ==> val componentSubstitutedCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[LocalVariableDescriptor]

'setExplicitReceiverValue' @ [117:38] ==> public fun CallBuilder.setExplicitReceiverValue(explicitReceiverValue: IntermediateValue): Unit defined in org.jetbrains.kotlin.psi2ir.intermediate in file CallBuilder.kt[SimpleFunctionDescriptorImpl]

'containerValue' @ [117:63] ==> value-parameter containerValue: IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[ValueParameterDescriptorImpl]

'getOrFail' @ [119:37] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>, key: (PsiElement..PsiElement?)): (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'VARIABLE' @ [119:62] ==> public final val VARIABLE: (WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktEntry' @ [119:72] ==> val ktEntry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[LocalVariableDescriptor]

'componentVariable' @ [122:17] ==> val componentVariable: (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[LocalVariableDescriptor]

'name' @ [122:35] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'isSpecial' @ [122:40] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'callGenerator' @ [124:35] ==> val callGenerator: CallGenerator defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[LocalVariableDescriptor]

'generateCall' @ [124:49] ==> public final fun generateCall(startOffset: Int, endOffset: Int, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'ktEntry' @ [124:62] ==> val ktEntry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[LocalVariableDescriptor]

'startOffset' @ [124:70] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktEntry' @ [124:83] ==> val ktEntry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[LocalVariableDescriptor]

'endOffset' @ [124:91] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'componentSubstitutedCall' @ [124:102] ==> val componentSubstitutedCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[LocalVariableDescriptor]

'withIndex' @ [125:92] ==> public final fun withIndex(index: Int): IrStatementOrigin.COMPONENT_N defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin.COMPONENT_N.Companion[DeserializedSimpleFunctionDescriptor]

'index' @ [125:102] ==> val index: Int defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[LocalVariableDescriptor]

'context' @ [126:34] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'symbolTable' @ [126:42] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareVariable' @ [126:54] ==> public final fun declareVariable(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: VariableDescriptor, irInitializerExpression: IrExpression?): IrVariable defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktEntry' @ [127:21] ==> val ktEntry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[LocalVariableDescriptor]

'startOffset' @ [127:29] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktEntry' @ [127:42] ==> val ktEntry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[LocalVariableDescriptor]

'endOffset' @ [127:50] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DEFINED' @ [127:81] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'componentVariable' @ [128:21] ==> val componentVariable: (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[LocalVariableDescriptor]

'irComponentCall' @ [128:40] ==> val irComponentCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[LocalVariableDescriptor]

'irBlock' @ [130:13] ==> value-parameter irBlock: IrStatementContainer defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[ValueParameterDescriptorImpl]

'statements' @ [130:21] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrStatementContainer[DeserializedPropertyDescriptor]

'add' @ [130:32] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irComponentVar' @ [130:36] ==> val irComponentVar: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.declareComponentVariablesInBlock[LocalVariableDescriptor]

'expression' @ [135:27] ==> value-parameter expression: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression[ValueParameterDescriptorImpl]

'parent' @ [135:38] ==> public final val KtBlockExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expression' @ [135:73] ==> value-parameter expression: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression[ValueParameterDescriptorImpl]

'parent' @ [135:84] ==> public final val KtBlockExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'isBlockBody' @ [136:13] ==> val isBlockBody: Boolean defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression[LocalVariableDescriptor]

'AssertionError' @ [136:32] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'getInferredTypeWithImplicitCasts' @ [138:26] ==> public fun Generator.getInferredTypeWithImplicitCasts(key: KtExpression): KotlinType? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [138:59] ==> value-parameter expression: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression[ValueParameterDescriptorImpl]

'context' @ [138:74] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'builtIns' @ [138:82] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [138:91] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'IrBlockImpl' @ [139:23] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedClassConstructorDescriptor]

'expression' @ [139:35] ==> value-parameter expression: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression[ValueParameterDescriptorImpl]

'startOffset' @ [139:46] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [139:59] ==> value-parameter expression: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression[ValueParameterDescriptorImpl]

'endOffset' @ [139:70] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'returnType' @ [139:81] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression[LocalVariableDescriptor]

'expression' @ [141:9] ==> value-parameter expression: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression[ValueParameterDescriptorImpl]

'statements' @ [141:20] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'forEach' @ [141:31] ==> @HidesMembers public inline fun <T> Iterable<(KtExpression..KtExpression?)>.forEach(action: ((KtExpression..KtExpression?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'irBlock' @ [142:13] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression[LocalVariableDescriptor]

'statements' @ [142:21] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedPropertyDescriptor]

'add' @ [142:32] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'it' @ [142:36] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression.<anonymous>[ValueParameterDescriptorImpl]

'genStmt' @ [142:39] ==> private final fun KtElement.genStmt(): IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'irBlock' @ [145:16] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression[LocalVariableDescriptor]

'getReturnExpressionTarget' @ [149:28] ==> private final fun getReturnExpressionTarget(expression: KtReturnExpression): CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [149:54] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitReturnExpression[ValueParameterDescriptorImpl]

'expression' @ [150:36] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitReturnExpression[ValueParameterDescriptorImpl]

'returnedExpression' @ [150:47] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'genExpr' @ [150:67] ==> private final fun KtElement.genExpr(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'IrGetObjectValueImpl' @ [151:36] ==> public constructor IrGetObjectValueImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrClassSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl[DeserializedClassConstructorDescriptor]

'expression' @ [151:57] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitReturnExpression[ValueParameterDescriptorImpl]

'startOffset' @ [151:68] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [151:81] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitReturnExpression[ValueParameterDescriptorImpl]

'endOffset' @ [151:92] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [151:103] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'builtIns' @ [151:111] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [151:120] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'context' @ [152:57] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'symbolTable' @ [152:65] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceClass' @ [152:77] ==> public final fun referenceClass(descriptor: ClassDescriptor): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'context' @ [152:92] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'builtIns' @ [152:100] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unit' @ [152:109] ==> public final val KotlinBuiltIns.unit: ClassDescriptor[MyPropertyDescriptor]

'IrReturnImpl' @ [153:16] ==> public constructor IrReturnImpl(startOffset: Int, endOffset: Int, type: KotlinType, returnTargetSymbol: IrFunctionSymbol, value: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl[DeserializedClassConstructorDescriptor]

'expression' @ [153:29] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitReturnExpression[ValueParameterDescriptorImpl]

'startOffset' @ [153:40] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [153:53] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitReturnExpression[ValueParameterDescriptorImpl]

'endOffset' @ [153:64] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [153:75] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'builtIns' @ [153:83] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'nothingType' @ [153:92] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'context' @ [154:29] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'symbolTable' @ [154:37] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [154:49] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'returnTarget' @ [154:67] ==> val returnTarget: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitReturnExpression[LocalVariableDescriptor]

'irReturnedExpression' @ [154:82] ==> val irReturnedExpression: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitReturnExpression[LocalVariableDescriptor]

'?:' @ [158:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: CallableDescriptor?, right: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> CallableDescriptor

'scopeOwner' @ [158:14] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'AssertionError' @ [158:58] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'scopeOwner' @ [158:103] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'if (!ExpressionTypingUtils.isFunctionLiteral(scopeOwner) && !ExpressionTypingUtils.isFunctionExpression(scopeOwner)) {
                scopeOwnerAsCallable()
            }
            else {
                val label = expression.getTargetLabel()
                when {
                    label != null -> {
                        val labelTarget = getOrFail(BindingContext.LABEL_TARGET, label)
                        val labelTargetDescriptor = getOrFail(BindingContext.DECLARATION_TO_DESCRIPTOR, labelTarget)
                        labelTargetDescriptor as CallableDescriptor
                    }
                    ExpressionTypingUtils.isFunctionLiteral(scopeOwner) -> {
                        BindingContextUtils.getContainingFunctionSkipFunctionLiterals(scopeOwner, true).first
                    }
                    else -> {
                        scopeOwnerAsCallable()
                    }
                }
            }' @ [161:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableDescriptor, elseBranch: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableDescriptor

'!' @ [161:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFunctionLiteral' @ [161:40] ==> public open fun isFunctionLiteral(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingUtils[JavaMethodDescriptor]

'scopeOwner' @ [161:58] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'!' @ [161:73] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFunctionExpression' @ [161:96] ==> public open fun isFunctionExpression(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingUtils[JavaMethodDescriptor]

'scopeOwner' @ [161:117] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'scopeOwnerAsCallable' @ [162:17] ==> private final fun scopeOwnerAsCallable(): CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [165:29] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.getReturnExpressionTarget[ValueParameterDescriptorImpl]

'getTargetLabel' @ [165:40] ==> public final fun getTargetLabel(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.KtReturnExpression[DeserializedSimpleFunctionDescriptor]

'when {
                    label != null -> {
                        val labelTarget = getOrFail(BindingContext.LABEL_TARGET, label)
                        val labelTargetDescriptor = getOrFail(BindingContext.DECLARATION_TO_DESCRIPTOR, labelTarget)
                        labelTargetDescriptor as CallableDescriptor
                    }
                    ExpressionTypingUtils.isFunctionLiteral(scopeOwner) -> {
                        BindingContextUtils.getContainingFunctionSkipFunctionLiterals(scopeOwner, true).first
                    }
                    else -> {
                        scopeOwnerAsCallable()
                    }
                }' @ [166:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallableDescriptor, entry1: CallableDescriptor, entry2: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallableDescriptor

'label' @ [167:21] ==> val label: KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.getReturnExpressionTarget[LocalVariableDescriptor]

'getOrFail' @ [168:43] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>, key: (KtReferenceExpression..KtReferenceExpression?)): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)
    <V : Any> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'LABEL_TARGET' @ [168:68] ==> public final val LABEL_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'label' @ [168:82] ==> val label: KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.getReturnExpressionTarget[LocalVariableDescriptor]

'getOrFail' @ [169:53] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>, key: (PsiElement..PsiElement?)): (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'DECLARATION_TO_DESCRIPTOR' @ [169:78] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'labelTarget' @ [169:105] ==> val labelTarget: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.getReturnExpressionTarget[LocalVariableDescriptor]

'labelTargetDescriptor' @ [170:25] ==> val labelTargetDescriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.getReturnExpressionTarget[LocalVariableDescriptor]

'isFunctionLiteral' @ [172:43] ==> public open fun isFunctionLiteral(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingUtils[JavaMethodDescriptor]

'scopeOwner' @ [172:61] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'getContainingFunctionSkipFunctionLiterals' @ [173:45] ==> @NotNull public open fun getContainingFunctionSkipFunctionLiterals(@Nullable p0: DeclarationDescriptor?, p1: Boolean): Pair<(FunctionDescriptor..FunctionDescriptor?), (PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'scopeOwner' @ [173:87] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'first' @ [173:105] ==> public final val first: (FunctionDescriptor..FunctionDescriptor?) defined in com.intellij.openapi.util.Pair[JavaPropertyDescriptor]

'scopeOwnerAsCallable' @ [176:25] ==> private final fun scopeOwnerAsCallable(): CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'IrThrowImpl' @ [182:16] ==> public constructor IrThrowImpl(startOffset: Int, endOffset: Int, type: KotlinType, value: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrThrowImpl[DeserializedClassConstructorDescriptor]

'expression' @ [182:28] ==> value-parameter expression: KtThrowExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitThrowExpression[ValueParameterDescriptorImpl]

'startOffset' @ [182:39] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [182:52] ==> value-parameter expression: KtThrowExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitThrowExpression[ValueParameterDescriptorImpl]

'endOffset' @ [182:63] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [182:74] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'builtIns' @ [182:82] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'nothingType' @ [182:91] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'expression' @ [182:104] ==> value-parameter expression: KtThrowExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitThrowExpression[ValueParameterDescriptorImpl]

'thrownExpression' @ [182:115] ==> public final val KtThrowExpression.thrownExpression: KtExpression?[MyPropertyDescriptor]

'genExpr' @ [182:134] ==> private final fun KtElement.genExpr(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'generateConstantExpression' @ [186:13] ==> public final fun generateConstantExpression(expression: KtExpression, constant: CompileTimeConstant<*>): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [186:40] ==> value-parameter expression: KtConstantExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitConstantExpression[ValueParameterDescriptorImpl]

'ConstantExpressionEvaluator' @ [187:40] ==> public companion object defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator[FakeCallableDescriptorForObject]

'getConstant' @ [187:68] ==> @JvmStatic public final fun getConstant(expression: KtExpression, bindingContext: BindingContext): CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [187:80] ==> value-parameter expression: KtConstantExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitConstantExpression[ValueParameterDescriptorImpl]

'context' @ [187:92] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'bindingContext' @ [187:100] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'error' @ [188:40] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'expression' @ [188:89] ==> value-parameter expression: KtConstantExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitConstantExpression[ValueParameterDescriptorImpl]

'text' @ [188:100] ==> public final val KtConstantExpression.text: (String..String?)[MyPropertyDescriptor]

'constant' @ [191:29] ==> value-parameter constant: CompileTimeConstant<*> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'toConstantValue' @ [191:38] ==> public abstract fun toConstantValue(expectedType: KotlinType): ConstantValue<Any?> defined in org.jetbrains.kotlin.resolve.constants.CompileTimeConstant[DeserializedSimpleFunctionDescriptor]

'getInferredTypeWithImplicitCastsOrFail' @ [191:54] ==> public fun Generator.getInferredTypeWithImplicitCastsOrFail(key: KtExpression): KotlinType defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [191:93] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'constantValue' @ [192:28] ==> val constantValue: ConstantValue<Any?> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'type' @ [192:42] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[DeserializedPropertyDescriptor]

'when (constantValue) {
            is StringValue ->
                IrConstImpl.string(expression.startOffset, expression.endOffset, constantType, constantValue.value)
            is IntValue ->
                IrConstImpl.int(expression.startOffset, expression.endOffset, constantType, constantValue.value)
            is NullValue ->
                IrConstImpl.constNull(expression.startOffset, expression.endOffset, constantType)
            is BooleanValue ->
                IrConstImpl.boolean(expression.startOffset, expression.endOffset, constantType, constantValue.value)
            is LongValue ->
                IrConstImpl.long(expression.startOffset, expression.endOffset, constantType, constantValue.value)
            is DoubleValue ->
                IrConstImpl.double(expression.startOffset, expression.endOffset, constantType, constantValue.value)
            is FloatValue ->
                IrConstImpl.float(expression.startOffset, expression.endOffset, constantType, constantValue.value)
            is CharValue ->
                IrConstImpl.char(expression.startOffset, expression.endOffset, constantType, constantValue.value)
            is ByteValue ->
                IrConstImpl.byte(expression.startOffset, expression.endOffset, constantType, constantValue.value)
            is ShortValue ->
                IrConstImpl.short(expression.startOffset, expression.endOffset, constantType, constantValue.value)
            else ->
                TODO("handle other literal types: ${constantValue.type}")
        }' @ [194:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression, entry3: IrExpression, entry4: IrExpression, entry5: IrExpression, entry6: IrExpression, entry7: IrExpression, entry8: IrExpression, entry9: IrExpression, entry10: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'constantValue' @ [194:22] ==> val constantValue: ConstantValue<Any?> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'IrConstImpl' @ [196:17] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'string' @ [196:29] ==> public final fun string(startOffset: Int, endOffset: Int, type: KotlinType, value: String): IrConstImpl<String> defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [196:36] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'startOffset' @ [196:47] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [196:60] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'endOffset' @ [196:71] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'constantType' @ [196:82] ==> val constantType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'constantValue' @ [196:96] ==> val constantValue: ConstantValue<Any?> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'value' @ [196:110] ==> public open val value: String defined in org.jetbrains.kotlin.resolve.constants.StringValue[DeserializedPropertyDescriptor]

'IrConstImpl' @ [198:17] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'int' @ [198:29] ==> public final fun int(startOffset: Int, endOffset: Int, type: KotlinType, value: Int): IrConstImpl<Int> defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [198:33] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'startOffset' @ [198:44] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [198:57] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'endOffset' @ [198:68] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'constantType' @ [198:79] ==> val constantType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'constantValue' @ [198:93] ==> val constantValue: ConstantValue<Any?> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'value' @ [198:107] ==> public open val value: Int defined in org.jetbrains.kotlin.resolve.constants.IntValue[DeserializedPropertyDescriptor]

'IrConstImpl' @ [200:17] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'constNull' @ [200:29] ==> public final fun constNull(startOffset: Int, endOffset: Int, type: KotlinType): IrConstImpl<Nothing?> defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [200:39] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'startOffset' @ [200:50] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [200:63] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'endOffset' @ [200:74] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'constantType' @ [200:85] ==> val constantType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'IrConstImpl' @ [202:17] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'boolean' @ [202:29] ==> public final fun boolean(startOffset: Int, endOffset: Int, type: KotlinType, value: Boolean): IrConstImpl<Boolean> defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [202:37] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'startOffset' @ [202:48] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [202:61] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'endOffset' @ [202:72] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'constantType' @ [202:83] ==> val constantType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'constantValue' @ [202:97] ==> val constantValue: ConstantValue<Any?> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'value' @ [202:111] ==> public open val value: Boolean defined in org.jetbrains.kotlin.resolve.constants.BooleanValue[DeserializedPropertyDescriptor]

'IrConstImpl' @ [204:17] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'long' @ [204:29] ==> public final fun long(startOffset: Int, endOffset: Int, type: KotlinType, value: Long): IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [204:34] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'startOffset' @ [204:45] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [204:58] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'endOffset' @ [204:69] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'constantType' @ [204:80] ==> val constantType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'constantValue' @ [204:94] ==> val constantValue: ConstantValue<Any?> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'value' @ [204:108] ==> public open val value: Long defined in org.jetbrains.kotlin.resolve.constants.LongValue[DeserializedPropertyDescriptor]

'IrConstImpl' @ [206:17] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'double' @ [206:29] ==> public final fun double(startOffset: Int, endOffset: Int, type: KotlinType, value: Double): IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [206:36] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'startOffset' @ [206:47] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [206:60] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'endOffset' @ [206:71] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'constantType' @ [206:82] ==> val constantType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'constantValue' @ [206:96] ==> val constantValue: ConstantValue<Any?> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'value' @ [206:110] ==> public open val value: Double defined in org.jetbrains.kotlin.resolve.constants.DoubleValue[DeserializedPropertyDescriptor]

'IrConstImpl' @ [208:17] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'float' @ [208:29] ==> public final fun float(startOffset: Int, endOffset: Int, type: KotlinType, value: Float): IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [208:35] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'startOffset' @ [208:46] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [208:59] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'endOffset' @ [208:70] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'constantType' @ [208:81] ==> val constantType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'constantValue' @ [208:95] ==> val constantValue: ConstantValue<Any?> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'value' @ [208:109] ==> public open val value: Float defined in org.jetbrains.kotlin.resolve.constants.FloatValue[DeserializedPropertyDescriptor]

'IrConstImpl' @ [210:17] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'char' @ [210:29] ==> public final fun char(startOffset: Int, endOffset: Int, type: KotlinType, value: Char): IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [210:34] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'startOffset' @ [210:45] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [210:58] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'endOffset' @ [210:69] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'constantType' @ [210:80] ==> val constantType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'constantValue' @ [210:94] ==> val constantValue: ConstantValue<Any?> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'value' @ [210:108] ==> public open val value: Char defined in org.jetbrains.kotlin.resolve.constants.CharValue[DeserializedPropertyDescriptor]

'IrConstImpl' @ [212:17] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'byte' @ [212:29] ==> public final fun byte(startOffset: Int, endOffset: Int, type: KotlinType, value: Byte): IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [212:34] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'startOffset' @ [212:45] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [212:58] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'endOffset' @ [212:69] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'constantType' @ [212:80] ==> val constantType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'constantValue' @ [212:94] ==> val constantValue: ConstantValue<Any?> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'value' @ [212:108] ==> public open val value: Byte defined in org.jetbrains.kotlin.resolve.constants.ByteValue[DeserializedPropertyDescriptor]

'IrConstImpl' @ [214:17] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'short' @ [214:29] ==> public final fun short(startOffset: Int, endOffset: Int, type: KotlinType, value: Short): IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [214:35] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'startOffset' @ [214:46] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [214:59] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[ValueParameterDescriptorImpl]

'endOffset' @ [214:70] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'constantType' @ [214:81] ==> val constantType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'constantValue' @ [214:95] ==> val constantValue: ConstantValue<Any?> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'value' @ [214:109] ==> public open val value: Short defined in org.jetbrains.kotlin.resolve.constants.ShortValue[DeserializedPropertyDescriptor]

'TODO' @ [216:17] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'constantValue' @ [216:53] ==> val constantValue: ConstantValue<Any?> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateConstantExpression[LocalVariableDescriptor]

'type' @ [216:67] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[DeserializedPropertyDescriptor]

'expression' @ [221:23] ==> value-parameter expression: KtStringTemplateExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[ValueParameterDescriptorImpl]

'entries' @ [221:34] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'getInferredTypeWithImplicitCastsOrFail' @ [222:26] ==> public fun Generator.getInferredTypeWithImplicitCastsOrFail(key: KtExpression): KotlinType defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'expression' @ [222:65] ==> value-parameter expression: KtStringTemplateExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[ValueParameterDescriptorImpl]

'when (entries.size) {
            1 -> {
                val irArg = entries[0].genExpr()
                if (irArg is IrConst<*> && irArg.kind == IrConstKind.String)
                    irArg
                else
                    IrStringConcatenationImpl(expression.startOffset, expression.endOffset, resultType, listOf(irArg))
            }
            0 ->
                IrConstImpl.string(expression.startOffset, expression.endOffset, resultType, "")
            else ->
                IrStringConcatenationImpl(expression.startOffset, expression.endOffset, resultType, entries.map { it.genExpr() })
        }' @ [223:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrStatement, entry1: IrStatement, entry2: IrStatement): IrStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrStatement

'entries' @ [223:22] ==> val entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[LocalVariableDescriptor]

'size' @ [223:30] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'entries' @ [225:29] ==> val entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[LocalVariableDescriptor]

'genExpr' @ [225:40] ==> private final fun KtElement.genExpr(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'if (irArg is IrConst<*> && irArg.kind == IrConstKind.String)
                    irArg
                else
                    IrStringConcatenationImpl(expression.startOffset, expression.endOffset, resultType, listOf(irArg))' @ [226:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'irArg' @ [226:21] ==> val irArg: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[LocalVariableDescriptor]

'irArg' @ [226:44] ==> val irArg: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[LocalVariableDescriptor]

'kind' @ [226:50] ==> public abstract val kind: IrConstKind<out Any?> defined in org.jetbrains.kotlin.ir.expressions.IrConst[DeserializedPropertyDescriptor]

'String' @ [226:70] ==> public object String : IrConstKind<String> defined in org.jetbrains.kotlin.ir.expressions.IrConstKind[FakeCallableDescriptorForObject]

'irArg' @ [227:21] ==> val irArg: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[LocalVariableDescriptor]

'IrStringConcatenationImpl' @ [229:21] ==> public constructor IrStringConcatenationImpl(startOffset: Int, endOffset: Int, type: KotlinType, arguments: Collection<IrExpression>) defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[DeserializedClassConstructorDescriptor]

'expression' @ [229:47] ==> value-parameter expression: KtStringTemplateExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[ValueParameterDescriptorImpl]

'startOffset' @ [229:58] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [229:71] ==> value-parameter expression: KtStringTemplateExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[ValueParameterDescriptorImpl]

'endOffset' @ [229:82] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'resultType' @ [229:93] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[LocalVariableDescriptor]

'listOf' @ [229:105] ==> public fun <T> listOf(element: IrExpression): List<IrExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'irArg' @ [229:112] ==> val irArg: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[LocalVariableDescriptor]

'IrConstImpl' @ [232:17] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'string' @ [232:29] ==> public final fun string(startOffset: Int, endOffset: Int, type: KotlinType, value: String): IrConstImpl<String> defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [232:36] ==> value-parameter expression: KtStringTemplateExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[ValueParameterDescriptorImpl]

'startOffset' @ [232:47] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [232:60] ==> value-parameter expression: KtStringTemplateExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[ValueParameterDescriptorImpl]

'endOffset' @ [232:71] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'resultType' @ [232:82] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[LocalVariableDescriptor]

'IrStringConcatenationImpl' @ [234:17] ==> public constructor IrStringConcatenationImpl(startOffset: Int, endOffset: Int, type: KotlinType, arguments: Collection<IrExpression>) defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[DeserializedClassConstructorDescriptor]

'expression' @ [234:43] ==> value-parameter expression: KtStringTemplateExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[ValueParameterDescriptorImpl]

'startOffset' @ [234:54] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [234:67] ==> value-parameter expression: KtStringTemplateExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[ValueParameterDescriptorImpl]

'endOffset' @ [234:78] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'resultType' @ [234:89] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[LocalVariableDescriptor]

'entries' @ [234:101] ==> val entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression[LocalVariableDescriptor]

'map' @ [234:109] ==> public inline fun <T, R> Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>.map(transform: ((KtStringTemplateEntry..KtStringTemplateEntry?)) -> IrExpression): List<IrExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtStringTemplateEntry..org.jetbrains.kotlin.psi.KtStringTemplateEntry?)
    <R> -> IrExpression

'it' @ [234:115] ==> value-parameter it: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateExpression.<anonymous>[ValueParameterDescriptorImpl]

'genExpr' @ [234:118] ==> private final fun KtElement.genExpr(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'IrConstImpl' @ [239:13] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'string' @ [239:25] ==> public final fun string(startOffset: Int, endOffset: Int, type: KotlinType, value: String): IrConstImpl<String> defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'entry' @ [239:32] ==> value-parameter entry: KtLiteralStringTemplateEntry defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLiteralStringTemplateEntry[ValueParameterDescriptorImpl]

'startOffset' @ [239:38] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'entry' @ [239:51] ==> value-parameter entry: KtLiteralStringTemplateEntry defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLiteralStringTemplateEntry[ValueParameterDescriptorImpl]

'endOffset' @ [239:57] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [239:68] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'builtIns' @ [239:76] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'stringType' @ [239:85] ==> public final val KotlinBuiltIns.stringType: SimpleType[MyPropertyDescriptor]

'entry' @ [239:97] ==> value-parameter entry: KtLiteralStringTemplateEntry defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLiteralStringTemplateEntry[ValueParameterDescriptorImpl]

'text' @ [239:103] ==> public final val KtLiteralStringTemplateEntry.text: (String..String?)[MyPropertyDescriptor]

'IrConstImpl' @ [242:13] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'string' @ [242:25] ==> public final fun string(startOffset: Int, endOffset: Int, type: KotlinType, value: String): IrConstImpl<String> defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[DeserializedSimpleFunctionDescriptor]

'entry' @ [242:32] ==> value-parameter entry: KtEscapeStringTemplateEntry defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitEscapeStringTemplateEntry[ValueParameterDescriptorImpl]

'startOffset' @ [242:38] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'entry' @ [242:51] ==> value-parameter entry: KtEscapeStringTemplateEntry defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitEscapeStringTemplateEntry[ValueParameterDescriptorImpl]

'endOffset' @ [242:57] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [242:68] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'builtIns' @ [242:76] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'stringType' @ [242:85] ==> public final val KotlinBuiltIns.stringType: SimpleType[MyPropertyDescriptor]

'entry' @ [242:97] ==> value-parameter entry: KtEscapeStringTemplateEntry defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitEscapeStringTemplateEntry[ValueParameterDescriptorImpl]

'unescapedValue' @ [242:103] ==> public final val KtEscapeStringTemplateEntry.unescapedValue: (String..String?)[MyPropertyDescriptor]

'entry' @ [245:13] ==> value-parameter entry: KtStringTemplateEntryWithExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitStringTemplateEntryWithExpression[ValueParameterDescriptorImpl]

'expression' @ [245:19] ==> public final val KtStringTemplateEntryWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'genExpr' @ [245:32] ==> private final fun KtElement.genExpr(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'getResolvedCall' @ [248:28] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'expression' @ [248:44] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'resolvedCall' @ [250:13] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression[LocalVariableDescriptor]

'resolvedCall' @ [251:17] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression[LocalVariableDescriptor]

'pregenerateCall' @ [252:36] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [252:52] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression[LocalVariableDescriptor]

'variableCall' @ [252:65] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[DeserializedPropertyDescriptor]

'CallGenerator' @ [253:24] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'this' @ [253:38] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateCall' @ [253:44] ==> public fun CallGenerator.generateCall(ktElement: KtElement, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'expression' @ [253:57] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'variableCall' @ [253:69] ==> val variableCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression[LocalVariableDescriptor]

'VARIABLE_AS_FUNCTION' @ [253:101] ==> public object VARIABLE_AS_FUNCTION : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'resolvedCall' @ [256:30] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [256:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'generateExpressionForReferencedDescriptor' @ [258:20] ==> private final fun generateExpressionForReferencedDescriptor(descriptor: DeclarationDescriptor, expression: KtExpression, resolvedCall: ResolvedCall<*>?): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [258:62] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression[LocalVariableDescriptor]

'expression' @ [258:74] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'resolvedCall' @ [258:86] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression[LocalVariableDescriptor]

'get' @ [261:31] ==> public fun <K, V : Any> Generator.get(slice: ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>, key: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'REFERENCE_TARGET' @ [261:50] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [261:68] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'referenceTarget' @ [262:13] ==> val referenceTarget: DeclarationDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression[LocalVariableDescriptor]

'generateExpressionForReferencedDescriptor' @ [263:20] ==> private final fun generateExpressionForReferencedDescriptor(descriptor: DeclarationDescriptor, expression: KtExpression, resolvedCall: ResolvedCall<*>?): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'referenceTarget' @ [263:62] ==> val referenceTarget: DeclarationDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression[LocalVariableDescriptor]

'expression' @ [263:79] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'ErrorExpressionGenerator' @ [266:16] ==> public constructor ErrorExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[ClassConstructorDescriptorImpl]

'this' @ [266:41] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateErrorSimpleName' @ [266:47] ==> public final fun generateErrorSimpleName(ktName: KtSimpleNameExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [266:71] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'CallGenerator' @ [274:13] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'this' @ [274:27] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateValueReference' @ [274:33] ==> public final fun generateValueReference(startOffset: Int, endOffset: Int, descriptor: DeclarationDescriptor, resolvedCall: ResolvedCall<*>?, origin: IrStatementOrigin?): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [275:21] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpressionForReferencedDescriptor[ValueParameterDescriptorImpl]

'startOffset' @ [275:32] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [275:45] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpressionForReferencedDescriptor[ValueParameterDescriptorImpl]

'endOffset' @ [275:56] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'descriptor' @ [276:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpressionForReferencedDescriptor[ValueParameterDescriptorImpl]

'resolvedCall' @ [276:33] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpressionForReferencedDescriptor[ValueParameterDescriptorImpl]

'getResolvedCall' @ [280:28] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'expression' @ [280:44] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression[ValueParameterDescriptorImpl]

'ErrorExpressionGenerator' @ [281:35] ==> public constructor ErrorExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[ClassConstructorDescriptorImpl]

'this' @ [281:60] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateErrorCall' @ [281:66] ==> public final fun generateErrorCall(ktCall: KtCallExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [281:84] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression[ValueParameterDescriptorImpl]

'resolvedCall' @ [283:13] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression[LocalVariableDescriptor]

'pregenerateCall' @ [284:32] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [284:48] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression[LocalVariableDescriptor]

'functionCall' @ [284:61] ==> public abstract val functionCall: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[DeserializedPropertyDescriptor]

'CallGenerator' @ [285:20] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'this' @ [285:34] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateCall' @ [285:40] ==> public fun CallGenerator.generateCall(ktElement: KtElement, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'expression' @ [285:53] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression[ValueParameterDescriptorImpl]

'functionCall' @ [285:65] ==> val functionCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression[LocalVariableDescriptor]

'INVOKE' @ [285:97] ==> public object INVOKE : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'CallGenerator' @ [288:16] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'this' @ [288:30] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateCall' @ [288:36] ==> public final fun generateCall(startOffset: Int, endOffset: Int, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [288:49] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression[ValueParameterDescriptorImpl]

'startOffset' @ [288:60] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [288:73] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression[ValueParameterDescriptorImpl]

'endOffset' @ [288:84] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'pregenerateCall' @ [288:95] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [288:111] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression[LocalVariableDescriptor]

'getOrFail' @ [292:30] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>, key: (KtExpression..KtExpression?)): (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : Any> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'INDEXED_LVALUE_GET' @ [292:55] ==> public final val INDEXED_LVALUE_GET: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [292:75] ==> value-parameter expression: KtArrayAccessExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitArrayAccessExpression[ValueParameterDescriptorImpl]

'CallGenerator' @ [294:16] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'this' @ [294:30] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateCall' @ [294:36] ==> public final fun generateCall(startOffset: Int, endOffset: Int, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [294:49] ==> value-parameter expression: KtArrayAccessExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitArrayAccessExpression[ValueParameterDescriptorImpl]

'startOffset' @ [294:60] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [294:73] ==> value-parameter expression: KtArrayAccessExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitArrayAccessExpression[ValueParameterDescriptorImpl]

'endOffset' @ [294:84] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'pregenerateCall' @ [295:49] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'indexedGetCall' @ [295:65] ==> val indexedGetCall: (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitArrayAccessExpression[LocalVariableDescriptor]

'GET_ARRAY_ELEMENT' @ [295:100] ==> public object GET_ARRAY_ELEMENT : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'expression' @ [299:13] ==> value-parameter expression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDotQualifiedExpression[ValueParameterDescriptorImpl]

'selectorExpression' @ [299:24] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'accept' @ [299:45] ==> public abstract fun <R : (Any..Any?), D : (Any..Any?)> accept(@NotNull visitor: KtVisitor<IrStatement, Nothing?>, data: Nothing?): IrStatement defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> IrStatement
    <D : (Any..Any?)> -> Nothing?

'this' @ [299:52] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'data' @ [299:58] ==> value-parameter data: Nothing? defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDotQualifiedExpression[ValueParameterDescriptorImpl]

'expression' @ [302:13] ==> value-parameter expression: KtSafeQualifiedExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSafeQualifiedExpression[ValueParameterDescriptorImpl]

'selectorExpression' @ [302:24] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtSafeQualifiedExpression[DeserializedPropertyDescriptor]

'accept' @ [302:45] ==> public abstract fun <R : (Any..Any?), D : (Any..Any?)> accept(@NotNull visitor: KtVisitor<IrStatement, Nothing?>, data: Nothing?): IrStatement defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> IrStatement
    <D : (Any..Any?)> -> Nothing?

'this' @ [302:52] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'data' @ [302:58] ==> value-parameter data: Nothing? defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSafeQualifiedExpression[ValueParameterDescriptorImpl]

'getOrFail' @ [305:31] ==> public inline fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>, key: (KtReferenceExpression..KtReferenceExpression?), message: ((KtReferenceExpression..KtReferenceExpression?)) -> String): (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'REFERENCE_TARGET' @ [305:56] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [305:74] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitThisExpression[ValueParameterDescriptorImpl]

'instanceReference' @ [305:85] ==> public final val KtThisExpression.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'when (referenceTarget) {
            is ClassDescriptor ->
                IrGetValueImpl(expression.startOffset, expression.endOffset,
                               context.symbolTable.referenceValueParameter(referenceTarget.thisAsReceiverParameter))
            is CallableDescriptor -> {
                val extensionReceiver = referenceTarget.extensionReceiverParameter ?: TODO("No extension receiver: $referenceTarget")
                IrGetValueImpl(expression.startOffset, expression.endOffset,
                               context.symbolTable.referenceValueParameter(extensionReceiver))
            }
            else ->
                error("Expected this or receiver: $referenceTarget")
        }' @ [306:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression, entry2: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'referenceTarget' @ [306:22] ==> val referenceTarget: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitThisExpression[LocalVariableDescriptor]

'IrGetValueImpl' @ [308:17] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'expression' @ [308:32] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitThisExpression[ValueParameterDescriptorImpl]

'startOffset' @ [308:43] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [308:56] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitThisExpression[ValueParameterDescriptorImpl]

'endOffset' @ [308:67] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [309:32] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'symbolTable' @ [309:40] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceValueParameter' @ [309:52] ==> public final fun referenceValueParameter(descriptor: ParameterDescriptor): IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'referenceTarget' @ [309:76] ==> val referenceTarget: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitThisExpression[LocalVariableDescriptor]

'thisAsReceiverParameter' @ [309:92] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'referenceTarget' @ [311:41] ==> val referenceTarget: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitThisExpression[LocalVariableDescriptor]

'extensionReceiverParameter' @ [311:57] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'TODO' @ [311:87] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'referenceTarget' @ [311:117] ==> val referenceTarget: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitThisExpression[LocalVariableDescriptor]

'IrGetValueImpl' @ [312:17] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'expression' @ [312:32] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitThisExpression[ValueParameterDescriptorImpl]

'startOffset' @ [312:43] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'expression' @ [312:56] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitThisExpression[ValueParameterDescriptorImpl]

'endOffset' @ [312:67] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [313:32] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'symbolTable' @ [313:40] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceValueParameter' @ [313:52] ==> public final fun referenceValueParameter(descriptor: ParameterDescriptor): IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'extensionReceiver' @ [313:76] ==> val extensionReceiver: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitThisExpression[LocalVariableDescriptor]

'error' @ [316:17] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'referenceTarget' @ [316:52] ==> val referenceTarget: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitThisExpression[LocalVariableDescriptor]

'OperatorExpressionGenerator' @ [321:13] ==> public constructor OperatorExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[ClassConstructorDescriptorImpl]

'this' @ [321:41] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateBinaryExpression' @ [321:47] ==> public final fun generateBinaryExpression(expression: KtBinaryExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [321:72] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBinaryExpression[ValueParameterDescriptorImpl]

'OperatorExpressionGenerator' @ [324:13] ==> public constructor OperatorExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[ClassConstructorDescriptorImpl]

'this' @ [324:41] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generatePrefixExpression' @ [324:47] ==> public final fun generatePrefixExpression(expression: KtPrefixExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [324:72] ==> value-parameter expression: KtPrefixExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitPrefixExpression[ValueParameterDescriptorImpl]

'OperatorExpressionGenerator' @ [327:13] ==> public constructor OperatorExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[ClassConstructorDescriptorImpl]

'this' @ [327:41] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generatePostfixExpression' @ [327:47] ==> public final fun generatePostfixExpression(expression: KtPostfixExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [327:73] ==> value-parameter expression: KtPostfixExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitPostfixExpression[ValueParameterDescriptorImpl]

'OperatorExpressionGenerator' @ [330:13] ==> public constructor OperatorExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[ClassConstructorDescriptorImpl]

'this' @ [330:41] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateCastExpression' @ [330:47] ==> public final fun generateCastExpression(expression: KtBinaryExpressionWithTypeRHS): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [330:70] ==> value-parameter expression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBinaryWithTypeRHSExpression[ValueParameterDescriptorImpl]

'OperatorExpressionGenerator' @ [333:13] ==> public constructor OperatorExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[ClassConstructorDescriptorImpl]

'this' @ [333:41] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateInstanceOfExpression' @ [333:47] ==> public final fun generateInstanceOfExpression(expression: KtIsExpression): IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [333:76] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitIsExpression[ValueParameterDescriptorImpl]

'BranchingExpressionGenerator' @ [336:13] ==> public constructor BranchingExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[ClassConstructorDescriptorImpl]

'this' @ [336:42] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateIfExpression' @ [336:48] ==> public final fun generateIfExpression(expression: KtIfExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [336:69] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitIfExpression[ValueParameterDescriptorImpl]

'BranchingExpressionGenerator' @ [339:13] ==> public constructor BranchingExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[ClassConstructorDescriptorImpl]

'this' @ [339:42] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateWhenExpression' @ [339:48] ==> public final fun generateWhenExpression(expression: KtWhenExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BranchingExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [339:71] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitWhenExpression[ValueParameterDescriptorImpl]

'LoopExpressionGenerator' @ [342:13] ==> public constructor LoopExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[ClassConstructorDescriptorImpl]

'this' @ [342:37] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateWhileLoop' @ [342:43] ==> public final fun generateWhileLoop(ktWhile: KtWhileExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [342:61] ==> value-parameter expression: KtWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitWhileExpression[ValueParameterDescriptorImpl]

'LoopExpressionGenerator' @ [345:13] ==> public constructor LoopExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[ClassConstructorDescriptorImpl]

'this' @ [345:37] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateDoWhileLoop' @ [345:43] ==> public final fun generateDoWhileLoop(ktDoWhile: KtDoWhileExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [345:63] ==> value-parameter expression: KtDoWhileExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDoWhileExpression[ValueParameterDescriptorImpl]

'LoopExpressionGenerator' @ [348:13] ==> public constructor LoopExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[ClassConstructorDescriptorImpl]

'this' @ [348:37] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateForLoop' @ [348:43] ==> public final fun generateForLoop(ktFor: KtForExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [348:59] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitForExpression[ValueParameterDescriptorImpl]

'LoopExpressionGenerator' @ [351:13] ==> public constructor LoopExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[ClassConstructorDescriptorImpl]

'this' @ [351:37] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateBreak' @ [351:43] ==> public final fun generateBreak(ktBreak: KtBreakExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [351:57] ==> value-parameter expression: KtBreakExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBreakExpression[ValueParameterDescriptorImpl]

'LoopExpressionGenerator' @ [354:13] ==> public constructor LoopExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[ClassConstructorDescriptorImpl]

'this' @ [354:37] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateContinue' @ [354:43] ==> public final fun generateContinue(ktContinue: KtContinueExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [354:60] ==> value-parameter expression: KtContinueExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitContinueExpression[ValueParameterDescriptorImpl]

'TryCatchExpressionGenerator' @ [357:13] ==> public constructor TryCatchExpressionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator[ClassConstructorDescriptorImpl]

'this' @ [357:41] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateTryCatch' @ [357:47] ==> public final fun generateTryCatch(ktTry: KtTryExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [357:64] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitTryExpression[ValueParameterDescriptorImpl]

'LocalFunctionGenerator' @ [360:13] ==> public constructor LocalFunctionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.LocalFunctionGenerator[ClassConstructorDescriptorImpl]

'this' @ [360:36] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateLambda' @ [360:42] ==> public final fun generateLambda(ktLambda: KtLambdaExpression): IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.LocalFunctionGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [360:57] ==> value-parameter expression: KtLambdaExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLambdaExpression[ValueParameterDescriptorImpl]

'LocalFunctionGenerator' @ [363:13] ==> public constructor LocalFunctionGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.LocalFunctionGenerator[ClassConstructorDescriptorImpl]

'this' @ [363:36] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateFunction' @ [363:42] ==> public final fun generateFunction(ktFun: KtNamedFunction): IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.LocalFunctionGenerator[SimpleFunctionDescriptorImpl]

'function' @ [363:59] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitNamedFunction[ValueParameterDescriptorImpl]

'LocalClassGenerator' @ [366:13] ==> public constructor LocalClassGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.LocalClassGenerator[ClassConstructorDescriptorImpl]

'this' @ [366:33] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateObjectLiteral' @ [366:39] ==> public final fun generateObjectLiteral(ktObjectLiteral: KtObjectLiteralExpression): IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.LocalClassGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [366:61] ==> value-parameter expression: KtObjectLiteralExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitObjectLiteralExpression[ValueParameterDescriptorImpl]

'LocalClassGenerator' @ [369:13] ==> public constructor LocalClassGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.LocalClassGenerator[ClassConstructorDescriptorImpl]

'this' @ [369:33] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateLocalClass' @ [369:39] ==> public final fun generateLocalClass(ktClassOrObject: KtClassOrObject): IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.LocalClassGenerator[SimpleFunctionDescriptorImpl]

'classOrObject' @ [369:58] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitClassOrObject[ValueParameterDescriptorImpl]

'IrTypeAliasImpl' @ [372:13] ==> public constructor IrTypeAliasImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: TypeAliasDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrTypeAliasImpl[DeserializedClassConstructorDescriptor]

'typeAlias' @ [372:29] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitTypeAlias[ValueParameterDescriptorImpl]

'startOffset' @ [372:39] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'typeAlias' @ [372:52] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitTypeAlias[ValueParameterDescriptorImpl]

'endOffset' @ [372:62] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DEFINED' @ [372:93] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'getOrFail' @ [373:29] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?)>, key: (PsiElement..PsiElement?)): (TypeAliasDescriptor..TypeAliasDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.TypeAliasDescriptor..org.jetbrains.kotlin.descriptors.TypeAliasDescriptor?)

'TYPE_ALIAS' @ [373:54] ==> public final val TYPE_ALIAS: (WritableSlice<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeAlias' @ [373:66] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitTypeAlias[ValueParameterDescriptorImpl]

'ReflectionReferencesGenerator' @ [376:13] ==> public constructor ReflectionReferencesGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[ClassConstructorDescriptorImpl]

'this' @ [376:43] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateClassLiteral' @ [376:49] ==> public final fun generateClassLiteral(ktClassLiteral: KtClassLiteralExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [376:70] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitClassLiteralExpression[ValueParameterDescriptorImpl]

'ReflectionReferencesGenerator' @ [379:13] ==> public constructor ReflectionReferencesGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[ClassConstructorDescriptorImpl]

'this' @ [379:43] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[LazyClassReceiverParameterDescriptor]

'generateCallableReference' @ [379:49] ==> public final fun generateCallableReference(ktCallableReference: KtCallableReferenceExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[SimpleFunctionDescriptorImpl]

'expression' @ [379:75] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallableReferenceExpression[ValueParameterDescriptorImpl]

'statementGenerator' @ [383:39] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension[PropertyDescriptorImpl]

'scope' @ [383:58] ==> public open val scope: Scope defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

'statementGenerator' @ [384:52] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension[PropertyDescriptorImpl]

'context' @ [384:71] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[PropertyDescriptorImpl]

