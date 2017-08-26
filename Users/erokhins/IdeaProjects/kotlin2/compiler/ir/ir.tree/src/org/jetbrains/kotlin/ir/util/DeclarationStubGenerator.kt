'IrModuleFragmentImpl' @ [39:13] ==> public constructor IrModuleFragmentImpl(descriptor: ModuleDescriptor, irBuiltins: IrBuiltIns) defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [39:34] ==> value-parameter descriptor: ModuleDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateEmptyModuleFragmentStub[ValueParameterDescriptorImpl]

'irBuiltIns' @ [39:46] ==> value-parameter irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateEmptyModuleFragmentStub[ValueParameterDescriptorImpl]

'symbolTable' @ [42:13] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[PropertyDescriptorImpl]

'declareExternalPackageFragment' @ [42:25] ==> public final fun declareExternalPackageFragment(packageFragmentDescriptor: PackageFragmentDescriptor): IrExternalPackageFragment defined in org.jetbrains.kotlin.ir.util.SymbolTable[SimpleFunctionDescriptorImpl]

'descriptor' @ [42:56] ==> value-parameter descriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateEmptyExternalPackageFragmentStub[ValueParameterDescriptorImpl]

'when (descriptor) {
                is ClassDescriptor ->
                    if (DescriptorUtils.isEnumEntry(descriptor))
                        generateEnumEntryStub(descriptor)
                    else
                        generateClassStub(descriptor)
                is ClassConstructorDescriptor ->
                    generateConstructorStub(descriptor)
                is FunctionDescriptor ->
                    generateFunctionStub(descriptor)
                is PropertyDescriptor ->
                    generatePropertyStub(descriptor)
                else ->
                    throw AssertionError("Unexpected member descriptor: $descriptor")
            }' @ [45:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrDeclaration, entry1: IrDeclaration, entry2: IrDeclaration, entry3: IrDeclaration, entry4: IrDeclaration): IrDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrDeclaration

'descriptor' @ [45:19] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateMemberStub[ValueParameterDescriptorImpl]

'if (DescriptorUtils.isEnumEntry(descriptor))
                        generateEnumEntryStub(descriptor)
                    else
                        generateClassStub(descriptor)' @ [47:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrSymbolDeclaration<IrBindableSymbol<ClassDescriptor, out IrSymbolDeclaration<IrBindableSymbol<ClassDescriptor, out IrSymbolDeclaration<*>>>>>, elseBranch: IrSymbolDeclaration<IrBindableSymbol<ClassDescriptor, out IrSymbolDeclaration<IrBindableSymbol<ClassDescriptor, out IrSymbolDeclaration<*>>>>>): IrSymbolDeclaration<IrBindableSymbol<ClassDescriptor, out IrSymbolDeclaration<IrBindableSymbol<ClassDescriptor, out IrSymbolDeclaration<*>>>>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrSymbolDeclaration<IrBindableSymbol<ClassDescriptor, out IrSymbolDeclaration<IrBindableSymbol<ClassDescriptor, out IrSymbolDeclaration<*>>>>>

