'generateModuleFragmentWithoutDependencies' @ [29:13] ==> public final fun generateModuleFragmentWithoutDependencies(ktFiles: Collection<KtFile>): IrModuleFragment defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator[SimpleFunctionDescriptorImpl]

'ktFiles' @ [29:55] ==> value-parameter ktFiles: Collection<KtFile> defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateModuleFragment[ValueParameterDescriptorImpl]

'also' @ [29:64] ==> @InlineOnly @SinceKotlin public inline fun <T> IrModuleFragment.also(block: (IrModuleFragment) -> Unit): IrModuleFragment defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrModuleFragment

'generateUnboundSymbolsAsDependencies' @ [30:17] ==> private final fun generateUnboundSymbolsAsDependencies(irModule: IrModuleFragment): Unit defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator[SimpleFunctionDescriptorImpl]

'irModule' @ [30:54] ==> value-parameter irModule: IrModuleFragment defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateModuleFragment.<anonymous>[ValueParameterDescriptorImpl]

'IrModuleFragmentImpl' @ [34:13] ==> public constructor IrModuleFragmentImpl(descriptor: ModuleDescriptor, irBuiltins: IrBuiltIns) defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl[DeserializedClassConstructorDescriptor]

'context' @ [34:34] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator[PropertyDescriptorImpl]

'moduleDescriptor' @ [34:42] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'context' @ [34:60] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator[PropertyDescriptorImpl]

'irBuiltIns' @ [34:68] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'also' @ [34:80] ==> @InlineOnly @SinceKotlin public inline fun <T> IrModuleFragmentImpl.also(block: (IrModuleFragmentImpl) -> Unit): IrModuleFragmentImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrModuleFragmentImpl

'irModule' @ [35:17] ==> value-parameter irModule: IrModuleFragmentImpl defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateModuleFragmentWithoutDependencies.<anonymous>[ValueParameterDescriptorImpl]

'files' @ [35:26] ==> public open val files: MutableList<IrFile> defined in org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl[DeserializedPropertyDescriptor]

'addAll' @ [35:32] ==> public abstract fun addAll(elements: Collection<IrFile>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'generateFiles' @ [35:39] ==> private final fun generateFiles(ktFiles: Collection<KtFile>): List<IrFile> defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator[SimpleFunctionDescriptorImpl]

'ktFiles' @ [35:53] ==> value-parameter ktFiles: Collection<KtFile> defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateModuleFragmentWithoutDependencies[ValueParameterDescriptorImpl]

'ExternalDependenciesGenerator' @ [39:9] ==> public constructor ExternalDependenciesGenerator(symbolTable: SymbolTable, irBuiltIns: IrBuiltIns) defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator[DeserializedClassConstructorDescriptor]

'context' @ [39:39] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator[PropertyDescriptorImpl]

'symbolTable' @ [39:47] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'context' @ [39:60] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator[PropertyDescriptorImpl]

'irBuiltIns' @ [39:68] ==> public final val irBuiltIns: IrBuiltIns defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[DeserializedPropertyDescriptor]

'generateUnboundSymbolsAsDependencies' @ [39:80] ==> public final fun generateUnboundSymbolsAsDependencies(irModule: IrModuleFragment): Unit defined in org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator[DeserializedSimpleFunctionDescriptor]

'irModule' @ [39:117] ==> value-parameter irModule: IrModuleFragment defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateUnboundSymbolsAsDependencies[ValueParameterDescriptorImpl]

'DeclarationGenerator' @ [43:38] ==> public constructor DeclarationGenerator(context: GeneratorContext) defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[ClassConstructorDescriptorImpl]

'context' @ [43:59] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator[PropertyDescriptorImpl]

'ktFiles' @ [45:16] ==> value-parameter ktFiles: Collection<KtFile> defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateFiles[ValueParameterDescriptorImpl]

'map' @ [45:24] ==> public inline fun <T, R> Iterable<KtFile>.map(transform: (KtFile) -> IrFileImpl): List<IrFileImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> IrFileImpl

'generateSingleFile' @ [46:13] ==> private final fun generateSingleFile(irDeclarationGenerator: DeclarationGenerator, ktFile: KtFile): IrFileImpl defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator[SimpleFunctionDescriptorImpl]

'irDeclarationGenerator' @ [46:32] ==> val irDeclarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateFiles[LocalVariableDescriptor]

'ktFile' @ [46:56] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateFiles.<anonymous>[ValueParameterDescriptorImpl]

'createEmptyIrFile' @ [51:22] ==> private final fun createEmptyIrFile(ktFile: KtFile): IrFileImpl defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator[SimpleFunctionDescriptorImpl]

'ktFile' @ [51:40] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateSingleFile[ValueParameterDescriptorImpl]

'ktFile' @ [53:35] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateSingleFile[ValueParameterDescriptorImpl]

'annotationEntries' @ [53:42] ==> public final val KtFile.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'irFile' @ [54:13] ==> val irFile: IrFileImpl defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateSingleFile[LocalVariableDescriptor]

'fileAnnotations' @ [54:20] ==> public open val fileAnnotations: MutableList<AnnotationDescriptor> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[DeserializedPropertyDescriptor]

'add' @ [54:36] ==> public abstract fun add(element: AnnotationDescriptor): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'getOrFail' @ [54:40] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>, key: (KtAnnotationEntry..KtAnnotationEntry?)): (AnnotationDescriptor..AnnotationDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor..org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor?)

