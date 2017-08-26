'scopeOwnerSymbol' @ [40:51] ==> public final val scopeOwnerSymbol: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'descriptor' @ [40:68] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSymbol[DeserializedPropertyDescriptor]

'Scope' @ [42:26] ==> public constructor Scope(scopeOwnerSymbol: IrSymbol) defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedClassConstructorDescriptor]

'scopeOwnerSymbol' @ [42:32] ==> public final val scopeOwnerSymbol: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'HashMap' @ [43:29] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtLoopExpression
    <V : (Any..Any?)> -> IrLoop

'createStatementGenerator' @ [46:34] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'IrBlockBodyImpl' @ [48:27] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedClassConstructorDescriptor]

'ktBody' @ [48:43] ==> value-parameter ktBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody[ValueParameterDescriptorImpl]

'startOffset' @ [48:50] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktBody' @ [48:63] ==> value-parameter ktBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody[ValueParameterDescriptorImpl]

'endOffset' @ [48:70] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'if (ktBody is KtBlockExpression) {
            statementGenerator.generateStatements(ktBody.statements, irBlockBody)
        }
        else {
            statementGenerator.generateReturnExpression(ktBody, irBlockBody)
        }' @ [49:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'ktBody' @ [49:13] ==> value-parameter ktBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody[ValueParameterDescriptorImpl]

'statementGenerator' @ [50:13] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody[LocalVariableDescriptor]

'generateStatements' @ [50:32] ==> public final fun generateStatements(ktStatements: List<KtExpression>, to: IrStatementContainer): MutableList<IrStatement> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktBody' @ [50:51] ==> value-parameter ktBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody[ValueParameterDescriptorImpl]

'statements' @ [50:58] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'irBlockBody' @ [50:70] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody[LocalVariableDescriptor]

'statementGenerator' @ [53:13] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody[LocalVariableDescriptor]

'generateReturnExpression' @ [53:32] ==> private final fun StatementGenerator.generateReturnExpression(ktExpression: KtExpression, irBlockBody: IrBlockBodyImpl): Unit defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktBody' @ [53:57] ==> value-parameter ktBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody[ValueParameterDescriptorImpl]

'irBlockBody' @ [53:65] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody[LocalVariableDescriptor]

'irBlockBody' @ [56:16] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody[LocalVariableDescriptor]

'IrExpressionBodyImpl' @ [60:13] ==> public constructor IrExpressionBodyImpl(expression: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl[DeserializedClassConstructorDescriptor]

'createStatementGenerator' @ [60:34] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'generateExpression' @ [60:61] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktExpression' @ [60:80] ==> value-parameter ktExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateExpressionBody[ValueParameterDescriptorImpl]

'createStatementGenerator' @ [63:34] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktFun' @ [65:22] ==> value-parameter ktFun: KtFunctionLiteral defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[ValueParameterDescriptorImpl]

'bodyExpression' @ [65:28] ==> public final val KtFunctionLiteral.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'IrBlockBodyImpl' @ [66:27] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedClassConstructorDescriptor]

'ktBody' @ [66:43] ==> val ktBody: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'startOffset' @ [66:50] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktBody' @ [66:63] ==> val ktBody: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'endOffset' @ [66:70] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktFun' @ [68:29] ==> value-parameter ktFun: KtFunctionLiteral defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[ValueParameterDescriptorImpl]

