'DeclarationGeneratorExtension' @ [34:71] ==> public constructor DeclarationGeneratorExtension(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGeneratorExtension[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [34:101] ==> value-parameter declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.<init>[ValueParameterDescriptorImpl]

'this' @ [35:46] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'DeclarationGenerator' @ [35:51] ==> public constructor DeclarationGenerator(context: GeneratorContext) defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[ClassConstructorDescriptorImpl]

'context' @ [35:72] ==> value-parameter context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.<init>[ValueParameterDescriptorImpl]

'declareSimpleFunction' @ [38:13] ==> private final inline fun declareSimpleFunction(ktFunction: KtFunction, ktReceiver: KtElement?, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor, generateBody: BodyGenerator.() -> IrBody?): IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'ktFunction' @ [39:21] ==> value-parameter ktFunction: KtNamedFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionDeclaration[ValueParameterDescriptorImpl]

'ktFunction' @ [40:21] ==> value-parameter ktFunction: KtNamedFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionDeclaration[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [40:32] ==> public final val KtNamedFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'DEFINED' @ [41:41] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'getOrFail' @ [42:21] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>, key: (PsiElement..PsiElement?)): (SimpleFunctionDescriptor..SimpleFunctionDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)

'FUNCTION' @ [42:46] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktFunction' @ [42:56] ==> value-parameter ktFunction: KtNamedFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionDeclaration[ValueParameterDescriptorImpl]

'ktFunction' @ [44:17] ==> value-parameter ktFunction: KtNamedFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionDeclaration[ValueParameterDescriptorImpl]

'bodyExpression' @ [44:28] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'let' @ [44:44] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> IrBody): IrBody defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> IrBody

'generateFunctionBody' @ [44:50] ==> public final fun generateFunctionBody(ktBody: KtExpression): IrBody defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'it' @ [44:71] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionDeclaration.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'declareSimpleFunction' @ [48:13] ==> private final inline fun declareSimpleFunction(ktFunction: KtFunction, ktReceiver: KtElement?, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor, generateBody: BodyGenerator.() -> IrBody?): IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'ktFunction' @ [49:21] ==> value-parameter ktFunction: KtFunctionLiteral defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateLambdaFunctionDeclaration[ValueParameterDescriptorImpl]

'LOCAL_FUNCTION_FOR_LAMBDA' @ [51:41] ==> public object LOCAL_FUNCTION_FOR_LAMBDA : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'getOrFail' @ [52:21] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>, key: (PsiElement..PsiElement?)): (SimpleFunctionDescriptor..SimpleFunctionDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)

'FUNCTION' @ [52:46] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktFunction' @ [52:56] ==> value-parameter ktFunction: KtFunctionLiteral defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateLambdaFunctionDeclaration[ValueParameterDescriptorImpl]

'generateLambdaBody' @ [54:17] ==> public final fun generateLambdaBody(ktFun: KtFunctionLiteral): IrBody defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktFunction' @ [54:36] ==> value-parameter ktFunction: KtFunctionLiteral defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateLambdaFunctionDeclaration[ValueParameterDescriptorImpl]

'context' @ [58:13] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[PropertyDescriptorImpl]

'symbolTable' @ [58:21] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareSimpleFunction' @ [58:33] ==> public final fun declareSimpleFunction(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktElement' @ [59:21] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFakeOverrideFunction[ValueParameterDescriptorImpl]

'startOffsetOrUndefined' @ [59:31] ==> public val PsiElement?.startOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'ktElement' @ [59:55] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFakeOverrideFunction[ValueParameterDescriptorImpl]

'endOffsetOrUndefined' @ [59:65] ==> public val PsiElement?.endOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'FAKE_OVERRIDE' @ [60:41] ==> public object FAKE_OVERRIDE : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'functionDescriptor' @ [61:21] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFakeOverrideFunction[ValueParameterDescriptorImpl]

'buildWithScope' @ [62:15] ==> public final inline fun <T : IrDeclaration> IrSimpleFunction.buildWithScope(builder: (IrSimpleFunction) -> Unit): IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclaration> -> IrSimpleFunction

'generateFunctionParameterDeclarations' @ [63:17] ==> public final fun generateFunctionParameterDeclarations(irFunction: IrFunction, ktParameterOwner: KtElement?, ktReceiverParameterElement: KtElement?): Unit defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'irFunction' @ [63:55] ==> value-parameter irFunction: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFakeOverrideFunction.<anonymous>[ValueParameterDescriptorImpl]

'ktElement' @ [63:67] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFakeOverrideFunction[ValueParameterDescriptorImpl]

'context' @ [73:13] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[PropertyDescriptorImpl]

