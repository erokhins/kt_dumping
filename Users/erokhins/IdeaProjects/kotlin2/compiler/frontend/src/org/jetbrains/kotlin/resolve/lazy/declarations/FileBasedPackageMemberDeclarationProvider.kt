'AbstractPsiBasedDeclarationProvider' @ [29:3] ==> public constructor AbstractPsiBasedDeclarationProvider(storageManager: StorageManager) defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider[ClassConstructorDescriptorImpl]

'storageManager' @ [29:39] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [31:42] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [31:57] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Collection<FqName>): NotNullLazyValue<Collection<FqName>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Collection<FqName>

'factory' @ [32:9] ==> private final val factory: FileBasedDeclarationProviderFactory defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'getAllDeclaredSubPackagesOf' @ [32:17] ==> public/*package*/ open fun getAllDeclaredSubPackagesOf(@NotNull parent: FqName): (MutableCollection<(FqName..FqName?)>..Collection<(FqName..FqName?)>?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedDeclarationProviderFactory[JavaMethodDescriptor]

'fqName' @ [32:45] ==> private final val fqName: FqName defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'packageFiles' @ [36:22] ==> private final val packageFiles: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'file' @ [37:33] ==> val file: KtFile defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider.doCreateIndex[LocalVariableDescriptor]

'declarations' @ [37:38] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'assert' @ [38:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'fqName' @ [38:24] ==> private final val fqName: FqName defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'file' @ [38:34] ==> val file: KtFile defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider.doCreateIndex[LocalVariableDescriptor]

'packageFqName' @ [38:39] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'index' @ [39:17] ==> value-parameter index: AbstractPsiBasedDeclarationProvider.Index defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider.doCreateIndex[ValueParameterDescriptorImpl]

'putToIndex' @ [39:23] ==> public final fun putToIndex(declaration: KtDeclaration): Unit defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractPsiBasedDeclarationProvider.Index[SimpleFunctionDescriptorImpl]

'declaration' @ [39:34] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider.doCreateIndex[LocalVariableDescriptor]

'invoke' @ [44:97] ==> public abstract fun invoke(): Collection<FqName> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'packageFiles' @ [46:38] ==> private final val packageFiles: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'+' @ [48:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'fqName' @ [48:58] ==> private final val fqName: FqName defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'packageFiles' @ [48:78] ==> private final val packageFiles: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'map' @ [48:91] ==> public inline fun <T, R> Iterable<KtFile>.map(transform: (KtFile) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> String

'it' @ [48:97] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider.toString.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [48:100] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'packageFiles' @ [49:59] ==> private final val packageFiles: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider[PropertyDescriptorImpl]

'flatMap' @ [49:72] ==> public inline fun <T, R> Iterable<KtFile>.flatMap(transform: (KtFile) -> Iterable<(KtDeclaration..KtDeclaration?)>): List<(KtDeclaration..KtDeclaration?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'it' @ [49:82] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider.toString.<anonymous>[ValueParameterDescriptorImpl]

'declarations' @ [49:85] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'map' @ [49:100] ==> public inline fun <T, R> Iterable<(KtDeclaration..KtDeclaration?)>.map(transform: ((KtDeclaration..KtDeclaration?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)
    <R> -> String

'it' @ [49:106] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedPackageMemberDeclarationProvider.toString.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [49:109] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

