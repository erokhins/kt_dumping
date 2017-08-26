'IrSymbolBase<D>' @ [33:33] ==> public constructor IrSymbolBase<out D : DeclarationDescriptor>(descriptor: D) defined in org.jetbrains.kotlin.ir.symbols.impl.IrSymbolBase[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> D

'descriptor' @ [33:49] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase.<init>[ValueParameterDescriptorImpl]

'assert' @ [35:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isOriginalDescriptor' @ [35:16] ==> private final fun isOriginalDescriptor(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[SimpleFunctionDescriptorImpl]

'descriptor' @ [35:37] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [36:38] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [36:55] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase.<init>[ValueParameterDescriptorImpl]

'original' @ [36:66] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

'if (descriptor is ValueParameterDescriptor)
                isOriginalDescriptor(descriptor.containingDeclaration)
            else
                descriptor == descriptor.original' @ [41:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'descriptor' @ [41:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase.isOriginalDescriptor[ValueParameterDescriptorImpl]

'isOriginalDescriptor' @ [42:17] ==> private final fun isOriginalDescriptor(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[SimpleFunctionDescriptorImpl]

'descriptor' @ [42:38] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase.isOriginalDescriptor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [42:49] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'descriptor' @ [44:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase.isOriginalDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [44:31] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase.isOriginalDescriptor[ValueParameterDescriptorImpl]

'original' @ [44:42] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

'_owner' @ [48:17] ==> private final var _owner: B? defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[PropertyDescriptorImpl]

'IllegalStateException' @ [48:33] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [48:68] ==> public open val descriptor: D defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[PropertyDescriptorImpl]

'if (_owner == null)
            _owner = owner
        else
            throw IllegalStateException("${javaClass.simpleName} for $descriptor is already bound")' @ [51:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'_owner' @ [51:13] ==> private final var _owner: B? defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[PropertyDescriptorImpl]

'_owner' @ [52:13] ==> private final var _owner: B? defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[PropertyDescriptorImpl]

'owner' @ [52:22] ==> value-parameter owner: B defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase.bind[ValueParameterDescriptorImpl]

'IllegalStateException' @ [54:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'javaClass' @ [54:44] ==> public val <T : Any> IrBindableSymbolBase<D, B>.javaClass: Class<IrBindableSymbolBase<D, B>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> IrBindableSymbolBase<D, B>

'simpleName' @ [54:54] ==> public final val <T : (Any..Any?)> Class<IrBindableSymbolBase<D, B>>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> IrBindableSymbolBase<D, B>

'descriptor' @ [54:71] ==> public open val descriptor: D defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[PropertyDescriptorImpl]

'_owner' @ [58:17] ==> private final var _owner: B? defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[PropertyDescriptorImpl]

'IrBindableSymbolBase<PackageFragmentDescriptor, IrFile>' @ [62:9] ==> public constructor IrBindableSymbolBase<out D : DeclarationDescriptor, B : IrSymbolOwner>(descriptor: PackageFragmentDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> PackageFragmentDescriptor
    <B : IrSymbolOwner> -> IrFile

'descriptor' @ [62:65] ==> value-parameter descriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrFileSymbolImpl.<init>[ValueParameterDescriptorImpl]

'IrBindableSymbolBase<PackageFragmentDescriptor, IrExternalPackageFragment>' @ [66:9] ==> public constructor IrBindableSymbolBase<out D : DeclarationDescriptor, B : IrSymbolOwner>(descriptor: PackageFragmentDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> PackageFragmentDescriptor
    <B : IrSymbolOwner> -> IrExternalPackageFragment

'descriptor' @ [66:84] ==> value-parameter descriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrExternalPackageFragmentSymbolImpl.<init>[ValueParameterDescriptorImpl]

'IrBindableSymbolBase<ClassDescriptor, IrAnonymousInitializer>' @ [70:9] ==> public constructor IrBindableSymbolBase<out D : DeclarationDescriptor, B : IrSymbolOwner>(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> ClassDescriptor
    <B : IrSymbolOwner> -> IrAnonymousInitializer

'descriptor' @ [70:71] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrAnonymousInitializerSymbolImpl.<init>[ValueParameterDescriptorImpl]

'IrBindableSymbolBase<ClassDescriptor, IrClass>' @ [74:9] ==> public constructor IrBindableSymbolBase<out D : DeclarationDescriptor, B : IrSymbolOwner>(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> ClassDescriptor
    <B : IrSymbolOwner> -> IrClass

'descriptor' @ [74:56] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrClassSymbolImpl.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [78:9] ==> value-parameter descriptor: ClassDescriptor? defined in org.jetbrains.kotlin.ir.symbols.impl.createClassSymbolOrNull[ValueParameterDescriptorImpl]

'let' @ [78:21] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> IrClassSymbolImpl): IrClassSymbolImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> IrClassSymbolImpl

'IrClassSymbolImpl' @ [78:27] ==> public constructor IrClassSymbolImpl(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrClassSymbolImpl[ClassConstructorDescriptorImpl]

'it' @ [78:45] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.createClassSymbolOrNull.<anonymous>[ValueParameterDescriptorImpl]

'IrBindableSymbolBase<ClassDescriptor, IrEnumEntry>' @ [81:9] ==> public constructor IrBindableSymbolBase<out D : DeclarationDescriptor, B : IrSymbolOwner>(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> ClassDescriptor
    <B : IrSymbolOwner> -> IrEnumEntry

'descriptor' @ [81:60] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrEnumEntrySymbolImpl.<init>[ValueParameterDescriptorImpl]

'IrBindableSymbolBase<PropertyDescriptor, IrField>' @ [85:9] ==> public constructor IrBindableSymbolBase<out D : DeclarationDescriptor, B : IrSymbolOwner>(descriptor: PropertyDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> PropertyDescriptor
    <B : IrSymbolOwner> -> IrField

'descriptor' @ [85:59] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrFieldSymbolImpl.<init>[ValueParameterDescriptorImpl]

'IrBindableSymbolBase<TypeParameterDescriptor, IrTypeParameter>' @ [89:9] ==> public constructor IrBindableSymbolBase<out D : DeclarationDescriptor, B : IrSymbolOwner>(descriptor: TypeParameterDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> TypeParameterDescriptor
    <B : IrSymbolOwner> -> IrTypeParameter

'descriptor' @ [89:72] ==> value-parameter descriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrTypeParameterSymbolImpl.<init>[ValueParameterDescriptorImpl]

'IrBindableSymbolBase<ParameterDescriptor, IrValueParameter>' @ [93:9] ==> public constructor IrBindableSymbolBase<out D : DeclarationDescriptor, B : IrSymbolOwner>(descriptor: ParameterDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> ParameterDescriptor
    <B : IrSymbolOwner> -> IrValueParameter

'descriptor' @ [93:69] ==> value-parameter descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrValueParameterSymbolImpl.<init>[ValueParameterDescriptorImpl]

'IrBindableSymbolBase<VariableDescriptor, IrVariable>' @ [97:9] ==> public constructor IrBindableSymbolBase<out D : DeclarationDescriptor, B : IrSymbolOwner>(descriptor: VariableDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> VariableDescriptor
    <B : IrSymbolOwner> -> IrVariable

'descriptor' @ [97:62] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrVariableSymbolImpl.<init>[ValueParameterDescriptorImpl]

'when (descriptor) {
            is ParameterDescriptor -> IrValueParameterSymbolImpl(descriptor)
            is VariableDescriptor -> IrVariableSymbolImpl(descriptor)
            else -> throw IllegalArgumentException("Unexpected descriptor kind: $descriptor")
        }' @ [101:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrValueSymbol, entry1: IrValueSymbol, entry2: IrValueSymbol): IrValueSymbol[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrValueSymbol

'descriptor' @ [101:15] ==> value-parameter descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.createValueSymbol[ValueParameterDescriptorImpl]

'IrValueParameterSymbolImpl' @ [102:39] ==> public constructor IrValueParameterSymbolImpl(descriptor: ParameterDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrValueParameterSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [102:66] ==> value-parameter descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.createValueSymbol[ValueParameterDescriptorImpl]

'IrVariableSymbolImpl' @ [103:38] ==> public constructor IrVariableSymbolImpl(descriptor: VariableDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrVariableSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [103:59] ==> value-parameter descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.createValueSymbol[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [104:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [104:82] ==> value-parameter descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.createValueSymbol[ValueParameterDescriptorImpl]

'IrBindableSymbolBase<FunctionDescriptor, IrSimpleFunction>' @ [108:9] ==> public constructor IrBindableSymbolBase<out D : DeclarationDescriptor, B : IrSymbolOwner>(descriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> FunctionDescriptor
    <B : IrSymbolOwner> -> IrSimpleFunction

'descriptor' @ [108:68] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrSimpleFunctionSymbolImpl.<init>[ValueParameterDescriptorImpl]

'IrBindableSymbolBase<ClassConstructorDescriptor, IrConstructor>' @ [112:9] ==> public constructor IrBindableSymbolBase<out D : DeclarationDescriptor, B : IrSymbolOwner>(descriptor: ClassConstructorDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> ClassConstructorDescriptor
    <B : IrSymbolOwner> -> IrConstructor

'descriptor' @ [112:73] ==> value-parameter descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrConstructorSymbolImpl.<init>[ValueParameterDescriptorImpl]

'when (descriptor) {
            is ClassConstructorDescriptor -> IrConstructorSymbolImpl(descriptor.original)
            is FunctionDescriptor -> IrSimpleFunctionSymbolImpl(descriptor.original)
            else -> throw IllegalArgumentException("Unexpected descriptor kind: $descriptor")
        }' @ [116:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrFunctionSymbol, entry1: IrFunctionSymbol, entry2: IrFunctionSymbol): IrFunctionSymbol[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrFunctionSymbol

'descriptor' @ [116:15] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.createFunctionSymbol[ValueParameterDescriptorImpl]

'IrConstructorSymbolImpl' @ [117:46] ==> public constructor IrConstructorSymbolImpl(descriptor: ClassConstructorDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrConstructorSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [117:70] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.createFunctionSymbol[ValueParameterDescriptorImpl]

'original' @ [117:81] ==> public final val ClassConstructorDescriptor.original: ClassConstructorDescriptor[MyPropertyDescriptor]

'IrSimpleFunctionSymbolImpl' @ [118:38] ==> public constructor IrSimpleFunctionSymbolImpl(descriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrSimpleFunctionSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [118:65] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.createFunctionSymbol[ValueParameterDescriptorImpl]

'original' @ [118:76] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'IllegalArgumentException' @ [119:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [119:82] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.createFunctionSymbol[ValueParameterDescriptorImpl]

'IrBindableSymbolBase<FunctionDescriptor, IrReturnableBlock>' @ [123:9] ==> public constructor IrBindableSymbolBase<out D : DeclarationDescriptor, B : IrSymbolOwner>(descriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrBindableSymbolBase[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> FunctionDescriptor
    <B : IrSymbolOwner> -> IrReturnableBlock

'descriptor' @ [123:69] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.impl.IrReturnableBlockSymbolImpl.<init>[ValueParameterDescriptorImpl]

