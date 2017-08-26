'DeclarationGeneratorExtension' @ [45:80] ==> public constructor DeclarationGeneratorExtension(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGeneratorExtension[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [45:110] ==> value-parameter declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.<init>[ValueParameterDescriptorImpl]

'this' @ [46:46] ==> public constructor DelegatedPropertyGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[ClassConstructorDescriptorImpl]

'DeclarationGenerator' @ [46:51] ==> public constructor DeclarationGenerator(context: GeneratorContext) defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[ClassConstructorDescriptorImpl]

'context' @ [46:72] ==> value-parameter context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.<init>[ValueParameterDescriptorImpl]

'getKPropertyTypeForDelegatedProperty' @ [54:29] ==> private final fun getKPropertyTypeForDelegatedProperty(propertyDescriptor: PropertyDescriptor): KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [54:66] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'IrPropertyImpl' @ [56:26] ==> public constructor IrPropertyImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, isDelegated: Boolean, descriptor: PropertyDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedClassConstructorDescriptor]

'ktProperty' @ [57:17] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'startOffset' @ [57:28] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktProperty' @ [57:41] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'endOffset' @ [57:52] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DEFINED' @ [57:83] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'propertyDescriptor' @ [58:17] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'apply' @ [59:11] ==> @InlineOnly public inline fun <T> IrPropertyImpl.apply(block: IrPropertyImpl.() -> Unit): IrPropertyImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrPropertyImpl

'backingField' @ [60:13] ==> public open var backingField: IrField? defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedPropertyDescriptor]

'generateDelegateFieldForProperty' @ [60:28] ==> private final fun generateDelegateFieldForProperty(propertyDescriptor: PropertyDescriptor, kPropertyType: KotlinType, ktDelegate: KtPropertyDelegate): IrField defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [60:61] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'kPropertyType' @ [60:81] ==> val kPropertyType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'ktDelegate' @ [60:96] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'irProperty' @ [63:26] ==> val irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'backingField' @ [63:37] ==> public open var backingField: IrField? defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedPropertyDescriptor]

'propertyDescriptor' @ [65:25] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'containingDeclaration' @ [65:44] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'createBackingFieldValueForDelegate' @ [66:37] ==> private final fun createBackingFieldValueForDelegate(irDelegateField: IrFieldSymbol, thisClass: ClassDescriptor?, ktDelegate: KtPropertyDelegate): IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'irDelegate' @ [66:72] ==> val irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'symbol' @ [66:83] ==> public abstract val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'thisClass' @ [66:91] ==> val thisClass: ClassDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'ktDelegate' @ [66:102] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [67:32] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'getter' @ [67:51] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'irProperty' @ [68:9] ==> val irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'getter' @ [68:20] ==> public open var getter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedPropertyDescriptor]

'generateDelegatedPropertyAccessor' @ [68:29] ==> private final inline fun generateDelegatedPropertyAccessor(ktProperty: KtProperty, ktDelegate: KtPropertyDelegate, accessorDescriptor: PropertyAccessorDescriptor, generateBody: (IrFunction) -> IrBody): IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'ktProperty' @ [68:63] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'ktDelegate' @ [68:75] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'getterDescriptor' @ [68:87] ==> val getterDescriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'generateDelegatedPropertyGetterBody' @ [69:13] ==> private final fun generateDelegatedPropertyGetterBody(irGetter: IrFunction, ktDelegate: KtPropertyDelegate, getterDescriptor: VariableAccessorDescriptor, delegateReceiverValue: IntermediateValue, irPropertyReference: IrCallableReference): IrBody defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'irGetter' @ [70:21] ==> value-parameter irGetter: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty.<anonymous>[ValueParameterDescriptorImpl]

'ktDelegate' @ [71:21] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'getterDescriptor' @ [71:33] ==> val getterDescriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'delegateReceiverValue' @ [71:51] ==> val delegateReceiverValue: IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'createCallableReference' @ [72:21] ==> private final fun createCallableReference(ktElement: KtElement, type: KotlinType, referencedDescriptor: CallableDescriptor, scopeOwner: IrSymbol): IrCallableReference defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'ktDelegate' @ [72:45] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'kPropertyType' @ [72:57] ==> val kPropertyType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'propertyDescriptor' @ [72:72] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'irGetter' @ [72:92] ==> value-parameter irGetter: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [72:101] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'propertyDescriptor' @ [76:13] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'isVar' @ [76:32] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'propertyDescriptor' @ [77:36] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'setter' @ [77:55] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'irProperty' @ [78:13] ==> val irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'setter' @ [78:24] ==> public open var setter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedPropertyDescriptor]

'generateDelegatedPropertyAccessor' @ [78:33] ==> private final inline fun generateDelegatedPropertyAccessor(ktProperty: KtProperty, ktDelegate: KtPropertyDelegate, accessorDescriptor: PropertyAccessorDescriptor, generateBody: (IrFunction) -> IrBody): IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'ktProperty' @ [78:67] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'ktDelegate' @ [78:79] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'setterDescriptor' @ [78:91] ==> val setterDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'generateDelegatedPropertySetterBody' @ [79:17] ==> private final fun generateDelegatedPropertySetterBody(irSetter: IrFunction, ktDelegate: KtPropertyDelegate, setterDescriptor: VariableAccessorDescriptor, delegateReceiverValue: IntermediateValue, irPropertyReference: IrCallableReference): IrBody defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'irSetter' @ [80:25] ==> value-parameter irSetter: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty.<anonymous>[ValueParameterDescriptorImpl]

'ktDelegate' @ [81:25] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'setterDescriptor' @ [81:37] ==> val setterDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'delegateReceiverValue' @ [81:55] ==> val delegateReceiverValue: IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'createCallableReference' @ [82:25] ==> private final fun createCallableReference(ktElement: KtElement, type: KotlinType, referencedDescriptor: CallableDescriptor, scopeOwner: IrSymbol): IrCallableReference defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'ktDelegate' @ [82:49] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'kPropertyType' @ [82:61] ==> val kPropertyType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'propertyDescriptor' @ [82:76] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[ValueParameterDescriptorImpl]

'irSetter' @ [82:96] ==> value-parameter irSetter: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [82:105] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'irProperty' @ [87:16] ==> val irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty[LocalVariableDescriptor]

'context' @ [96:13] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[PropertyDescriptorImpl]

'symbolTable' @ [96:21] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareSimpleFunction' @ [96:33] ==> public final fun declareSimpleFunction(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktDelegate' @ [97:21] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyAccessor[ValueParameterDescriptorImpl]

'startOffset' @ [97:32] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDelegate' @ [97:45] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyAccessor[ValueParameterDescriptorImpl]

