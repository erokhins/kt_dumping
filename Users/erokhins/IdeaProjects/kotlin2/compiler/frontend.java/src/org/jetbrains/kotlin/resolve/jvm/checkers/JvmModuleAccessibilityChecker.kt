'JavaModuleResolver' @ [44:34] ==> public companion object SERVICE defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver[FakeCallableDescriptorForObject]

'getInstance' @ [44:53] ==> public final fun getInstance(project: Project): JavaModuleResolver defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver.SERVICE[SimpleFunctionDescriptorImpl]

'project' @ [44:65] ==> value-parameter project: Project defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.<init>[ValueParameterDescriptorImpl]

'resolvedCall' @ [47:26] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.check[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [47:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'?:' @ [51:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassOrPackageFragmentDescriptor?, right: ClassOrPackageFragmentDescriptor): ClassOrPackageFragmentDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassOrPackageFragmentDescriptor

'getParentOfType' @ [51:48] ==> @Nullable public open fun <D : (DeclarationDescriptor..DeclarationDescriptor?)> getParentOfType(@Nullable p0: DeclarationDescriptor?, @NotNull p1: Class<(ClassOrPackageFragmentDescriptor..ClassOrPackageFragmentDescriptor?)>): ClassOrPackageFragmentDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (DeclarationDescriptor..DeclarationDescriptor?)> -> (org.jetbrains.kotlin.descriptors.ClassOrPackageFragmentDescriptor..org.jetbrains.kotlin.descriptors.ClassOrPackageFragmentDescriptor?)

'descriptor' @ [51:64] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.check[LocalVariableDescriptor]

'java' @ [51:116] ==> public val <T> KClass<ClassOrPackageFragmentDescriptor>.java: Class<ClassOrPackageFragmentDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClassOrPackageFragmentDescriptor

'DescriptorToSourceUtils' @ [53:33] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getContainingFile' @ [53:57] ==> @JvmStatic public final fun getContainingFile(declarationDescriptor: DeclarationDescriptor): KtFile? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'context' @ [53:75] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.check[ValueParameterDescriptorImpl]

'scope' @ [53:83] ==> public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'ownerDescriptor' @ [53:89] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'virtualFile' @ [53:107] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'diagnosticFor' @ [54:9] ==> private final fun diagnosticFor(targetClassOrPackage: ClassOrPackageFragmentDescriptor, originalDescriptor: DeclarationDescriptorWithSource?, fileFromOurModule: VirtualFile?, reportOn: PsiElement): Diagnostic? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker[SimpleFunctionDescriptorImpl]

'targetDescriptor' @ [54:23] ==> val targetDescriptor: ClassOrPackageFragmentDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.check[LocalVariableDescriptor]

'descriptor' @ [54:41] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.check[LocalVariableDescriptor]

'fileFromOurModule' @ [54:53] ==> val fileFromOurModule: VirtualFile? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.check[LocalVariableDescriptor]

'reportOn' @ [54:72] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.check[ValueParameterDescriptorImpl]

'let' @ [54:83] ==> @InlineOnly public inline fun <T, R> Diagnostic.let(block: (Diagnostic) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <R> -> Unit

'context' @ [54:87] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.check[ValueParameterDescriptorImpl]

'trace' @ [54:95] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'report' @ [54:102] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'findVirtualFile' @ [63:30] ==> private final fun findVirtualFile(descriptor: ClassOrPackageFragmentDescriptor, originalDescriptor: DeclarationDescriptorWithSource?): VirtualFile? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker[SimpleFunctionDescriptorImpl]

'targetClassOrPackage' @ [63:46] ==> value-parameter targetClassOrPackage: ClassOrPackageFragmentDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.diagnosticFor[ValueParameterDescriptorImpl]

'originalDescriptor' @ [63:68] ==> value-parameter originalDescriptor: DeclarationDescriptorWithSource? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.diagnosticFor[ValueParameterDescriptorImpl]

'getParentOfType' @ [66:33] ==> @Nullable public open fun <D : (DeclarationDescriptor..DeclarationDescriptor?)> getParentOfType(@Nullable p0: DeclarationDescriptor?, @NotNull p1: Class<(PackageFragmentDescriptor..PackageFragmentDescriptor?)>, p2: Boolean): PackageFragmentDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (DeclarationDescriptor..DeclarationDescriptor?)> -> (org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor..org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor?)

'targetClassOrPackage' @ [66:49] ==> value-parameter targetClassOrPackage: ClassOrPackageFragmentDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.diagnosticFor[ValueParameterDescriptorImpl]

'java' @ [66:104] ==> public val <T> KClass<PackageFragmentDescriptor>.java: Class<PackageFragmentDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'fqName' @ [66:118] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'moduleResolver' @ [67:26] ==> private final val moduleResolver: JavaModuleResolver defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker[PropertyDescriptorImpl]

'checkAccessibility' @ [67:41] ==> public abstract fun checkAccessibility(fileFromOurModule: VirtualFile?, referencedFile: VirtualFile, referencedPackage: FqName?): JavaModuleResolver.AccessError? defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver[SimpleFunctionDescriptorImpl]

'fileFromOurModule' @ [67:60] ==> value-parameter fileFromOurModule: VirtualFile? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.diagnosticFor[ValueParameterDescriptorImpl]

'referencedFile' @ [67:79] ==> val referencedFile: VirtualFile defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.diagnosticFor[LocalVariableDescriptor]

'referencedPackageFqName' @ [67:95] ==> val referencedPackageFqName: FqName? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.diagnosticFor[LocalVariableDescriptor]

'when (diagnostic) {
            is ModuleDoesNotReadUnnamedModule ->
                JAVA_MODULE_DOES_NOT_READ_UNNAMED_MODULE.on(reportOn)
            is ModuleDoesNotReadModule ->
                JAVA_MODULE_DOES_NOT_DEPEND_ON_MODULE.on(reportOn, diagnostic.dependencyModuleName)
            is ModuleDoesNotExportPackage ->
                JAVA_MODULE_DOES_NOT_EXPORT_PACKAGE.on(reportOn, diagnostic.dependencyModuleName, referencedPackageFqName!!.asString())
            else -> null
        }' @ [69:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Diagnostic?, entry1: Diagnostic?, entry2: Diagnostic?, entry3: Diagnostic?): Diagnostic?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Diagnostic?

'diagnostic' @ [69:22] ==> val diagnostic: JavaModuleResolver.AccessError? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.diagnosticFor[LocalVariableDescriptor]

'JAVA_MODULE_DOES_NOT_READ_UNNAMED_MODULE' @ [71:17] ==> public final val JAVA_MODULE_DOES_NOT_READ_UNNAMED_MODULE: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [71:58] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportOn' @ [71:61] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.diagnosticFor[ValueParameterDescriptorImpl]

'JAVA_MODULE_DOES_NOT_DEPEND_ON_MODULE' @ [73:17] ==> public final val JAVA_MODULE_DOES_NOT_DEPEND_ON_MODULE: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [73:55] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [73:58] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.diagnosticFor[ValueParameterDescriptorImpl]

'diagnostic' @ [73:68] ==> val diagnostic: JavaModuleResolver.AccessError? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.diagnosticFor[LocalVariableDescriptor]

'dependencyModuleName' @ [73:79] ==> public final val dependencyModuleName: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver.AccessError.ModuleDoesNotReadModule[PropertyDescriptorImpl]

'JAVA_MODULE_DOES_NOT_EXPORT_PACKAGE' @ [75:17] ==> public final val JAVA_MODULE_DOES_NOT_EXPORT_PACKAGE: (DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (String..String?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [75:53] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: String, @NotNull p2: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'reportOn' @ [75:56] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.diagnosticFor[ValueParameterDescriptorImpl]

'diagnostic' @ [75:66] ==> val diagnostic: JavaModuleResolver.AccessError? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.diagnosticFor[LocalVariableDescriptor]

'dependencyModuleName' @ [75:77] ==> public final val dependencyModuleName: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver.AccessError.ModuleDoesNotExportPackage[PropertyDescriptorImpl]

'referencedPackageFqName' @ [75:99] ==> val referencedPackageFqName: FqName? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.diagnosticFor[LocalVariableDescriptor]

'asString' @ [75:125] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'descriptor' @ [84:22] ==> value-parameter descriptor: ClassOrPackageFragmentDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.findVirtualFile[ValueParameterDescriptorImpl]

'source' @ [84:33] ==> public final val ClassOrPackageFragmentDescriptor.source: SourceElement[MyPropertyDescriptor]

'when (source) {
            is KotlinJvmBinarySourceElement -> (source.binaryClass as? VirtualFileKotlinClass)?.file?.let { return it }
            is JavaSourceElement -> (source.javaElement as? VirtualFileBoundJavaClass)?.virtualFile?.let { return it }
            is KotlinJvmBinaryPackageSourceElement -> {
                if (originalDescriptor is DeserializedMemberDescriptor) {
                    (source.getContainingBinaryClass(originalDescriptor) as? VirtualFileKotlinClass)?.file?.let { return it }
                }
            }
        }' @ [85:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?, entry2: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'source' @ [85:15] ==> val source: SourceElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.findVirtualFile[LocalVariableDescriptor]

'source' @ [86:49] ==> val source: SourceElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.findVirtualFile[LocalVariableDescriptor]

'binaryClass' @ [86:56] ==> public final val binaryClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinarySourceElement[DeserializedPropertyDescriptor]

'file' @ [86:97] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.load.kotlin.VirtualFileKotlinClass[PropertyDescriptorImpl]

'let' @ [86:103] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> Nothing

'it' @ [86:116] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.findVirtualFile.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [87:38] ==> val source: SourceElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.findVirtualFile[LocalVariableDescriptor]

'javaElement' @ [87:45] ==> public abstract val javaElement: JavaElement defined in org.jetbrains.kotlin.load.java.sources.JavaSourceElement[DeserializedPropertyDescriptor]

'virtualFile' @ [87:89] ==> public abstract val virtualFile: VirtualFile? defined in org.jetbrains.kotlin.load.java.structure.impl.VirtualFileBoundJavaClass[PropertyDescriptorImpl]

'let' @ [87:102] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> Nothing

'it' @ [87:115] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.findVirtualFile.<anonymous>[ValueParameterDescriptorImpl]

'originalDescriptor' @ [89:21] ==> value-parameter originalDescriptor: DeclarationDescriptorWithSource? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.findVirtualFile[ValueParameterDescriptorImpl]

'source' @ [90:22] ==> val source: SourceElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.findVirtualFile[LocalVariableDescriptor]

'getContainingBinaryClass' @ [90:29] ==> public final fun getContainingBinaryClass(descriptor: DeserializedMemberDescriptor): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryPackageSourceElement[DeserializedSimpleFunctionDescriptor]

'originalDescriptor' @ [90:54] ==> value-parameter originalDescriptor: DeclarationDescriptorWithSource? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.findVirtualFile[ValueParameterDescriptorImpl]

'file' @ [90:103] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.load.kotlin.VirtualFileKotlinClass[PropertyDescriptorImpl]

'let' @ [90:109] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> Nothing

'it' @ [90:122] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.findVirtualFile.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [95:9] ==> val source: SourceElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.findVirtualFile[LocalVariableDescriptor]

'getPsi' @ [95:16] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'containingFile' @ [95:26] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [95:42] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'let' @ [95:55] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> Nothing

'it' @ [95:68] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.findVirtualFile.<anonymous>[ValueParameterDescriptorImpl]

'originalDescriptor' @ [97:16] ==> value-parameter originalDescriptor: DeclarationDescriptorWithSource? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.findVirtualFile[ValueParameterDescriptorImpl]

'source' @ [97:36] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [97:44] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'containingFile' @ [97:54] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [97:70] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'element' @ [107:31] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'containingFile' @ [107:39] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [107:54] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'when (targetDescriptor) {
                is ClassDescriptor -> {
                    diagnosticFor(targetDescriptor, targetDescriptor, virtualFile, element)?.let(trace::report)
                }
                is TypeAliasDescriptor -> {
                    val containingClassOrPackage = DescriptorUtils.getParentOfType(targetDescriptor, ClassOrPackageFragmentDescriptor::class.java)
                    if (containingClassOrPackage != null) {
                        diagnosticFor(containingClassOrPackage, targetDescriptor, virtualFile, element)?.let(trace::report)
                    }

                    val expandedClass = targetDescriptor.expandedType.constructor.declarationDescriptor as? ClassDescriptor
                    if (expandedClass != null) {
                        diagnosticFor(expandedClass, expandedClass, virtualFile, element)?.let(trace::report)
                    }
                }
            }' @ [108:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'targetDescriptor' @ [108:19] ==> value-parameter targetDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'diagnosticFor' @ [110:21] ==> private final fun diagnosticFor(targetClassOrPackage: ClassOrPackageFragmentDescriptor, originalDescriptor: DeclarationDescriptorWithSource?, fileFromOurModule: VirtualFile?, reportOn: PsiElement): Diagnostic? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker[SimpleFunctionDescriptorImpl]

'targetDescriptor' @ [110:35] ==> value-parameter targetDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'targetDescriptor' @ [110:53] ==> value-parameter targetDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'virtualFile' @ [110:71] ==> val virtualFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[LocalVariableDescriptor]

'element' @ [110:84] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'let' @ [110:94] ==> @InlineOnly public inline fun <T, R> Diagnostic.let(block: (Diagnostic) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <R> -> Unit

'trace' @ [110:98] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'report' @ [110:105] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'getParentOfType' @ [113:68] ==> @Nullable public open fun <D : (DeclarationDescriptor..DeclarationDescriptor?)> getParentOfType(@Nullable p0: DeclarationDescriptor?, @NotNull p1: Class<(ClassOrPackageFragmentDescriptor..ClassOrPackageFragmentDescriptor?)>): ClassOrPackageFragmentDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (DeclarationDescriptor..DeclarationDescriptor?)> -> (org.jetbrains.kotlin.descriptors.ClassOrPackageFragmentDescriptor..org.jetbrains.kotlin.descriptors.ClassOrPackageFragmentDescriptor?)

'targetDescriptor' @ [113:84] ==> value-parameter targetDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'java' @ [113:142] ==> public val <T> KClass<ClassOrPackageFragmentDescriptor>.java: Class<ClassOrPackageFragmentDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClassOrPackageFragmentDescriptor

'containingClassOrPackage' @ [114:25] ==> val containingClassOrPackage: ClassOrPackageFragmentDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[LocalVariableDescriptor]

'diagnosticFor' @ [115:25] ==> private final fun diagnosticFor(targetClassOrPackage: ClassOrPackageFragmentDescriptor, originalDescriptor: DeclarationDescriptorWithSource?, fileFromOurModule: VirtualFile?, reportOn: PsiElement): Diagnostic? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker[SimpleFunctionDescriptorImpl]

'containingClassOrPackage' @ [115:39] ==> val containingClassOrPackage: ClassOrPackageFragmentDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[LocalVariableDescriptor]

'targetDescriptor' @ [115:65] ==> value-parameter targetDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'virtualFile' @ [115:83] ==> val virtualFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[LocalVariableDescriptor]

'element' @ [115:96] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'let' @ [115:106] ==> @InlineOnly public inline fun <T, R> Diagnostic.let(block: (Diagnostic) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <R> -> Unit

'trace' @ [115:110] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'report' @ [115:117] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'targetDescriptor' @ [118:41] ==> value-parameter targetDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'expandedType' @ [118:58] ==> public abstract val expandedType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'constructor' @ [118:71] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [118:83] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'expandedClass' @ [119:25] ==> val expandedClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[LocalVariableDescriptor]

'diagnosticFor' @ [120:25] ==> private final fun diagnosticFor(targetClassOrPackage: ClassOrPackageFragmentDescriptor, originalDescriptor: DeclarationDescriptorWithSource?, fileFromOurModule: VirtualFile?, reportOn: PsiElement): Diagnostic? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker[SimpleFunctionDescriptorImpl]

'expandedClass' @ [120:39] ==> val expandedClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[LocalVariableDescriptor]

'expandedClass' @ [120:54] ==> val expandedClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[LocalVariableDescriptor]

'virtualFile' @ [120:69] ==> val virtualFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[LocalVariableDescriptor]

'element' @ [120:82] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'let' @ [120:92] ==> @InlineOnly public inline fun <T, R> Diagnostic.let(block: (Diagnostic) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <R> -> Unit

'trace' @ [120:96] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.jvm.checkers.JvmModuleAccessibilityChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'report' @ [120:103] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