'symbolTable' @ [73:21] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareSimpleFunction' @ [73:33] ==> public final fun declareSimpleFunction(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktFunction' @ [74:21] ==> value-parameter ktFunction: KtFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareSimpleFunction[ValueParameterDescriptorImpl]

'startOffset' @ [74:32] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktFunction' @ [74:45] ==> value-parameter ktFunction: KtFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareSimpleFunction[ValueParameterDescriptorImpl]

'endOffset' @ [74:56] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'origin' @ [74:67] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareSimpleFunction[ValueParameterDescriptorImpl]

'descriptor' @ [74:75] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareSimpleFunction[ValueParameterDescriptorImpl]

'buildWithScope' @ [75:15] ==> public final inline fun <T : IrDeclaration> IrSimpleFunction.buildWithScope(builder: (IrSimpleFunction) -> Unit): IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclaration> -> IrSimpleFunction

'generateFunctionParameterDeclarations' @ [76:17] ==> public final fun generateFunctionParameterDeclarations(irFunction: IrFunction, ktParameterOwner: KtElement?, ktReceiverParameterElement: KtElement?): Unit defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'irFunction' @ [76:55] ==> value-parameter irFunction: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareSimpleFunction.<anonymous>[ValueParameterDescriptorImpl]

'ktFunction' @ [76:67] ==> value-parameter ktFunction: KtFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareSimpleFunction[ValueParameterDescriptorImpl]

'ktReceiver' @ [76:79] ==> value-parameter ktReceiver: KtElement? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareSimpleFunction[ValueParameterDescriptorImpl]

'irFunction' @ [77:17] ==> value-parameter irFunction: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareSimpleFunction.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [77:28] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'createBodyGenerator' @ [77:35] ==> public fun Generator.createBodyGenerator(scopeOwnerSymbol: IrSymbol): BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'irFunction' @ [77:55] ==> value-parameter irFunction: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareSimpleFunction.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [77:66] ==> public abstract val symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'invoke' @ [77:74] ==> public abstract operator fun BodyGenerator.invoke(): IrBody? defined in kotlin.Function1[FunctionInvokeDescriptor]

'declarationGenerator' @ [85:9] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[PropertyDescriptorImpl]

'generateTypeParameterDeclarations' @ [85:30] ==> public final fun generateTypeParameterDeclarations(irTypeParametersOwner: IrTypeParametersContainer, from: List<TypeParameterDescriptor>): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'irFunction' @ [85:64] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionParameterDeclarations[ValueParameterDescriptorImpl]

'irFunction' @ [85:76] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionParameterDeclarations[ValueParameterDescriptorImpl]

'descriptor' @ [85:87] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'typeParameters' @ [85:98] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'generateValueParameterDeclarations' @ [86:9] ==> private final fun generateValueParameterDeclarations(irFunction: IrFunction, ktParameterOwner: KtElement?, ktReceiverParameterElement: KtElement?, withDefaultValues: Boolean = ...): Unit defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'irFunction' @ [86:44] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionParameterDeclarations[ValueParameterDescriptorImpl]

'ktParameterOwner' @ [86:56] ==> value-parameter ktParameterOwner: KtElement? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionParameterDeclarations[ValueParameterDescriptorImpl]

'ktReceiverParameterElement' @ [86:74] ==> value-parameter ktReceiverParameterElement: KtElement? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionParameterDeclarations[ValueParameterDescriptorImpl]

'context' @ [94:13] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[PropertyDescriptorImpl]

'symbolTable' @ [94:21] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareSimpleFunction' @ [94:33] ==> public final fun declareSimpleFunction(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktAccessor' @ [95:21] ==> value-parameter ktAccessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor[ValueParameterDescriptorImpl]

'startOffset' @ [95:33] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktProperty' @ [95:48] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor[ValueParameterDescriptorImpl]

'startOffset' @ [95:59] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktAccessor' @ [96:21] ==> value-parameter ktAccessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor[ValueParameterDescriptorImpl]

'endOffset' @ [96:33] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktProperty' @ [96:46] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor[ValueParameterDescriptorImpl]

'endOffset' @ [96:57] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'if (ktAccessor != null) IrDeclarationOrigin.DEFINED else IrDeclarationOrigin.DEFAULT_PROPERTY_ACCESSOR' @ [97:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrDeclarationOriginImpl, elseBranch: IrDeclarationOriginImpl): IrDeclarationOriginImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrDeclarationOriginImpl

'ktAccessor' @ [97:25] ==> value-parameter ktAccessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor[ValueParameterDescriptorImpl]

'DEFINED' @ [97:65] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'DEFAULT_PROPERTY_ACCESSOR' @ [97:98] ==> public object DEFAULT_PROPERTY_ACCESSOR : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'descriptor' @ [98:21] ==> value-parameter descriptor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor[ValueParameterDescriptorImpl]