'endOffset' @ [97:56] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DELEGATED_PROPERTY_ACCESSOR' @ [98:41] ==> public object DELEGATED_PROPERTY_ACCESSOR : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'accessorDescriptor' @ [99:21] ==> value-parameter accessorDescriptor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyAccessor[ValueParameterDescriptorImpl]

'buildWithScope' @ [100:15] ==> public final inline fun <T : IrDeclaration> IrSimpleFunction.buildWithScope(builder: (IrSimpleFunction) -> Unit): IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclaration> -> IrSimpleFunction

'FunctionGenerator' @ [101:17] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [101:35] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[PropertyDescriptorImpl]

'generateFunctionParameterDeclarations' @ [101:57] ==> public final fun generateFunctionParameterDeclarations(irFunction: IrFunction, ktParameterOwner: KtElement?, ktReceiverParameterElement: KtElement?): Unit defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'irAccessor' @ [101:95] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyAccessor.<anonymous>[ValueParameterDescriptorImpl]

'ktProperty' @ [101:107] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyAccessor[ValueParameterDescriptorImpl]

'irAccessor' @ [102:17] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyAccessor.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [102:28] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'invoke' @ [102:35] ==> public abstract operator fun invoke(p1: IrFunction): IrBody defined in kotlin.Function1[FunctionInvokeDescriptor]

'irAccessor' @ [102:48] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyAccessor.<anonymous>[ValueParameterDescriptorImpl]

'listOfNotNull' @ [107:25] ==> public fun <T : Any> listOfNotNull(vararg elements: ReceiverParameterDescriptor?): List<ReceiverParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ReceiverParameterDescriptor