'valueParameters' @ [68:35] ==> public final val KtFunctionLiteral.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'ktParameter' @ [69:46] ==> val ktParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'destructuringDeclaration' @ [69:58] ==> public final val KtParameter.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'getOrFail' @ [70:34] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>, key: (KtParameter..KtParameter?)): (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'VALUE_PARAMETER' @ [70:59] ==> public final val VALUE_PARAMETER: (WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktParameter' @ [70:76] ==> val ktParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'VariableLValue' @ [71:34] ==> public constructor VariableLValue(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.psi2ir.intermediate.VariableLValue[ClassConstructorDescriptorImpl]

'ktDestructuringDeclaration' @ [71:49] ==> val ktDestructuringDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'startOffset' @ [71:76] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDestructuringDeclaration' @ [71:89] ==> val ktDestructuringDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'endOffset' @ [71:116] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [72:49] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'symbolTable' @ [72:57] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceValue' @ [72:69] ==> public final fun referenceValue(value: ValueDescriptor): IrValueSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'valueParameter' @ [72:84] ==> val valueParameter: (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'DESTRUCTURING_DECLARATION' @ [73:67] ==> public object DESTRUCTURING_DECLARATION : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'statementGenerator' @ [74:13] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'declareComponentVariablesInBlock' @ [74:32] ==> public final fun declareComponentVariablesInBlock(multiDeclaration: KtDestructuringDeclaration, irBlock: IrStatementContainer, containerValue: IntermediateValue): Unit defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktDestructuringDeclaration' @ [74:65] ==> val ktDestructuringDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'irBlockBody' @ [74:93] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'parameterValue' @ [74:106] ==> val parameterValue: VariableLValue defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'ktBody' @ [77:32] ==> val ktBody: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'statements' @ [77:39] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'if (ktBodyStatements.isNotEmpty()) {
            for (ktStatement in ktBodyStatements.dropLast(1)) {
                irBlockBody.statements.add(statementGenerator.generateStatement(ktStatement))
            }
            val ktReturnedValue = ktBodyStatements.last()
            statementGenerator.generateReturnExpression(ktReturnedValue, irBlockBody)
        }
        else {
            irBlockBody.statements.add(generateReturnExpression(
                    ktBody.startOffset, ktBody.endOffset,
                    IrGetObjectValueImpl(ktBody.startOffset, ktBody.endOffset, context.builtIns.unitType,
                                         context.symbolTable.referenceClass(context.builtIns.unit))))
        }' @ [78:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'ktBodyStatements' @ [78:13] ==> val ktBodyStatements: List<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'isNotEmpty' @ [78:30] ==> @InlineOnly public inline fun <T> Collection<(KtExpression..KtExpression?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'ktBodyStatements' @ [79:33] ==> val ktBodyStatements: List<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'dropLast' @ [79:50] ==> public fun <T> List<(KtExpression..KtExpression?)>.dropLast(n: Int): List<(KtExpression..KtExpression?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'irBlockBody' @ [80:17] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'statements' @ [80:29] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [80:40] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statementGenerator' @ [80:44] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'generateStatement' @ [80:63] ==> public final fun generateStatement(ktElement: KtElement): IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktStatement' @ [80:81] ==> val ktStatement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'ktBodyStatements' @ [82:35] ==> val ktBodyStatements: List<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'last' @ [82:52] ==> public fun <T> List<(KtExpression..KtExpression?)>.last(): (KtExpression..KtExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'statementGenerator' @ [83:13] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'generateReturnExpression' @ [83:32] ==> private final fun StatementGenerator.generateReturnExpression(ktExpression: KtExpression, irBlockBody: IrBlockBodyImpl): Unit defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktReturnedValue' @ [83:57] ==> val ktReturnedValue: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'irBlockBody' @ [83:74] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'irBlockBody' @ [86:13] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'statements' @ [86:25] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [86:36] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'generateReturnExpression' @ [86:40] ==> private final fun generateReturnExpression(startOffset: Int, endOffset: Int, returnValue: IrExpression): IrReturnImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktBody' @ [87:21] ==> val ktBody: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'startOffset' @ [87:28] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktBody' @ [87:41] ==> val ktBody: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'endOffset' @ [87:48] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'IrGetObjectValueImpl' @ [88:21] ==> public constructor IrGetObjectValueImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrClassSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl[DeserializedClassConstructorDescriptor]

'ktBody' @ [88:42] ==> val ktBody: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'startOffset' @ [88:49] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktBody' @ [88:62] ==> val ktBody: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'endOffset' @ [88:69] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [88:80] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'builtIns' @ [88:88] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unitType' @ [88:97] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'context' @ [89:42] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'symbolTable' @ [89:50] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceClass' @ [89:62] ==> public final fun referenceClass(descriptor: ClassDescriptor): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'context' @ [89:77] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'builtIns' @ [89:85] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'unit' @ [89:94] ==> public final val KotlinBuiltIns.unit: ClassDescriptor[MyPropertyDescriptor]

'irBlockBody' @ [92:16] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody[LocalVariableDescriptor]

'generateStatement' @ [96:34] ==> public final fun generateStatement(ktElement: KtElement): IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktExpression' @ [96:52] ==> value-parameter ktExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateReturnExpression[ValueParameterDescriptorImpl]

'if (irReturnExpression is IrExpression) {
            irBlockBody.statements.add(irReturnExpression.wrapWithReturn())
        }
        else {
            irBlockBody.statements.add(irReturnExpression)
        }' @ [97:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'irReturnExpression' @ [97:13] ==> val irReturnExpression: IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateReturnExpression[LocalVariableDescriptor]

'irBlockBody' @ [98:13] ==> value-parameter irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateReturnExpression[ValueParameterDescriptorImpl]

'statements' @ [98:25] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [98:36] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irReturnExpression' @ [98:40] ==> val irReturnExpression: IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateReturnExpression[LocalVariableDescriptor]

'wrapWithReturn' @ [98:59] ==> private final fun IrExpression.wrapWithReturn(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'irBlockBody' @ [101:13] ==> value-parameter irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateReturnExpression[ValueParameterDescriptorImpl]

'statements' @ [101:25] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [101:36] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irReturnExpression' @ [101:40] ==> val irReturnExpression: IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateReturnExpression[LocalVariableDescriptor]

'if (this is IrReturn || this is IrErrorExpression || this is IrThrow)
                this
            else {
                generateReturnExpression(startOffset, endOffset, this) }' @ [106:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'this' @ [106:17] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.wrapWithReturn[ReceiverParameterDescriptorImpl]

'this' @ [106:37] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.wrapWithReturn[ReceiverParameterDescriptorImpl]

'this' @ [106:66] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.wrapWithReturn[ReceiverParameterDescriptorImpl]

'this' @ [107:17] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.wrapWithReturn[ReceiverParameterDescriptorImpl]

'generateReturnExpression' @ [109:17] ==> private final fun generateReturnExpression(startOffset: Int, endOffset: Int, returnValue: IrExpression): IrReturnImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'startOffset' @ [109:42] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'endOffset' @ [109:55] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'this' @ [109:66] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.wrapWithReturn[ReceiverParameterDescriptorImpl]

'?:' @ [113:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: CallableDescriptor?, right: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> CallableDescriptor

'scopeOwner' @ [113:29] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'AssertionError' @ [114:34] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'scopeOwner' @ [114:79] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'IrReturnImpl' @ [115:16] ==> public constructor IrReturnImpl(startOffset: Int, endOffset: Int, type: KotlinType, returnTargetSymbol: IrFunctionSymbol, value: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [115:29] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateReturnExpression[ValueParameterDescriptorImpl]

'endOffset' @ [115:42] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateReturnExpression[ValueParameterDescriptorImpl]

'context' @ [115:53] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'builtIns' @ [115:61] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'nothingType' @ [115:70] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'context' @ [116:29] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'symbolTable' @ [116:37] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [116:49] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'returnTarget' @ [116:67] ==> val returnTarget: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateReturnExpression[LocalVariableDescriptor]

'returnValue' @ [117:29] ==> value-parameter returnValue: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateReturnExpression[ValueParameterDescriptorImpl]

'IrBlockBodyImpl' @ [122:27] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedClassConstructorDescriptor]

'ktConstructor' @ [122:43] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBody[ValueParameterDescriptorImpl]

'startOffset' @ [122:57] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktConstructor' @ [122:70] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBody[ValueParameterDescriptorImpl]

'endOffset' @ [122:84] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'generateDelegatingConstructorCall' @ [124:9] ==> private final fun generateDelegatingConstructorCall(irBlockBody: IrBlockBodyImpl, ktConstructor: KtSecondaryConstructor): Unit defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'irBlockBody' @ [124:43] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBody[LocalVariableDescriptor]

'ktConstructor' @ [124:56] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBody[ValueParameterDescriptorImpl]

'ktConstructor' @ [126:9] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBody[ValueParameterDescriptorImpl]

'bodyExpression' @ [126:23] ==> public final val KtSecondaryConstructor.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'let' @ [126:39] ==> @InlineOnly public inline fun <T, R> KtBlockExpression.let(block: (KtBlockExpression) -> MutableList<IrStatement>): MutableList<IrStatement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtBlockExpression
    <R> -> MutableList<IrStatement>

'createStatementGenerator' @ [127:13] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'generateStatements' @ [127:40] ==> public final fun generateStatements(ktStatements: List<KtExpression>, to: IrStatementContainer): MutableList<IrStatement> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktBody' @ [127:59] ==> value-parameter ktBody: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBody.<anonymous>[ValueParameterDescriptorImpl]

'statements' @ [127:66] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'irBlockBody' @ [127:78] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBody[LocalVariableDescriptor]

'irBlockBody' @ [130:16] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBody[LocalVariableDescriptor]

'scopeOwner' @ [134:37] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'createStatementGenerator' @ [136:34] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktConstructor' @ [137:43] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[ValueParameterDescriptorImpl]

'getDelegationCall' @ [137:57] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'getResolvedCall' @ [138:49] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'ktDelegatingConstructorCall' @ [138:65] ==> val ktDelegatingConstructorCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[LocalVariableDescriptor]

'delegatingConstructorResolvedCall' @ [140:13] ==> val delegatingConstructorResolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[LocalVariableDescriptor]

'if (constructorDescriptor.containingDeclaration.kind == ClassKind.ENUM_CLASS) {
                generateEnumSuperConstructorCall(irBlockBody, ktConstructor)
            }
            else {
                generateAnySuperConstructorCall(irBlockBody, ktConstructor)
            }' @ [141:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'constructorDescriptor' @ [141:17] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[LocalVariableDescriptor]

'containingDeclaration' @ [141:39] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'kind' @ [141:61] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [141:79] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'generateEnumSuperConstructorCall' @ [142:17] ==> private final fun generateEnumSuperConstructorCall(irBlockBody: IrBlockBodyImpl, ktElement: KtElement): Unit defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'irBlockBody' @ [142:50] ==> value-parameter irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[ValueParameterDescriptorImpl]

'ktConstructor' @ [142:63] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[ValueParameterDescriptorImpl]

'generateAnySuperConstructorCall' @ [145:17] ==> private final fun generateAnySuperConstructorCall(irBlockBody: IrBlockBodyImpl, ktElement: KtElement): Unit defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'irBlockBody' @ [145:49] ==> value-parameter irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[ValueParameterDescriptorImpl]

'ktConstructor' @ [145:62] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[ValueParameterDescriptorImpl]

'statementGenerator' @ [150:41] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[LocalVariableDescriptor]

'pregenerateCall' @ [150:60] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'delegatingConstructorResolvedCall' @ [150:76] ==> val delegatingConstructorResolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[LocalVariableDescriptor]

'CallGenerator' @ [151:43] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [151:57] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[LocalVariableDescriptor]

'generateDelegatingConstructorCall' @ [151:77] ==> public final fun generateDelegatingConstructorCall(startOffset: Int, endOffset: Int, call: CallBuilder): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'ktDelegatingConstructorCall' @ [152:17] ==> val ktDelegatingConstructorCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[LocalVariableDescriptor]

'startOffset' @ [152:45] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDelegatingConstructorCall' @ [152:58] ==> val ktDelegatingConstructorCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[LocalVariableDescriptor]

'endOffset' @ [152:86] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'delegatingConstructorCall' @ [153:17] ==> val delegatingConstructorCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[LocalVariableDescriptor]

'irBlockBody' @ [154:9] ==> value-parameter irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[ValueParameterDescriptorImpl]

'statements' @ [154:21] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [154:32] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irDelegatingConstructorCall' @ [154:36] ==> val irDelegatingConstructorCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateDelegatingConstructorCall[LocalVariableDescriptor]

'StatementGenerator' @ [157:38] ==> public constructor StatementGenerator(bodyGenerator: BodyGenerator, scope: Scope) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[ClassConstructorDescriptorImpl]

'this' @ [157:57] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[LazyClassReceiverParameterDescriptor]

'scope' @ [157:63] ==> public open val scope: Scope defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'loopTable' @ [160:9] ==> private final val loopTable: HashMap<KtLoopExpression, IrLoop> defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'expression' @ [160:19] ==> value-parameter expression: KtLoopExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.putLoop[ValueParameterDescriptorImpl]

'irLoop' @ [160:33] ==> value-parameter irLoop: IrLoop defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.putLoop[ValueParameterDescriptorImpl]

'loopTable' @ [164:13] ==> private final val loopTable: HashMap<KtLoopExpression, IrLoop> defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'expression' @ [164:23] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.getLoop[ValueParameterDescriptorImpl]

'IrBlockBodyImpl' @ [167:27] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedClassConstructorDescriptor]

'ktClassOrObject' @ [167:43] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generatePrimaryConstructorBody[ValueParameterDescriptorImpl]

'startOffset' @ [167:59] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktClassOrObject' @ [167:72] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generatePrimaryConstructorBody[ValueParameterDescriptorImpl]

'endOffset' @ [167:88] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'generateSuperConstructorCall' @ [169:9] ==> private final fun generateSuperConstructorCall(irBlockBody: IrBlockBodyImpl, ktClassOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'irBlockBody' @ [169:38] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generatePrimaryConstructorBody[LocalVariableDescriptor]

'ktClassOrObject' @ [169:51] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generatePrimaryConstructorBody[ValueParameterDescriptorImpl]

'scopeOwner' @ [171:32] ==> public final val scopeOwner: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'containingDeclaration' @ [171:74] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'irBlockBody' @ [172:9] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generatePrimaryConstructorBody[LocalVariableDescriptor]

'statements' @ [172:21] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [172:32] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrInstanceInitializerCallImpl' @ [172:36] ==> public constructor IrInstanceInitializerCallImpl(startOffset: Int, endOffset: Int, classSymbol: IrClassSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrInstanceInitializerCallImpl[DeserializedClassConstructorDescriptor]

'ktClassOrObject' @ [172:66] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generatePrimaryConstructorBody[ValueParameterDescriptorImpl]

'startOffset' @ [172:82] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktClassOrObject' @ [172:95] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generatePrimaryConstructorBody[ValueParameterDescriptorImpl]

'endOffset' @ [172:111] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [173:66] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'symbolTable' @ [173:74] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceClass' @ [173:86] ==> public final fun referenceClass(descriptor: ClassDescriptor): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [173:101] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generatePrimaryConstructorBody[LocalVariableDescriptor]

'irBlockBody' @ [175:16] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generatePrimaryConstructorBody[LocalVariableDescriptor]

'IrBlockBodyImpl' @ [179:27] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedClassConstructorDescriptor]

'ktConstructor' @ [179:43] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBodyWithNestedInitializers[ValueParameterDescriptorImpl]

'startOffset' @ [179:57] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktConstructor' @ [179:70] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBodyWithNestedInitializers[ValueParameterDescriptorImpl]

'endOffset' @ [179:84] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'generateDelegatingConstructorCall' @ [181:9] ==> private final fun generateDelegatingConstructorCall(irBlockBody: IrBlockBodyImpl, ktConstructor: KtSecondaryConstructor): Unit defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'irBlockBody' @ [181:43] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBodyWithNestedInitializers[LocalVariableDescriptor]

'ktConstructor' @ [181:56] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBodyWithNestedInitializers[ValueParameterDescriptorImpl]

'getOrFail' @ [183:31] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>, key: (PsiElement..PsiElement?)): (ConstructorDescriptor..ConstructorDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.ConstructorDescriptor..org.jetbrains.kotlin.descriptors.ConstructorDescriptor?)

'CONSTRUCTOR' @ [183:56] ==> public final val CONSTRUCTOR: (WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktConstructor' @ [183:69] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBodyWithNestedInitializers[ValueParameterDescriptorImpl]

'containingDeclaration' @ [183:84] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'irBlockBody' @ [184:9] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBodyWithNestedInitializers[LocalVariableDescriptor]

'statements' @ [184:21] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [184:32] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrInstanceInitializerCallImpl' @ [184:36] ==> public constructor IrInstanceInitializerCallImpl(startOffset: Int, endOffset: Int, classSymbol: IrClassSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrInstanceInitializerCallImpl[DeserializedClassConstructorDescriptor]

'ktConstructor' @ [184:66] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBodyWithNestedInitializers[ValueParameterDescriptorImpl]

'startOffset' @ [184:80] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktConstructor' @ [184:93] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBodyWithNestedInitializers[ValueParameterDescriptorImpl]

'endOffset' @ [184:107] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [185:66] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'symbolTable' @ [185:74] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceClass' @ [185:86] ==> public final fun referenceClass(descriptor: ClassDescriptor): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [185:101] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBodyWithNestedInitializers[LocalVariableDescriptor]

'ktConstructor' @ [187:9] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBodyWithNestedInitializers[ValueParameterDescriptorImpl]

'bodyExpression' @ [187:23] ==> public final val KtSecondaryConstructor.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'let' @ [187:39] ==> @InlineOnly public inline fun <T, R> KtBlockExpression.let(block: (KtBlockExpression) -> MutableList<IrStatement>): MutableList<IrStatement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtBlockExpression
    <R> -> MutableList<IrStatement>

'createStatementGenerator' @ [188:13] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'generateStatements' @ [188:40] ==> public final fun generateStatements(ktStatements: List<KtExpression>, to: IrStatementContainer): MutableList<IrStatement> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktBody' @ [188:59] ==> value-parameter ktBody: KtBlockExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBodyWithNestedInitializers.<anonymous>[ValueParameterDescriptorImpl]

'statements' @ [188:66] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'irBlockBody' @ [188:78] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBodyWithNestedInitializers[LocalVariableDescriptor]

'irBlockBody' @ [191:16] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSecondaryConstructorBodyWithNestedInitializers[LocalVariableDescriptor]

'getOrFail' @ [195:31] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>, key: (PsiElement..PsiElement?)): (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'CLASS' @ [195:56] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktClassOrObject' @ [195:63] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[ValueParameterDescriptorImpl]

'when (classDescriptor.kind) {
            ClassKind.ENUM_CLASS -> {
                generateEnumSuperConstructorCall(irBlockBody, ktClassOrObject)
            }
            ClassKind.ENUM_ENTRY -> {
                irBlockBody.statements.add(generateEnumEntrySuperConstructorCall(ktClassOrObject as KtEnumEntry, classDescriptor))
            }
            else -> {
                val statementGenerator = createStatementGenerator()

                ktClassOrObject.getSuperTypeList()?.let { ktSuperTypeList ->
                    for (ktSuperTypeListEntry in ktSuperTypeList.entries) {
                        if (ktSuperTypeListEntry is KtSuperTypeCallEntry) {
                            val superConstructorCall = statementGenerator.pregenerateCall(getResolvedCall(ktSuperTypeListEntry)!!)
                            val irSuperConstructorCall = CallGenerator(statementGenerator).generateDelegatingConstructorCall(
                                    ktSuperTypeListEntry.startOffset, ktSuperTypeListEntry.endOffset, superConstructorCall)
                            irBlockBody.statements.add(irSuperConstructorCall)
                            return
                        }
                    }
                }

                // If we are here, we didn't find a superclass entry in super types.
                // Thus, super class should be Any.
                val superClass = classDescriptor.getSuperClassOrAny()
                assert(KotlinBuiltIns.isAny(superClass)) { "$classDescriptor: Super class should be any: $superClass" }
                generateAnySuperConstructorCall(irBlockBody, ktClassOrObject)
            }
        }' @ [197:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'classDescriptor' @ [197:15] ==> val classDescriptor: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[LocalVariableDescriptor]

'kind' @ [197:31] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [198:23] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'generateEnumSuperConstructorCall' @ [199:17] ==> private final fun generateEnumSuperConstructorCall(irBlockBody: IrBlockBodyImpl, ktElement: KtElement): Unit defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'irBlockBody' @ [199:50] ==> value-parameter irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[ValueParameterDescriptorImpl]

'ktClassOrObject' @ [199:63] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[ValueParameterDescriptorImpl]

'ENUM_ENTRY' @ [201:23] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'irBlockBody' @ [202:17] ==> value-parameter irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[ValueParameterDescriptorImpl]

'statements' @ [202:29] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [202:40] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'generateEnumEntrySuperConstructorCall' @ [202:44] ==> private final fun generateEnumEntrySuperConstructorCall(ktEnumEntry: KtEnumEntry, enumEntryDescriptor: ClassDescriptor): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktClassOrObject' @ [202:82] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[ValueParameterDescriptorImpl]

'classDescriptor' @ [202:114] ==> val classDescriptor: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[LocalVariableDescriptor]

'createStatementGenerator' @ [205:42] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktClassOrObject' @ [207:17] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[ValueParameterDescriptorImpl]

'getSuperTypeList' @ [207:33] ==> public final fun getSuperTypeList(): KtSuperTypeList? defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'let' @ [207:53] ==> @InlineOnly public inline fun <T, R> KtSuperTypeList.let(block: (KtSuperTypeList) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeList
    <R> -> Unit

'ktSuperTypeList' @ [208:50] ==> value-parameter ktSuperTypeList: KtSuperTypeList defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall.<anonymous>[ValueParameterDescriptorImpl]

'entries' @ [208:66] ==> public final val KtSuperTypeList.entries: (MutableList<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>..List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>?)[MyPropertyDescriptor]

'ktSuperTypeListEntry' @ [209:29] ==> val ktSuperTypeListEntry: (KtSuperTypeListEntry..KtSuperTypeListEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall.<anonymous>[LocalVariableDescriptor]

'statementGenerator' @ [210:56] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[LocalVariableDescriptor]

'pregenerateCall' @ [210:75] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'getResolvedCall' @ [210:91] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'ktSuperTypeListEntry' @ [210:107] ==> val ktSuperTypeListEntry: (KtSuperTypeListEntry..KtSuperTypeListEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall.<anonymous>[LocalVariableDescriptor]

'CallGenerator' @ [211:58] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [211:72] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[LocalVariableDescriptor]

'generateDelegatingConstructorCall' @ [211:92] ==> public final fun generateDelegatingConstructorCall(startOffset: Int, endOffset: Int, call: CallBuilder): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'ktSuperTypeListEntry' @ [212:37] ==> val ktSuperTypeListEntry: (KtSuperTypeListEntry..KtSuperTypeListEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [212:58] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktSuperTypeListEntry' @ [212:71] ==> val ktSuperTypeListEntry: (KtSuperTypeListEntry..KtSuperTypeListEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [212:92] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'superConstructorCall' @ [212:103] ==> val superConstructorCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall.<anonymous>[LocalVariableDescriptor]

'irBlockBody' @ [213:29] ==> value-parameter irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[ValueParameterDescriptorImpl]

'statements' @ [213:41] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [213:52] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irSuperConstructorCall' @ [213:56] ==> val irSuperConstructorCall: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall.<anonymous>[LocalVariableDescriptor]

'classDescriptor' @ [221:34] ==> val classDescriptor: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[LocalVariableDescriptor]

'getSuperClassOrAny' @ [221:50] ==> public fun ClassDescriptor.getSuperClassOrAny(): ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'assert' @ [222:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isAny' @ [222:39] ==> public open fun isAny(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'superClass' @ [222:45] ==> val superClass: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[LocalVariableDescriptor]

'classDescriptor' @ [222:62] ==> val classDescriptor: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[LocalVariableDescriptor]

'superClass' @ [222:107] ==> val superClass: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[LocalVariableDescriptor]

'generateAnySuperConstructorCall' @ [223:17] ==> private final fun generateAnySuperConstructorCall(irBlockBody: IrBlockBodyImpl, ktElement: KtElement): Unit defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'irBlockBody' @ [223:49] ==> value-parameter irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[ValueParameterDescriptorImpl]

'ktClassOrObject' @ [223:62] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall[ValueParameterDescriptorImpl]

'context' @ [229:30] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'builtIns' @ [229:38] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'any' @ [229:47] ==> public final val KotlinBuiltIns.any: ClassDescriptor[MyPropertyDescriptor]

'constructors' @ [229:51] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'single' @ [229:64] ==> public fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.single(): (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'irBlockBody' @ [230:9] ==> value-parameter irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateAnySuperConstructorCall[ValueParameterDescriptorImpl]

'statements' @ [230:21] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [230:32] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrDelegatingConstructorCallImpl' @ [231:17] ==> public constructor IrDelegatingConstructorCallImpl(startOffset: Int, endOffset: Int, symbol: IrConstructorSymbol, descriptor: ClassConstructorDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl[DeserializedClassConstructorDescriptor]

'ktElement' @ [232:25] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateAnySuperConstructorCall[ValueParameterDescriptorImpl]

'startOffset' @ [232:35] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktElement' @ [232:48] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateAnySuperConstructorCall[ValueParameterDescriptorImpl]

'endOffset' @ [232:58] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [233:25] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'symbolTable' @ [233:33] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceConstructor' @ [233:45] ==> public final fun referenceConstructor(descriptor: ClassConstructorDescriptor): IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'anyConstructor' @ [233:66] ==> val anyConstructor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateAnySuperConstructorCall[LocalVariableDescriptor]

'anyConstructor' @ [234:25] ==> val anyConstructor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateAnySuperConstructorCall[LocalVariableDescriptor]

'context' @ [241:31] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'builtIns' @ [241:39] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'enum' @ [241:48] ==> public final val KotlinBuiltIns.enum: ClassDescriptor[MyPropertyDescriptor]

'constructors' @ [241:53] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'single' @ [241:66] ==> public fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.single(): (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'irBlockBody' @ [242:9] ==> value-parameter irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumSuperConstructorCall[ValueParameterDescriptorImpl]

'statements' @ [242:21] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [242:32] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrEnumConstructorCallImpl' @ [243:17] ==> public constructor IrEnumConstructorCallImpl(startOffset: Int, endOffset: Int, symbol: IrConstructorSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrEnumConstructorCallImpl[DeserializedClassConstructorDescriptor]

'ktElement' @ [244:25] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumSuperConstructorCall[ValueParameterDescriptorImpl]

'startOffset' @ [244:35] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktElement' @ [244:48] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumSuperConstructorCall[ValueParameterDescriptorImpl]

'endOffset' @ [244:58] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [245:25] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'symbolTable' @ [245:33] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceConstructor' @ [245:45] ==> public final fun referenceConstructor(descriptor: ClassConstructorDescriptor): IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'enumConstructor' @ [245:66] ==> val enumConstructor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumSuperConstructorCall[LocalVariableDescriptor]

'generateEnumConstructorCallOrSuperCall' @ [251:16] ==> private final fun generateEnumConstructorCallOrSuperCall(ktEnumEntry: KtEnumEntry, enumClassDescriptor: ClassDescriptor): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktEnumEntry' @ [251:55] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumEntrySuperConstructorCall[ValueParameterDescriptorImpl]

'enumEntryDescriptor' @ [251:68] ==> value-parameter enumEntryDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumEntrySuperConstructorCall[ValueParameterDescriptorImpl]

'containingDeclaration' @ [251:88] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'ktEnumEntry' @ [255:13] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumEntryInitializer[ValueParameterDescriptorImpl]

'declarations' @ [255:25] ==> public final val KtEnumEntry.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'isNotEmpty' @ [255:38] ==> @InlineOnly public inline fun <T> Collection<KtDeclaration>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'enumEntryDescriptor' @ [256:40] ==> value-parameter enumEntryDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumEntryInitializer[ValueParameterDescriptorImpl]

'unsubstitutedPrimaryConstructor' @ [256:60] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'IrEnumConstructorCallImpl' @ [257:20] ==> public constructor IrEnumConstructorCallImpl(startOffset: Int, endOffset: Int, symbol: IrConstructorSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrEnumConstructorCallImpl[DeserializedClassConstructorDescriptor]

'ktEnumEntry' @ [258:21] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumEntryInitializer[ValueParameterDescriptorImpl]

'startOffset' @ [258:33] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktEnumEntry' @ [258:46] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumEntryInitializer[ValueParameterDescriptorImpl]

'endOffset' @ [258:58] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [259:21] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'symbolTable' @ [259:29] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceConstructor' @ [259:41] ==> public final fun referenceConstructor(descriptor: ClassConstructorDescriptor): IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'enumEntryConstructor' @ [259:62] ==> val enumEntryConstructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumEntryInitializer[LocalVariableDescriptor]

'generateEnumConstructorCallOrSuperCall' @ [263:16] ==> private final fun generateEnumConstructorCallOrSuperCall(ktEnumEntry: KtEnumEntry, enumClassDescriptor: ClassDescriptor): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktEnumEntry' @ [263:55] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumEntryInitializer[ValueParameterDescriptorImpl]

'enumEntryDescriptor' @ [263:68] ==> value-parameter enumEntryDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumEntryInitializer[ValueParameterDescriptorImpl]

'containingDeclaration' @ [263:88] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'createStatementGenerator' @ [270:34] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktEnumEntry' @ [273:34] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [273:46] ==> public final val KtEnumEntry.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'firstOrNull' @ [273:67] ==> public fun <T> List<KtSuperTypeListEntry>.firstOrNull(): KtSuperTypeListEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry

'ktSuperCallElement' @ [274:13] ==> val ktSuperCallElement: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall[LocalVariableDescriptor]

'statementGenerator' @ [275:20] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall[LocalVariableDescriptor]

'generateEnumConstructorCall' @ [275:39] ==> private final fun StatementGenerator.generateEnumConstructorCall(constructorCall: ResolvedCall<out CallableDescriptor>, ktEnumEntry: KtEnumEntry): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'getResolvedCall' @ [275:67] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'ktSuperCallElement' @ [275:83] ==> val ktSuperCallElement: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall[LocalVariableDescriptor]

'ktEnumEntry' @ [275:106] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall[ValueParameterDescriptorImpl]

'getResolvedCall' @ [278:42] ==> public fun Generator.getResolvedCall(key: KtElement): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'ktEnumEntry' @ [278:58] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall[ValueParameterDescriptorImpl]

'enumDefaultConstructorCall' @ [279:13] ==> val enumDefaultConstructorCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall[LocalVariableDescriptor]

'statementGenerator' @ [280:20] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall[LocalVariableDescriptor]

'generateEnumConstructorCall' @ [280:39] ==> private final fun StatementGenerator.generateEnumConstructorCall(constructorCall: ResolvedCall<out CallableDescriptor>, ktEnumEntry: KtEnumEntry): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'enumDefaultConstructorCall' @ [280:67] ==> val enumDefaultConstructorCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall[LocalVariableDescriptor]

'ktEnumEntry' @ [280:95] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall[ValueParameterDescriptorImpl]

'enumClassDescriptor' @ [285:17] ==> value-parameter enumClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall[ValueParameterDescriptorImpl]

'constructors' @ [285:37] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'singleOrNull' @ [285:50] ==> public inline fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.singleOrNull(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): ClassConstructorDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'it' @ [285:65] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [285:68] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'all' @ [285:84] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.all(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [285:90] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [285:93] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'AssertionError' @ [286:23] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'enumClassDescriptor' @ [286:51] ==> value-parameter enumClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall[ValueParameterDescriptorImpl]

'IrEnumConstructorCallImpl' @ [287:16] ==> public constructor IrEnumConstructorCallImpl(startOffset: Int, endOffset: Int, symbol: IrConstructorSymbol) defined in org.jetbrains.kotlin.ir.expressions.impl.IrEnumConstructorCallImpl[DeserializedClassConstructorDescriptor]

'ktEnumEntry' @ [288:17] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall[ValueParameterDescriptorImpl]

'startOffset' @ [288:29] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktEnumEntry' @ [288:42] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall[ValueParameterDescriptorImpl]

'endOffset' @ [288:54] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [289:17] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'symbolTable' @ [289:25] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceConstructor' @ [289:37] ==> public final fun referenceConstructor(descriptor: ClassConstructorDescriptor): IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'enumClassConstructor' @ [289:58] ==> val enumClassConstructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCallOrSuperCall[LocalVariableDescriptor]

'CallGenerator' @ [294:13] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'this' @ [294:27] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCall[ReceiverParameterDescriptorImpl]

'generateEnumConstructorSuperCall' @ [294:33] ==> public final fun generateEnumConstructorSuperCall(startOffset: Int, endOffset: Int, call: CallBuilder): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'ktEnumEntry' @ [294:66] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCall[ValueParameterDescriptorImpl]

'startOffset' @ [294:78] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktEnumEntry' @ [294:91] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCall[ValueParameterDescriptorImpl]

'endOffset' @ [294:103] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'pregenerateCall' @ [295:66] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'constructorCall' @ [295:82] ==> value-parameter constructorCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateEnumConstructorCall[ValueParameterDescriptorImpl]