'buildWithScope' @ [99:15] ==> public final inline fun <T : IrDeclaration> IrSimpleFunction.buildWithScope(builder: (IrSimpleFunction) -> Unit): IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclaration> -> IrSimpleFunction

'generateFunctionParameterDeclarations' @ [100:17] ==> public final fun generateFunctionParameterDeclarations(irFunction: IrFunction, ktParameterOwner: KtElement?, ktReceiverParameterElement: KtElement?): Unit defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'irAccessor' @ [100:55] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor.<anonymous>[ValueParameterDescriptorImpl]

'ktAccessor' @ [100:67] ==> value-parameter ktAccessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor[ValueParameterDescriptorImpl]

'ktProperty' @ [100:81] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor[ValueParameterDescriptorImpl]

'ktProperty' @ [100:93] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [100:104] ==> public final val KtProperty.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'ktAccessor' @ [101:40] ==> value-parameter ktAccessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor[ValueParameterDescriptorImpl]

'bodyExpression' @ [101:52] ==> public final val KtPropertyAccessor.bodyExpression: KtExpression?[MyPropertyDescriptor]

'irAccessor' @ [102:17] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [102:28] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'if (ktBodyExpression != null)
                            createBodyGenerator(irAccessor.symbol).generateFunctionBody(ktBodyExpression)
                        else
                            generateDefaultAccessorBody(ktProperty, descriptor, irAccessor)' @ [103:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrBody?, elseBranch: IrBody?): IrBody?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrBody?

'ktBodyExpression' @ [103:29] ==> val ktBodyExpression: KtExpression? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor.<anonymous>[LocalVariableDescriptor]

'createBodyGenerator' @ [104:29] ==> public fun Generator.createBodyGenerator(scopeOwnerSymbol: IrSymbol): BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'irAccessor' @ [104:49] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [104:60] ==> public abstract val symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'generateFunctionBody' @ [104:68] ==> public final fun generateFunctionBody(ktBody: KtExpression): IrBody defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktBodyExpression' @ [104:89] ==> val ktBodyExpression: KtExpression? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor.<anonymous>[LocalVariableDescriptor]

'generateDefaultAccessorBody' @ [106:29] ==> private final fun generateDefaultAccessorBody(ktProperty: KtElement, accessor: PropertyAccessorDescriptor, irAccessor: IrSimpleFunction): IrBlockBody? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'ktProperty' @ [106:57] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor[ValueParameterDescriptorImpl]

'descriptor' @ [106:69] ==> value-parameter descriptor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor[ValueParameterDescriptorImpl]

'irAccessor' @ [106:81] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePropertyAccessor.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [113:13] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[PropertyDescriptorImpl]

'symbolTable' @ [113:21] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareSimpleFunction' @ [113:33] ==> public final fun declareSimpleFunction(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktParameter' @ [114:21] ==> value-parameter ktParameter: KtParameter defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorForPrimaryConstructorParameter[ValueParameterDescriptorImpl]

'startOffsetOrUndefined' @ [114:33] ==> public val PsiElement?.startOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'ktParameter' @ [115:21] ==> value-parameter ktParameter: KtParameter defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorForPrimaryConstructorParameter[ValueParameterDescriptorImpl]

'endOffsetOrUndefined' @ [115:33] ==> public val PsiElement?.endOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'DEFAULT_PROPERTY_ACCESSOR' @ [116:41] ==> public object DEFAULT_PROPERTY_ACCESSOR : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'descriptor' @ [117:21] ==> value-parameter descriptor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorForPrimaryConstructorParameter[ValueParameterDescriptorImpl]

'buildWithScope' @ [118:15] ==> public final inline fun <T : IrDeclaration> IrSimpleFunction.buildWithScope(builder: (IrSimpleFunction) -> Unit): IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclaration> -> IrSimpleFunction

'declarationGenerator' @ [119:17] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[PropertyDescriptorImpl]

'generateTypeParameterDeclarations' @ [119:38] ==> public final fun generateTypeParameterDeclarations(irTypeParametersOwner: IrTypeParametersContainer, from: List<TypeParameterDescriptor>): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'irAccessor' @ [119:72] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorForPrimaryConstructorParameter.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [119:84] ==> value-parameter descriptor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorForPrimaryConstructorParameter[ValueParameterDescriptorImpl]

'typeParameters' @ [119:95] ==> public final val PropertyAccessorDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'FunctionGenerator' @ [120:17] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [120:35] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[PropertyDescriptorImpl]

