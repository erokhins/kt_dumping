'DeclarationGeneratorExtension' @ [45:79] ==> public constructor DeclarationGeneratorExtension(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGeneratorExtension[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [45:109] ==> value-parameter declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.<init>[ValueParameterDescriptorImpl]

'MyDataClassMethodGenerator' @ [47:9] ==> public constructor MyDataClassMethodGenerator(ktClassOrObject: KtClassOrObject, irClass: IrClass) defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[ClassConstructorDescriptorImpl]

'ktClassOrObject' @ [47:36] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.generate[ValueParameterDescriptorImpl]

'irClass' @ [47:53] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.generate[ValueParameterDescriptorImpl]

'generate' @ [47:62] ==> public final fun generate(): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[DeserializedSimpleFunctionDescriptor]

'context' @ [51:13] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[PropertyDescriptorImpl]

'symbolTable' @ [51:21] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareSimpleFunction' @ [51:33] ==> public final fun declareSimpleFunction(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'startOffset' @ [51:55] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.declareSimpleFunction[ValueParameterDescriptorImpl]

'endOffset' @ [51:68] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.declareSimpleFunction[ValueParameterDescriptorImpl]

'origin' @ [51:79] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.declareSimpleFunction[ValueParameterDescriptorImpl]

'function' @ [51:87] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.declareSimpleFunction[ValueParameterDescriptorImpl]

'UNDEFINED_OFFSET' @ [57:32] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [58:30] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'declareSimpleFunction' @ [59:42] ==> private final fun declareSimpleFunction(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, function: FunctionDescriptor): IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[SimpleFunctionDescriptorImpl]

'startOffset' @ [59:64] ==> value-parameter startOffset: Int = ... defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [59:77] ==> value-parameter endOffset: Int = ... defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder.<init>[ValueParameterDescriptorImpl]

'origin' @ [59:88] ==> value-parameter origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder.<init>[ValueParameterDescriptorImpl]

'function' @ [59:96] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder.<init>[ValueParameterDescriptorImpl]

'IrBlockBodyBuilder' @ [60:9] ==> public constructor IrBlockBodyBuilder(context: IrGeneratorContext, scope: Scope, startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[DeserializedClassConstructorDescriptor]

'context' @ [60:28] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[PropertyDescriptorImpl]

'Scope' @ [60:37] ==> public constructor Scope(scopeOwnerSymbol: IrSymbol) defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedClassConstructorDescriptor]

'irFunction' @ [60:43] ==> value-parameter irFunction: IrFunction = ... defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder.<init>[ValueParameterDescriptorImpl]

'symbol' @ [60:54] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'startOffset' @ [60:63] ==> value-parameter startOffset: Int = ... defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [60:76] ==> value-parameter endOffset: Int = ... defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder.<init>[ValueParameterDescriptorImpl]

'irFunction' @ [62:13] ==> public final val irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[PropertyDescriptorImpl]

'buildWithScope' @ [62:24] ==> public final inline fun <T : IrDeclaration> IrFunction.buildWithScope(builder: (IrFunction) -> Unit): IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclaration> -> IrFunction

'invoke' @ [63:17] ==> public abstract operator fun DataClassMembersGenerator.MemberFunctionBuilder.invoke(p2: IrFunction): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'irFunction' @ [63:25] ==> public final val irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[PropertyDescriptorImpl]

'irFunction' @ [64:17] ==> public final val irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[PropertyDescriptorImpl]

'body' @ [64:28] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'doBuild' @ [64:35] ==> public open fun doBuild(): IrBlockBody defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedSimpleFunctionDescriptor]

'irClass' @ [67:13] ==> public final val irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[PropertyDescriptorImpl]

'declarations' @ [67:21] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'add' @ [67:34] ==> public abstract fun add(element: IrDeclaration): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irFunction' @ [67:38] ==> public final val irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[PropertyDescriptorImpl]

'irFunction' @ [68:20] ==> public final val irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[PropertyDescriptorImpl]

'irFunction' @ [72:13] ==> public final val irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[PropertyDescriptorImpl]

'putDefault' @ [72:24] ==> public fun IrFunction.putDefault(parameter: ValueParameterDescriptor, expressionBody: IrExpressionBody): Unit defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'parameter' @ [72:35] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder.putDefault[ValueParameterDescriptorImpl]

'irExprBody' @ [72:46] ==> public fun IrBuilderWithScope.irExprBody(value: IrExpression): IrExpressionBodyImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'value' @ [72:57] ==> value-parameter value: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder.putDefault[ValueParameterDescriptorImpl]

'IrGetValueImpl' @ [76:17] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [76:32] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedPropertyDescriptor]

