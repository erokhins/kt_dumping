'DeclarationStubGenerator' @ [28:33] ==> public constructor DeclarationStubGenerator(symbolTable: SymbolTable, origin: IrDeclarationOrigin) defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[ClassConstructorDescriptorImpl]

'symbolTable' @ [28:58] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator[PropertyDescriptorImpl]

'IR_EXTERNAL_DECLARATION_STUB' @ [28:91] ==> public object IR_EXTERNAL_DECLARATION_STUB : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'DependenciesCollector' @ [31:25] ==> public constructor DependenciesCollector() defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[ClassConstructorDescriptorImpl]

'collector' @ [32:9] ==> val collector: DependenciesCollector defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generateUnboundSymbolsAsDependencies[LocalVariableDescriptor]

'collectTopLevelDescriptorsForUnboundSymbols' @ [32:19] ==> public final fun collectTopLevelDescriptorsForUnboundSymbols(symbolTable: SymbolTable): Unit defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[SimpleFunctionDescriptorImpl]

'symbolTable' @ [32:63] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator[PropertyDescriptorImpl]

'collector' @ [34:9] ==> val collector: DependenciesCollector defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generateUnboundSymbolsAsDependencies[LocalVariableDescriptor]

'dependencyModules' @ [34:19] ==> public final val dependencyModules: Collection<ModuleDescriptor> defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[PropertyDescriptorImpl]

'mapTo' @ [34:37] ==> public inline fun <T, R, C : MutableCollection<in IrModuleFragment>> Iterable<ModuleDescriptor>.mapTo(destination: MutableList<IrModuleFragment>, transform: (ModuleDescriptor) -> IrModuleFragment): MutableList<IrModuleFragment> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptor
    <R> -> IrModuleFragment
    <C : MutableCollection<in R>> -> MutableList<IrModuleFragment>

'irModule' @ [34:43] ==> value-parameter irModule: IrModuleFragment defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generateUnboundSymbolsAsDependencies[ValueParameterDescriptorImpl]

'dependencyModules' @ [34:52] ==> public abstract val dependencyModules: MutableList<IrModuleFragment> defined in org.jetbrains.kotlin.ir.declarations.IrModuleFragment[PropertyDescriptorImpl]

'generateModuleStub' @ [35:13] ==> private final fun generateModuleStub(collector: DependenciesCollector, moduleDescriptor: ModuleDescriptor): IrModuleFragment defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator[SimpleFunctionDescriptorImpl]

'collector' @ [35:32] ==> val collector: DependenciesCollector defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generateUnboundSymbolsAsDependencies[LocalVariableDescriptor]

'moduleDescriptor' @ [35:43] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generateUnboundSymbolsAsDependencies.<anonymous>[ValueParameterDescriptorImpl]

'stubGenerator' @ [40:13] ==> private final val stubGenerator: DeclarationStubGenerator defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator[PropertyDescriptorImpl]

'generateEmptyModuleFragmentStub' @ [40:27] ==> public final fun generateEmptyModuleFragmentStub(descriptor: ModuleDescriptor, irBuiltIns: IrBuiltIns): IrModuleFragment defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'moduleDescriptor' @ [40:59] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generateModuleStub[ValueParameterDescriptorImpl]

'irBuiltIns' @ [40:77] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator[PropertyDescriptorImpl]

'also' @ [40:89] ==> @InlineOnly @SinceKotlin public inline fun <T> IrModuleFragment.also(block: (IrModuleFragment) -> Unit): IrModuleFragment defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrModuleFragment

'collector' @ [41:17] ==> value-parameter collector: DependenciesCollector defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generateModuleStub[ValueParameterDescriptorImpl]

'getPackageFragments' @ [41:27] ==> public final fun getPackageFragments(moduleDescriptor: ModuleDescriptor): Collection<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[SimpleFunctionDescriptorImpl]

'moduleDescriptor' @ [41:47] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generateModuleStub[ValueParameterDescriptorImpl]