'ANNOTATION' @ [54:65] ==> public final val ANNOTATION: (WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktAnnotationEntry' @ [54:77] ==> val ktAnnotationEntry: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateSingleFile[LocalVariableDescriptor]

'ktFile' @ [57:31] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateSingleFile[ValueParameterDescriptorImpl]

'declarations' @ [57:38] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'irFile' @ [58:13] ==> val irFile: IrFileImpl defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateSingleFile[LocalVariableDescriptor]

'declarations' @ [58:20] ==> public open val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[DeserializedPropertyDescriptor]

'add' @ [58:33] ==> public abstract fun add(element: IrDeclaration): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irDeclarationGenerator' @ [58:37] ==> value-parameter irDeclarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateSingleFile[ValueParameterDescriptorImpl]

'generateMemberDeclaration' @ [58:60] ==> public final fun generateMemberDeclaration(ktDeclaration: KtDeclaration): IrDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'ktDeclaration' @ [58:86] ==> val ktDeclaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateSingleFile[LocalVariableDescriptor]

'irFile' @ [61:16] ==> val irFile: IrFileImpl defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateSingleFile[LocalVariableDescriptor]

'context' @ [65:25] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator[PropertyDescriptorImpl]

'sourceManager' @ [65:33] ==> public final val sourceManager: PsiSourceManager defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'getOrCreateFileEntry' @ [65:47] ==> public final fun getOrCreateFileEntry(ktFile: KtFile): PsiSourceManager.PsiFileEntry defined in org.jetbrains.kotlin.psi2ir.PsiSourceManager[SimpleFunctionDescriptorImpl]

'ktFile' @ [65:68] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.createEmptyIrFile[ValueParameterDescriptorImpl]

'getOrFail' @ [66:41] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(KtFile..KtFile?), (PackageFragmentDescriptor..PackageFragmentDescriptor?)>, key: (KtFile..KtFile?)): (PackageFragmentDescriptor..PackageFragmentDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor..org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor?)

'FILE_TO_PACKAGE_FRAGMENT' @ [66:66] ==> public final val FILE_TO_PACKAGE_FRAGMENT: (WritableSlice<(KtFile..KtFile?), (PackageFragmentDescriptor..PackageFragmentDescriptor?)>..WritableSlice<(KtFile..KtFile?), (PackageFragmentDescriptor..PackageFragmentDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktFile' @ [66:92] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.createEmptyIrFile[ValueParameterDescriptorImpl]

'IrFileImpl' @ [67:22] ==> public constructor IrFileImpl(fileEntry: SourceManager.FileEntry, packageFragmentDescriptor: PackageFragmentDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl[DeserializedClassConstructorDescriptor]

'fileEntry' @ [67:33] ==> val fileEntry: PsiSourceManager.PsiFileEntry defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.createEmptyIrFile[LocalVariableDescriptor]

'packageFragmentDescriptor' @ [67:44] ==> val packageFragmentDescriptor: (PackageFragmentDescriptor..PackageFragmentDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.createEmptyIrFile[LocalVariableDescriptor]

'context' @ [68:9] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator[PropertyDescriptorImpl]

'sourceManager' @ [68:17] ==> public final val sourceManager: PsiSourceManager defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'putFileEntry' @ [68:31] ==> public final fun putFileEntry(irFile: IrFile, fileEntry: PsiSourceManager.PsiFileEntry): Unit defined in org.jetbrains.kotlin.psi2ir.PsiSourceManager[SimpleFunctionDescriptorImpl]

'irFile' @ [68:44] ==> val irFile: IrFileImpl defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.createEmptyIrFile[LocalVariableDescriptor]

'fileEntry' @ [68:52] ==> val fileEntry: PsiSourceManager.PsiFileEntry defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.createEmptyIrFile[LocalVariableDescriptor]

'irFile' @ [69:16] ==> val irFile: IrFileImpl defined in org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.createEmptyIrFile[LocalVariableDescriptor]