'generateSyntheticFunctionParameterDeclarations' @ [120:57] ==> public final fun generateSyntheticFunctionParameterDeclarations(irFunction: IrFunction): Unit defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'irAccessor' @ [120:104] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorForPrimaryConstructorParameter.<anonymous>[ValueParameterDescriptorImpl]

'irAccessor' @ [121:17] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorForPrimaryConstructorParameter.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [121:28] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'generateDefaultAccessorBody' @ [121:35] ==> private final fun generateDefaultAccessorBody(ktProperty: KtElement, accessor: PropertyAccessorDescriptor, irAccessor: IrSimpleFunction): IrBlockBody? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'ktParameter' @ [121:63] ==> value-parameter ktParameter: KtParameter defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorForPrimaryConstructorParameter[ValueParameterDescriptorImpl]

'descriptor' @ [121:76] ==> value-parameter descriptor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorForPrimaryConstructorParameter[ValueParameterDescriptorImpl]

'irAccessor' @ [121:88] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorForPrimaryConstructorParameter.<anonymous>[ValueParameterDescriptorImpl]

'if (accessor.modality == Modality.ABSTRACT)
                null
            else
                when (accessor) {
                    is PropertyGetterDescriptor -> generateDefaultGetterBody(ktProperty, accessor, irAccessor)
                    is PropertySetterDescriptor -> generateDefaultSetterBody(ktProperty, accessor, irAccessor)
                    else -> throw AssertionError("Should be getter or setter: $accessor")
                }' @ [125:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrBlockBody?, elseBranch: IrBlockBody?): IrBlockBody?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrBlockBody?

'accessor' @ [125:17] ==> value-parameter accessor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorBody[ValueParameterDescriptorImpl]

'modality' @ [125:26] ==> public final val PropertyAccessorDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [125:38] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [125:47] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'when (accessor) {
                    is PropertyGetterDescriptor -> generateDefaultGetterBody(ktProperty, accessor, irAccessor)
                    is PropertySetterDescriptor -> generateDefaultSetterBody(ktProperty, accessor, irAccessor)
                    else -> throw AssertionError("Should be getter or setter: $accessor")
                }' @ [128:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrBlockBody, entry1: IrBlockBody, entry2: IrBlockBody): IrBlockBody[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrBlockBody

'accessor' @ [128:23] ==> value-parameter accessor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorBody[ValueParameterDescriptorImpl]

'generateDefaultGetterBody' @ [129:52] ==> private final fun generateDefaultGetterBody(ktProperty: KtElement, getter: PropertyGetterDescriptor, irAccessor: IrSimpleFunction): IrBlockBody defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'ktProperty' @ [129:78] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorBody[ValueParameterDescriptorImpl]

'accessor' @ [129:90] ==> value-parameter accessor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorBody[ValueParameterDescriptorImpl]

'irAccessor' @ [129:100] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorBody[ValueParameterDescriptorImpl]

'generateDefaultSetterBody' @ [130:52] ==> private final fun generateDefaultSetterBody(ktProperty: KtElement, setter: PropertySetterDescriptor, irAccessor: IrSimpleFunction): IrBlockBody defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'ktProperty' @ [130:78] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorBody[ValueParameterDescriptorImpl]

'accessor' @ [130:90] ==> value-parameter accessor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorBody[ValueParameterDescriptorImpl]

'irAccessor' @ [130:100] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorBody[ValueParameterDescriptorImpl]

'AssertionError' @ [131:35] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'accessor' @ [131:80] ==> value-parameter accessor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultAccessorBody[ValueParameterDescriptorImpl]

'getter' @ [135:24] ==> value-parameter getter: PropertyGetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultGetterBody[ValueParameterDescriptorImpl]

'correspondingProperty' @ [135:31] ==> public final val PropertyGetterDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'IrBlockBodyImpl' @ [137:22] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedClassConstructorDescriptor]

'ktProperty' @ [137:38] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultGetterBody[ValueParameterDescriptorImpl]

'startOffset' @ [137:49] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktProperty' @ [137:62] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultGetterBody[ValueParameterDescriptorImpl]

'endOffset' @ [137:73] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'generateReceiverExpressionForDefaultPropertyAccessor' @ [139:24] ==> private final fun generateReceiverExpressionForDefaultPropertyAccessor(ktProperty: KtElement, property: PropertyDescriptor): IrExpression? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'ktProperty' @ [139:77] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultGetterBody[ValueParameterDescriptorImpl]

'property' @ [139:89] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultGetterBody[LocalVariableDescriptor]

'irBody' @ [141:9] ==> val irBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultGetterBody[LocalVariableDescriptor]

'statements' @ [141:16] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [141:27] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrReturnImpl' @ [142:17] ==> public constructor IrReturnImpl(startOffset: Int, endOffset: Int, type: KotlinType, returnTargetSymbol: IrFunctionSymbol, value: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl[DeserializedClassConstructorDescriptor]

