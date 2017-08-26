'DeclarationGeneratorExtension' @ [34:71] ==> public constructor DeclarationGeneratorExtension(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGeneratorExtension[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [34:101] ==> value-parameter declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.<init>[ValueParameterDescriptorImpl]

'getPropertyDescriptor' @ [36:34] ==> private final fun getPropertyDescriptor(ktProperty: KtProperty): PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[SimpleFunctionDescriptorImpl]

'ktProperty' @ [36:56] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyDeclaration[ValueParameterDescriptorImpl]

'ktProperty' @ [37:26] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyDeclaration[ValueParameterDescriptorImpl]

'delegate' @ [37:37] ==> public final val KtProperty.delegate: KtPropertyDelegate?[MyPropertyDescriptor]

'if (ktDelegate != null)
            generateDelegatedProperty(ktProperty, ktDelegate, propertyDescriptor)
        else
            generateSimpleProperty(ktProperty, propertyDescriptor)' @ [38:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrProperty, elseBranch: IrProperty): IrProperty[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrProperty

'ktDelegate' @ [38:20] ==> val ktDelegate: KtPropertyDelegate? defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyDeclaration[LocalVariableDescriptor]

'generateDelegatedProperty' @ [39:13] ==> private final fun generateDelegatedProperty(ktProperty: KtProperty, ktDelegate: KtPropertyDelegate, propertyDescriptor: PropertyDescriptor): IrProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[SimpleFunctionDescriptorImpl]

'ktProperty' @ [39:39] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyDeclaration[ValueParameterDescriptorImpl]

'ktDelegate' @ [39:51] ==> val ktDelegate: KtPropertyDelegate? defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyDeclaration[LocalVariableDescriptor]

'propertyDescriptor' @ [39:63] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyDeclaration[LocalVariableDescriptor]

'generateSimpleProperty' @ [41:13] ==> private final fun generateSimpleProperty(ktProperty: KtProperty, propertyDescriptor: PropertyDescriptor): IrProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[SimpleFunctionDescriptorImpl]

'ktProperty' @ [41:36] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyDeclaration[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [41:48] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyDeclaration[LocalVariableDescriptor]

'getOrFail' @ [45:34] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>, key: (PsiElement..PsiElement?)): (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)

'PRIMARY_CONSTRUCTOR_PARAMETER' @ [45:59] ==> public final val PRIMARY_CONSTRUCTOR_PARAMETER: (WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktParameter' @ [45:90] ==> value-parameter ktParameter: KtParameter defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[ValueParameterDescriptorImpl]

'IrPropertyImpl' @ [47:16] ==> public constructor IrPropertyImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, isDelegated: Boolean, descriptor: PropertyDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedClassConstructorDescriptor]

'ktParameter' @ [48:17] ==> value-parameter ktParameter: KtParameter defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[ValueParameterDescriptorImpl]

'startOffset' @ [48:29] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktParameter' @ [48:42] ==> value-parameter ktParameter: KtParameter defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[ValueParameterDescriptorImpl]

'endOffset' @ [48:54] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DEFINED' @ [49:37] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'propertyDescriptor' @ [50:17] ==> val propertyDescriptor: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[LocalVariableDescriptor]

'also' @ [51:11] ==> @InlineOnly @SinceKotlin public inline fun <T> IrPropertyImpl.also(block: (IrPropertyImpl) -> Unit): IrPropertyImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrPropertyImpl

'irProperty' @ [52:13] ==> value-parameter irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter.<anonymous>[ValueParameterDescriptorImpl]

'backingField' @ [52:24] ==> public open var backingField: IrField? defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedPropertyDescriptor]

'generatePropertyBackingField' @ [53:21] ==> private final inline fun generatePropertyBackingField(ktPropertyElement: KtElement, propertyDescriptor: PropertyDescriptor, generateInitializer: (IrField) -> IrExpressionBody?): IrField defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[SimpleFunctionDescriptorImpl]

'ktParameter' @ [53:50] ==> value-parameter ktParameter: KtParameter defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [53:63] ==> val propertyDescriptor: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[LocalVariableDescriptor]

'IrExpressionBodyImpl' @ [54:25] ==> public constructor IrExpressionBodyImpl(expression: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl[DeserializedClassConstructorDescriptor]

'IrGetValueImpl' @ [54:46] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'ktParameter' @ [55:33] ==> value-parameter ktParameter: KtParameter defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[ValueParameterDescriptorImpl]

'startOffset' @ [55:45] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktParameter' @ [55:58] ==> value-parameter ktParameter: KtParameter defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[ValueParameterDescriptorImpl]

'endOffset' @ [55:70] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'irValueParameter' @ [56:33] ==> value-parameter irValueParameter: IrValueParameter defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[ValueParameterDescriptorImpl]

'symbol' @ [56:50] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'INITIALIZE_PROPERTY_FROM_PARAMETER' @ [57:51] ==> public object INITIALIZE_PROPERTY_FROM_PARAMETER : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'propertyDescriptor' @ [61:26] ==> val propertyDescriptor: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[LocalVariableDescriptor]

'getter' @ [61:45] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'AssertionError' @ [62:32] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'propertyDescriptor' @ [62:105] ==> val propertyDescriptor: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[LocalVariableDescriptor]

'irProperty' @ [63:13] ==> value-parameter irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter.<anonymous>[ValueParameterDescriptorImpl]

'getter' @ [63:24] ==> public open var getter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedPropertyDescriptor]

'FunctionGenerator' @ [63:33] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [63:51] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[PropertyDescriptorImpl]

'generateDefaultAccessorForPrimaryConstructorParameter' @ [63:73] ==> public final fun generateDefaultAccessorForPrimaryConstructorParameter(descriptor: PropertyAccessorDescriptor, ktParameter: KtParameter): IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'getter' @ [63:127] ==> val getter: PropertyGetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter.<anonymous>[LocalVariableDescriptor]

'ktParameter' @ [63:135] ==> value-parameter ktParameter: KtParameter defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [65:17] ==> val propertyDescriptor: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[LocalVariableDescriptor]

'isVar' @ [65:36] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'propertyDescriptor' @ [66:30] ==> val propertyDescriptor: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[LocalVariableDescriptor]

'setter' @ [66:49] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'AssertionError' @ [67:36] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'propertyDescriptor' @ [67:109] ==> val propertyDescriptor: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[LocalVariableDescriptor]

'irProperty' @ [68:17] ==> value-parameter irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter.<anonymous>[ValueParameterDescriptorImpl]

'setter' @ [68:28] ==> public open var setter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedPropertyDescriptor]