'mapTo' @ [41:65] ==> public inline fun <T, R, C : MutableCollection<in IrExternalPackageFragment>> Iterable<PackageFragmentDescriptor>.mapTo(destination: MutableList<IrExternalPackageFragment>, transform: (PackageFragmentDescriptor) -> IrExternalPackageFragment): MutableList<IrExternalPackageFragment> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor
    <R> -> IrExternalPackageFragment
    <C : MutableCollection<in R>> -> MutableList<IrExternalPackageFragment>

'irDependencyModule' @ [41:71] ==> value-parameter irDependencyModule: IrModuleFragment defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generateModuleStub.<anonymous>[ValueParameterDescriptorImpl]

'externalPackageFragments' @ [41:90] ==> public abstract val externalPackageFragments: MutableList<IrExternalPackageFragment> defined in org.jetbrains.kotlin.ir.declarations.IrModuleFragment[PropertyDescriptorImpl]

'generatePackageStub' @ [42:21] ==> private final fun generatePackageStub(packageFragmentDescriptor: PackageFragmentDescriptor, topLevelDescriptors: Collection<DeclarationDescriptor>): IrExternalPackageFragment defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator[SimpleFunctionDescriptorImpl]

'packageFragmentDescriptor' @ [42:41] ==> value-parameter packageFragmentDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generateModuleStub.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'collector' @ [42:68] ==> value-parameter collector: DependenciesCollector defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generateModuleStub[ValueParameterDescriptorImpl]

'getTopLevelDescriptors' @ [42:78] ==> public final fun getTopLevelDescriptors(packageFragmentDescriptor: PackageFragmentDescriptor): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.ir.util.DependenciesCollector[SimpleFunctionDescriptorImpl]

'packageFragmentDescriptor' @ [42:101] ==> value-parameter packageFragmentDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generateModuleStub.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'stubGenerator' @ [47:13] ==> private final val stubGenerator: DeclarationStubGenerator defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator[PropertyDescriptorImpl]

'generateEmptyExternalPackageFragmentStub' @ [47:27] ==> public final fun generateEmptyExternalPackageFragmentStub(descriptor: PackageFragmentDescriptor): IrExternalPackageFragment defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'packageFragmentDescriptor' @ [47:68] ==> value-parameter packageFragmentDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generatePackageStub[ValueParameterDescriptorImpl]

'also' @ [47:95] ==> @InlineOnly @SinceKotlin public inline fun <T> IrExternalPackageFragment.also(block: (IrExternalPackageFragment) -> Unit): IrExternalPackageFragment defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExternalPackageFragment

'topLevelDescriptors' @ [48:17] ==> value-parameter topLevelDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generatePackageStub[ValueParameterDescriptorImpl]

'mapTo' @ [48:37] ==> public inline fun <T, R, C : MutableCollection<in IrDeclaration>> Iterable<DeclarationDescriptor>.mapTo(destination: MutableList<IrDeclaration>, transform: (DeclarationDescriptor) -> IrDeclaration): MutableList<IrDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> IrDeclaration
    <C : MutableCollection<in R>> -> MutableList<IrDeclaration>

'irExternalPackageFragment' @ [48:43] ==> value-parameter irExternalPackageFragment: IrExternalPackageFragment defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generatePackageStub.<anonymous>[ValueParameterDescriptorImpl]

'declarations' @ [48:69] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrExternalPackageFragment[PropertyDescriptorImpl]

'stubGenerator' @ [49:21] ==> private final val stubGenerator: DeclarationStubGenerator defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator[PropertyDescriptorImpl]

'generateMemberStub' @ [49:35] ==> public final fun generateMemberStub(descriptor: DeclarationDescriptor): IrDeclaration defined in org.jetbrains.kotlin.ir.util.DeclarationStubGenerator[SimpleFunctionDescriptorImpl]

'it' @ [49:54] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator.generatePackageStub.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