'ktProperty' @ [143:25] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultGetterBody[ValueParameterDescriptorImpl]

'startOffset' @ [143:36] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktProperty' @ [143:49] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultGetterBody[ValueParameterDescriptorImpl]

'endOffset' @ [143:60] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [143:71] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[PropertyDescriptorImpl]

'builtIns' @ [143:79] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'nothingType' @ [143:88] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'irAccessor' @ [144:25] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultGetterBody[ValueParameterDescriptorImpl]

'symbol' @ [144:36] ==> public abstract val symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'IrGetFieldImpl' @ [145:25] ==> public constructor IrGetFieldImpl(startOffset: Int, endOffset: Int, symbol: IrFieldSymbol, receiver: IrExpression?, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetFieldImpl[DeserializedClassConstructorDescriptor]

'ktProperty' @ [146:33] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultGetterBody[ValueParameterDescriptorImpl]

'startOffset' @ [146:44] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktProperty' @ [146:57] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultGetterBody[ValueParameterDescriptorImpl]

'endOffset' @ [146:68] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [147:33] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[PropertyDescriptorImpl]

'symbolTable' @ [147:41] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceField' @ [147:53] ==> public final fun referenceField(descriptor: PropertyDescriptor): IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'property' @ [147:68] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultGetterBody[LocalVariableDescriptor]

'receiver' @ [148:33] ==> val receiver: IrExpression? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultGetterBody[LocalVariableDescriptor]

'irBody' @ [152:16] ==> val irBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultGetterBody[LocalVariableDescriptor]

'setter' @ [156:24] ==> value-parameter setter: PropertySetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultSetterBody[ValueParameterDescriptorImpl]

'correspondingProperty' @ [156:31] ==> public final val PropertySetterDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'IrBlockBodyImpl' @ [158:22] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedClassConstructorDescriptor]

'ktProperty' @ [158:38] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultSetterBody[ValueParameterDescriptorImpl]

'startOffset' @ [158:49] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktProperty' @ [158:62] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultSetterBody[ValueParameterDescriptorImpl]

'endOffset' @ [158:73] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'generateReceiverExpressionForDefaultPropertyAccessor' @ [160:24] ==> private final fun generateReceiverExpressionForDefaultPropertyAccessor(ktProperty: KtElement, property: PropertyDescriptor): IrExpression? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'ktProperty' @ [160:77] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultSetterBody[ValueParameterDescriptorImpl]

'property' @ [160:89] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultSetterBody[LocalVariableDescriptor]

'irAccessor' @ [162:31] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultSetterBody[ValueParameterDescriptorImpl]

'valueParameters' @ [162:42] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'single' @ [162:58] ==> public fun <T> List<IrValueParameter>.single(): IrValueParameter defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameter

'symbol' @ [162:67] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'irBody' @ [163:9] ==> val irBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultSetterBody[LocalVariableDescriptor]

'statements' @ [163:16] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [163:27] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrSetFieldImpl' @ [164:17] ==> public constructor IrSetFieldImpl(startOffset: Int, endOffset: Int, symbol: IrFieldSymbol, receiver: IrExpression?, value: IrExpression, origin: IrStatementOrigin? = ..., superQualifierSymbol: IrClassSymbol? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSetFieldImpl[DeserializedClassConstructorDescriptor]

'ktProperty' @ [165:25] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultSetterBody[ValueParameterDescriptorImpl]

'startOffset' @ [165:36] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktProperty' @ [165:49] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultSetterBody[ValueParameterDescriptorImpl]

'endOffset' @ [165:60] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [166:25] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[PropertyDescriptorImpl]

'symbolTable' @ [166:33] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceField' @ [166:45] ==> public final fun referenceField(descriptor: PropertyDescriptor): IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'property' @ [166:60] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultSetterBody[LocalVariableDescriptor]

'receiver' @ [167:25] ==> val receiver: IrExpression? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultSetterBody[LocalVariableDescriptor]

'IrGetValueImpl' @ [168:25] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'ktProperty' @ [168:40] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultSetterBody[ValueParameterDescriptorImpl]

'startOffset' @ [168:51] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktProperty' @ [168:64] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultSetterBody[ValueParameterDescriptorImpl]

'endOffset' @ [168:75] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'setterParameter' @ [168:86] ==> val setterParameter: IrValueParameterSymbol defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultSetterBody[LocalVariableDescriptor]

'irBody' @ [171:16] ==> val irBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateDefaultSetterBody[LocalVariableDescriptor]