'FunctionGenerator' @ [68:37] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [68:55] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[PropertyDescriptorImpl]

'generateDefaultAccessorForPrimaryConstructorParameter' @ [68:77] ==> public final fun generateDefaultAccessorForPrimaryConstructorParameter(descriptor: PropertyAccessorDescriptor, ktParameter: KtParameter): IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'setter' @ [68:131] ==> val setter: PropertySetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter.<anonymous>[LocalVariableDescriptor]

'ktParameter' @ [68:139] ==> value-parameter ktParameter: KtParameter defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyForPrimaryConstructorParameter[ValueParameterDescriptorImpl]

'context' @ [78:13] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[PropertyDescriptorImpl]

'symbolTable' @ [78:21] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareField' @ [78:33] ==> public final fun declareField(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: PropertyDescriptor): IrField defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktPropertyElement' @ [79:21] ==> value-parameter ktPropertyElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyBackingField[ValueParameterDescriptorImpl]

'startOffset' @ [79:39] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktPropertyElement' @ [79:52] ==> value-parameter ktPropertyElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyBackingField[ValueParameterDescriptorImpl]

'endOffset' @ [79:70] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'PROPERTY_BACKING_FIELD' @ [80:41] ==> public object PROPERTY_BACKING_FIELD : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'propertyDescriptor' @ [81:21] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyBackingField[ValueParameterDescriptorImpl]

