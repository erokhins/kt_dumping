'DeclarationGeneratorExtension' @ [28:83] ==> public constructor DeclarationGeneratorExtension(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGeneratorExtension[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [28:113] ==> value-parameter declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.<init>[ValueParameterDescriptorImpl]

'context' @ [30:13] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator[PropertyDescriptorImpl]

'symbolTable' @ [30:21] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareAnonymousInitializer' @ [30:33] ==> public final fun declareAnonymousInitializer(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ClassDescriptor): IrAnonymousInitializer defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktAnonymousInitializer' @ [31:21] ==> value-parameter ktAnonymousInitializer: KtAnonymousInitializer defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration[ValueParameterDescriptorImpl]

'startOffset' @ [31:44] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktAnonymousInitializer' @ [31:57] ==> value-parameter ktAnonymousInitializer: KtAnonymousInitializer defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration[ValueParameterDescriptorImpl]

'endOffset' @ [31:80] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DEFINED' @ [31:111] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'classDescriptor' @ [31:120] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration[ValueParameterDescriptorImpl]

'buildWithScope' @ [32:15] ==> public final inline fun <T : IrDeclaration> IrAnonymousInitializer.buildWithScope(builder: (IrAnonymousInitializer) -> Unit): IrAnonymousInitializer defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclaration> -> IrAnonymousInitializer

'createBodyGenerator' @ [33:37] ==> public fun Generator.createBodyGenerator(scopeOwnerSymbol: IrSymbol): BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'irAnonymousInitializer' @ [33:57] ==> value-parameter irAnonymousInitializer: IrAnonymousInitializer defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [33:80] ==> public abstract val symbol: IrAnonymousInitializerSymbol defined in org.jetbrains.kotlin.ir.declarations.IrAnonymousInitializer[DeserializedPropertyDescriptor]

'bodyGenerator' @ [34:42] ==> val bodyGenerator: BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration.<anonymous>[LocalVariableDescriptor]

'createStatementGenerator' @ [34:56] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktAnonymousInitializer' @ [35:30] ==> value-parameter ktAnonymousInitializer: KtAnonymousInitializer defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration[ValueParameterDescriptorImpl]

'body' @ [35:53] ==> public abstract val body: KtExpression? defined in org.jetbrains.kotlin.psi.KtAnonymousInitializer[DeserializedPropertyDescriptor]

'IrBlockBodyImpl' @ [36:35] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedClassConstructorDescriptor]

'ktBody' @ [36:51] ==> val ktBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [36:58] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktBody' @ [36:71] ==> val ktBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [36:78] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'if (ktBody is KtBlockExpression) {
                    statementGenerator.generateStatements(ktBody.statements, irBlockBody)
                }
                else {
                    irBlockBody.statements.add(statementGenerator.generateStatement(ktBody))
                }' @ [37:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'ktBody' @ [37:21] ==> val ktBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration.<anonymous>[LocalVariableDescriptor]

'statementGenerator' @ [38:21] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration.<anonymous>[LocalVariableDescriptor]

'generateStatements' @ [38:40] ==> public final fun generateStatements(ktStatements: List<KtExpression>, to: IrStatementContainer): MutableList<IrStatement> defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktBody' @ [38:59] ==> val ktBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration.<anonymous>[LocalVariableDescriptor]

'statements' @ [38:66] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'irBlockBody' @ [38:78] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration.<anonymous>[LocalVariableDescriptor]

'irBlockBody' @ [41:21] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration.<anonymous>[LocalVariableDescriptor]

'statements' @ [41:33] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [41:44] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statementGenerator' @ [41:48] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration.<anonymous>[LocalVariableDescriptor]

'generateStatement' @ [41:67] ==> public final fun generateStatement(ktElement: KtElement): IrStatement defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktBody' @ [41:85] ==> val ktBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration.<anonymous>[LocalVariableDescriptor]

'irAnonymousInitializer' @ [43:17] ==> value-parameter irAnonymousInitializer: IrAnonymousInitializer defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [43:40] ==> public abstract var body: IrBlockBody defined in org.jetbrains.kotlin.ir.declarations.IrAnonymousInitializer[DeserializedPropertyDescriptor]

'irBlockBody' @ [43:47] ==> val irBlockBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator.generateAnonymousInitializerDeclaration.<anonymous>[LocalVariableDescriptor]