'isEnumEntry' @ [47:41] ==> public open fun isEnumEntry(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [47:53] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateMemberStub[ValueParameterDescriptorImpl]

'generateEnumEntryStub' @ [48:25] ==> public final fun generateEnumEntryStub(descriptor: ClassDescriptor): IrEnumEntry defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [48:47] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateMemberStub[ValueParameterDescriptorImpl]

'generateClassStub' @ [50:25] ==> public final fun generateClassStub(descriptor: ClassDescriptor): IrClass defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [50:43] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateMemberStub[ValueParameterDescriptorImpl]

'generateConstructorStub' @ [52:21] ==> public final fun generateConstructorStub(descriptor: ClassConstructorDescriptor): IrConstructor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [52:45] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateMemberStub[ValueParameterDescriptorImpl]

'generateFunctionStub' @ [54:21] ==> public final fun generateFunctionStub(descriptor: FunctionDescriptor): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [54:42] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateMemberStub[ValueParameterDescriptorImpl]

'generatePropertyStub' @ [56:21] ==> public final fun generatePropertyStub(descriptor: PropertyDescriptor): IrProperty defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [56:42] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateMemberStub[ValueParameterDescriptorImpl]

'AssertionError' @ [58:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [58:74] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateMemberStub[ValueParameterDescriptorImpl]

'IrPropertyImpl' @ [62:13] ==> public constructor IrPropertyImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: PropertyDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[ClassConstructorDescriptorImpl]

'UNDEFINED_OFFSET' @ [62:28] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'UNDEFINED_OFFSET' @ [62:46] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'origin' @ [62:64] ==> public final val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[PropertyDescriptorImpl]

'descriptor' @ [62:72] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generatePropertyStub[ValueParameterDescriptorImpl]

'also' @ [62:84] ==> @InlineOnly @SinceKotlin public inline fun <T> IrPropertyImpl.also(block: (IrPropertyImpl) -> Unit): IrPropertyImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrPropertyImpl

'descriptor' @ [63:40] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generatePropertyStub[ValueParameterDescriptorImpl]

'getter' @ [63:51] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'if (getterDescriptor == null) {
                    irProperty.backingField =
                            symbolTable.declareField(UNDEFINED_OFFSET, UNDEFINED_OFFSET, origin, descriptor)
                }
                else {
                    irProperty.getter = generateFunctionStub(getterDescriptor)
                }' @ [64:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'getterDescriptor' @ [64:21] ==> val getterDescriptor: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generatePropertyStub.<anonymous>[LocalVariableDescriptor]

'irProperty' @ [65:21] ==> value-parameter irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generatePropertyStub.<anonymous>[ValueParameterDescriptorImpl]

'backingField' @ [65:32] ==> public open var backingField: IrField? defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[PropertyDescriptorImpl]

'symbolTable' @ [66:29] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[PropertyDescriptorImpl]

'declareField' @ [66:41] ==> public final fun declareField(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: PropertyDescriptor): IrField defined in org.jetbrains.kotlin.ir.util.SymbolTable[SimpleFunctionDescriptorImpl]

'UNDEFINED_OFFSET' @ [66:54] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'UNDEFINED_OFFSET' @ [66:72] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'origin' @ [66:90] ==> public final val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[PropertyDescriptorImpl]

'descriptor' @ [66:98] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generatePropertyStub[ValueParameterDescriptorImpl]

'irProperty' @ [69:21] ==> value-parameter irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generatePropertyStub.<anonymous>[ValueParameterDescriptorImpl]

'getter' @ [69:32] ==> public open var getter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[PropertyDescriptorImpl]

'generateFunctionStub' @ [69:41] ==> public final fun generateFunctionStub(descriptor: FunctionDescriptor): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'getterDescriptor' @ [69:62] ==> val getterDescriptor: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generatePropertyStub.<anonymous>[LocalVariableDescriptor]

'irProperty' @ [72:17] ==> value-parameter irProperty: IrPropertyImpl defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generatePropertyStub.<anonymous>[ValueParameterDescriptorImpl]

'setter' @ [72:28] ==> public open var setter: IrFunction? defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[PropertyDescriptorImpl]

'descriptor' @ [72:37] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generatePropertyStub[ValueParameterDescriptorImpl]

'setter' @ [72:48] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'let' @ [72:56] ==> @InlineOnly public inline fun <T, R> PropertySetterDescriptor.let(block: (PropertySetterDescriptor) -> IrSimpleFunction): IrSimpleFunction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertySetterDescriptor
    <R> -> IrSimpleFunction

'generateFunctionStub' @ [72:62] ==> public final fun generateFunctionStub(descriptor: FunctionDescriptor): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'it' @ [72:83] ==> value-parameter it: PropertySetterDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generatePropertyStub.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'symbolTable' @ [76:13] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[PropertyDescriptorImpl]

'declareSimpleFunction' @ [76:25] ==> public final fun declareSimpleFunction(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor): IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.SymbolTable[SimpleFunctionDescriptorImpl]

'UNDEFINED_OFFSET' @ [76:47] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'UNDEFINED_OFFSET' @ [76:65] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'origin' @ [76:83] ==> public final val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[PropertyDescriptorImpl]

'descriptor' @ [76:91] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateFunctionStub[ValueParameterDescriptorImpl]

'original' @ [76:102] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'also' @ [76:112] ==> @InlineOnly @SinceKotlin public inline fun <T> IrSimpleFunction.also(block: (IrSimpleFunction) -> Unit): IrSimpleFunction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrSimpleFunction

'generateTypeParameterStubs' @ [77:17] ==> public final fun generateTypeParameterStubs(typeParameters: List<TypeParameterDescriptor>, container: IrTypeParametersContainer): Unit defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [77:44] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateFunctionStub[ValueParameterDescriptorImpl]

'typeParameters' @ [77:55] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'irFunction' @ [77:71] ==> value-parameter irFunction: IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateFunctionStub.<anonymous>[ValueParameterDescriptorImpl]

'generateValueParametersStubs' @ [78:17] ==> public final fun generateValueParametersStubs(valueParameters: Collection<ValueParameterDescriptor>, function: IrFunction): Unit defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [78:46] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateFunctionStub[ValueParameterDescriptorImpl]

'valueParameters' @ [78:57] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'irFunction' @ [78:74] ==> value-parameter irFunction: IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateFunctionStub.<anonymous>[ValueParameterDescriptorImpl]

'symbolTable' @ [82:13] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[PropertyDescriptorImpl]

'declareConstructor' @ [82:25] ==> public final fun declareConstructor(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ClassConstructorDescriptor): IrConstructor defined in org.jetbrains.kotlin.ir.util.SymbolTable[SimpleFunctionDescriptorImpl]

'UNDEFINED_OFFSET' @ [82:44] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'UNDEFINED_OFFSET' @ [82:62] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'origin' @ [82:80] ==> public final val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[PropertyDescriptorImpl]

'descriptor' @ [82:88] ==> value-parameter descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateConstructorStub[ValueParameterDescriptorImpl]

'original' @ [82:99] ==> public final val ClassConstructorDescriptor.original: ClassConstructorDescriptor[MyPropertyDescriptor]

'also' @ [82:109] ==> @InlineOnly @SinceKotlin public inline fun <T> IrConstructor.also(block: (IrConstructor) -> Unit): IrConstructor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrConstructor

'generateValueParametersStubs' @ [83:17] ==> public final fun generateValueParametersStubs(valueParameters: Collection<ValueParameterDescriptor>, function: IrFunction): Unit defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [83:46] ==> value-parameter descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateConstructorStub[ValueParameterDescriptorImpl]

'valueParameters' @ [83:57] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'irConstructor' @ [83:74] ==> value-parameter irConstructor: IrConstructor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateConstructorStub.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [87:9] ==> value-parameter valueParameters: Collection<ValueParameterDescriptor> defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateValueParametersStubs[ValueParameterDescriptorImpl]

'mapTo' @ [87:25] ==> public inline fun <T, R, C : MutableCollection<in IrValueParameter>> Iterable<ValueParameterDescriptor>.mapTo(destination: MutableList<IrValueParameter>, transform: (ValueParameterDescriptor) -> IrValueParameter): MutableList<IrValueParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor
    <R> -> IrValueParameter
    <C : MutableCollection<in R>> -> MutableList<IrValueParameter>

'function' @ [87:31] ==> value-parameter function: IrFunction defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateValueParametersStubs[ValueParameterDescriptorImpl]

'valueParameters' @ [87:40] ==> public abstract val valueParameters: MutableList<IrValueParameter> defined in org.jetbrains.kotlin.ir.declarations.IrFunction[PropertyDescriptorImpl]

'generateValueParameterStub' @ [87:59] ==> public final fun generateValueParameterStub(descriptor: ValueParameterDescriptor): IrValueParameter defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'it' @ [87:86] ==> value-parameter it: ValueParameterDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateValueParametersStubs.<anonymous>[ValueParameterDescriptorImpl]

'IrValueParameterImpl' @ [91:13] ==> public constructor IrValueParameterImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ParameterDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[ClassConstructorDescriptorImpl]

'UNDEFINED_OFFSET' @ [91:34] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'UNDEFINED_OFFSET' @ [91:52] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'origin' @ [91:70] ==> public final val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[PropertyDescriptorImpl]

'descriptor' @ [91:78] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateValueParameterStub[ValueParameterDescriptorImpl]

'also' @ [91:90] ==> @InlineOnly @SinceKotlin public inline fun <T> IrValueParameterImpl.also(block: (IrValueParameterImpl) -> Unit): IrValueParameterImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrValueParameterImpl

'descriptor' @ [92:21] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateValueParameterStub[ValueParameterDescriptorImpl]

'declaresDefaultValue' @ [92:32] ==> public abstract fun declaresDefaultValue(): Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'irValueParameter' @ [93:21] ==> value-parameter irValueParameter: IrValueParameterImpl defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateValueParameterStub.<anonymous>[ValueParameterDescriptorImpl]

'defaultValue' @ [93:38] ==> public open var defaultValue: IrExpressionBody? defined in org.jetbrains.kotlin.ir.declarations.impl.IrValueParameterImpl[PropertyDescriptorImpl]

'IrExpressionBodyImpl' @ [94:29] ==> public constructor IrExpressionBodyImpl(expression: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl[ClassConstructorDescriptorImpl]

'IrErrorExpressionImpl' @ [94:50] ==> public constructor IrErrorExpressionImpl(startOffset: Int, endOffset: Int, type: KotlinType, description: String) defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorExpressionImpl[ClassConstructorDescriptorImpl]

'UNDEFINED_OFFSET' @ [95:37] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'UNDEFINED_OFFSET' @ [95:55] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'descriptor' @ [95:73] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateValueParameterStub[ValueParameterDescriptorImpl]

'type' @ [95:84] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'descriptor' @ [96:77] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateValueParameterStub[ValueParameterDescriptorImpl]

'name' @ [96:88] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'symbolTable' @ [102:13] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[PropertyDescriptorImpl]

'declareClass' @ [102:25] ==> public final fun declareClass(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ClassDescriptor): IrClass defined in org.jetbrains.kotlin.ir.util.SymbolTable[SimpleFunctionDescriptorImpl]

'UNDEFINED_OFFSET' @ [102:38] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'UNDEFINED_OFFSET' @ [102:56] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'origin' @ [102:74] ==> public final val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[PropertyDescriptorImpl]

'descriptor' @ [102:82] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateClassStub[ValueParameterDescriptorImpl]

'also' @ [102:94] ==> @InlineOnly @SinceKotlin public inline fun <T> IrClass.also(block: (IrClass) -> Unit): IrClass defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrClass

'generateTypeParameterStubs' @ [103:17] ==> public final fun generateTypeParameterStubs(typeParameters: List<TypeParameterDescriptor>, container: IrTypeParametersContainer): Unit defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [103:44] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateClassStub[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [103:55] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'irClass' @ [103:79] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateClassStub.<anonymous>[ValueParameterDescriptorImpl]

'generateChildStubs' @ [104:17] ==> public final fun generateChildStubs(descriptors: Collection<DeclarationDescriptor>, container: IrDeclarationContainer): Unit defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [104:36] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateClassStub[ValueParameterDescriptorImpl]

'constructors' @ [104:47] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'irClass' @ [104:61] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateClassStub.<anonymous>[ValueParameterDescriptorImpl]

'generateMemberStubs' @ [105:17] ==> public final fun generateMemberStubs(memberScope: MemberScope, container: IrDeclarationContainer): Unit defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [105:37] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateClassStub[ValueParameterDescriptorImpl]

'defaultType' @ [105:48] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [105:60] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'irClass' @ [105:73] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateClassStub.<anonymous>[ValueParameterDescriptorImpl]

'generateMemberStubs' @ [106:17] ==> public final fun generateMemberStubs(memberScope: MemberScope, container: IrDeclarationContainer): Unit defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [106:37] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateClassStub[ValueParameterDescriptorImpl]

'staticScope' @ [106:48] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'irClass' @ [106:61] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateClassStub.<anonymous>[ValueParameterDescriptorImpl]

'symbolTable' @ [110:13] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[PropertyDescriptorImpl]

'declareEnumEntry' @ [110:25] ==> public final fun declareEnumEntry(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ClassDescriptor): IrEnumEntry defined in org.jetbrains.kotlin.ir.util.SymbolTable[SimpleFunctionDescriptorImpl]

'UNDEFINED_OFFSET' @ [110:42] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'UNDEFINED_OFFSET' @ [110:60] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'origin' @ [110:78] ==> public final val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[PropertyDescriptorImpl]

'descriptor' @ [110:86] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateEnumEntryStub[ValueParameterDescriptorImpl]

'typeParameters' @ [113:9] ==> value-parameter typeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateTypeParameterStubs[ValueParameterDescriptorImpl]

'mapTo' @ [113:24] ==> public inline fun <T, R, C : MutableCollection<in IrTypeParameter>> Iterable<TypeParameterDescriptor>.mapTo(destination: MutableList<IrTypeParameter>, transform: (TypeParameterDescriptor) -> IrTypeParameter): MutableList<IrTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> IrTypeParameter
    <C : MutableCollection<in R>> -> MutableList<IrTypeParameter>

'container' @ [113:30] ==> value-parameter container: IrTypeParametersContainer defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateTypeParameterStubs[ValueParameterDescriptorImpl]

'typeParameters' @ [113:40] ==> public abstract val typeParameters: MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.declarations.IrTypeParametersContainer[PropertyDescriptorImpl]

'generateTypeParameterStub' @ [113:58] ==> public final fun generateTypeParameterStub(descriptor: TypeParameterDescriptor): IrTypeParameter defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'it' @ [113:84] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateTypeParameterStubs.<anonymous>[ValueParameterDescriptorImpl]

'IrTypeParameterImpl' @ [117:13] ==> public constructor IrTypeParameterImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: TypeParameterDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrTypeParameterImpl[ClassConstructorDescriptorImpl]

'UNDEFINED_OFFSET' @ [117:33] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'UNDEFINED_OFFSET' @ [117:51] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir in file SourceManager.kt[PropertyDescriptorImpl]

'origin' @ [117:69] ==> public final val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[PropertyDescriptorImpl]

'descriptor' @ [117:77] ==> value-parameter descriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateTypeParameterStub[ValueParameterDescriptorImpl]

'generateChildStubs' @ [120:9] ==> public final fun generateChildStubs(descriptors: Collection<DeclarationDescriptor>, container: IrDeclarationContainer): Unit defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'memberScope' @ [120:28] ==> value-parameter memberScope: MemberScope defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateMemberStubs[ValueParameterDescriptorImpl]

'getContributedDescriptors' @ [120:40] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'container' @ [120:69] ==> value-parameter container: IrDeclarationContainer defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateMemberStubs[ValueParameterDescriptorImpl]

'descriptors' @ [124:9] ==> value-parameter descriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateChildStubs[ValueParameterDescriptorImpl]

'sortedWith' @ [124:21] ==> public fun <T> Iterable<DeclarationDescriptor>.sortedWith(comparator: Comparator<in DeclarationDescriptor> /* = Comparator<in DeclarationDescriptor> */): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'StableDescriptorsComparator' @ [124:32] ==> public object StableDescriptorsComparator : Comparator<DeclarationDescriptor> defined in org.jetbrains.kotlin.ir.util in file StableDescriptorsComparator.kt[FakeCallableDescriptorForObject]

'mapTo' @ [124:61] ==> public inline fun <T, R, C : MutableCollection<in IrDeclaration>> Iterable<DeclarationDescriptor>.mapTo(destination: MutableList<IrDeclaration>, transform: (DeclarationDescriptor) -> IrDeclaration): MutableList<IrDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> IrDeclaration
    <C : MutableCollection<in R>> -> MutableList<IrDeclaration>

'container' @ [124:67] ==> value-parameter container: IrDeclarationContainer defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateChildStubs[ValueParameterDescriptorImpl]

'declarations' @ [124:77] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationContainer[PropertyDescriptorImpl]

'generateMemberStub' @ [124:93] ==> public final fun generateMemberStub(descriptor: DeclarationDescriptor): IrDeclaration defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'it' @ [124:112] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator.generateChildStubs.<anonymous>[ValueParameterDescriptorImpl]