'property' @ [175:37] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateReceiverExpressionForDefaultPropertyAccessor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [175:46] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'when (containingDeclaration) {
            is ClassDescriptor ->
                IrGetValueImpl(ktProperty.startOffset, ktProperty.endOffset,
                               context.symbolTable.referenceValue(containingDeclaration.thisAsReceiverParameter))
            else -> null
        }' @ [176:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression?, entry1: IrExpression?): IrExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression?

'containingDeclaration' @ [176:22] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateReceiverExpressionForDefaultPropertyAccessor[LocalVariableDescriptor]

'IrGetValueImpl' @ [178:17] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'ktProperty' @ [178:32] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateReceiverExpressionForDefaultPropertyAccessor[ValueParameterDescriptorImpl]

'startOffset' @ [178:43] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktProperty' @ [178:56] ==> value-parameter ktProperty: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateReceiverExpressionForDefaultPropertyAccessor[ValueParameterDescriptorImpl]

'endOffset' @ [178:67] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [179:32] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[PropertyDescriptorImpl]

'symbolTable' @ [179:40] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceValue' @ [179:52] ==> public final fun referenceValue(value: ValueDescriptor): IrValueSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [179:67] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateReceiverExpressionForDefaultPropertyAccessor[LocalVariableDescriptor]

'thisAsReceiverParameter' @ [179:89] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'declareConstructor' @ [188:13] ==> private final inline fun declareConstructor(ktConstructorElement: KtElement, ktParametersElement: KtElement, constructorDescriptor: ClassConstructorDescriptor, generateBody: BodyGenerator.() -> IrBody): IrConstructor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'ktClassOrObject' @ [188:32] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePrimaryConstructor[ValueParameterDescriptorImpl]

'ktClassOrObject' @ [188:49] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePrimaryConstructor[ValueParameterDescriptorImpl]

'primaryConstructor' @ [188:65] ==> public final val KtClassOrObject.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'ktClassOrObject' @ [188:87] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePrimaryConstructor[ValueParameterDescriptorImpl]

'primaryConstructorDescriptor' @ [188:104] ==> value-parameter primaryConstructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePrimaryConstructor[ValueParameterDescriptorImpl]

'generatePrimaryConstructorBody' @ [189:17] ==> public final fun generatePrimaryConstructorBody(ktClassOrObject: KtClassOrObject): IrBody defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktClassOrObject' @ [189:48] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePrimaryConstructor[ValueParameterDescriptorImpl]

'declareConstructor' @ [193:13] ==> private final inline fun declareConstructor(ktConstructorElement: KtElement, ktParametersElement: KtElement, constructorDescriptor: ClassConstructorDescriptor, generateBody: BodyGenerator.() -> IrBody): IrConstructor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'ktConstructor' @ [194:21] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateSecondaryConstructor[ValueParameterDescriptorImpl]

'ktConstructor' @ [194:36] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateSecondaryConstructor[ValueParameterDescriptorImpl]

'getOrFail' @ [195:21] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>, key: (PsiElement..PsiElement?)): (ConstructorDescriptor..ConstructorDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.ConstructorDescriptor..org.jetbrains.kotlin.descriptors.ConstructorDescriptor?)

