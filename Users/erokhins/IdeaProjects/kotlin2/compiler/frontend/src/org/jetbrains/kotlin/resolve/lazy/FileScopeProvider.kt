'DefaultImplementation' @ [28:1] ==> public constructor DefaultImplementation(impl: KClass<*>) defined in org.jetbrains.kotlin.container.DefaultImplementation[DeserializedClassConstructorDescriptor]

'FileScopeProviderImpl' @ [28:24] ==> public constructor FileScopeProviderImpl(fileScopeFactory: FileScopeFactory, bindingTrace: BindingTrace, storageManager: StorageManager) defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProviderImpl[ClassConstructorDescriptorImpl]

'getFileScopes' @ [30:62] ==> public abstract fun getFileScopes(file: KtFile): FileScopes defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProvider[SimpleFunctionDescriptorImpl]

'file' @ [30:76] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProvider.getFileResolutionScope[ValueParameterDescriptorImpl]

'lexicalScope' @ [30:82] ==> public final val lexicalScope: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.FileScopes[PropertyDescriptorImpl]

'getFileScopes' @ [31:59] ==> public abstract fun getFileScopes(file: KtFile): FileScopes defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProvider[SimpleFunctionDescriptorImpl]

'file' @ [31:73] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProvider.getImportResolver[ValueParameterDescriptorImpl]

'importResolver' @ [31:79] ==> public final val importResolver: ImportResolver defined in org.jetbrains.kotlin.resolve.lazy.FileScopes[PropertyDescriptorImpl]

'UnsupportedOperationException' @ [36:58] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'storageManager' @ [46:25] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProviderImpl[PropertyDescriptorImpl]

'createMemoizedFunction' @ [46:40] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (KtFile) -> FileScopes): MemoizedFunctionToNotNull<KtFile, FileScopes> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtFile
    <V : Any> -> FileScopes

'?:' @ [47:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: FileScopes?, right: FileScopes): FileScopes[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> FileScopes

'file' @ [47:23] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProviderImpl.cache.<anonymous>[ValueParameterDescriptorImpl]

'originalFile' @ [47:28] ==> public final var KtFile.originalFile: PsiFile[MyPropertyDescriptor]

'fileScopesCustomizer' @ [47:54] ==> public var KtFile.fileScopesCustomizer: FileScopesCustomizer? defined in org.jetbrains.kotlin.resolve.lazy in file FileScopeProvider.kt[PropertyDescriptorImpl]

'createFileScopes' @ [47:76] ==> public abstract fun createFileScopes(fileScopeFactory: FileScopeFactory): FileScopes defined in org.jetbrains.kotlin.resolve.lazy.FileScopesCustomizer[SimpleFunctionDescriptorImpl]

'fileScopeFactory' @ [47:93] ==> private final val fileScopeFactory: FileScopeFactory defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProviderImpl[PropertyDescriptorImpl]

'fileScopeFactory' @ [48:25] ==> private final val fileScopeFactory: FileScopeFactory defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProviderImpl[PropertyDescriptorImpl]

'createScopesForFile' @ [48:42] ==> public final fun createScopesForFile(file: KtFile, existingImports: ImportingScope? = ...): FileScopes defined in org.jetbrains.kotlin.resolve.lazy.FileScopeFactory[SimpleFunctionDescriptorImpl]

'file' @ [48:62] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProviderImpl.cache.<anonymous>[ValueParameterDescriptorImpl]

'bindingTrace' @ [49:9] ==> private final val bindingTrace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProviderImpl[PropertyDescriptorImpl]

'recordScope' @ [49:22] ==> public fun BindingTrace.recordScope(scope: LexicalScope, element: KtElement?): Unit defined in org.jetbrains.kotlin.resolve.bindingContextUtil in file BindingContextUtils.kt[SimpleFunctionDescriptorImpl]

'scopes' @ [49:34] ==> val scopes: FileScopes defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProviderImpl.cache.<anonymous>[LocalVariableDescriptor]

'lexicalScope' @ [49:41] ==> public final val lexicalScope: LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.FileScopes[PropertyDescriptorImpl]

'file' @ [49:55] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProviderImpl.cache.<anonymous>[ValueParameterDescriptorImpl]

'scopes' @ [50:9] ==> val scopes: FileScopes defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProviderImpl.cache.<anonymous>[LocalVariableDescriptor]

'invoke' @ [53:48] ==> public abstract fun invoke(p1: KtFile): FileScopes defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'file' @ [53:54] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProviderImpl.getFileScopes[ValueParameterDescriptorImpl]

'UserDataProperty' @ [60:59] ==> public constructor UserDataProperty<in R : UserDataHolder, T : Any>(key: Key<FileScopesCustomizer>) defined in org.jetbrains.kotlin.psi.UserDataProperty[ClassConstructorDescriptorImpl]
Inferred types:
    <in R : UserDataHolder> -> KtFile
    <T : Any> -> FileScopesCustomizer

'create' @ [60:80] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(FileScopesCustomizer..FileScopesCustomizer?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FileScopesCustomizer