'also' @ [82:15] ==> @InlineOnly @SinceKotlin public inline fun <T> IrField.also(block: (IrField) -> Unit): IrField defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrField

'it' @ [83:17] ==> value-parameter it: IrField defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyBackingField.<anonymous>[ValueParameterDescriptorImpl]

'initializer' @ [83:20] ==> public abstract var initializer: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'invoke' @ [83:34] ==> public abstract operator fun invoke(p1: IrField): IrExpressionBody? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [83:54] ==> value-parameter it: IrField defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyBackingField.<anonymous>[ValueParameterDescriptorImpl]

'DelegatedPropertyGenerator' @ [92:13] ==> public constructor DelegatedPropertyGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [92:40] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[PropertyDescriptorImpl]

'generateDelegatedProperty' @ [93:22] ==> public final fun generateDelegatedProperty(ktProperty: KtProperty, ktDelegate: KtPropertyDelegate, propertyDescriptor: PropertyDescriptor): IrProperty defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'ktProperty' @ [93:48] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'ktDelegate' @ [93:60] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [93:72] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'IrPropertyImpl' @ [96:13] ==> public constructor IrPropertyImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, isDelegated: Boolean, descriptor: PropertyDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedClassConstructorDescriptor]

'ktProperty' @ [97:21] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty[ValueParameterDescriptorImpl]

'startOffset' @ [97:32] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktProperty' @ [97:45] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty[ValueParameterDescriptorImpl]

'endOffset' @ [97:56] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DEFINED' @ [98:41] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'propertyDescriptor' @ [99:21] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty[ValueParameterDescriptorImpl]

'buildWithScope' @ [100:15] ==> public final inline fun <T : IrDeclaration> IrPropertyImpl.buildWithScope(builder: (IrPropertyImpl) -> Unit): IrPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclaration> -> IrPropertyImpl

'irProperty' @ [101:17] ==> value-parameter irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty.<anonymous>[ValueParameterDescriptorImpl]

'backingField' @ [101:28] ==> public open var backingField: IrField? defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedPropertyDescriptor]

'if (propertyDescriptor.hasBackingField())
                            generatePropertyBackingField(ktProperty, propertyDescriptor) { irField ->
                                ktProperty.initializer?.let { ktInitializer ->
                                    declarationGenerator.generateInitializerBody(irField.symbol, ktInitializer)
                                }
                            }
                        else
                            null' @ [102:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrField?, elseBranch: IrField?): IrField?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrField?

'propertyDescriptor' @ [102:29] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty[ValueParameterDescriptorImpl]

'hasBackingField' @ [102:48] ==> private final fun PropertyDescriptor.hasBackingField(): Boolean defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[SimpleFunctionDescriptorImpl]

'generatePropertyBackingField' @ [103:29] ==> private final inline fun generatePropertyBackingField(ktPropertyElement: KtElement, propertyDescriptor: PropertyDescriptor, generateInitializer: (IrField) -> IrExpressionBody?): IrField defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[SimpleFunctionDescriptorImpl]

'ktProperty' @ [103:58] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [103:70] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty[ValueParameterDescriptorImpl]

'ktProperty' @ [104:33] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty[ValueParameterDescriptorImpl]

'initializer' @ [104:44] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'let' @ [104:57] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> IrExpressionBody): IrExpressionBody defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> IrExpressionBody

'declarationGenerator' @ [105:37] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[PropertyDescriptorImpl]