'CONSTRUCTOR' @ [195:46] ==> public final val CONSTRUCTOR: (WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktConstructor' @ [195:59] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateSecondaryConstructor[ValueParameterDescriptorImpl]

'if (ktConstructor.isConstructorDelegatingToSuper(context.bindingContext))
                    generateSecondaryConstructorBodyWithNestedInitializers(ktConstructor)
                else
                    generateSecondaryConstructorBody(ktConstructor)' @ [197:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrBody, elseBranch: IrBody): IrBody[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrBody

'ktConstructor' @ [197:21] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateSecondaryConstructor[ValueParameterDescriptorImpl]

'isConstructorDelegatingToSuper' @ [197:35] ==> public fun KtSecondaryConstructor.isConstructorDelegatingToSuper(bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [197:66] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[PropertyDescriptorImpl]

'bindingContext' @ [197:74] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'generateSecondaryConstructorBodyWithNestedInitializers' @ [198:21] ==> public final fun generateSecondaryConstructorBodyWithNestedInitializers(ktConstructor: KtSecondaryConstructor): IrBody defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktConstructor' @ [198:76] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateSecondaryConstructor[ValueParameterDescriptorImpl]

'generateSecondaryConstructorBody' @ [200:21] ==> public final fun generateSecondaryConstructorBody(ktConstructor: KtSecondaryConstructor): IrBody defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktConstructor' @ [200:54] ==> value-parameter ktConstructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateSecondaryConstructor[ValueParameterDescriptorImpl]

'context' @ [210:13] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[PropertyDescriptorImpl]

'symbolTable' @ [210:21] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareConstructor' @ [210:33] ==> public final fun declareConstructor(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ClassConstructorDescriptor): IrConstructor defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktConstructorElement' @ [211:21] ==> value-parameter ktConstructorElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareConstructor[ValueParameterDescriptorImpl]

'startOffset' @ [211:42] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktConstructorElement' @ [211:55] ==> value-parameter ktConstructorElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareConstructor[ValueParameterDescriptorImpl]

'endOffset' @ [211:76] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DEFINED' @ [211:107] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'constructorDescriptor' @ [211:116] ==> value-parameter constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareConstructor[ValueParameterDescriptorImpl]

'buildWithScope' @ [212:15] ==> public final inline fun <T : IrDeclaration> IrConstructor.buildWithScope(builder: (IrConstructor) -> Unit): IrConstructor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclaration> -> IrConstructor

'generateValueParameterDeclarations' @ [213:17] ==> private final fun generateValueParameterDeclarations(irFunction: IrFunction, ktParameterOwner: KtElement?, ktReceiverParameterElement: KtElement?, withDefaultValues: Boolean = ...): Unit defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'irConstructor' @ [213:52] ==> value-parameter irConstructor: IrConstructor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareConstructor.<anonymous>[ValueParameterDescriptorImpl]

'ktParametersElement' @ [213:67] ==> value-parameter ktParametersElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareConstructor[ValueParameterDescriptorImpl]

'irConstructor' @ [214:17] ==> value-parameter irConstructor: IrConstructor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareConstructor.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [214:31] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'createBodyGenerator' @ [214:38] ==> public fun Generator.createBodyGenerator(scopeOwnerSymbol: IrSymbol): BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'irConstructor' @ [214:58] ==> value-parameter irConstructor: IrConstructor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareConstructor.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [214:72] ==> public abstract val symbol: IrConstructorSymbol defined in org.jetbrains.kotlin.ir.declarations.IrConstructor[DeserializedPropertyDescriptor]

'invoke' @ [214:80] ==> public abstract operator fun BodyGenerator.invoke(): IrBody defined in kotlin.Function1[FunctionInvokeDescriptor]

'declarationGenerator' @ [218:9] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[PropertyDescriptorImpl]

'generateTypeParameterDeclarations' @ [218:30] ==> public final fun generateTypeParameterDeclarations(irTypeParametersOwner: IrTypeParametersContainer, from: List<TypeParameterDescriptor>): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'irFunction' @ [218:64] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateSyntheticFunctionParameterDeclarations[ValueParameterDescriptorImpl]

'irFunction' @ [218:76] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateSyntheticFunctionParameterDeclarations[ValueParameterDescriptorImpl]

'descriptor' @ [218:87] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'typeParameters' @ [218:98] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'generateValueParameterDeclarations' @ [219:9] ==> private final fun generateValueParameterDeclarations(irFunction: IrFunction, ktParameterOwner: KtElement?, ktReceiverParameterElement: KtElement?, withDefaultValues: Boolean = ...): Unit defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'irFunction' @ [219:44] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateSyntheticFunctionParameterDeclarations[ValueParameterDescriptorImpl]

'irFunction' @ [228:34] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations[ValueParameterDescriptorImpl]

'descriptor' @ [228:45] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'irFunction' @ [230:9] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [230:20] ==> public abstract var dispatchReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'functionDescriptor' @ [230:48] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [230:67] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'let' @ [230:94] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> IrValueParameter): IrValueParameter defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> IrValueParameter

'generateReceiverParameterDeclaration' @ [231:13] ==> private final fun generateReceiverParameterDeclaration(receiverParameterDescriptor: ReceiverParameterDescriptor, ktElement: KtElement?): IrValueParameter defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'it' @ [231:50] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'ktParameterOwner' @ [231:54] ==> value-parameter ktParameterOwner: KtElement? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations[ValueParameterDescriptorImpl]

'irFunction' @ [234:9] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [234:20] ==> public abstract var extensionReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'functionDescriptor' @ [234:49] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations[LocalVariableDescriptor]

'extensionReceiverParameter' @ [234:68] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'let' @ [234:96] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> IrValueParameter): IrValueParameter defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> IrValueParameter

'generateReceiverParameterDeclaration' @ [235:13] ==> private final fun generateReceiverParameterDeclaration(receiverParameterDescriptor: ReceiverParameterDescriptor, ktElement: KtElement?): IrValueParameter defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'it' @ [235:50] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'ktReceiverParameterElement' @ [235:54] ==> value-parameter ktReceiverParameterElement: KtElement? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations[ValueParameterDescriptorImpl]

