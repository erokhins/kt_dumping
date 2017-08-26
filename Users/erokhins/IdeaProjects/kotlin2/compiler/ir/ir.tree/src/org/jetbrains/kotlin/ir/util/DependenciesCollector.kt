'LinkedHashSet' @ [27:51] ==> public final fun <E> <init>(): LinkedHashSet<ModuleDescriptor> /* = LinkedHashSet<ModuleDescriptor> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> ModuleDescriptor

'LinkedHashMap' @ [28:60] ==> public final fun <K, V> <init>(): LinkedHashMap<ModuleDescriptor, MutableSet<PackageFragmentDescriptor>> /* = LinkedHashMap<ModuleDescriptor, MutableSet<PackageFragmentDescriptor>> */ defined in kotlin.collections.LinkedHashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> ModuleDescriptor
    <V> -> MutableSet<PackageFragmentDescriptor>

'LinkedHashMap' @ [29:39] ==> public final fun <K, V> <init>(): LinkedHashMap<PackageFragmentDescriptor, MutableSet<DeclarationDescriptor>> /* = LinkedHashMap<PackageFragmentDescriptor, MutableSet<DeclarationDescriptor>> */ defined in kotlin.collections.LinkedHashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> PackageFragmentDescriptor
    <V> -> MutableSet<DeclarationDescriptor>

'modulesForDependencyDescriptors' @ [31:65] ==> private final val modulesForDependencyDescriptors: LinkedHashSet<ModuleDescriptor> /* = LinkedHashSet<ModuleDescriptor> */ defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[PropertyDescriptorImpl]

'packageFragmentsForDependencyDescriptors' @ [34:13] ==> private final val packageFragmentsForDependencyDescriptors: LinkedHashMap<ModuleDescriptor, MutableSet<PackageFragmentDescriptor>> /* = LinkedHashMap<ModuleDescriptor, MutableSet<PackageFragmentDescriptor>> */ defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[PropertyDescriptorImpl]

'moduleDescriptor' @ [34:54] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.getPackageFragments[ValueParameterDescriptorImpl]

'emptyList' @ [34:75] ==> public fun <T> emptyList(): List<PackageFragmentDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'topLevelDescriptors' @ [37:13] ==> private final val topLevelDescriptors: LinkedHashMap<PackageFragmentDescriptor, MutableSet<DeclarationDescriptor>> /* = LinkedHashMap<PackageFragmentDescriptor, MutableSet<DeclarationDescriptor>> */ defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[PropertyDescriptorImpl]

'packageFragmentDescriptor' @ [37:33] ==> value-parameter packageFragmentDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.getTopLevelDescriptors[ValueParameterDescriptorImpl]