'endOffset' @ [76:45] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedPropertyDescriptor]

'irFunction' @ [76:56] ==> public final val irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[PropertyDescriptorImpl]

'dispatchReceiverParameter' @ [76:67] ==> public abstract var dispatchReceiverParameter: IrValueParameter? defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'symbol' @ [76:95] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'IrGetValueImpl' @ [79:17] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [79:32] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedPropertyDescriptor]

'endOffset' @ [79:45] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedPropertyDescriptor]

'irFunction' @ [79:56] ==> public final val irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[PropertyDescriptorImpl]

'valueParameters' @ [79:67] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'symbol' @ [79:86] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'DataClassMethodGenerator' @ [85:9] ==> public constructor DataClassMethodGenerator(declaration: KtClassOrObject, bindingContext: BindingContext) defined in org.jetbrains.kotlin.backend.common.DataClassMethodGenerator[DeserializedClassConstructorDescriptor]

'ktClassOrObject' @ [85:34] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.<init>[ValueParameterDescriptorImpl]

'declarationGenerator' @ [85:51] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[PropertyDescriptorImpl]

'context' @ [85:72] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[PropertyDescriptorImpl]

'bindingContext' @ [85:80] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'MemberFunctionBuilder' @ [91:13] ==> public constructor MemberFunctionBuilder(irClass: IrClass, function: FunctionDescriptor, origin: IrDeclarationOrigin, startOffset: Int = ..., endOffset: Int = ..., irFunction: IrFunction = ...) defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[ClassConstructorDescriptorImpl]

'irClass' @ [92:21] ==> public final val irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[PropertyDescriptorImpl]

'function' @ [92:30] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.buildMember[ValueParameterDescriptorImpl]

'GENERATED_DATA_CLASS_MEMBER' @ [92:60] ==> public object GENERATED_DATA_CLASS_MEMBER : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'psiElement' @ [93:21] ==> value-parameter psiElement: PsiElement? = ... defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.buildMember[ValueParameterDescriptorImpl]

'startOffsetOrUndefined' @ [93:32] ==> public val PsiElement?.startOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'psiElement' @ [93:56] ==> value-parameter psiElement: PsiElement? = ... defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.buildMember[ValueParameterDescriptorImpl]

'endOffsetOrUndefined' @ [93:67] ==> public val PsiElement?.endOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'addToClass' @ [94:15] ==> public final inline fun addToClass(builder: DataClassMembersGenerator.MemberFunctionBuilder.(IrFunction) -> Unit): IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[SimpleFunctionDescriptorImpl]

'irFunction' @ [95:17] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.buildMember.<anonymous>[ValueParameterDescriptorImpl]

'buildWithScope' @ [95:28] ==> public final inline fun <T : IrDeclaration> IrFunction.buildWithScope(builder: (IrFunction) -> Unit): IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclaration> -> IrFunction

'FunctionGenerator' @ [96:21] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [96:39] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[PropertyDescriptorImpl]

'generateSyntheticFunctionParameterDeclarations' @ [96:61] ==> public final fun generateSyntheticFunctionParameterDeclarations(irFunction: IrFunction): Unit defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'irFunction' @ [96:108] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.buildMember.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [97:21] ==> public abstract operator fun DataClassMembersGenerator.MemberFunctionBuilder.invoke(p2: IrFunction): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'irFunction' @ [97:26] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.buildMember.<anonymous>[ValueParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [103:31] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [103:55] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'parameter' @ [103:79] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateComponentFunction[ValueParameterDescriptorImpl]

'AssertionError' @ [104:37] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'parameter' @ [104:105] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateComponentFunction[ValueParameterDescriptorImpl]

'buildMember' @ [106:13] ==> private final inline fun buildMember(function: FunctionDescriptor, psiElement: PsiElement? = ..., body: DataClassMembersGenerator.MemberFunctionBuilder.(IrFunction) -> Unit): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'function' @ [106:25] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateComponentFunction[ValueParameterDescriptorImpl]

'ktParameter' @ [106:35] ==> val ktParameter: PsiElement defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateComponentFunction[LocalVariableDescriptor]

'+' @ [107:17] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedSimpleFunctionDescriptor]

