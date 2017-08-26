'StatementGeneratorExtension' @ [28:77] ==> public constructor StatementGeneratorExtension(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension[ClassConstructorDescriptorImpl]

'statementGenerator' @ [28:105] ==> value-parameter statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.<init>[ValueParameterDescriptorImpl]

'getInferredTypeWithImplicitCastsOrFail' @ [30:26] ==> public fun Generator.getInferredTypeWithImplicitCastsOrFail(key: KtExpression): KotlinType defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'ktTry' @ [30:65] ==> value-parameter ktTry: KtTryExpression defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[ValueParameterDescriptorImpl]

'IrTryImpl' @ [31:26] ==> public constructor IrTryImpl(startOffset: Int, endOffset: Int, type: KotlinType) defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[DeserializedClassConstructorDescriptor]

'ktTry' @ [31:36] ==> value-parameter ktTry: KtTryExpression defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[ValueParameterDescriptorImpl]

'startOffset' @ [31:42] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktTry' @ [31:55] ==> value-parameter ktTry: KtTryExpression defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[ValueParameterDescriptorImpl]

'endOffset' @ [31:61] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'resultType' @ [31:72] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[LocalVariableDescriptor]

'irTryCatch' @ [33:9] ==> val irTryCatch: IrTryImpl defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[LocalVariableDescriptor]

'tryResult' @ [33:20] ==> public open lateinit var tryResult: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[DeserializedPropertyDescriptor]

'statementGenerator' @ [33:32] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [33:51] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktTry' @ [33:70] ==> value-parameter ktTry: KtTryExpression defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[ValueParameterDescriptorImpl]

'tryBlock' @ [33:76] ==> public final val KtTryExpression.tryBlock: KtBlockExpression[MyPropertyDescriptor]

'ktTry' @ [35:31] ==> value-parameter ktTry: KtTryExpression defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[ValueParameterDescriptorImpl]

'catchClauses' @ [35:37] ==> public final val KtTryExpression.catchClauses: (MutableList<(KtCatchClause..KtCatchClause?)>..List<(KtCatchClause..KtCatchClause?)>)[MyPropertyDescriptor]

'ktCatchClause' @ [36:36] ==> val ktCatchClause: (KtCatchClause..KtCatchClause?) defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[LocalVariableDescriptor]

'catchParameter' @ [36:50] ==> public final val KtCatchClause.catchParameter: KtParameter?[MyPropertyDescriptor]

'ktCatchClause' @ [37:31] ==> val ktCatchClause: (KtCatchClause..KtCatchClause?) defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[LocalVariableDescriptor]

'catchBody' @ [37:45] ==> public final val KtCatchClause.catchBody: KtExpression?[MyPropertyDescriptor]

'getOrFail' @ [38:44] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>, key: (KtParameter..KtParameter?)): (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'VALUE_PARAMETER' @ [38:69] ==> public final val VALUE_PARAMETER: (WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktCatchParameter' @ [38:86] ==> val ktCatchParameter: KtParameter defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[LocalVariableDescriptor]

'IrCatchImpl' @ [40:27] ==> public constructor IrCatchImpl(startOffset: Int, endOffset: Int, catchParameter: IrVariable) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[DeserializedClassConstructorDescriptor]

'ktCatchClause' @ [41:21] ==> val ktCatchClause: (KtCatchClause..KtCatchClause?) defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[LocalVariableDescriptor]

'startOffset' @ [41:35] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktCatchClause' @ [41:48] ==> val ktCatchClause: (KtCatchClause..KtCatchClause?) defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[LocalVariableDescriptor]

'endOffset' @ [41:62] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [42:21] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator[PropertyDescriptorImpl]

'symbolTable' @ [42:29] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareVariable' @ [42:41] ==> public final fun declareVariable(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: VariableDescriptor): IrVariable defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktCatchParameter' @ [43:29] ==> val ktCatchParameter: KtParameter defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[LocalVariableDescriptor]

'startOffset' @ [43:46] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktCatchParameter' @ [43:59] ==> val ktCatchParameter: KtParameter defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[LocalVariableDescriptor]

'endOffset' @ [43:76] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'CATCH_PARAMETER' @ [44:49] ==> public object CATCH_PARAMETER : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'catchParameterDescriptor' @ [45:29] ==> val catchParameterDescriptor: (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[LocalVariableDescriptor]

'apply' @ [47:15] ==> @InlineOnly public inline fun <T> IrCatchImpl.apply(block: IrCatchImpl.() -> Unit): IrCatchImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCatchImpl

'result' @ [48:17] ==> public open lateinit var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[DeserializedPropertyDescriptor]

'statementGenerator' @ [48:26] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [48:45] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktCatchBody' @ [48:64] ==> val ktCatchBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[LocalVariableDescriptor]

'irTryCatch' @ [51:13] ==> val irTryCatch: IrTryImpl defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[LocalVariableDescriptor]

'catches' @ [51:24] ==> public open val catches: MutableList<IrCatch> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[DeserializedPropertyDescriptor]

'add' @ [51:32] ==> public abstract fun add(element: IrCatch): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irCatch' @ [51:36] ==> val irCatch: IrCatchImpl defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[LocalVariableDescriptor]

'irTryCatch' @ [54:9] ==> val irTryCatch: IrTryImpl defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[LocalVariableDescriptor]

'finallyExpression' @ [54:20] ==> public open var finallyExpression: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[DeserializedPropertyDescriptor]

'ktTry' @ [54:40] ==> value-parameter ktTry: KtTryExpression defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[ValueParameterDescriptorImpl]

'finallyBlock' @ [54:46] ==> public final val KtTryExpression.finallyBlock: KtFinallySection?[MyPropertyDescriptor]

'let' @ [54:60] ==> @InlineOnly public inline fun <T, R> KtFinallySection.let(block: (KtFinallySection) -> IrExpression): IrExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFinallySection
    <R> -> IrExpression

'statementGenerator' @ [54:65] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [54:84] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'it' @ [54:103] ==> value-parameter it: KtFinallySection defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch.<anonymous>[ValueParameterDescriptorImpl]

'finalExpression' @ [54:106] ==> public final val KtFinallySection.finalExpression: (KtBlockExpression..KtBlockExpression?)[MyPropertyDescriptor]

'irTryCatch' @ [56:16] ==> val irTryCatch: IrTryImpl defined in org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch[LocalVariableDescriptor]