'propertyDescriptor' @ [107:39] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.getKPropertyTypeForDelegatedProperty[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [107:58] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'propertyDescriptor' @ [107:86] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.getKPropertyTypeForDelegatedProperty[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [107:105] ==> public final val PropertyDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'context' @ [108:16] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[PropertyDescriptorImpl]

'reflectionTypes' @ [108:24] ==> public final val reflectionTypes: ReflectionTypes defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'getKPropertyType' @ [108:40] ==> public final fun getKPropertyType(annotations: Annotations, receiverTypes: List<KotlinType>, returnType: KotlinType, mutable: Boolean): SimpleType defined in org.jetbrains.kotlin.builtins.ReflectionTypes[DeserializedSimpleFunctionDescriptor]

'EMPTY' @ [108:69] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'receivers' @ [108:76] ==> val receivers: List<ReceiverParameterDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.getKPropertyTypeForDelegatedProperty[LocalVariableDescriptor]

'map' @ [108:86] ==> public inline fun <T, R> Iterable<ReceiverParameterDescriptor>.map(transform: (ReceiverParameterDescriptor) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> KotlinType

'it' @ [108:91] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.getKPropertyTypeForDelegatedProperty.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [108:94] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'propertyDescriptor' @ [108:102] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.getKPropertyTypeForDelegatedProperty[ValueParameterDescriptorImpl]

'type' @ [108:121] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'propertyDescriptor' @ [108:127] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.getKPropertyTypeForDelegatedProperty[ValueParameterDescriptorImpl]

'isVar' @ [108:146] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'getDelegatedPropertyDelegateType' @ [116:28] ==> private final fun getDelegatedPropertyDelegateType(delegatedPropertyDescriptor: VariableDescriptorWithAccessors, ktDelegate: KtPropertyDelegate): KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [116:61] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateFieldForProperty[ValueParameterDescriptorImpl]

'ktDelegate' @ [116:81] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateFieldForProperty[ValueParameterDescriptorImpl]

'createPropertyDelegateDescriptor' @ [117:34] ==> private final fun createPropertyDelegateDescriptor(propertyDescriptor: PropertyDescriptor, delegateType: KotlinType, kPropertyType: KotlinType): IrPropertyDelegateDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [117:67] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateFieldForProperty[ValueParameterDescriptorImpl]

'delegateType' @ [117:87] ==> val delegateType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateFieldForProperty[LocalVariableDescriptor]

'kPropertyType' @ [117:101] ==> value-parameter kPropertyType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateFieldForProperty[ValueParameterDescriptorImpl]

'context' @ [119:16] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[PropertyDescriptorImpl]

'symbolTable' @ [119:24] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareField' @ [119:36] ==> public final fun declareField(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: PropertyDescriptor): IrField defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktDelegate' @ [120:17] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateFieldForProperty[ValueParameterDescriptorImpl]

'startOffset' @ [120:28] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDelegate' @ [120:41] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateFieldForProperty[ValueParameterDescriptorImpl]

'endOffset' @ [120:52] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DELEGATE' @ [120:83] ==> public object DELEGATE : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'delegateDescriptor' @ [121:17] ==> val delegateDescriptor: IrPropertyDelegateDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateFieldForProperty[LocalVariableDescriptor]

'also' @ [122:11] ==> @InlineOnly @SinceKotlin public inline fun <T> IrField.also(block: (IrField) -> Unit): IrField defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrField

'irDelegate' @ [123:13] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateFieldForProperty.<anonymous>[ValueParameterDescriptorImpl]

'initializer' @ [123:24] ==> public abstract var initializer: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'generateInitializerBodyForPropertyDelegate' @ [123:38] ==> private final fun generateInitializerBodyForPropertyDelegate(property: VariableDescriptorWithAccessors, kPropertyType: KotlinType, ktDelegate: KtPropertyDelegate, scopeOwner: IrSymbol): IrExpressionBody defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [124:21] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateFieldForProperty[ValueParameterDescriptorImpl]

'kPropertyType' @ [124:41] ==> value-parameter kPropertyType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateFieldForProperty[ValueParameterDescriptorImpl]

'ktDelegate' @ [124:56] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateFieldForProperty[ValueParameterDescriptorImpl]

'irDelegate' @ [125:21] ==> value-parameter irDelegate: IrField defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateFieldForProperty.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [125:32] ==> public abstract val symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'ktDelegate' @ [136:36] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[ValueParameterDescriptorImpl]

'expression' @ [136:47] ==> public final val KtPropertyDelegate.expression: KtExpression?[MyPropertyDescriptor]

'declarationGenerator' @ [137:37] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[PropertyDescriptorImpl]

'generateInitializerBody' @ [137:58] ==> public final fun generateInitializerBody(scopeOwnerSymbol: IrSymbol, ktBody: KtExpression): IrExpressionBody defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'scopeOwner' @ [137:82] ==> value-parameter scopeOwner: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[ValueParameterDescriptorImpl]

'ktDelegateExpression' @ [137:94] ==> val ktDelegateExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[LocalVariableDescriptor]

'get' @ [139:43] ==> public fun <K, V : Any> Generator.get(slice: ReadOnlySlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>, key: (VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors..org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors?)
    <V : Any> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'PROVIDE_DELEGATE_RESOLVED_CALL' @ [139:62] ==> public final val PROVIDE_DELEGATE_RESOLVED_CALL: (WritableSlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'property' @ [139:94] ==> value-parameter property: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[ValueParameterDescriptorImpl]

'irDelegateInitializer' @ [140:53] ==> val irDelegateInitializer: IrExpressionBody defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[LocalVariableDescriptor]

'createBodyGenerator' @ [142:34] ==> public fun Generator.createBodyGenerator(scopeOwnerSymbol: IrSymbol): BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators in file DeclarationGenerator.kt[SimpleFunctionDescriptorImpl]

'scopeOwner' @ [142:54] ==> value-parameter scopeOwner: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[ValueParameterDescriptorImpl]

'createStatementGenerator' @ [142:66] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'statementGenerator' @ [143:35] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[LocalVariableDescriptor]

'pregenerateCall' @ [143:54] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'provideDelegateResolvedCall' @ [143:70] ==> val provideDelegateResolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[LocalVariableDescriptor]

'provideDelegateCall' @ [144:9] ==> val provideDelegateCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[LocalVariableDescriptor]

'setExplicitReceiverValue' @ [144:29] ==> public fun CallBuilder.setExplicitReceiverValue(explicitReceiverValue: IntermediateValue): Unit defined in org.jetbrains.kotlin.psi2ir.intermediate in file CallBuilder.kt[SimpleFunctionDescriptorImpl]

'OnceExpressionValue' @ [144:54] ==> public constructor OnceExpressionValue(irExpression: IrExpression) defined in org.jetbrains.kotlin.psi2ir.intermediate.OnceExpressionValue[ClassConstructorDescriptorImpl]

'irDelegateInitializer' @ [144:74] ==> val irDelegateInitializer: IrExpressionBody defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[LocalVariableDescriptor]

'expression' @ [144:96] ==> public abstract var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpressionBody[DeserializedPropertyDescriptor]

'provideDelegateCall' @ [145:9] ==> val provideDelegateCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[LocalVariableDescriptor]

'irValueArgumentsByIndex' @ [145:29] ==> public final val irValueArgumentsByIndex: Array<IrExpression?> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'createCallableReference' @ [145:58] ==> private final fun createCallableReference(ktElement: KtElement, type: KotlinType, referencedDescriptor: CallableDescriptor, scopeOwner: IrSymbol): IrCallableReference defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'ktDelegate' @ [145:82] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[ValueParameterDescriptorImpl]

'kPropertyType' @ [145:94] ==> value-parameter kPropertyType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[ValueParameterDescriptorImpl]

'property' @ [145:109] ==> value-parameter property: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[ValueParameterDescriptorImpl]

'scopeOwner' @ [145:119] ==> value-parameter scopeOwner: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[ValueParameterDescriptorImpl]

'CallGenerator' @ [146:33] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [146:47] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[LocalVariableDescriptor]

'generateCall' @ [146:67] ==> public final fun generateCall(startOffset: Int, endOffset: Int, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'ktDelegate' @ [146:80] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[ValueParameterDescriptorImpl]

'startOffset' @ [146:91] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDelegate' @ [146:104] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[ValueParameterDescriptorImpl]

'endOffset' @ [146:115] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'provideDelegateCall' @ [146:126] ==> val provideDelegateCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[LocalVariableDescriptor]

'IrExpressionBodyImpl' @ [147:16] ==> public constructor IrExpressionBodyImpl(expression: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl[DeserializedClassConstructorDescriptor]

'irProvideDelegate' @ [147:37] ==> val irProvideDelegate: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerBodyForPropertyDelegate[LocalVariableDescriptor]

'createThisValueForDelegate' @ [151:25] ==> private final fun createThisValueForDelegate(thisClass: ClassDescriptor?, ktDelegate: KtPropertyDelegate): IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'thisClass' @ [151:52] ==> value-parameter thisClass: ClassDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createBackingFieldValueForDelegate[ValueParameterDescriptorImpl]

'ktDelegate' @ [151:63] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createBackingFieldValueForDelegate[ValueParameterDescriptorImpl]

'BackingFieldLValue' @ [152:16] ==> public constructor BackingFieldLValue(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrFieldSymbol, receiver: IntermediateValue?, origin: IrStatementOrigin?) defined in org.jetbrains.kotlin.psi2ir.intermediate.BackingFieldLValue[ClassConstructorDescriptorImpl]

'ktDelegate' @ [152:35] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createBackingFieldValueForDelegate[ValueParameterDescriptorImpl]

'startOffset' @ [152:46] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDelegate' @ [152:59] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createBackingFieldValueForDelegate[ValueParameterDescriptorImpl]

'endOffset' @ [152:70] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'irDelegateField' @ [153:35] ==> value-parameter irDelegateField: IrFieldSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createBackingFieldValueForDelegate[ValueParameterDescriptorImpl]

'descriptor' @ [153:51] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFieldSymbol[DeserializedPropertyDescriptor]

'type' @ [153:62] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'irDelegateField' @ [154:35] ==> value-parameter irDelegateField: IrFieldSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createBackingFieldValueForDelegate[ValueParameterDescriptorImpl]

'thisValue' @ [155:35] ==> val thisValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createBackingFieldValueForDelegate[LocalVariableDescriptor]

'thisClass' @ [160:13] ==> value-parameter thisClass: ClassDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createThisValueForDelegate[ValueParameterDescriptorImpl]

'let' @ [160:24] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> ExpressionValue): ExpressionValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> ExpressionValue

'generateExpressionValue' @ [161:17] ==> public inline fun generateExpressionValue(type: KotlinType, crossinline generate: () -> IrExpression): ExpressionValue defined in org.jetbrains.kotlin.psi2ir.intermediate in file OnceExpressionValue.kt[SimpleFunctionDescriptorImpl]

'it' @ [161:41] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createThisValueForDelegate.<anonymous>[ValueParameterDescriptorImpl]

'thisAsReceiverParameter' @ [161:44] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'type' @ [161:68] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'IrGetValueImpl' @ [162:21] ==> public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'ktDelegate' @ [163:29] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createThisValueForDelegate[ValueParameterDescriptorImpl]

'startOffset' @ [163:40] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDelegate' @ [163:53] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createThisValueForDelegate[ValueParameterDescriptorImpl]

'endOffset' @ [163:64] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'context' @ [164:29] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[PropertyDescriptorImpl]

'symbolTable' @ [164:37] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'referenceValueParameter' @ [164:49] ==> public final fun referenceValueParameter(descriptor: ParameterDescriptor): IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'thisClass' @ [164:73] ==> value-parameter thisClass: ClassDescriptor? defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createThisValueForDelegate[ValueParameterDescriptorImpl]

'thisAsReceiverParameter' @ [164:83] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'ReflectionReferencesGenerator' @ [175:13] ==> public constructor ReflectionReferencesGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [175:43] ==> value-parameter statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createCallableReference[ValueParameterDescriptorImpl]

'generateCallableReference' @ [175:63] ==> public final fun generateCallableReference(startOffset: Int, endOffset: Int, type: KotlinType, callableDescriptor: CallableDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>?, origin: IrStatementOrigin? = ...): IrCallableReference defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[SimpleFunctionDescriptorImpl]

'ktElement' @ [176:21] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createCallableReference[ValueParameterDescriptorImpl]

'startOffset' @ [176:31] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktElement' @ [176:44] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createCallableReference[ValueParameterDescriptorImpl]

'endOffset' @ [176:54] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'type' @ [176:65] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createCallableReference[ValueParameterDescriptorImpl]

'referencedDescriptor' @ [177:21] ==> value-parameter referencedDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createCallableReference[ValueParameterDescriptorImpl]

'PROPERTY_REFERENCE_FOR_DELEGATE' @ [178:45] ==> public object PROPERTY_REFERENCE_FOR_DELEGATE : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'createCallableReference' @ [187:13] ==> private final fun createCallableReference(ktElement: KtElement, type: KotlinType, referencedDescriptor: CallableDescriptor, statementGenerator: StatementGenerator): IrCallableReference defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'ktElement' @ [188:21] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createCallableReference[ValueParameterDescriptorImpl]

'type' @ [188:32] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createCallableReference[ValueParameterDescriptorImpl]

'referencedDescriptor' @ [188:38] ==> value-parameter referencedDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createCallableReference[ValueParameterDescriptorImpl]

'createBodyGenerator' @ [189:21] ==> public fun Generator.createBodyGenerator(scopeOwnerSymbol: IrSymbol): BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators in file DeclarationGenerator.kt[SimpleFunctionDescriptorImpl]

'scopeOwner' @ [189:41] ==> value-parameter scopeOwner: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createCallableReference[ValueParameterDescriptorImpl]

'createStatementGenerator' @ [189:53] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ReflectionReferencesGenerator' @ [199:13] ==> public constructor ReflectionReferencesGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[ClassConstructorDescriptorImpl]

'createBodyGenerator' @ [199:43] ==> public fun Generator.createBodyGenerator(scopeOwnerSymbol: IrSymbol): BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators in file DeclarationGenerator.kt[SimpleFunctionDescriptorImpl]

'scopeOwner' @ [199:63] ==> value-parameter scopeOwner: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'createStatementGenerator' @ [199:75] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'generateLocalDelegatedPropertyReference' @ [199:103] ==> public final fun generateLocalDelegatedPropertyReference(startOffset: Int, endOffset: Int, type: KotlinType, variableDescriptor: VariableDescriptorWithAccessors, irDelegateSymbol: IrVariableSymbol, origin: IrStatementOrigin?): IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator[SimpleFunctionDescriptorImpl]

'ktElement' @ [200:21] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'startOffset' @ [200:31] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktElement' @ [200:44] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'endOffset' @ [200:54] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'type' @ [201:21] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'variableDescriptor' @ [201:27] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'irDelegateSymbol' @ [201:47] ==> value-parameter irDelegateSymbol: IrVariableSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalDelegatedPropertyReference[ValueParameterDescriptorImpl]

'PROPERTY_REFERENCE_FOR_DELEGATE' @ [202:39] ==> public object PROPERTY_REFERENCE_FOR_DELEGATE : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'getKPropertyTypeForLocalDelegatedProperty' @ [211:29] ==> private final fun getKPropertyTypeForLocalDelegatedProperty(variableDescriptor: VariableDescriptorWithAccessors): SimpleType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [211:71] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'IrLocalDelegatedPropertyImpl' @ [213:40] ==> public constructor IrLocalDelegatedPropertyImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: VariableDescriptorWithAccessors) defined in org.jetbrains.kotlin.ir.declarations.impl.IrLocalDelegatedPropertyImpl[DeserializedClassConstructorDescriptor]

'ktProperty' @ [214:17] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'startOffset' @ [214:28] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktProperty' @ [214:41] ==> value-parameter ktProperty: KtProperty defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'endOffset' @ [214:52] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DEFINED' @ [214:83] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'variableDescriptor' @ [215:17] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'apply' @ [216:11] ==> @InlineOnly public inline fun <T> IrLocalDelegatedPropertyImpl.apply(block: IrLocalDelegatedPropertyImpl.() -> Unit): IrLocalDelegatedPropertyImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrLocalDelegatedPropertyImpl

'delegate' @ [217:13] ==> public open lateinit var delegate: IrVariable defined in org.jetbrains.kotlin.ir.declarations.impl.IrLocalDelegatedPropertyImpl[DeserializedPropertyDescriptor]

'generateDelegateVariableForLocalDelegatedProperty' @ [217:24] ==> private final fun generateDelegateVariableForLocalDelegatedProperty(ktDelegate: KtPropertyDelegate, variableDescriptor: VariableDescriptorWithAccessors, kPropertyType: KotlinType, scopeOwner: IrSymbol): IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'ktDelegate' @ [217:74] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'variableDescriptor' @ [217:86] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'kPropertyType' @ [217:106] ==> val kPropertyType: SimpleType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'scopeOwnerSymbol' @ [217:121] ==> value-parameter scopeOwnerSymbol: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'irLocalDelegatedProperty' @ [220:26] ==> val irLocalDelegatedProperty: IrLocalDelegatedPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'delegate' @ [220:51] ==> public open lateinit var delegate: IrVariable defined in org.jetbrains.kotlin.ir.declarations.impl.IrLocalDelegatedPropertyImpl[DeserializedPropertyDescriptor]

'variableDescriptor' @ [222:32] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'getter' @ [222:51] ==> public abstract val getter: VariableAccessorDescriptor? defined in org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors[DeserializedPropertyDescriptor]

'createVariableValueForDelegate' @ [223:37] ==> private final fun createVariableValueForDelegate(irDelegate: IrVariableSymbol, ktDelegate: KtPropertyDelegate): VariableLValue defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'irDelegate' @ [223:68] ==> val irDelegate: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'symbol' @ [223:79] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'ktDelegate' @ [223:87] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'irLocalDelegatedProperty' @ [224:9] ==> val irLocalDelegatedProperty: IrLocalDelegatedPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'getter' @ [224:34] ==> public open lateinit var getter: IrFunction defined in org.jetbrains.kotlin.ir.declarations.impl.IrLocalDelegatedPropertyImpl[DeserializedPropertyDescriptor]

'createLocalPropertyAccessor' @ [225:17] ==> private final inline fun createLocalPropertyAccessor(getterDescriptor: VariableAccessorDescriptor, ktDelegate: KtPropertyDelegate, generateBody: (IrFunction) -> IrBody): IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'getterDescriptor' @ [225:45] ==> val getterDescriptor: VariableAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'ktDelegate' @ [225:63] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'generateDelegatedPropertyGetterBody' @ [226:21] ==> private final fun generateDelegatedPropertyGetterBody(irGetter: IrFunction, ktDelegate: KtPropertyDelegate, getterDescriptor: VariableAccessorDescriptor, delegateReceiverValue: IntermediateValue, irPropertyReference: IrCallableReference): IrBody defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'irGetter' @ [227:29] ==> value-parameter irGetter: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty.<anonymous>[ValueParameterDescriptorImpl]

'ktDelegate' @ [227:38] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'getterDescriptor' @ [227:50] ==> val getterDescriptor: VariableAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'delegateReceiverValue' @ [227:68] ==> val delegateReceiverValue: VariableLValue defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'createLocalDelegatedPropertyReference' @ [228:29] ==> private final fun createLocalDelegatedPropertyReference(ktElement: KtElement, type: KotlinType, variableDescriptor: VariableDescriptorWithAccessors, irDelegateSymbol: IrVariableSymbol, scopeOwner: IrSymbol): IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'ktDelegate' @ [229:37] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'kPropertyType' @ [229:49] ==> val kPropertyType: SimpleType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'variableDescriptor' @ [230:37] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'irDelegate' @ [230:57] ==> val irDelegate: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'symbol' @ [230:68] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'irGetter' @ [231:37] ==> value-parameter irGetter: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [231:46] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'variableDescriptor' @ [236:13] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'isVar' @ [236:32] ==> public final val VariableDescriptorWithAccessors.isVar: Boolean[MyPropertyDescriptor]

'variableDescriptor' @ [237:36] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'setter' @ [237:55] ==> public abstract val setter: VariableAccessorDescriptor? defined in org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors[DeserializedPropertyDescriptor]

'irLocalDelegatedProperty' @ [238:13] ==> val irLocalDelegatedProperty: IrLocalDelegatedPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'setter' @ [238:38] ==> public open var setter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.impl.IrLocalDelegatedPropertyImpl[DeserializedPropertyDescriptor]

'createLocalPropertyAccessor' @ [239:21] ==> private final inline fun createLocalPropertyAccessor(getterDescriptor: VariableAccessorDescriptor, ktDelegate: KtPropertyDelegate, generateBody: (IrFunction) -> IrBody): IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'setterDescriptor' @ [239:49] ==> val setterDescriptor: VariableAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'ktDelegate' @ [239:67] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'generateDelegatedPropertySetterBody' @ [240:25] ==> private final fun generateDelegatedPropertySetterBody(irSetter: IrFunction, ktDelegate: KtPropertyDelegate, setterDescriptor: VariableAccessorDescriptor, delegateReceiverValue: IntermediateValue, irPropertyReference: IrCallableReference): IrBody defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'irSetter' @ [241:33] ==> value-parameter irSetter: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty.<anonymous>[ValueParameterDescriptorImpl]

'ktDelegate' @ [241:43] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'setterDescriptor' @ [241:55] ==> val setterDescriptor: VariableAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'delegateReceiverValue' @ [241:73] ==> val delegateReceiverValue: VariableLValue defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'createLocalDelegatedPropertyReference' @ [242:33] ==> private final fun createLocalDelegatedPropertyReference(ktElement: KtElement, type: KotlinType, variableDescriptor: VariableDescriptorWithAccessors, irDelegateSymbol: IrVariableSymbol, scopeOwner: IrSymbol): IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'ktDelegate' @ [243:41] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'kPropertyType' @ [243:53] ==> val kPropertyType: SimpleType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'variableDescriptor' @ [244:41] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[ValueParameterDescriptorImpl]

'irDelegate' @ [244:61] ==> val irDelegate: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'symbol' @ [244:72] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'irSetter' @ [245:41] ==> value-parameter irSetter: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [245:50] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'irLocalDelegatedProperty' @ [251:16] ==> val irLocalDelegatedProperty: IrLocalDelegatedPropertyImpl defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty[LocalVariableDescriptor]

'getDelegatedPropertyDelegateType' @ [260:28] ==> private final fun getDelegatedPropertyDelegateType(delegatedPropertyDescriptor: VariableDescriptorWithAccessors, ktDelegate: KtPropertyDelegate): KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [260:61] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateVariableForLocalDelegatedProperty[ValueParameterDescriptorImpl]

'ktDelegate' @ [260:81] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateVariableForLocalDelegatedProperty[ValueParameterDescriptorImpl]

'createLocalPropertyDelegatedDescriptor' @ [261:34] ==> private final fun createLocalPropertyDelegatedDescriptor(variableDescriptor: VariableDescriptorWithAccessors, delegateType: KotlinType, kPropertyType: KotlinType): IrLocalDelegatedPropertyDelegateDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [261:73] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateVariableForLocalDelegatedProperty[ValueParameterDescriptorImpl]

'delegateType' @ [261:93] ==> val delegateType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateVariableForLocalDelegatedProperty[LocalVariableDescriptor]

'kPropertyType' @ [261:107] ==> value-parameter kPropertyType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateVariableForLocalDelegatedProperty[ValueParameterDescriptorImpl]

'context' @ [263:16] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[PropertyDescriptorImpl]

'symbolTable' @ [263:24] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareVariable' @ [263:36] ==> public final fun declareVariable(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: VariableDescriptor): IrVariable defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktDelegate' @ [264:17] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateVariableForLocalDelegatedProperty[ValueParameterDescriptorImpl]

'startOffset' @ [264:28] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDelegate' @ [264:41] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateVariableForLocalDelegatedProperty[ValueParameterDescriptorImpl]

'endOffset' @ [264:52] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DELEGATE' @ [264:83] ==> public object DELEGATE : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'delegateDescriptor' @ [265:17] ==> val delegateDescriptor: IrLocalDelegatedPropertyDelegateDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateVariableForLocalDelegatedProperty[LocalVariableDescriptor]

'also' @ [266:11] ==> @InlineOnly @SinceKotlin public inline fun <T> IrVariable.also(block: (IrVariable) -> Unit): IrVariable defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVariable

'irVariable' @ [267:13] ==> value-parameter irVariable: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateVariableForLocalDelegatedProperty.<anonymous>[ValueParameterDescriptorImpl]

'initializer' @ [267:24] ==> public abstract var initializer: IrExpression? defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'generateInitializerForLocalDelegatedPropertyDelegate' @ [267:38] ==> private final fun generateInitializerForLocalDelegatedPropertyDelegate(variableDescriptor: VariableDescriptorWithAccessors, kPropertyType: KotlinType, ktDelegate: KtPropertyDelegate, delegateSymbol: IrVariableSymbol, scopeOwner: IrSymbol): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [268:21] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateVariableForLocalDelegatedProperty[ValueParameterDescriptorImpl]

'kPropertyType' @ [268:41] ==> value-parameter kPropertyType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateVariableForLocalDelegatedProperty[ValueParameterDescriptorImpl]

'ktDelegate' @ [268:56] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateVariableForLocalDelegatedProperty[ValueParameterDescriptorImpl]

'irVariable' @ [269:21] ==> value-parameter irVariable: IrVariable defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateVariableForLocalDelegatedProperty.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [269:32] ==> public abstract val symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.declarations.IrVariable[DeserializedPropertyDescriptor]

'scopeOwner' @ [270:21] ==> value-parameter scopeOwner: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateVariableForLocalDelegatedProperty[ValueParameterDescriptorImpl]

'get' @ [279:43] ==> public fun <K, V : Any> Generator.get(slice: ReadOnlySlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>, key: (VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors..org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors?)
    <V : Any> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'PROVIDE_DELEGATE_RESOLVED_CALL' @ [279:62] ==> public final val PROVIDE_DELEGATE_RESOLVED_CALL: (WritableSlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'delegatedPropertyDescriptor' @ [279:94] ==> value-parameter delegatedPropertyDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.getDelegatedPropertyDelegateType[ValueParameterDescriptorImpl]

'if (provideDelegateResolvedCall != null)
            provideDelegateResolvedCall.resultingDescriptor.returnType!!
        else
            getInferredTypeWithImplicitCastsOrFail(ktDelegate.expression!!)' @ [280:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'provideDelegateResolvedCall' @ [280:20] ==> val provideDelegateResolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.getDelegatedPropertyDelegateType[LocalVariableDescriptor]

'provideDelegateResolvedCall' @ [281:13] ==> val provideDelegateResolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.getDelegatedPropertyDelegateType[LocalVariableDescriptor]

'resultingDescriptor' @ [281:41] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.resultingDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'returnType' @ [281:61] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'getInferredTypeWithImplicitCastsOrFail' @ [283:13] ==> public fun Generator.getInferredTypeWithImplicitCastsOrFail(key: KtExpression): KotlinType defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'ktDelegate' @ [283:52] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.getDelegatedPropertyDelegateType[ValueParameterDescriptorImpl]

'expression' @ [283:63] ==> public final val KtPropertyDelegate.expression: KtExpression?[MyPropertyDescriptor]

'ktDelegate' @ [293:36] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[ValueParameterDescriptorImpl]

'expression' @ [293:47] ==> public final val KtPropertyDelegate.expression: KtExpression?[MyPropertyDescriptor]

'createBodyGenerator' @ [294:37] ==> public fun Generator.createBodyGenerator(scopeOwnerSymbol: IrSymbol): BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators in file DeclarationGenerator.kt[SimpleFunctionDescriptorImpl]

'scopeOwner' @ [294:57] ==> value-parameter scopeOwner: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[ValueParameterDescriptorImpl]

'createStatementGenerator' @ [294:69] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'generateExpression' @ [294:96] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktDelegateExpression' @ [294:115] ==> val ktDelegateExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[LocalVariableDescriptor]

'get' @ [296:43] ==> public fun <K, V : Any> Generator.get(slice: ReadOnlySlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>, key: (VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors..org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors?)
    <V : Any> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'PROVIDE_DELEGATE_RESOLVED_CALL' @ [296:62] ==> public final val PROVIDE_DELEGATE_RESOLVED_CALL: (WritableSlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'variableDescriptor' @ [296:94] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[ValueParameterDescriptorImpl]

'irDelegateInitializer' @ [297:50] ==> val irDelegateInitializer: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[LocalVariableDescriptor]

'createBodyGenerator' @ [299:34] ==> public fun Generator.createBodyGenerator(scopeOwnerSymbol: IrSymbol): BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators in file DeclarationGenerator.kt[SimpleFunctionDescriptorImpl]

'scopeOwner' @ [299:54] ==> value-parameter scopeOwner: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[ValueParameterDescriptorImpl]

'createStatementGenerator' @ [299:66] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'statementGenerator' @ [301:35] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[LocalVariableDescriptor]

'pregenerateCall' @ [301:54] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'provideDelegateResolvedCall' @ [301:70] ==> val provideDelegateResolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[LocalVariableDescriptor]

'apply' @ [301:99] ==> @InlineOnly public inline fun <T> CallBuilder.apply(block: CallBuilder.() -> Unit): CallBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallBuilder

'setExplicitReceiverValue' @ [302:13] ==> public fun CallBuilder.setExplicitReceiverValue(explicitReceiverValue: IntermediateValue): Unit defined in org.jetbrains.kotlin.psi2ir.intermediate in file CallBuilder.kt[SimpleFunctionDescriptorImpl]

'OnceExpressionValue' @ [302:38] ==> public constructor OnceExpressionValue(irExpression: IrExpression) defined in org.jetbrains.kotlin.psi2ir.intermediate.OnceExpressionValue[ClassConstructorDescriptorImpl]

'irDelegateInitializer' @ [302:58] ==> val irDelegateInitializer: IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[LocalVariableDescriptor]

'irValueArgumentsByIndex' @ [303:13] ==> public final val irValueArgumentsByIndex: Array<IrExpression?> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'createLocalDelegatedPropertyReference' @ [304:21] ==> private final fun createLocalDelegatedPropertyReference(ktElement: KtElement, type: KotlinType, variableDescriptor: VariableDescriptorWithAccessors, irDelegateSymbol: IrVariableSymbol, scopeOwner: IrSymbol): IrLocalDelegatedPropertyReference defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]

'ktDelegate' @ [304:59] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[ValueParameterDescriptorImpl]

'kPropertyType' @ [304:71] ==> value-parameter kPropertyType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[ValueParameterDescriptorImpl]

'variableDescriptor' @ [304:86] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[ValueParameterDescriptorImpl]

'delegateSymbol' @ [304:106] ==> value-parameter delegateSymbol: IrVariableSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[ValueParameterDescriptorImpl]

'scopeOwner' @ [304:122] ==> value-parameter scopeOwner: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[ValueParameterDescriptorImpl]

'CallGenerator' @ [307:16] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [307:30] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[LocalVariableDescriptor]

'generateCall' @ [307:50] ==> public final fun generateCall(startOffset: Int, endOffset: Int, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'ktDelegate' @ [307:63] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[ValueParameterDescriptorImpl]

'startOffset' @ [307:74] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDelegate' @ [307:87] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[ValueParameterDescriptorImpl]

'endOffset' @ [307:98] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'provideDelegateCall' @ [307:109] ==> val provideDelegateCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate[LocalVariableDescriptor]

'VariableLValue' @ [311:13] ==> public constructor VariableLValue(startOffset: Int, endOffset: Int, symbol: IrValueSymbol, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.psi2ir.intermediate.VariableLValue[ClassConstructorDescriptorImpl]

'ktDelegate' @ [311:28] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createVariableValueForDelegate[ValueParameterDescriptorImpl]

'startOffset' @ [311:39] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDelegate' @ [311:52] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createVariableValueForDelegate[ValueParameterDescriptorImpl]

'endOffset' @ [311:63] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'irDelegate' @ [311:74] ==> value-parameter irDelegate: IrVariableSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createVariableValueForDelegate[ValueParameterDescriptorImpl]

'context' @ [318:13] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[PropertyDescriptorImpl]

'symbolTable' @ [318:21] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareSimpleFunction' @ [318:33] ==> public final fun declareSimpleFunction(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktDelegate' @ [319:21] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalPropertyAccessor[ValueParameterDescriptorImpl]

'startOffset' @ [319:32] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDelegate' @ [319:45] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalPropertyAccessor[ValueParameterDescriptorImpl]

'endOffset' @ [319:56] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DELEGATED_PROPERTY_ACCESSOR' @ [320:41] ==> public object DELEGATED_PROPERTY_ACCESSOR : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'getterDescriptor' @ [321:21] ==> value-parameter getterDescriptor: VariableAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalPropertyAccessor[ValueParameterDescriptorImpl]

'buildWithScope' @ [322:15] ==> public final inline fun <T : IrDeclaration> IrSimpleFunction.buildWithScope(builder: (IrSimpleFunction) -> Unit): IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrDeclaration> -> IrSimpleFunction

'FunctionGenerator' @ [323:17] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [323:35] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[PropertyDescriptorImpl]

'generateFunctionParameterDeclarations' @ [323:57] ==> public final fun generateFunctionParameterDeclarations(irFunction: IrFunction, ktParameterOwner: KtElement?, ktReceiverParameterElement: KtElement?): Unit defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'irAccessor' @ [323:95] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalPropertyAccessor.<anonymous>[ValueParameterDescriptorImpl]

'ktDelegate' @ [323:107] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalPropertyAccessor[ValueParameterDescriptorImpl]

'irAccessor' @ [324:17] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalPropertyAccessor.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [324:28] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'invoke' @ [324:35] ==> public abstract operator fun invoke(p1: IrFunction): IrBody defined in kotlin.Function1[FunctionInvokeDescriptor]

'irAccessor' @ [324:48] ==> value-parameter irAccessor: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalPropertyAccessor.<anonymous>[ValueParameterDescriptorImpl]

'IrLocalDelegatedPropertyDelegateDescriptorImpl' @ [332:16] ==> public constructor IrLocalDelegatedPropertyDelegateDescriptorImpl(correspondingLocalProperty: VariableDescriptorWithAccessors, delegateType: KotlinType, kPropertyType: KotlinType) defined in org.jetbrains.kotlin.ir.descriptors.IrLocalDelegatedPropertyDelegateDescriptorImpl[DeserializedClassConstructorDescriptor]

'variableDescriptor' @ [332:63] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalPropertyDelegatedDescriptor[ValueParameterDescriptorImpl]

'delegateType' @ [332:83] ==> value-parameter delegateType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalPropertyDelegatedDescriptor[ValueParameterDescriptorImpl]

'kPropertyType' @ [332:97] ==> value-parameter kPropertyType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createLocalPropertyDelegatedDescriptor[ValueParameterDescriptorImpl]

'context' @ [336:13] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator[PropertyDescriptorImpl]

'reflectionTypes' @ [336:21] ==> public final val reflectionTypes: ReflectionTypes defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'getKPropertyType' @ [336:37] ==> public final fun getKPropertyType(annotations: Annotations, receiverTypes: List<KotlinType>, returnType: KotlinType, mutable: Boolean): SimpleType defined in org.jetbrains.kotlin.builtins.ReflectionTypes[DeserializedSimpleFunctionDescriptor]

'EMPTY' @ [336:66] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'emptyList' @ [336:73] ==> public fun <T> emptyList(): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'variableDescriptor' @ [336:86] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.getKPropertyTypeForLocalDelegatedProperty[ValueParameterDescriptorImpl]

'type' @ [336:105] ==> public final val VariableDescriptorWithAccessors.type: KotlinType[MyPropertyDescriptor]

'variableDescriptor' @ [336:111] ==> value-parameter variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.getKPropertyTypeForLocalDelegatedProperty[ValueParameterDescriptorImpl]

'isVar' @ [336:130] ==> public final val VariableDescriptorWithAccessors.isVar: Boolean[MyPropertyDescriptor]

'IrPropertyDelegateDescriptorImpl' @ [343:13] ==> public constructor IrPropertyDelegateDescriptorImpl(correspondingProperty: PropertyDescriptor, delegateType: KotlinType, kPropertyType: KotlinType) defined in org.jetbrains.kotlin.ir.descriptors.IrPropertyDelegateDescriptorImpl[DeserializedClassConstructorDescriptor]

'propertyDescriptor' @ [343:46] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createPropertyDelegateDescriptor[ValueParameterDescriptorImpl]

'delegateType' @ [343:66] ==> value-parameter delegateType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createPropertyDelegateDescriptor[ValueParameterDescriptorImpl]

'kPropertyType' @ [343:80] ==> value-parameter kPropertyType: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.createPropertyDelegateDescriptor[ValueParameterDescriptorImpl]

'with' @ [352:13] ==> @InlineOnly public inline fun <T, R> with(receiver: BodyGenerator, block: BodyGenerator.() -> IrBlockBody): IrBlockBody defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BodyGenerator
    <R> -> IrBlockBody

'createBodyGenerator' @ [352:18] ==> public fun Generator.createBodyGenerator(scopeOwnerSymbol: IrSymbol): BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators in file DeclarationGenerator.kt[SimpleFunctionDescriptorImpl]

'irGetter' @ [352:38] ==> value-parameter irGetter: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyGetterBody[ValueParameterDescriptorImpl]

'symbol' @ [352:47] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'irBlockBody' @ [353:17] ==> public inline fun GeneratorWithScope.irBlockBody(ktElement: KtElement?, body: IrBlockBodyBuilder.() -> Unit): IrBlockBody defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'ktDelegate' @ [353:29] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyGetterBody[ValueParameterDescriptorImpl]

'createStatementGenerator' @ [354:46] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'getOrFail' @ [355:56] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>, key: (VariableAccessorDescriptor..VariableAccessorDescriptor?)): (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.VariableAccessorDescriptor..org.jetbrains.kotlin.descriptors.VariableAccessorDescriptor?)
    <V : Any> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'DELEGATED_PROPERTY_RESOLVED_CALL' @ [355:81] ==> public final val DELEGATED_PROPERTY_RESOLVED_CALL: (WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'getterDescriptor' @ [355:115] ==> value-parameter getterDescriptor: VariableAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyGetterBody[ValueParameterDescriptorImpl]

'statementGenerator' @ [356:48] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyGetterBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'pregenerateCall' @ [356:67] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'conventionMethodResolvedCall' @ [356:83] ==> val conventionMethodResolvedCall: (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyGetterBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'conventionMethodCall' @ [357:21] ==> val conventionMethodCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyGetterBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'setExplicitReceiverValue' @ [357:42] ==> public fun CallBuilder.setExplicitReceiverValue(explicitReceiverValue: IntermediateValue): Unit defined in org.jetbrains.kotlin.psi2ir.intermediate in file CallBuilder.kt[SimpleFunctionDescriptorImpl]

'delegateReceiverValue' @ [357:67] ==> value-parameter delegateReceiverValue: IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyGetterBody[ValueParameterDescriptorImpl]

'conventionMethodCall' @ [358:21] ==> val conventionMethodCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyGetterBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'irValueArgumentsByIndex' @ [358:42] ==> public final val irValueArgumentsByIndex: Array<IrExpression?> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'irPropertyReference' @ [358:71] ==> value-parameter irPropertyReference: IrCallableReference defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyGetterBody[ValueParameterDescriptorImpl]

'+' @ [359:21] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[DeserializedSimpleFunctionDescriptor]

'irReturn' @ [359:22] ==> public fun IrBuilderWithScope.irReturn(value: IrExpression): IrReturnImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'CallGenerator' @ [359:31] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [359:45] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyGetterBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'generateCall' @ [359:65] ==> public final fun generateCall(startOffset: Int, endOffset: Int, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'ktDelegate' @ [359:78] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyGetterBody[ValueParameterDescriptorImpl]

'startOffset' @ [359:89] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDelegate' @ [359:102] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyGetterBody[ValueParameterDescriptorImpl]

'endOffset' @ [359:113] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'conventionMethodCall' @ [359:124] ==> val conventionMethodCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyGetterBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'with' @ [369:17] ==> @InlineOnly public inline fun <T, R> with(receiver: BodyGenerator, block: BodyGenerator.() -> IrBlockBody): IrBlockBody defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BodyGenerator
    <R> -> IrBlockBody

'createBodyGenerator' @ [369:22] ==> public fun Generator.createBodyGenerator(scopeOwnerSymbol: IrSymbol): BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators in file DeclarationGenerator.kt[SimpleFunctionDescriptorImpl]

'irSetter' @ [369:42] ==> value-parameter irSetter: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertySetterBody[ValueParameterDescriptorImpl]

'symbol' @ [369:51] ==> public abstract val symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'irBlockBody' @ [370:9] ==> public inline fun GeneratorWithScope.irBlockBody(ktElement: KtElement?, body: IrBlockBodyBuilder.() -> Unit): IrBlockBody defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'ktDelegate' @ [370:21] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertySetterBody[ValueParameterDescriptorImpl]

'createStatementGenerator' @ [371:38] ==> public final fun createStatementGenerator(): StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'getOrFail' @ [372:48] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>, key: (VariableAccessorDescriptor..VariableAccessorDescriptor?)): (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.VariableAccessorDescriptor..org.jetbrains.kotlin.descriptors.VariableAccessorDescriptor?)
    <V : Any> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'DELEGATED_PROPERTY_RESOLVED_CALL' @ [372:73] ==> public final val DELEGATED_PROPERTY_RESOLVED_CALL: (WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'setterDescriptor' @ [372:107] ==> value-parameter setterDescriptor: VariableAccessorDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertySetterBody[ValueParameterDescriptorImpl]

'statementGenerator' @ [373:40] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertySetterBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'pregenerateCall' @ [373:59] ==> public fun StatementGenerator.pregenerateCall(resolvedCall: ResolvedCall<*>): CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators in file ArgumentsGenerationUtils.kt[SimpleFunctionDescriptorImpl]

'conventionMethodResolvedCall' @ [373:75] ==> val conventionMethodResolvedCall: (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertySetterBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'conventionMethodCall' @ [374:13] ==> val conventionMethodCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertySetterBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'setExplicitReceiverValue' @ [374:34] ==> public fun CallBuilder.setExplicitReceiverValue(explicitReceiverValue: IntermediateValue): Unit defined in org.jetbrains.kotlin.psi2ir.intermediate in file CallBuilder.kt[SimpleFunctionDescriptorImpl]

'delegateReceiverValue' @ [374:59] ==> value-parameter delegateReceiverValue: IntermediateValue defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertySetterBody[ValueParameterDescriptorImpl]

'conventionMethodCall' @ [375:13] ==> val conventionMethodCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertySetterBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'irValueArgumentsByIndex' @ [375:34] ==> public final val irValueArgumentsByIndex: Array<IrExpression?> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'irPropertyReference' @ [375:63] ==> value-parameter irPropertyReference: IrCallableReference defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertySetterBody[ValueParameterDescriptorImpl]

'conventionMethodCall' @ [376:13] ==> val conventionMethodCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertySetterBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'irValueArgumentsByIndex' @ [376:34] ==> public final val irValueArgumentsByIndex: Array<IrExpression?> defined in org.jetbrains.kotlin.psi2ir.intermediate.CallBuilder[PropertyDescriptorImpl]

'irGet' @ [376:63] ==> public fun IrBuilderWithScope.irGet(variable: IrValueSymbol): IrGetValueImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'irSetter' @ [376:69] ==> value-parameter irSetter: IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertySetterBody[ValueParameterDescriptorImpl]

'valueParameters' @ [376:78] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'symbol' @ [376:97] ==> public abstract val symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.declarations.IrValueParameter[DeserializedPropertyDescriptor]

'+' @ [377:13] ==> public final fun IrStatement.unaryPlus(): Unit defined in org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder[DeserializedSimpleFunctionDescriptor]

'irReturn' @ [377:14] ==> public fun IrBuilderWithScope.irReturn(value: IrExpression): IrReturnImpl defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'CallGenerator' @ [377:23] ==> public constructor CallGenerator(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[ClassConstructorDescriptorImpl]

'statementGenerator' @ [377:37] ==> val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertySetterBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'generateCall' @ [377:57] ==> public final fun generateCall(startOffset: Int, endOffset: Int, call: CallBuilder, origin: IrStatementOrigin? = ...): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.CallGenerator[SimpleFunctionDescriptorImpl]

'ktDelegate' @ [377:70] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertySetterBody[ValueParameterDescriptorImpl]

'startOffset' @ [377:81] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDelegate' @ [377:94] ==> value-parameter ktDelegate: KtPropertyDelegate defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertySetterBody[ValueParameterDescriptorImpl]

'endOffset' @ [377:105] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'conventionMethodCall' @ [377:116] ==> val conventionMethodCall: CallBuilder defined in org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertySetterBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