'generateInitializerBody' @ [105:58] ==> public final fun generateInitializerBody(scopeOwnerSymbol: IrSymbol, ktBody: KtExpression): IrExpressionBody defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'irField' @ [105:82] ==> value-parameter irField: IrField defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [105:90] ==> public abstract val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'ktInitializer' @ [105:98] ==> value-parameter ktInitializer: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'irProperty' @ [111:17] ==> value-parameter irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty.<anonymous>[ValueParameterDescriptorImpl]

'getter' @ [111:28] ==> public open var getter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedPropertyDescriptor]

'generateGetterIfRequired' @ [111:37] ==> private final fun generateGetterIfRequired(ktProperty: KtProperty, property: PropertyDescriptor): IrFunction? defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[SimpleFunctionDescriptorImpl]

'ktProperty' @ [111:62] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [111:74] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty[ValueParameterDescriptorImpl]

'irProperty' @ [113:17] ==> value-parameter irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty.<anonymous>[ValueParameterDescriptorImpl]

'setter' @ [113:28] ==> public open var setter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedPropertyDescriptor]

'generateSetterIfRequired' @ [113:37] ==> private final fun generateSetterIfRequired(ktProperty: KtProperty, property: PropertyDescriptor): IrFunction? defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[SimpleFunctionDescriptorImpl]

'ktProperty' @ [113:62] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [113:74] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSimpleProperty[ValueParameterDescriptorImpl]

'get' @ [117:13] ==> public fun <K, V : Any> Generator.get(slice: ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>, key: (PropertyDescriptor..PropertyDescriptor?)): Boolean? defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)
    <V : Any> -> (kotlin.Boolean..kotlin.Boolean?)

'BACKING_FIELD_REQUIRED' @ [117:32] ==> public final val BACKING_FIELD_REQUIRED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [117:56] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.hasBackingField[ReceiverParameterDescriptorImpl]

'property' @ [120:22] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateGetterIfRequired[ValueParameterDescriptorImpl]

'getter' @ [120:31] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'FunctionGenerator' @ [121:16] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [121:34] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[PropertyDescriptorImpl]

'generatePropertyAccessor' @ [121:56] ==> public final fun generatePropertyAccessor(descriptor: PropertyAccessorDescriptor, ktProperty: KtProperty, ktAccessor: KtPropertyAccessor?): IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'getter' @ [121:81] ==> val getter: PropertyGetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateGetterIfRequired[LocalVariableDescriptor]

'ktProperty' @ [121:89] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateGetterIfRequired[ValueParameterDescriptorImpl]

'ktProperty' @ [121:101] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateGetterIfRequired[ValueParameterDescriptorImpl]

'getter' @ [121:112] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'!' @ [125:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'property' @ [125:14] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSetterIfRequired[ValueParameterDescriptorImpl]

'isVar' @ [125:23] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'property' @ [126:22] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSetterIfRequired[ValueParameterDescriptorImpl]

'setter' @ [126:31] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'FunctionGenerator' @ [127:16] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [127:34] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[PropertyDescriptorImpl]

'generatePropertyAccessor' @ [127:56] ==> public final fun generatePropertyAccessor(descriptor: PropertyAccessorDescriptor, ktProperty: KtProperty, ktAccessor: KtPropertyAccessor?): IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'setter' @ [127:81] ==> val setter: PropertySetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSetterIfRequired[LocalVariableDescriptor]

'ktProperty' @ [127:89] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSetterIfRequired[ValueParameterDescriptorImpl]

'ktProperty' @ [127:101] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateSetterIfRequired[ValueParameterDescriptorImpl]

'setter' @ [127:112] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'getOrFail' @ [131:34] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>, key: (PsiElement..PsiElement?)): (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'VARIABLE' @ [131:59] ==> public final val VARIABLE: (WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktProperty' @ [131:69] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.getPropertyDescriptor[ValueParameterDescriptorImpl]

'variableDescriptor' @ [132:16] ==> val variableDescriptor: (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.getPropertyDescriptor[LocalVariableDescriptor]

'TODO' @ [132:61] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