'irReturn' @ [107:18] ==> public fun IrBuilderWithScope.irReturn(value: IrExpression): IrReturnImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irGet' @ [107:27] ==> public fun IrBuilderWithScope.irGet(receiver: IrExpression, getterSymbol: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irThis' @ [107:33] ==> public final fun irThis(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[SimpleFunctionDescriptorImpl]

'getPropertyGetterSymbol' @ [107:43] ==> private final fun getPropertyGetterSymbol(parameter: ValueParameterDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'parameter' @ [107:67] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateComponentFunction[ValueParameterDescriptorImpl]

'getOrFail' @ [112:28] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (PropertyDescriptor..PropertyDescriptor?)>, key: (ValueParameterDescriptor..ValueParameterDescriptor?)): (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)

'VALUE_PARAMETER_AS_PROPERTY' @ [112:53] ==> public final val VALUE_PARAMETER_AS_PROPERTY: (WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (PropertyDescriptor..PropertyDescriptor?)>..WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (PropertyDescriptor..PropertyDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parameter' @ [112:82] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getPropertyGetterSymbol[ValueParameterDescriptorImpl]

'getPropertyGetterSymbol' @ [113:20] ==> private final fun getPropertyGetterSymbol(property: PropertyDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'property' @ [113:44] ==> val property: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getPropertyGetterSymbol[LocalVariableDescriptor]

'context' @ [117:17] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[PropertyDescriptorImpl]

'symbolTable' @ [117:25] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [117:37] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'property' @ [117:55] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getPropertyGetterSymbol[ValueParameterDescriptorImpl]

'getter' @ [117:64] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'classDescriptor' @ [120:40] ==> protected final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[DeserializedPropertyDescriptor]

'unsubstitutedPrimaryConstructor' @ [120:56] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'AssertionError' @ [121:46] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'classDescriptor' @ [121:109] ==> protected final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[DeserializedPropertyDescriptor]

'context' @ [122:37] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[PropertyDescriptorImpl]

'symbolTable' @ [122:45] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceConstructor' @ [122:57] ==> public final fun referenceConstructor(descriptor: ClassConstructorDescriptor): IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'dataClassConstructor' @ [122:78] ==> val dataClassConstructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateCopyFunction[LocalVariableDescriptor]

'buildMember' @ [124:13] ==> private final inline fun buildMember(function: FunctionDescriptor, psiElement: PsiElement? = ..., body: DataClassMembersGenerator.MemberFunctionBuilder.(IrFunction) -> Unit): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'function' @ [124:25] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateCopyFunction[ValueParameterDescriptorImpl]

'function' @ [125:17] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateCopyFunction[ValueParameterDescriptorImpl]

'valueParameters' @ [125:26] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'forEach' @ [125:42] ==> @HidesMembers public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.forEach(action: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'putDefault' @ [126:21] ==> public final fun putDefault(parameter: ValueParameterDescriptor, value: IrExpression): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [126:32] ==> value-parameter parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateCopyFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'irGet' @ [126:43] ==> public fun IrBuilderWithScope.irGet(receiver: IrExpression, getterSymbol: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irThis' @ [126:49] ==> public final fun irThis(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[SimpleFunctionDescriptorImpl]

'getPropertyGetterSymbol' @ [126:59] ==> private final fun getPropertyGetterSymbol(parameter: ValueParameterDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'parameter' @ [126:83] ==> value-parameter parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateCopyFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'+' @ [128:17] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedSimpleFunctionDescriptor]

'irReturn' @ [128:18] ==> public fun IrBuilderWithScope.irReturn(value: IrExpression): IrReturnImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irCall' @ [128:27] ==> public fun IrBuilderWithScope.irCall(callee: IrFunctionSymbol, type: KotlinType): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'constructorSymbol' @ [128:34] ==> val constructorSymbol: IrConstructorSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateCopyFunction[LocalVariableDescriptor]

'dataClassConstructor' @ [128:53] ==> val dataClassConstructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateCopyFunction[LocalVariableDescriptor]

'returnType' @ [128:74] ==> public final val ClassConstructorDescriptor.returnType: KotlinType[MyPropertyDescriptor]

'mapValueParameters' @ [128:86] ==> public inline fun <T : IrMemberAccessExpression> IrCall.mapValueParameters(transform: (ValueParameterDescriptor) -> IrExpression?): IrCall defined in org.jetbrains.kotlin.ir.expressions[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrMemberAccessExpression> -> IrCall

'irGet' @ [129:21] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irFunction' @ [129:27] ==> value-parameter irFunction: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateCopyFunction.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [129:38] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'it' @ [129:54] ==> value-parameter it: ValueParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateCopyFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [129:57] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'symbol' @ [129:64] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'buildMember' @ [135:13] ==> private final inline fun buildMember(function: FunctionDescriptor, psiElement: PsiElement? = ..., body: DataClassMembersGenerator.MemberFunctionBuilder.(IrFunction) -> Unit): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'function' @ [135:25] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateEqualsMethod[ValueParameterDescriptorImpl]

'+' @ [136:17] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedSimpleFunctionDescriptor]

'irIfThenReturnTrue' @ [136:18] ==> public fun IrBuilderWithScope.irIfThenReturnTrue(condition: IrExpression): IrIfThenElseImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irEqeqeq' @ [136:37] ==> public fun IrBuilderWithScope.irEqeqeq(arg1: IrExpression, arg2: IrExpression): IrExpression defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irThis' @ [136:46] ==> public final fun irThis(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[SimpleFunctionDescriptorImpl]

'irOther' @ [136:56] ==> public final fun irOther(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[SimpleFunctionDescriptorImpl]

'+' @ [137:17] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedSimpleFunctionDescriptor]

'irIfThenReturnFalse' @ [137:18] ==> public fun IrBuilderWithScope.irIfThenReturnFalse(condition: IrExpression): IrIfThenElseImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irNotIs' @ [137:38] ==> public fun IrBuilderWithScope.irNotIs(argument: IrExpression, type: KotlinType): IrTypeOperatorCallImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irOther' @ [137:46] ==> public final fun irOther(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [137:57] ==> protected final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[DeserializedPropertyDescriptor]

'defaultType' @ [137:73] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'irTemporary' @ [138:37] ==> public fun <T : IrElement> IrStatementsBuilder<IrBlockBody>.irTemporary(value: IrExpression, nameHint: String? = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrBlockBody

'irAs' @ [138:49] ==> public fun IrBuilderWithScope.irAs(argument: IrExpression, type: KotlinType): IrTypeOperatorCallImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irOther' @ [138:54] ==> public final fun irOther(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [138:65] ==> protected final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[DeserializedPropertyDescriptor]

'defaultType' @ [138:81] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'properties' @ [139:34] ==> value-parameter properties: List<PropertyDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateEqualsMethod[ValueParameterDescriptorImpl]

'+' @ [140:21] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedSimpleFunctionDescriptor]

'irIfThenReturnFalse' @ [140:22] ==> public fun IrBuilderWithScope.irIfThenReturnFalse(condition: IrExpression): IrIfThenElseImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irNotEquals' @ [141:29] ==> public fun IrBuilderWithScope.irNotEquals(arg1: IrExpression, arg2: IrExpression): IrExpression defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irGet' @ [141:41] ==> public fun IrBuilderWithScope.irGet(receiver: IrExpression, getterSymbol: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irThis' @ [141:47] ==> public final fun irThis(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[SimpleFunctionDescriptorImpl]

'getPropertyGetterSymbol' @ [141:57] ==> private final fun getPropertyGetterSymbol(property: PropertyDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'property' @ [141:81] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateEqualsMethod.<anonymous>[LocalVariableDescriptor]

'irGet' @ [142:41] ==> public fun IrBuilderWithScope.irGet(receiver: IrExpression, getterSymbol: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irGet' @ [142:47] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'otherWithCast' @ [142:53] ==> val otherWithCast: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateEqualsMethod.<anonymous>[LocalVariableDescriptor]

'symbol' @ [142:67] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'getPropertyGetterSymbol' @ [142:76] ==> private final fun getPropertyGetterSymbol(property: PropertyDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'property' @ [142:100] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateEqualsMethod.<anonymous>[LocalVariableDescriptor]

'+' @ [144:17] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedSimpleFunctionDescriptor]

'irReturnTrue' @ [144:18] ==> public fun IrBuilderWithScope.irReturnTrue(): IrReturnImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'context' @ [148:32] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[PropertyDescriptorImpl]

'builtIns' @ [148:40] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'int' @ [148:49] ==> public final val KotlinBuiltIns.int: ClassDescriptor[MyPropertyDescriptor]

'context' @ [149:31] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[PropertyDescriptorImpl]

'builtIns' @ [149:39] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'intType' @ [149:48] ==> public final val KotlinBuiltIns.intType: SimpleType[MyPropertyDescriptor]

'intClass' @ [152:17] ==> private final val intClass: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[PropertyDescriptorImpl]

'findFirstFunction' @ [152:26] ==> public inline fun ClassDescriptor.findFirstFunction(name: String, predicate: (CallableMemberDescriptor) -> Boolean): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir[SimpleFunctionDescriptorImpl]

'DEFAULT' @ [152:73] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [152:81] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'it' @ [152:92] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.intTimes.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [152:95] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'type' @ [152:114] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'intType' @ [152:120] ==> private final val intType: SimpleType defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[PropertyDescriptorImpl]

'let' @ [153:26] ==> @InlineOnly public inline fun <T, R> SimpleFunctionDescriptor.let(block: (SimpleFunctionDescriptor) -> IrFunctionSymbol): IrFunctionSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor
    <R> -> IrFunctionSymbol

'context' @ [153:32] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[PropertyDescriptorImpl]

'symbolTable' @ [153:40] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [153:52] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'it' @ [153:70] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.intTimes.<anonymous>[ValueParameterDescriptorImpl]

'intClass' @ [156:17] ==> private final val intClass: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[PropertyDescriptorImpl]

'findFirstFunction' @ [156:26] ==> public inline fun ClassDescriptor.findFirstFunction(name: String, predicate: (CallableMemberDescriptor) -> Boolean): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir[SimpleFunctionDescriptorImpl]

'DEFAULT' @ [156:72] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [156:80] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'it' @ [156:91] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.intPlus.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [156:94] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'type' @ [156:113] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'intType' @ [156:119] ==> private final val intType: SimpleType defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[PropertyDescriptorImpl]

'let' @ [157:26] ==> @InlineOnly public inline fun <T, R> SimpleFunctionDescriptor.let(block: (SimpleFunctionDescriptor) -> IrFunctionSymbol): IrFunctionSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor
    <R> -> IrFunctionSymbol

'context' @ [157:32] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[PropertyDescriptorImpl]

'symbolTable' @ [157:40] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [157:52] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'it' @ [157:70] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.intPlus.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [161:45] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeFunction[ValueParameterDescriptorImpl]

'constructor' @ [161:50] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [161:62] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'when (typeConstructorDescriptor) {
                is ClassDescriptor -> {
                    if (KotlinBuiltIns.isArrayOrPrimitiveArray(typeConstructorDescriptor)) {
                        context.irBuiltIns.dataClassArrayMemberHashCodeSymbol
                    }
                    else {
                        val hashCodeDescriptor: CallableDescriptor = typeConstructorDescriptor.findFirstFunction("hashCode") { it.valueParameters.isEmpty() }
                        context.symbolTable.referenceFunction(hashCodeDescriptor)
                    }
                }
                is TypeParameterDescriptor ->
                    getHashCodeFunction(context.builtIns.anyType) // TODO
                else ->
                    throw AssertionError("Unexpected type: $type")
            }' @ [162:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrFunctionSymbol, entry1: IrFunctionSymbol, entry2: IrFunctionSymbol): IrFunctionSymbol[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrFunctionSymbol

'typeConstructorDescriptor' @ [162:26] ==> val typeConstructorDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeFunction[LocalVariableDescriptor]

'if (KotlinBuiltIns.isArrayOrPrimitiveArray(typeConstructorDescriptor)) {
                        context.irBuiltIns.dataClassArrayMemberHashCodeSymbol
                    }
                    else {
                        val hashCodeDescriptor: CallableDescriptor = typeConstructorDescriptor.findFirstFunction("hashCode") { it.valueParameters.isEmpty() }
                        context.symbolTable.referenceFunction(hashCodeDescriptor)
                    }' @ [164:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrFunctionSymbol, elseBranch: IrFunctionSymbol): IrFunctionSymbol[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrFunctionSymbol

'isArrayOrPrimitiveArray' @ [164:40] ==> public open fun isArrayOrPrimitiveArray(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'typeConstructorDescriptor' @ [164:64] ==> val typeConstructorDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeFunction[LocalVariableDescriptor]

'context' @ [165:25] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[PropertyDescriptorImpl]

'irBuiltIns' @ [165:33] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'dataClassArrayMemberHashCodeSymbol' @ [165:44] ==> public final val dataClassArrayMemberHashCodeSymbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.descriptors.IrBuiltIns[DeserializedPropertyDescriptor]

'typeConstructorDescriptor' @ [168:70] ==> val typeConstructorDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeFunction[LocalVariableDescriptor]

'findFirstFunction' @ [168:96] ==> public inline fun ClassDescriptor.findFirstFunction(name: String, predicate: (CallableMemberDescriptor) -> Boolean): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir[SimpleFunctionDescriptorImpl]

'it' @ [168:128] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeFunction.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [168:131] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [168:147] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'context' @ [169:25] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[PropertyDescriptorImpl]

'symbolTable' @ [169:33] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceFunction' @ [169:45] ==> public final fun referenceFunction(callable: CallableDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'hashCodeDescriptor' @ [169:63] ==> val hashCodeDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeFunction[LocalVariableDescriptor]

'getHashCodeFunction' @ [173:21] ==> private final fun getHashCodeFunction(type: KotlinType): IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'context' @ [173:41] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator[PropertyDescriptorImpl]

'builtIns' @ [173:49] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'anyType' @ [173:58] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'AssertionError' @ [175:27] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'type' @ [175:61] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeFunction[ValueParameterDescriptorImpl]

'buildMember' @ [181:13] ==> private final inline fun buildMember(function: FunctionDescriptor, psiElement: PsiElement? = ..., body: DataClassMembersGenerator.MemberFunctionBuilder.(IrFunction) -> Unit): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'function' @ [181:25] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateHashCodeMethod[ValueParameterDescriptorImpl]

'irTemporaryVar' @ [182:30] ==> public fun <T : IrElement> IrStatementsBuilder<IrBlockBody>.irTemporaryVar(value: IrExpression, nameHint: String? = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : IrElement> -> IrBlockBody

'irInt' @ [182:45] ==> public fun IrBuilderWithScope.irInt(value: Int): IrConstImpl<Int> defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'symbol' @ [182:65] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'properties' @ [184:34] ==> value-parameter properties: List<PropertyDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateHashCodeMethod[ValueParameterDescriptorImpl]

'getHashCodeOfProperty' @ [185:46] ==> private final fun DataClassMembersGenerator.MemberFunctionBuilder.getHashCodeOfProperty(receiver: IrExpression, property: PropertyDescriptor): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'irThis' @ [185:68] ==> public final fun irThis(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[SimpleFunctionDescriptorImpl]

'property' @ [185:78] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateHashCodeMethod.<anonymous>[LocalVariableDescriptor]

'if (first) hashCodeOfProperty
                            else irCallOp(intPlus, irCallOp(intTimes, irGet(result), irInt(31)), hashCodeOfProperty)' @ [187:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'first' @ [187:33] ==> var first: Boolean defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateHashCodeMethod.<anonymous>[LocalVariableDescriptor]

'hashCodeOfProperty' @ [187:40] ==> val hashCodeOfProperty: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateHashCodeMethod.<anonymous>[LocalVariableDescriptor]

'irCallOp' @ [188:34] ==> public fun IrBuilderWithScope.irCallOp(callee: IrFunctionSymbol, dispatchReceiver: IrExpression, argument: IrExpression): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'intPlus' @ [188:43] ==> private final val intPlus: IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[PropertyDescriptorImpl]

'irCallOp' @ [188:52] ==> public fun IrBuilderWithScope.irCallOp(callee: IrFunctionSymbol, dispatchReceiver: IrExpression, argument: IrExpression): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'intTimes' @ [188:61] ==> private final val intTimes: IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[PropertyDescriptorImpl]

'irGet' @ [188:71] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'result' @ [188:77] ==> val result: IrVariableSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateHashCodeMethod.<anonymous>[LocalVariableDescriptor]

'irInt' @ [188:86] ==> public fun IrBuilderWithScope.irInt(value: Int): IrConstImpl<Int> defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'hashCodeOfProperty' @ [188:98] ==> val hashCodeOfProperty: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateHashCodeMethod.<anonymous>[LocalVariableDescriptor]

'+' @ [189:21] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedSimpleFunctionDescriptor]

'irSetVar' @ [189:22] ==> public fun IrBuilderWithScope.irSetVar(variable: IrVariableSymbol, value: IrExpression): IrSetVariableImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'result' @ [189:31] ==> val result: IrVariableSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateHashCodeMethod.<anonymous>[LocalVariableDescriptor]

'irNewValue' @ [189:39] ==> val irNewValue: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateHashCodeMethod.<anonymous>[LocalVariableDescriptor]

'first' @ [190:21] ==> var first: Boolean defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateHashCodeMethod.<anonymous>[LocalVariableDescriptor]

'+' @ [192:17] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedSimpleFunctionDescriptor]

'irReturn' @ [192:18] ==> public fun IrBuilderWithScope.irReturn(value: IrExpression): IrReturnImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irGet' @ [192:27] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'result' @ [192:33] ==> val result: IrVariableSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateHashCodeMethod.<anonymous>[LocalVariableDescriptor]

'getPropertyGetterSymbol' @ [197:32] ==> private final fun getPropertyGetterSymbol(property: PropertyDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'property' @ [197:56] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeOfProperty[ValueParameterDescriptorImpl]

'when {
                property.type.containsNull() ->
                    irLetS(irGet(receiver, getterSymbol)) { variable ->
                        irIfNull(context.builtIns.intType, irGet(variable), irInt(0), getHashCodeOf(irGet(variable)))
                    }
                else ->
                    getHashCodeOf(irGet(receiver, getterSymbol))
            }' @ [198:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrExpression, entry1: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrExpression

'property' @ [199:17] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeOfProperty[ValueParameterDescriptorImpl]

'type' @ [199:26] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'containsNull' @ [199:31] ==> public fun KotlinType.containsNull(): Boolean defined in org.jetbrains.kotlin.psi2ir[SimpleFunctionDescriptorImpl]

'irLetS' @ [200:21] ==> public inline fun IrBuilderWithScope.irLetS(value: IrExpression, origin: IrStatementOrigin? = ..., nameHint: String? = ..., body: (IrValueSymbol) -> IrExpression): IrExpression defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irGet' @ [200:28] ==> public fun IrBuilderWithScope.irGet(receiver: IrExpression, getterSymbol: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'receiver' @ [200:34] ==> value-parameter receiver: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeOfProperty[ValueParameterDescriptorImpl]

'getterSymbol' @ [200:44] ==> val getterSymbol: IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeOfProperty[LocalVariableDescriptor]

'irIfNull' @ [201:25] ==> public fun IrBuilderWithScope.irIfNull(type: KotlinType, subject: IrExpression, thenPart: IrExpression, elsePart: IrExpression): IrIfThenElseImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'context' @ [201:34] ==> public open val context: IrGeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedPropertyDescriptor]

'builtIns' @ [201:42] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.ir.builders.IrGeneratorContext[DeserializedPropertyDescriptor]

'intType' @ [201:51] ==> public final val KotlinBuiltIns.intType: SimpleType[MyPropertyDescriptor]

'irGet' @ [201:60] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'variable' @ [201:66] ==> value-parameter variable: IrValueSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeOfProperty.<anonymous>[ValueParameterDescriptorImpl]

'irInt' @ [201:77] ==> public fun IrBuilderWithScope.irInt(value: Int): IrConstImpl<Int> defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'getHashCodeOf' @ [201:87] ==> private final fun DataClassMembersGenerator.MemberFunctionBuilder.getHashCodeOf(irValue: IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'irGet' @ [201:101] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'variable' @ [201:107] ==> value-parameter variable: IrValueSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeOfProperty.<anonymous>[ValueParameterDescriptorImpl]

'getHashCodeOf' @ [204:21] ==> private final fun DataClassMembersGenerator.MemberFunctionBuilder.getHashCodeOf(irValue: IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'irGet' @ [204:35] ==> public fun IrBuilderWithScope.irGet(receiver: IrExpression, getterSymbol: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'receiver' @ [204:41] ==> value-parameter receiver: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeOfProperty[ValueParameterDescriptorImpl]

'getterSymbol' @ [204:51] ==> val getterSymbol: IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeOfProperty[LocalVariableDescriptor]

'irCall' @ [209:17] ==> public fun IrBuilderWithScope.irCall(callee: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'getHashCodeFunction' @ [209:24] ==> private final fun getHashCodeFunction(type: KotlinType): IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'irValue' @ [209:44] ==> value-parameter irValue: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeOf[ValueParameterDescriptorImpl]

'type' @ [209:52] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'apply' @ [209:59] ==> @InlineOnly public inline fun <T> IrCall.apply(block: IrCall.() -> Unit): IrCall defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCall

'if (descriptor.dispatchReceiverParameter != null) {
                        dispatchReceiver = irValue
                    }
                    else {
                        putValueArgument(0, irValue)
                    }' @ [210:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [210:25] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'dispatchReceiverParameter' @ [210:36] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'dispatchReceiver' @ [211:25] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'irValue' @ [211:44] ==> value-parameter irValue: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeOf[ValueParameterDescriptorImpl]

'putValueArgument' @ [214:25] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'irValue' @ [214:45] ==> value-parameter irValue: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.getHashCodeOf[ValueParameterDescriptorImpl]

'buildMember' @ [219:13] ==> private final inline fun buildMember(function: FunctionDescriptor, psiElement: PsiElement? = ..., body: DataClassMembersGenerator.MemberFunctionBuilder.(IrFunction) -> Unit): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'function' @ [219:25] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod[ValueParameterDescriptorImpl]

'irConcat' @ [220:32] ==> public fun IrBuilderWithScope.irConcat(): IrStringConcatenationImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irConcat' @ [221:17] ==> val irConcat: IrStringConcatenationImpl defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

'addArgument' @ [221:26] ==> public open fun addArgument(argument: IrExpression): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[DeserializedSimpleFunctionDescriptor]

'irString' @ [221:38] ==> public fun IrBuilderWithScope.irString(value: String): IrConstImpl<String> defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [221:47] ==> protected final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[DeserializedPropertyDescriptor]

'name' @ [221:63] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [221:68] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'properties' @ [223:34] ==> value-parameter properties: List<PropertyDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod[ValueParameterDescriptorImpl]

'!' @ [224:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'first' @ [224:26] ==> var first: Boolean defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

'irConcat' @ [224:33] ==> val irConcat: IrStringConcatenationImpl defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

'addArgument' @ [224:42] ==> public open fun addArgument(argument: IrExpression): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[DeserializedSimpleFunctionDescriptor]

'irString' @ [224:54] ==> public fun IrBuilderWithScope.irString(value: String): IrConstImpl<String> defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irConcat' @ [225:21] ==> val irConcat: IrStringConcatenationImpl defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

'addArgument' @ [225:30] ==> public open fun addArgument(argument: IrExpression): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[DeserializedSimpleFunctionDescriptor]

'irString' @ [225:42] ==> public fun IrBuilderWithScope.irString(value: String): IrConstImpl<String> defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'property' @ [225:51] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

'name' @ [225:60] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [225:65] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'irGet' @ [226:43] ==> public fun IrBuilderWithScope.irGet(receiver: IrExpression, getterSymbol: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irThis' @ [226:49] ==> public final fun irThis(): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[SimpleFunctionDescriptorImpl]

'getPropertyGetterSymbol' @ [226:59] ==> private final fun getPropertyGetterSymbol(property: PropertyDescriptor): IrFunctionSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator[SimpleFunctionDescriptorImpl]

'property' @ [226:83] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

'property' @ [227:53] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

'type' @ [227:62] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [227:67] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [227:79] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'if (typeConstructorDescriptor is ClassDescriptor &&
                                KotlinBuiltIns.isArrayOrPrimitiveArray(typeConstructorDescriptor))
                                irCall(context.irBuiltIns.dataClassArrayMemberToStringSymbol).apply {
                                    putValueArgument(0, irPropertyValue)
                                }
                            else
                                irPropertyValue' @ [229:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrCall, elseBranch: IrCall): IrCall[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrCall

'typeConstructorDescriptor' @ [229:33] ==> val typeConstructorDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

'isArrayOrPrimitiveArray' @ [230:48] ==> public open fun isArrayOrPrimitiveArray(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'typeConstructorDescriptor' @ [230:72] ==> val typeConstructorDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

'irCall' @ [231:33] ==> public fun IrBuilderWithScope.irCall(callee: IrFunctionSymbol): IrCall defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'context' @ [231:40] ==> public open val context: IrGeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedPropertyDescriptor]

'irBuiltIns' @ [231:48] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.ir.builders.IrGeneratorContext[DeserializedPropertyDescriptor]

'dataClassArrayMemberToStringSymbol' @ [231:59] ==> public final val dataClassArrayMemberToStringSymbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.descriptors.IrBuiltIns[DeserializedPropertyDescriptor]

'apply' @ [231:95] ==> @InlineOnly public inline fun <T> IrCall.apply(block: IrCall.() -> Unit): IrCall defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCall

'putValueArgument' @ [232:37] ==> public abstract fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedSimpleFunctionDescriptor]

'irPropertyValue' @ [232:57] ==> val irPropertyValue: IrCall defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

'irPropertyValue' @ [235:33] ==> val irPropertyValue: IrCall defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

'irConcat' @ [236:21] ==> val irConcat: IrStringConcatenationImpl defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

'addArgument' @ [236:30] ==> public open fun addArgument(argument: IrExpression): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[DeserializedSimpleFunctionDescriptor]

'irPropertyStringValue' @ [236:42] ==> val irPropertyStringValue: IrCall defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

'first' @ [237:21] ==> var first: Boolean defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

'irConcat' @ [239:17] ==> val irConcat: IrStringConcatenationImpl defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

'addArgument' @ [239:26] ==> public open fun addArgument(argument: IrExpression): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[DeserializedSimpleFunctionDescriptor]

'irString' @ [239:38] ==> public fun IrBuilderWithScope.irString(value: String): IrConstImpl<String> defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'+' @ [240:17] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MemberFunctionBuilder[DeserializedSimpleFunctionDescriptor]

'irReturn' @ [240:18] ==> public fun IrBuilderWithScope.irReturn(value: IrExpression): IrReturnImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irConcat' @ [240:27] ==> val irConcat: IrStringConcatenationImpl defined in org.jetbrains.kotlin.psi2ir.generators.DataClassMembersGenerator.MyDataClassMethodGenerator.generateToStringMethod.<anonymous>[LocalVariableDescriptor]