'ktParameterOwner' @ [235:84] ==> value-parameter ktParameterOwner: KtElement? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations[ValueParameterDescriptorImpl]

'createBodyGenerator' @ [238:29] ==> public fun Generator.createBodyGenerator(scopeOwnerSymbol: IrSymbol): BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'irFunction' @ [238:49] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations[ValueParameterDescriptorImpl]

'symbol' @ [238:60] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'functionDescriptor' @ [239:9] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations[LocalVariableDescriptor]

'valueParameters' @ [239:28] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'mapTo' @ [239:44] ==> public inline fun <T, R, C : MutableCollection<in IrValueParameter>> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.mapTo(destination: MutableList<IrValueParameter>, transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> IrValueParameter): MutableList<IrValueParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> IrValueParameter
    <C : MutableCollection<in R>> -> MutableList<IrValueParameter>

'irFunction' @ [239:50] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations[ValueParameterDescriptorImpl]

'valueParameters' @ [239:61] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'DescriptorToSourceUtils' @ [240:31] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [240:55] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'valueParameterDescriptor' @ [240:79] ==> value-parameter valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'generateValueParameterDeclaration' @ [241:13] ==> private final fun generateValueParameterDeclaration(valueParameterDescriptor: ValueParameterDescriptor, ktParameter: KtParameter?, bodyGenerator: BodyGenerator, withDefaultValues: Boolean): IrValueParameter defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'valueParameterDescriptor' @ [241:47] ==> value-parameter valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'ktParameter' @ [241:73] ==> val ktParameter: KtParameter? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations.<anonymous>[LocalVariableDescriptor]

'bodyGenerator' @ [241:86] ==> val bodyGenerator: BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations[LocalVariableDescriptor]

'withDefaultValues' @ [241:101] ==> value-parameter withDefaultValues: Boolean = ... defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclarations[ValueParameterDescriptorImpl]

'context' @ [251:13] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[PropertyDescriptorImpl]

'symbolTable' @ [251:21] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareValueParameter' @ [251:33] ==> public final fun declareValueParameter(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ParameterDescriptor): IrValueParameter defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktParameter' @ [252:21] ==> value-parameter ktParameter: KtParameter? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclaration[ValueParameterDescriptorImpl]

'startOffsetOrUndefined' @ [252:33] ==> public val PsiElement?.startOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'ktParameter' @ [253:21] ==> value-parameter ktParameter: KtParameter? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclaration[ValueParameterDescriptorImpl]

'endOffsetOrUndefined' @ [253:33] ==> public val PsiElement?.endOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'DEFINED' @ [254:41] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'valueParameterDescriptor' @ [255:21] ==> value-parameter valueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclaration[ValueParameterDescriptorImpl]

'also' @ [256:15] ==> @InlineOnly @SinceKotlin public inline fun <T> IrValueParameter.also(block: (IrValueParameter) -> Unit): IrValueParameter defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameter

'withDefaultValues' @ [257:21] ==> value-parameter withDefaultValues: Boolean defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclaration[ValueParameterDescriptorImpl]

'it' @ [258:21] ==> value-parameter it: IrValueParameter defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'defaultValue' @ [258:24] ==> public abstract var defaultValue: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'ktParameter' @ [258:39] ==> value-parameter ktParameter: KtParameter? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclaration[ValueParameterDescriptorImpl]

'defaultValue' @ [258:52] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'let' @ [258:66] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> IrExpressionBody): IrExpressionBody defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> IrExpressionBody

'bodyGenerator' @ [259:25] ==> value-parameter bodyGenerator: BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclaration[ValueParameterDescriptorImpl]

'generateExpressionBody' @ [259:39] ==> public final fun generateExpressionBody(ktExpression: KtExpression): IrExpressionBody defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'it' @ [259:62] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateValueParameterDeclaration.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [268:13] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[PropertyDescriptorImpl]

'symbolTable' @ [268:21] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareValueParameter' @ [268:33] ==> public final fun declareValueParameter(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ParameterDescriptor): IrValueParameter defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktElement' @ [269:21] ==> value-parameter ktElement: KtElement? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateReceiverParameterDeclaration[ValueParameterDescriptorImpl]

'startOffsetOrUndefined' @ [269:31] ==> public val PsiElement?.startOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'ktElement' @ [270:21] ==> value-parameter ktElement: KtElement? defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateReceiverParameterDeclaration[ValueParameterDescriptorImpl]

'endOffsetOrUndefined' @ [270:31] ==> public val PsiElement?.endOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'DEFINED' @ [271:41] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'receiverParameterDescriptor' @ [272:21] ==> value-parameter receiverParameterDescriptor: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateReceiverParameterDeclaration[ValueParameterDescriptorImpl]