'emptyList' @ [37:63] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'assert' @ [40:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'symbolTable' @ [40:16] ==> value-parameter symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.collectTopLevelDescriptorsForUnboundSymbols[ValueParameterDescriptorImpl]

'unboundTypeParameters' @ [40:28] ==> public final val unboundTypeParameters: Set<IrTypeParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'isEmpty' @ [40:50] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'symbolTable' @ [40:91] ==> value-parameter symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.collectTopLevelDescriptorsForUnboundSymbols[ValueParameterDescriptorImpl]

'unboundTypeParameters' @ [40:103] ==> public final val unboundTypeParameters: Set<IrTypeParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'assert' @ [41:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'symbolTable' @ [41:16] ==> value-parameter symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.collectTopLevelDescriptorsForUnboundSymbols[ValueParameterDescriptorImpl]

'unboundValueParameters' @ [41:28] ==> public final val unboundValueParameters: Set<IrValueParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'isEmpty' @ [41:51] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'symbolTable' @ [41:93] ==> value-parameter symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.collectTopLevelDescriptorsForUnboundSymbols[ValueParameterDescriptorImpl]

'unboundValueParameters' @ [41:105] ==> public final val unboundValueParameters: Set<IrValueParameterSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'assert' @ [42:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'symbolTable' @ [42:16] ==> value-parameter symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.collectTopLevelDescriptorsForUnboundSymbols[ValueParameterDescriptorImpl]

'unboundVariables' @ [42:28] ==> public final val unboundVariables: Set<IrVariableSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'isEmpty' @ [42:45] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'symbolTable' @ [42:80] ==> value-parameter symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.collectTopLevelDescriptorsForUnboundSymbols[ValueParameterDescriptorImpl]

'unboundVariables' @ [42:92] ==> public final val unboundVariables: Set<IrVariableSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'symbolTable' @ [44:9] ==> value-parameter symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.collectTopLevelDescriptorsForUnboundSymbols[ValueParameterDescriptorImpl]

'unboundClasses' @ [44:21] ==> public final val unboundClasses: Set<IrClassSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'addTopLevelDeclarations' @ [44:36] ==> private final fun Collection<IrSymbol>.addTopLevelDeclarations(): Unit defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[SimpleFunctionDescriptorImpl]

'symbolTable' @ [45:9] ==> value-parameter symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.collectTopLevelDescriptorsForUnboundSymbols[ValueParameterDescriptorImpl]

'unboundConstructors' @ [45:21] ==> public final val unboundConstructors: Set<IrConstructorSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'addTopLevelDeclarations' @ [45:41] ==> private final fun Collection<IrSymbol>.addTopLevelDeclarations(): Unit defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[SimpleFunctionDescriptorImpl]

'symbolTable' @ [46:9] ==> value-parameter symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.collectTopLevelDescriptorsForUnboundSymbols[ValueParameterDescriptorImpl]

'unboundEnumEntries' @ [46:21] ==> public final val unboundEnumEntries: Set<IrEnumEntrySymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'addTopLevelDeclarations' @ [46:40] ==> private final fun Collection<IrSymbol>.addTopLevelDeclarations(): Unit defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[SimpleFunctionDescriptorImpl]

'symbolTable' @ [47:9] ==> value-parameter symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.collectTopLevelDescriptorsForUnboundSymbols[ValueParameterDescriptorImpl]

'unboundFields' @ [47:21] ==> public final val unboundFields: Set<IrFieldSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'addTopLevelDeclarations' @ [47:35] ==> private final fun Collection<IrSymbol>.addTopLevelDeclarations(): Unit defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[SimpleFunctionDescriptorImpl]

'symbolTable' @ [48:9] ==> value-parameter symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.collectTopLevelDescriptorsForUnboundSymbols[ValueParameterDescriptorImpl]

'unboundSimpleFunctions' @ [48:21] ==> public final val unboundSimpleFunctions: Set<IrSimpleFunctionSymbol> defined in org.jetbrains.kotlin.ir.util.SymbolTable[PropertyDescriptorImpl]

'addTopLevelDeclarations' @ [48:44] ==> private final fun Collection<IrSymbol>.addTopLevelDeclarations(): Unit defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[SimpleFunctionDescriptorImpl]

'forEach' @ [52:9] ==> @HidesMembers public inline fun <T> Iterable<IrSymbol>.forEach(action: (IrSymbol) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrSymbol

'addTopLevelDeclaration' @ [52:19] ==> public final fun addTopLevelDeclaration(symbol: IrSymbol): Unit defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[SimpleFunctionDescriptorImpl]

'it' @ [52:42] ==> value-parameter it: IrSymbol defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.addTopLevelDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [56:26] ==> value-parameter symbol: IrSymbol defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.addTopLevelDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [56:33] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSymbol[PropertyDescriptorImpl]

'getTopLevelDeclaration' @ [57:35] ==> private final fun getTopLevelDeclaration(descriptor: DeclarationDescriptor): DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[SimpleFunctionDescriptorImpl]

'descriptor' @ [57:58] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.addTopLevelDeclaration[LocalVariableDescriptor]

'addTopLevelDescriptor' @ [58:9] ==> private final fun addTopLevelDescriptor(descriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[SimpleFunctionDescriptorImpl]

'topLevelDeclaration' @ [58:31] ==> val topLevelDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.addTopLevelDeclaration[LocalVariableDescriptor]

'descriptor' @ [62:37] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.getTopLevelDeclaration[ValueParameterDescriptorImpl]

'containingDeclaration' @ [62:48] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'when (containingDeclaration) {
            is PackageFragmentDescriptor -> descriptor
            is ClassDescriptor -> getTopLevelDeclaration(containingDeclaration)
            else -> throw AssertionError("Package or class expected: $containingDeclaration")
        }' @ [63:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor, entry1: DeclarationDescriptor, entry2: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor

'containingDeclaration' @ [63:22] ==> val containingDeclaration: DeclarationDescriptor? defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.getTopLevelDeclaration[LocalVariableDescriptor]

'descriptor' @ [64:45] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.getTopLevelDeclaration[ValueParameterDescriptorImpl]

'getTopLevelDeclaration' @ [65:35] ==> private final fun getTopLevelDeclaration(descriptor: DeclarationDescriptor): DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[SimpleFunctionDescriptorImpl]

'containingDeclaration' @ [65:58] ==> val containingDeclaration: DeclarationDescriptor? defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.getTopLevelDeclaration[LocalVariableDescriptor]

'AssertionError' @ [66:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'containingDeclaration' @ [66:71] ==> val containingDeclaration: DeclarationDescriptor? defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.getTopLevelDeclaration[LocalVariableDescriptor]

'!!' @ [71:41] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PackageFragmentDescriptor?): PackageFragmentDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PackageFragmentDescriptor

'getParentOfType' @ [71:57] ==> @Nullable public open fun <D : (DeclarationDescriptor..DeclarationDescriptor?)> getParentOfType(@Nullable p0: DeclarationDescriptor?, @NotNull p1: Class<(PackageFragmentDescriptor..PackageFragmentDescriptor?)>): PackageFragmentDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (DeclarationDescriptor..DeclarationDescriptor?)> -> PackageFragmentDescriptor

'descriptor' @ [71:73] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.addTopLevelDescriptor[ValueParameterDescriptorImpl]

'java' @ [71:118] ==> public val <T> KClass<PackageFragmentDescriptor>.java: Class<PackageFragmentDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'packageFragmentDescriptor' @ [73:32] ==> val packageFragmentDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.addTopLevelDescriptor[LocalVariableDescriptor]

'containingDeclaration' @ [73:58] ==> public final val PackageFragmentDescriptor.containingDeclaration: ModuleDescriptor[MyPropertyDescriptor]

'modulesForDependencyDescriptors' @ [74:9] ==> private final val modulesForDependencyDescriptors: LinkedHashSet<ModuleDescriptor> /* = LinkedHashSet<ModuleDescriptor> */ defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[PropertyDescriptorImpl]

'add' @ [74:41] ==> public open fun add(element: ModuleDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'moduleDescriptor' @ [74:45] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.addTopLevelDescriptor[LocalVariableDescriptor]

'packageFragmentsForDependencyDescriptors' @ [76:9] ==> private final val packageFragmentsForDependencyDescriptors: LinkedHashMap<ModuleDescriptor, MutableSet<PackageFragmentDescriptor>> /* = LinkedHashMap<ModuleDescriptor, MutableSet<PackageFragmentDescriptor>> */ defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[PropertyDescriptorImpl]

'getOrPut' @ [76:50] ==> public inline fun <K, V> MutableMap<ModuleDescriptor, MutableSet<PackageFragmentDescriptor>>.getOrPut(key: ModuleDescriptor, defaultValue: () -> MutableSet<PackageFragmentDescriptor>): MutableSet<PackageFragmentDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ModuleDescriptor
    <V> -> MutableSet<PackageFragmentDescriptor>

'moduleDescriptor' @ [76:59] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.addTopLevelDescriptor[LocalVariableDescriptor]

'LinkedHashSet' @ [76:79] ==> public final fun <E> <init>(): LinkedHashSet<PackageFragmentDescriptor> /* = LinkedHashSet<PackageFragmentDescriptor> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> PackageFragmentDescriptor

'add' @ [76:97] ==> public abstract fun add(element: PackageFragmentDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'packageFragmentDescriptor' @ [76:101] ==> val packageFragmentDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.addTopLevelDescriptor[LocalVariableDescriptor]

'topLevelDescriptors' @ [77:9] ==> private final val topLevelDescriptors: LinkedHashMap<PackageFragmentDescriptor, MutableSet<DeclarationDescriptor>> /* = LinkedHashMap<PackageFragmentDescriptor, MutableSet<DeclarationDescriptor>> */ defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[PropertyDescriptorImpl]

'getOrPut' @ [77:29] ==> public inline fun <K, V> MutableMap<PackageFragmentDescriptor, MutableSet<DeclarationDescriptor>>.getOrPut(key: PackageFragmentDescriptor, defaultValue: () -> MutableSet<DeclarationDescriptor>): MutableSet<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PackageFragmentDescriptor
    <V> -> MutableSet<DeclarationDescriptor>

'packageFragmentDescriptor' @ [77:38] ==> val packageFragmentDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.addTopLevelDescriptor[LocalVariableDescriptor]

'LinkedHashSet' @ [77:67] ==> public final fun <E> <init>(): LinkedHashSet<DeclarationDescriptor> /* = LinkedHashSet<DeclarationDescriptor> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> DeclarationDescriptor

'add' @ [77:85] ==> public abstract fun add(element: DeclarationDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [77:89] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.DependenciesCollector.addTopLevelDescriptor[ValueParameterDescriptorImpl]

