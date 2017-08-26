'DeclarationGeneratorExtension' @ [27:79] ==> public constructor DeclarationGeneratorExtension(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGeneratorExtension[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [27:109] ==> value-parameter declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.<init>[ValueParameterDescriptorImpl]

'generateValues' @ [29:9] ==> private final fun generateValues(irClass: IrClass): Unit defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator[SimpleFunctionDescriptorImpl]

'irClass' @ [29:24] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateSpecialMembers[ValueParameterDescriptorImpl]

'generateValueOf' @ [30:9] ==> private final fun generateValueOf(irClass: IrClass): Unit defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator[SimpleFunctionDescriptorImpl]

'irClass' @ [30:25] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateSpecialMembers[ValueParameterDescriptorImpl]

'irClass' @ [34:30] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValues[ValueParameterDescriptorImpl]

'descriptor' @ [34:38] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'staticScope' @ [34:49] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'findFirstFunction' @ [34:61] ==> public inline fun MemberScope.findFirstFunction(name: String, predicate: (CallableMemberDescriptor) -> Boolean): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir[SimpleFunctionDescriptorImpl]

'it' @ [35:13] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValues.<anonymous>[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [35:16] ==> public final val CallableMemberDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'it' @ [36:13] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValues.<anonymous>[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [36:16] ==> public final val CallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'it' @ [37:13] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValues.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [37:16] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [37:32] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'irClass' @ [40:9] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValues[ValueParameterDescriptorImpl]

'addMember' @ [40:17] ==> public fun IrClass.addMember(member: IrDeclaration): Unit defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'context' @ [41:17] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator[PropertyDescriptorImpl]

'symbolTable' @ [41:25] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareSimpleFunction' @ [41:37] ==> public final fun declareSimpleFunction(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'irClass' @ [42:25] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValues[ValueParameterDescriptorImpl]

'startOffset' @ [42:33] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'irClass' @ [42:46] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValues[ValueParameterDescriptorImpl]

'endOffset' @ [42:54] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'ENUM_CLASS_SPECIAL_MEMBER' @ [43:45] ==> public object ENUM_CLASS_SPECIAL_MEMBER : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'valuesFunction' @ [44:25] ==> val valuesFunction: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValues[LocalVariableDescriptor]

'also' @ [45:19] ==> @InlineOnly @SinceKotlin public inline fun <T> IrSimpleFunction.also(block: (IrSimpleFunction) -> Unit): IrSimpleFunction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrSimpleFunction

'FunctionGenerator' @ [46:21] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [46:39] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator[PropertyDescriptorImpl]

'generateFunctionParameterDeclarations' @ [46:61] ==> public final fun generateFunctionParameterDeclarations(irFunction: IrFunction, ktParameterOwner: KtElement?, ktReceiverParameterElement: KtElement?): Unit defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'irFunction' @ [46:99] ==> value-parameter irFunction: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValues.<anonymous>[ValueParameterDescriptorImpl]

'irFunction' @ [47:21] ==> value-parameter irFunction: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValues.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [47:32] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'IrSyntheticBodyImpl' @ [47:39] ==> public constructor IrSyntheticBodyImpl(startOffset: Int, endOffset: Int, kind: IrSyntheticBodyKind) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSyntheticBodyImpl[DeserializedClassConstructorDescriptor]

'irClass' @ [47:59] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValues[ValueParameterDescriptorImpl]

'startOffset' @ [47:67] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'irClass' @ [47:80] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValues[ValueParameterDescriptorImpl]

'endOffset' @ [47:88] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'ENUM_VALUES' @ [47:119] ==> enum entry ENUM_VALUES defined in org.jetbrains.kotlin.ir.expressions.IrSyntheticBodyKind[FakeCallableDescriptorForObject]

'irClass' @ [53:31] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValueOf[ValueParameterDescriptorImpl]

'descriptor' @ [53:39] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'staticScope' @ [53:50] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'findFirstFunction' @ [53:62] ==> public inline fun MemberScope.findFirstFunction(name: String, predicate: (CallableMemberDescriptor) -> Boolean): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir[SimpleFunctionDescriptorImpl]

'it' @ [54:13] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValueOf.<anonymous>[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [54:16] ==> public final val CallableMemberDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'it' @ [55:13] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValueOf.<anonymous>[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [55:16] ==> public final val CallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'it' @ [56:13] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValueOf.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [56:16] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [56:32] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'irClass' @ [59:9] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValueOf[ValueParameterDescriptorImpl]

'addMember' @ [59:17] ==> public fun IrClass.addMember(member: IrDeclaration): Unit defined in org.jetbrains.kotlin.ir.declarations[DeserializedSimpleFunctionDescriptor]

'context' @ [60:17] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator[PropertyDescriptorImpl]

'symbolTable' @ [60:25] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareSimpleFunction' @ [60:37] ==> public final fun declareSimpleFunction(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'UNDEFINED_OFFSET' @ [61:25] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [61:43] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'ENUM_CLASS_SPECIAL_MEMBER' @ [62:45] ==> public object ENUM_CLASS_SPECIAL_MEMBER : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'valueOfFunction' @ [63:25] ==> val valueOfFunction: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValueOf[LocalVariableDescriptor]

'also' @ [64:19] ==> @InlineOnly @SinceKotlin public inline fun <T> IrSimpleFunction.also(block: (IrSimpleFunction) -> Unit): IrSimpleFunction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrSimpleFunction

'FunctionGenerator' @ [65:21] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'declarationGenerator' @ [65:39] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator[PropertyDescriptorImpl]

'generateFunctionParameterDeclarations' @ [65:61] ==> public final fun generateFunctionParameterDeclarations(irFunction: IrFunction, ktParameterOwner: KtElement?, ktReceiverParameterElement: KtElement?): Unit defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'irFunction' @ [65:99] ==> value-parameter irFunction: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValueOf.<anonymous>[ValueParameterDescriptorImpl]

'irFunction' @ [66:21] ==> value-parameter irFunction: IrSimpleFunction defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValueOf.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [66:32] ==> public abstract var body: IrBody? defined in org.jetbrains.kotlin.ir.declarations.IrSimpleFunction[DeserializedPropertyDescriptor]

'IrSyntheticBodyImpl' @ [66:39] ==> public constructor IrSyntheticBodyImpl(startOffset: Int, endOffset: Int, kind: IrSyntheticBodyKind) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSyntheticBodyImpl[DeserializedClassConstructorDescriptor]

'irClass' @ [66:59] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValueOf[ValueParameterDescriptorImpl]

'startOffset' @ [66:67] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'irClass' @ [66:80] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.psi2ir.generators.EnumClassMembersGenerator.generateValueOf[ValueParameterDescriptorImpl]

'endOffset' @ [66:88] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'ENUM_VALUEOF' @ [66:119] ==> enum entry ENUM_VALUEOF defined in org.jetbrains.kotlin.ir.expressions.IrSyntheticBodyKind[FakeCallableDescriptorForObject]

