'ContainerInfo' @ [64:29] ==> private constructor ContainerInfo() defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo[ClassConstructorDescriptorImpl]

'descriptor' @ [66:67] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.UnknownPackage.matches[ValueParameterDescriptorImpl]

'ContainerInfo' @ [69:49] ==> private constructor ContainerInfo() defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo[ClassConstructorDescriptorImpl]

'descriptor' @ [71:20] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package.matches[ValueParameterDescriptorImpl]

'descriptor' @ [71:63] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package.matches[ValueParameterDescriptorImpl]

'fqName' @ [71:74] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'fqName' @ [71:84] ==> public open val fqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package[PropertyDescriptorImpl]

'ContainerInfo' @ [75:48] ==> private constructor ContainerInfo() defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo[ClassConstructorDescriptorImpl]

'descriptor' @ [77:20] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Class.matches[ValueParameterDescriptorImpl]

'descriptor' @ [77:53] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Class.matches[ValueParameterDescriptorImpl]

'importableFqName' @ [77:64] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'fqName' @ [77:84] ==> public open val fqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Class[PropertyDescriptorImpl]

'ArrayList' @ [85:18] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'processInternalReferencesToUpdateOnPackageNameChange' @ [86:5] ==> public fun KtElement.processInternalReferencesToUpdateOnPackageNameChange(containerChangeInfo: ContainerChangeInfo, body: (originalRefExpr: KtSimpleNameExpression, usageFactory: UsageInfoFactory /* = (KtSimpleNameExpression) -> UsageInfo? */) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'containerChangeInfo' @ [86:58] ==> value-parameter containerChangeInfo: ContainerChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.move.getInternalReferencesToUpdateOnPackageNameChange[ValueParameterDescriptorImpl]

'usages' @ [86:98] ==> val usages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.getInternalReferencesToUpdateOnPackageNameChange[LocalVariableDescriptor]

'addIfNotNull' @ [86:105] ==> public fun <T : Any> MutableCollection<UsageInfo>.addIfNotNull(t: UsageInfo?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> UsageInfo

'invoke' @ [86:118] ==> public abstract operator fun invoke(p1: KtSimpleNameExpression): UsageInfo? defined in kotlin.Function1[FunctionInvokeDescriptor]

'expr' @ [86:126] ==> value-parameter expr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.getInternalReferencesToUpdateOnPackageNameChange.<anonymous>[ValueParameterDescriptorImpl]

'usages' @ [87:12] ==> val usages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.getInternalReferencesToUpdateOnPackageNameChange[LocalVariableDescriptor]

'containingFile' @ [96:16] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'file' @ [98:23] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange[LocalVariableDescriptor]

'importDirectives' @ [98:28] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'mapNotNull' @ [98:45] ==> public inline fun <T, R : Any> Iterable<(KtImportDirective..KtImportDirective?)>.mapNotNull(transform: ((KtImportDirective..KtImportDirective?)) -> ImportPath?): List<ImportPath> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)
    <R : Any> -> ImportPath

'it' @ [98:58] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [98:61] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'getFqName' @ [101:38] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [101:48] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.isImported[ValueParameterDescriptorImpl]

'let' @ [101:60] ==> @InlineOnly public inline fun <T, R> FqNameUnsafe.let(block: (FqNameUnsafe) -> FqName): FqName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqNameUnsafe
    <R> -> FqName

'if (it.isSafe) it.toSafe() else return@isImported false' @ [101:66] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName, elseBranch: FqName): FqName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName

'it' @ [101:70] ==> value-parameter it: FqNameUnsafe defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.isImported.<anonymous>[ValueParameterDescriptorImpl]

'isSafe' @ [101:73] ==> public final val FqNameUnsafe.isSafe: Boolean[MyPropertyDescriptor]

'it' @ [101:81] ==> value-parameter it: FqNameUnsafe defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.isImported.<anonymous>[ValueParameterDescriptorImpl]

'toSafe' @ [101:84] ==> @NotNull public open fun toSafe(): FqName defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'importPaths' @ [102:13] ==> val importPaths: List<ImportPath> defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange[LocalVariableDescriptor]

'any' @ [102:25] ==> public inline fun <T> Iterable<ImportPath>.any(predicate: (ImportPath) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportPath

'fqName' @ [102:31] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.isImported[LocalVariableDescriptor]

'isImported' @ [102:38] ==> public fun FqName.isImported(importPath: ImportPath, skipAliasedImports: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.fqName[DeserializedSimpleFunctionDescriptor]

'it' @ [102:49] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.isImported.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [104:36] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.isImported[ValueParameterDescriptorImpl]

'containingDeclaration' @ [104:47] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'when (containingDescriptor) {
            is ClassDescriptor, is PackageViewDescriptor -> isImported(containingDescriptor)
            else -> false
        }' @ [105:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'containingDescriptor' @ [105:22] ==> val containingDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.isImported[LocalVariableDescriptor]

'isImported' @ [106:61] ==> local final tailrec fun isImported(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange[SimpleFunctionDescriptorImpl]

'containingDescriptor' @ [106:72] ==> val containingDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.isImported[LocalVariableDescriptor]

'bindingContext' @ [112:26] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [112:56] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'refExpr' @ [112:74] ==> value-parameter refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[ValueParameterDescriptorImpl]

'getImportableDescriptor' @ [112:84] ==> public fun DeclarationDescriptor.getImportableDescriptor(): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [113:36] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'containingDeclaration' @ [113:47] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'descriptor' @ [115:29] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'kind' @ [115:71] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'callableKind' @ [116:13] ==> val callableKind: CallableMemberDescriptor.Kind? defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'callableKind' @ [116:37] ==> val callableKind: CallableMemberDescriptor.Kind? defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'DECLARATION' @ [116:83] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'refExpr' @ [119:13] ==> value-parameter refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[ValueParameterDescriptorImpl]

'textRange' @ [119:21] ==> public final val KtSimpleNameExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'isEmpty' @ [119:31] ==> public final val TextRange.isEmpty: Boolean[MyPropertyDescriptor]

'descriptor' @ [121:13] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'descriptor' @ [121:46] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'isInner' @ [121:57] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'refExpr' @ [121:68] ==> value-parameter refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[ValueParameterDescriptorImpl]

'parent' @ [121:76] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'descriptor' @ [123:26] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'isCallable' @ [124:27] ==> val isCallable: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'refExpr' @ [124:41] ==> value-parameter refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[ValueParameterDescriptorImpl]

'isExtensionRef' @ [124:49] ==> private fun KtSimpleNameExpression.isExtensionRef(bindingContext: BindingContext? = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [124:64] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[ValueParameterDescriptorImpl]

'isCallableReference' @ [125:35] ==> private fun isCallableReference(reference: PsiReference): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'refExpr' @ [125:55] ==> value-parameter refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[ValueParameterDescriptorImpl]

'mainReference' @ [125:63] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'getValue' @ [127:28] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'?:' @ [128:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'getAnyDeclaration' @ [128:53] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [128:71] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'descriptor' @ [128:80] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'descriptor' @ [130:17] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'isCompanionObject' @ [130:28] ==> public fun DeclarationDescriptor.isCompanionObject(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [131:20] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[ValueParameterDescriptorImpl]

'SHORT_REFERENCE_TO_COMPANION_OBJECT' @ [131:50] ==> public final val SHORT_REFERENCE_TO_COMPANION_OBJECT: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (ClassifierDescriptorWithTypeParameters..ClassifierDescriptorWithTypeParameters?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (ClassifierDescriptorWithTypeParameters..ClassifierDescriptorWithTypeParameters?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'refExpr' @ [131:87] ==> value-parameter refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[ValueParameterDescriptorImpl]

'result' @ [132:17] ==> var result: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference.<anonymous>[LocalVariableDescriptor]

'?:' @ [132:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'result' @ [132:27] ==> var result: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference.<anonymous>[LocalVariableDescriptor]

'containingClassOrObject' @ [132:58] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'result' @ [132:85] ==> var result: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference.<anonymous>[LocalVariableDescriptor]

'result' @ [135:13] ==> var result: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference.<anonymous>[LocalVariableDescriptor]

'isCallable' @ [138:13] ==> val isCallable: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'!' @ [139:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCallableReference' @ [139:18] ==> val isCallableReference: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'isExtension' @ [140:21] ==> val isExtension: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'containingDescriptor' @ [140:36] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'refExpr' @ [141:44] ==> value-parameter refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[ValueParameterDescriptorImpl]

'getResolvedCall' @ [141:52] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [141:68] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [141:85] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'dispatchReceiver' @ [142:42] ==> val dispatchReceiver: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'classDescriptor' @ [142:87] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitClassReceiver[DeserializedPropertyDescriptor]

'implicitClass' @ [143:25] ==> val implicitClass: ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'isCompanionObject' @ [143:40] ==> public final val ClassDescriptor.isCompanionObject: Boolean[MyPropertyDescriptor]

'ImplicitCompanionAsDispatchReceiverUsageInfo' @ [144:34] ==> public constructor ImplicitCompanionAsDispatchReceiverUsageInfo(callee: KtSimpleNameExpression, companionDescriptor: ClassDescriptor) defined in org.jetbrains.kotlin.idea.refactoring.move.ImplicitCompanionAsDispatchReceiverUsageInfo[ClassConstructorDescriptorImpl]

'it' @ [144:79] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference.<anonymous>[ValueParameterDescriptorImpl]

'implicitClass' @ [144:83] ==> val implicitClass: ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'dispatchReceiver' @ [146:25] ==> val dispatchReceiver: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'containingDescriptor' @ [146:53] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'kind' @ [146:74] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [146:92] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'!' @ [150:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isExtension' @ [150:18] ==> val isExtension: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'!' @ [151:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containingDescriptor' @ [151:23] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'containingDescriptor' @ [152:26] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'containingDescriptor' @ [152:69] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'kind' @ [152:90] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [152:108] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'descriptor' @ [153:26] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'?:' @ [153:73] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'declaration' @ [153:74] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'hasModifierProperty' @ [153:102] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMember[JavaMethodDescriptor]

'STATIC' @ [153:134] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'!' @ [157:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getFqName' @ [157:30] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [157:40] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'isSafe' @ [157:52] ==> public final val FqNameUnsafe.isSafe: Boolean[MyPropertyDescriptor]

'component1' @ [159:14] ==> public final operator fun component1(): ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerChangeInfo[SimpleFunctionDescriptorImpl]

'component2' @ [159:28] ==> public final operator fun component2(): ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerChangeInfo[SimpleFunctionDescriptorImpl]

'containerChangeInfo' @ [159:44] ==> value-parameter containerChangeInfo: ContainerChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange[ValueParameterDescriptorImpl]

'descriptor' @ [161:31] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'parents' @ [162:18] ==> public val DeclarationDescriptor.parents: Sequence<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'mapNotNull' @ [163:18] ==> public fun <T, R : Any> Sequence<DeclarationDescriptor>.mapNotNull(transform: (DeclarationDescriptor) -> FqName?): Sequence<FqName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R : Any> -> FqName

'when {
                        oldContainer.matches(it) -> oldContainer.fqName
                        newContainer.matches(it) -> newContainer.fqName
                        else -> null
                    }' @ [164:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FqName?, entry1: FqName?, entry2: FqName?): FqName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FqName?

'oldContainer' @ [165:25] ==> val oldContainer: ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'matches' @ [165:38] ==> public abstract fun matches(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo[SimpleFunctionDescriptorImpl]

'it' @ [165:46] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference.<anonymous>[ValueParameterDescriptorImpl]

'oldContainer' @ [165:53] ==> val oldContainer: ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'fqName' @ [165:66] ==> public abstract val fqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo[PropertyDescriptorImpl]

'newContainer' @ [166:25] ==> val newContainer: ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'matches' @ [166:38] ==> public abstract fun matches(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo[SimpleFunctionDescriptorImpl]

'it' @ [166:46] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference.<anonymous>[ValueParameterDescriptorImpl]

'newContainer' @ [166:53] ==> val newContainer: ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'fqName' @ [166:66] ==> public abstract val fqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo[PropertyDescriptorImpl]

'firstOrNull' @ [170:18] ==> public fun <T> Sequence<FqName>.firstOrNull(): FqName? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'isImported' @ [172:26] ==> local final tailrec fun isImported(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange[SimpleFunctionDescriptorImpl]

'descriptor' @ [172:37] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'isImported' @ [173:13] ==> val isImported: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'this' @ [173:27] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange[ReceiverParameterDescriptorImpl]

'declaration' @ [175:13] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'isExtension' @ [177:13] ==> val isExtension: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'containerFqName' @ [177:28] ==> val containerFqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'isImported' @ [177:55] ==> val isImported: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'createMoveUsageInfoIfPossible' @ [178:13] ==> public fun createMoveUsageInfoIfPossible(reference: PsiReference, referencedElement: PsiElement, addImportToOriginalFile: Boolean, isInternal: Boolean): UsageInfo? defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [178:43] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference.<anonymous>[ValueParameterDescriptorImpl]

'mainReference' @ [178:46] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'declaration' @ [178:61] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.processReference[LocalVariableDescriptor]

'analyzeFully' @ [184:26] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'forEachDescendantOfType' @ [185:5] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtReferenceExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtReferenceExpression

'refExpr' @ [186:13] ==> value-parameter refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.<anonymous>[ValueParameterDescriptorImpl]

'refExpr' @ [186:51] ==> value-parameter refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [186:59] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'processReference' @ [188:9] ==> local final fun processReference(refExpr: KtSimpleNameExpression, bindingContext: BindingContext): UsageInfoFactory? /* = ((KtSimpleNameExpression) -> UsageInfo?)? */ defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange[SimpleFunctionDescriptorImpl]

'refExpr' @ [188:26] ==> value-parameter refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.<anonymous>[ValueParameterDescriptorImpl]

'bindingContext' @ [188:35] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange[LocalVariableDescriptor]

'let' @ [188:52] ==> @InlineOnly public inline fun <T, R> (UsageInfoFactory /* = (KtSimpleNameExpression) -> UsageInfo? */).let(block: (UsageInfoFactory /* = (KtSimpleNameExpression) -> UsageInfo? */) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<KtSimpleNameExpression, UsageInfo?>
    <R> -> Unit

'invoke' @ [188:58] ==> public abstract operator fun invoke(originalRefExpr: @ParameterName KtSimpleNameExpression, usageFactory: UsageInfoFactory /* = @ParameterName(name = "usageFactory") (KtSimpleNameExpression) -> UsageInfo? */): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'refExpr' @ [188:63] ==> value-parameter refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [188:72] ==> value-parameter it: UsageInfoFactory /* = (KtSimpleNameExpression) -> UsageInfo? */ defined in org.jetbrains.kotlin.idea.refactoring.move.processInternalReferencesToUpdateOnPackageNameChange.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getValue' @ [192:70] ==> public final operator fun getValue(thisRef: R, property: KProperty<*>): T? defined in org.jetbrains.kotlin.psi.CopyableUserDataProperty[DeserializedSimpleFunctionDescriptor]

'create' @ [192:99] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(UsageInfo..UsageInfo?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.usageView.UsageInfo..com.intellij.usageView.UsageInfo?)

'usages' @ [195:5] ==> value-parameter usages: Collection<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.markInternalUsages[ValueParameterDescriptorImpl]

'forEach' @ [195:12] ==> @HidesMembers public inline fun <T> Iterable<UsageInfo>.forEach(action: (UsageInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'it' @ [195:23] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.markInternalUsages.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [195:26] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'internalUsageInfo' @ [195:63] ==> internal var KtSimpleNameExpression.internalUsageInfo: UsageInfo? defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[PropertyDescriptorImpl]

'it' @ [195:83] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.markInternalUsages.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [203:12] ==> value-parameter scope: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.restoreInternalUsages[ValueParameterDescriptorImpl]

'collectDescendantsOfType' @ [203:18] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(noinline predicate: (KtSimpleNameExpression) -> Boolean = ...): List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'mapNotNull' @ [203:69] ==> public inline fun <T, R : Any> Iterable<KtSimpleNameExpression>.mapNotNull(transform: (KtSimpleNameExpression) -> UsageInfo?): List<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression
    <R : Any> -> UsageInfo

'it' @ [204:25] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.restoreInternalUsages.<anonymous>[ValueParameterDescriptorImpl]

'internalUsageInfo' @ [204:28] ==> internal var KtSimpleNameExpression.internalUsageInfo: UsageInfo? defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[PropertyDescriptorImpl]

'!' @ [205:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'forcedRestore' @ [205:14] ==> value-parameter forcedRestore: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.move.restoreInternalUsages[ValueParameterDescriptorImpl]

'usageInfo' @ [205:31] ==> val usageInfo: UsageInfo? defined in org.jetbrains.kotlin.idea.refactoring.move.restoreInternalUsages.<anonymous>[LocalVariableDescriptor]

'element' @ [205:42] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'usageInfo' @ [205:77] ==> val usageInfo: UsageInfo? defined in org.jetbrains.kotlin.idea.refactoring.move.restoreInternalUsages.<anonymous>[LocalVariableDescriptor]

'?:' @ [206:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'usageInfo' @ [206:34] ==> val usageInfo: UsageInfo? defined in org.jetbrains.kotlin.idea.refactoring.move.restoreInternalUsages.<anonymous>[LocalVariableDescriptor]

'referencedElement' @ [206:70] ==> public final val MoveRenameUsageInfo.referencedElement: PsiElement?[MyPropertyDescriptor]

'mapToNewOrThis' @ [207:36] ==> internal fun mapToNewOrThis(e: PsiElement, oldToNewElementsMapping: Map<PsiElement, PsiElement>): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'referencedElement' @ [207:51] ==> val referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.restoreInternalUsages.<anonymous>[LocalVariableDescriptor]

'oldToNewElementsMapping' @ [207:70] ==> value-parameter oldToNewElementsMapping: Map<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.restoreInternalUsages[ValueParameterDescriptorImpl]

'!' @ [208:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'newReferencedElement' @ [208:14] ==> val newReferencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.restoreInternalUsages.<anonymous>[LocalVariableDescriptor]

'isValid' @ [208:35] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'usageInfo' @ [209:10] ==> val usageInfo: UsageInfo? defined in org.jetbrains.kotlin.idea.refactoring.move.restoreInternalUsages.<anonymous>[LocalVariableDescriptor]

'refresh' @ [209:42] ==> public abstract fun refresh(refExpr: KtSimpleNameExpression, referencedElement: PsiElement): UsageInfo? defined in org.jetbrains.kotlin.idea.refactoring.move.KotlinMoveUsage[SimpleFunctionDescriptorImpl]

'it' @ [209:50] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.restoreInternalUsages.<anonymous>[ValueParameterDescriptorImpl]

'newReferencedElement' @ [209:54] ==> val newReferencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.restoreInternalUsages.<anonymous>[LocalVariableDescriptor]

'usages' @ [214:5] ==> value-parameter usages: Collection<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.cleanUpInternalUsages[ValueParameterDescriptorImpl]

'forEach' @ [214:12] ==> @HidesMembers public inline fun <T> Iterable<UsageInfo>.forEach(action: (UsageInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'it' @ [214:23] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.cleanUpInternalUsages.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [214:26] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'internalUsageInfo' @ [214:63] ==> internal var KtSimpleNameExpression.internalUsageInfo: UsageInfo? defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[PropertyDescriptorImpl]

'UsageInfo' @ [220:5] ==> public constructor UsageInfo(@NotNull p0: PsiElement) defined in com.intellij.usageView.UsageInfo[JavaClassConstructorDescriptor]

'callee' @ [220:15] ==> value-parameter callee: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.ImplicitCompanionAsDispatchReceiverUsageInfo.<init>[ValueParameterDescriptorImpl]

'MoveRenameUsageInfo' @ [235:4] ==> public constructor MoveRenameUsageInfo(p0: (PsiElement..PsiElement?), p1: (PsiReference..PsiReference?), p2: Int, p3: Int, p4: (PsiElement..PsiElement?), p5: Boolean) defined in com.intellij.refactoring.util.MoveRenameUsageInfo[JavaClassConstructorDescriptor]

'element' @ [235:24] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo.<init>[ValueParameterDescriptorImpl]

'reference' @ [235:33] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo.<init>[ValueParameterDescriptorImpl]

'reference' @ [235:44] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo.<init>[ValueParameterDescriptorImpl]

'rangeInElement' @ [235:54] ==> public final val PsiReference.rangeInElement: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [235:69] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'reference' @ [235:82] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo.<init>[ValueParameterDescriptorImpl]

'rangeInElement' @ [235:92] ==> public final val PsiReference.rangeInElement: (TextRange..TextRange?)[MyPropertyDescriptor]

'endOffset' @ [235:107] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'referencedElement' @ [235:118] ==> value-parameter referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo.<init>[ValueParameterDescriptorImpl]

'UnqualifiableMoveRenameUsageInfo' @ [237:16] ==> public constructor UnqualifiableMoveRenameUsageInfo(element: PsiElement, reference: PsiReference, referencedElement: PsiElement, originalFile: PsiFile, addImportToOriginalFile: Boolean, isInternal: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo[ClassConstructorDescriptorImpl]

'refExpr' @ [237:49] ==> value-parameter refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo.refresh[ValueParameterDescriptorImpl]

'refExpr' @ [237:58] ==> value-parameter refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo.refresh[ValueParameterDescriptorImpl]

'mainReference' @ [237:66] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'referencedElement' @ [237:81] ==> value-parameter referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo.refresh[ValueParameterDescriptorImpl]

'originalFile' @ [237:100] ==> public final val originalFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo[PropertyDescriptorImpl]

'addImportToOriginalFile' @ [237:114] ==> public final val addImportToOriginalFile: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo[PropertyDescriptorImpl]

'isInternal' @ [237:139] ==> public open val isInternal: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo[PropertyDescriptorImpl]

'MoveRenameUsageInfo' @ [246:4] ==> public constructor MoveRenameUsageInfo(p0: (PsiElement..PsiElement?), p1: (PsiReference..PsiReference?), p2: Int, p3: Int, p4: (PsiElement..PsiElement?), p5: Boolean) defined in com.intellij.refactoring.util.MoveRenameUsageInfo[JavaClassConstructorDescriptor]

'element' @ [246:24] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.QualifiableMoveRenameUsageInfo.<init>[ValueParameterDescriptorImpl]

'reference' @ [246:33] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.move.QualifiableMoveRenameUsageInfo.<init>[ValueParameterDescriptorImpl]

'reference' @ [246:44] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.move.QualifiableMoveRenameUsageInfo.<init>[ValueParameterDescriptorImpl]

'rangeInElement' @ [246:54] ==> public final val PsiReference.rangeInElement: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [246:69] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'reference' @ [246:82] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.move.QualifiableMoveRenameUsageInfo.<init>[ValueParameterDescriptorImpl]

'rangeInElement' @ [246:92] ==> public final val PsiReference.rangeInElement: (TextRange..TextRange?)[MyPropertyDescriptor]

'endOffset' @ [246:107] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'referencedElement' @ [246:118] ==> value-parameter referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.QualifiableMoveRenameUsageInfo.<init>[ValueParameterDescriptorImpl]

'QualifiableMoveRenameUsageInfo' @ [249:16] ==> public constructor QualifiableMoveRenameUsageInfo(element: PsiElement, reference: PsiReference, referencedElement: PsiElement, isInternal: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.move.QualifiableMoveRenameUsageInfo[ClassConstructorDescriptorImpl]

'refExpr' @ [249:47] ==> value-parameter refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.QualifiableMoveRenameUsageInfo.refresh[ValueParameterDescriptorImpl]

'refExpr' @ [249:56] ==> value-parameter refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.QualifiableMoveRenameUsageInfo.refresh[ValueParameterDescriptorImpl]

'mainReference' @ [249:64] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'referencedElement' @ [249:79] ==> value-parameter referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.QualifiableMoveRenameUsageInfo.refresh[ValueParameterDescriptorImpl]

'isInternal' @ [249:98] ==> public open val isInternal: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.QualifiableMoveRenameUsageInfo[PropertyDescriptorImpl]

'reference' @ [259:19] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.move.createMoveUsageInfoIfPossible[ValueParameterDescriptorImpl]

'element' @ [259:29] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (getReferenceKind(reference, referencedElement)) {
        ReferenceKind.QUALIFIABLE -> QualifiableMoveRenameUsageInfo(
                element, reference, referencedElement, isInternal
        )
        ReferenceKind.UNQUALIFIABLE -> UnqualifiableMoveRenameUsageInfo(
                element, reference, referencedElement, element.containingFile!!, addImportToOriginalFile, isInternal
        )
        else -> null
    }' @ [260:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UsageInfo?, entry1: UsageInfo?, entry2: UsageInfo?): UsageInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UsageInfo?

'getReferenceKind' @ [260:18] ==> private fun getReferenceKind(reference: PsiReference, referencedElement: PsiElement): ReferenceKind defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'reference' @ [260:35] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.move.createMoveUsageInfoIfPossible[ValueParameterDescriptorImpl]

'referencedElement' @ [260:46] ==> value-parameter referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.createMoveUsageInfoIfPossible[ValueParameterDescriptorImpl]

'QUALIFIABLE' @ [261:23] ==> enum entry QUALIFIABLE defined in org.jetbrains.kotlin.idea.refactoring.move.ReferenceKind[FakeCallableDescriptorForObject]

'QualifiableMoveRenameUsageInfo' @ [261:38] ==> public constructor QualifiableMoveRenameUsageInfo(element: PsiElement, reference: PsiReference, referencedElement: PsiElement, isInternal: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.move.QualifiableMoveRenameUsageInfo[ClassConstructorDescriptorImpl]

'element' @ [262:17] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.move.createMoveUsageInfoIfPossible[LocalVariableDescriptor]

'reference' @ [262:26] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.move.createMoveUsageInfoIfPossible[ValueParameterDescriptorImpl]

'referencedElement' @ [262:37] ==> value-parameter referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.createMoveUsageInfoIfPossible[ValueParameterDescriptorImpl]

'isInternal' @ [262:56] ==> value-parameter isInternal: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.createMoveUsageInfoIfPossible[ValueParameterDescriptorImpl]

'UNQUALIFIABLE' @ [264:23] ==> enum entry UNQUALIFIABLE defined in org.jetbrains.kotlin.idea.refactoring.move.ReferenceKind[FakeCallableDescriptorForObject]

'UnqualifiableMoveRenameUsageInfo' @ [264:40] ==> public constructor UnqualifiableMoveRenameUsageInfo(element: PsiElement, reference: PsiReference, referencedElement: PsiElement, originalFile: PsiFile, addImportToOriginalFile: Boolean, isInternal: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo[ClassConstructorDescriptorImpl]

'element' @ [265:17] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.move.createMoveUsageInfoIfPossible[LocalVariableDescriptor]

'reference' @ [265:26] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.move.createMoveUsageInfoIfPossible[ValueParameterDescriptorImpl]

'referencedElement' @ [265:37] ==> value-parameter referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.createMoveUsageInfoIfPossible[ValueParameterDescriptorImpl]

'element' @ [265:56] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.move.createMoveUsageInfoIfPossible[LocalVariableDescriptor]

'containingFile' @ [265:64] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'addImportToOriginalFile' @ [265:82] ==> value-parameter addImportToOriginalFile: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.createMoveUsageInfoIfPossible[ValueParameterDescriptorImpl]

'isInternal' @ [265:107] ==> value-parameter isInternal: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.createMoveUsageInfoIfPossible[ValueParameterDescriptorImpl]

'getResolvedCall' @ [278:24] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [278:40] ==> value-parameter bindingContext: BindingContext? = ... defined in org.jetbrains.kotlin.idea.refactoring.move.isExtensionRef[ValueParameterDescriptorImpl]

'analyze' @ [278:58] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [278:82] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'resolvedCall' @ [279:9] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.move.isExtensionRef[LocalVariableDescriptor]

'resolvedCall' @ [280:16] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.move.isExtensionRef[LocalVariableDescriptor]

'variableCall' @ [280:29] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[DeserializedPropertyDescriptor]

'candidateDescriptor' @ [280:42] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<VariableDescriptor>.candidateDescriptor: VariableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'isExtension' @ [280:62] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'resolvedCall' @ [280:77] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.move.isExtensionRef[LocalVariableDescriptor]

'functionCall' @ [280:90] ==> public abstract val functionCall: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[DeserializedPropertyDescriptor]

'candidateDescriptor' @ [280:103] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<FunctionDescriptor>.candidateDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'isExtension' @ [280:123] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'resolvedCall' @ [282:12] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.move.isExtensionRef[LocalVariableDescriptor]

'candidateDescriptor' @ [282:25] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'isExtension' @ [282:45] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'referencedElement' @ [286:18] ==> value-parameter referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.getReferenceKind[ValueParameterDescriptorImpl]

'unwrapped' @ [286:36] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'reference' @ [287:19] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.move.getReferenceKind[ValueParameterDescriptorImpl]

'element' @ [287:29] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'QUALIFIABLE' @ [287:88] ==> enum entry QUALIFIABLE defined in org.jetbrains.kotlin.idea.refactoring.move.ReferenceKind[FakeCallableDescriptorForObject]

'element' @ [289:9] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.getReferenceKind[LocalVariableDescriptor]

'getStrictParentOfType' @ [289:17] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtSuperExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSuperExpression

'IRRELEVANT' @ [289:90] ==> enum entry IRRELEVANT defined in org.jetbrains.kotlin.idea.refactoring.move.ReferenceKind[FakeCallableDescriptorForObject]

'element' @ [291:9] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.getReferenceKind[LocalVariableDescriptor]

'isExtensionRef' @ [291:17] ==> private fun KtSimpleNameExpression.isExtensionRef(bindingContext: BindingContext? = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'reference' @ [291:37] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.move.getReferenceKind[ValueParameterDescriptorImpl]

'element' @ [291:47] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [291:55] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'UNQUALIFIABLE' @ [291:131] ==> enum entry UNQUALIFIABLE defined in org.jetbrains.kotlin.idea.refactoring.move.ReferenceKind[FakeCallableDescriptorForObject]

'element' @ [293:5] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.move.getReferenceKind[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [293:13] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallableReferenceExpression.() -> PsiElement?): KtCallableReferenceExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallableReferenceExpression

'callableReference' @ [293:71] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'let' @ [293:92] ==> @InlineOnly public inline fun <T, R> KtCallableReferenceExpression.let(block: (KtCallableReferenceExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallableReferenceExpression
    <R> -> Unit

'it' @ [294:13] ==> value-parameter it: KtCallableReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.getReferenceKind.<anonymous>[ValueParameterDescriptorImpl]

'receiverExpression' @ [294:16] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[DeserializedPropertyDescriptor]

'IRRELEVANT' @ [294:65] ==> enum entry IRRELEVANT defined in org.jetbrains.kotlin.idea.refactoring.move.ReferenceKind[FakeCallableDescriptorForObject]

'target' @ [295:13] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.getReferenceKind[LocalVariableDescriptor]

'target' @ [295:40] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.getReferenceKind[LocalVariableDescriptor]

'parent' @ [295:47] ==> public final val KtDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'UNQUALIFIABLE' @ [295:86] ==> enum entry UNQUALIFIABLE defined in org.jetbrains.kotlin.idea.refactoring.move.ReferenceKind[FakeCallableDescriptorForObject]

'target' @ [296:13] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.getReferenceKind[LocalVariableDescriptor]

'target' @ [296:36] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.getReferenceKind[LocalVariableDescriptor]

'containingClass' @ [296:43] ==> public final val PsiMember.containingClass: PsiClass?[MyPropertyDescriptor]

'UNQUALIFIABLE' @ [296:89] ==> enum entry UNQUALIFIABLE defined in org.jetbrains.kotlin.idea.refactoring.move.ReferenceKind[FakeCallableDescriptorForObject]

'QUALIFIABLE' @ [299:26] ==> enum entry QUALIFIABLE defined in org.jetbrains.kotlin.idea.refactoring.move.ReferenceKind[FakeCallableDescriptorForObject]

'reference' @ [303:12] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.move.isCallableReference[ValueParameterDescriptorImpl]

'reference' @ [304:15] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.move.isCallableReference[ValueParameterDescriptorImpl]

'element' @ [304:25] ==> public final val KtSimpleNameReference.element: (KtSimpleNameExpression..KtSimpleNameExpression?)[MyPropertyDescriptor]

'getParentOfTypeAndBranch' @ [304:33] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallableReferenceExpression.() -> PsiElement?): KtCallableReferenceExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallableReferenceExpression

'callableReference' @ [304:91] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'declarationsToMove' @ [308:9] ==> value-parameter declarationsToMove: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.guessNewFileName[ValueParameterDescriptorImpl]

'isEmpty' @ [308:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'declarationsToMove' @ [310:26] ==> value-parameter declarationsToMove: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.guessNewFileName[ValueParameterDescriptorImpl]

'singleOrNull' @ [310:45] ==> public fun <T> Iterable<KtNamedDeclaration>.singleOrNull(): KtNamedDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'declarationsToMove' @ [311:29] ==> value-parameter declarationsToMove: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.guessNewFileName[ValueParameterDescriptorImpl]

'filterIsInstance' @ [311:48] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClassOrObject

'singleOrNull' @ [311:84] ==> public fun <T> List<KtClassOrObject>.singleOrNull(): KtClassOrObject? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'representative' @ [312:5] ==> val representative: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.move.guessNewFileName[LocalVariableDescriptor]

'let' @ [312:21] ==> @InlineOnly public inline fun <T, R> KtNamedDeclaration.let(block: (KtNamedDeclaration) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> Nothing

'it' @ [312:37] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.guessNewFileName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [312:40] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'EXTENSION' @ [312:63] ==> public const final val EXTENSION: String defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'declarationsToMove' @ [314:12] ==> value-parameter declarationsToMove: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.guessNewFileName[ValueParameterDescriptorImpl]

'first' @ [314:31] ==> public fun <T> Iterable<KtNamedDeclaration>.first(): KtNamedDeclaration defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'containingFile' @ [314:39] ==> public final val KtNamedDeclaration.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'name' @ [314:54] ==> public final var PsiFile.name: String[MyPropertyDescriptor]

'oldElement' @ [319:9] ==> value-parameter oldElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[ValueParameterDescriptorImpl]

'newElement' @ [319:36] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[ValueParameterDescriptorImpl]

'oldElement' @ [321:28] ==> value-parameter oldElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[ValueParameterDescriptorImpl]

'containingClass' @ [321:39] ==> public final val PsiMember.containingClass: PsiClass?[MyPropertyDescriptor]

'qualifiedName' @ [321:56] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'oldClassName' @ [322:13] ==> val oldClassName: String? defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[LocalVariableDescriptor]

'reference' @ [323:37] ==> value-parameter reference: PsiReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[ValueParameterDescriptorImpl]

'containingFile' @ [323:47] ==> public final val PsiReferenceExpression.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'importList' @ [323:80] ==> public final val PsiJavaFile.importList: PsiImportList?[MyPropertyDescriptor]

'allImportStatements' @ [323:92] ==> public final val PsiImportList.allImportStatements: (Array<(PsiImportStatementBase..PsiImportStatementBase?)>..Array<out (PsiImportStatementBase..PsiImportStatementBase?)>)[MyPropertyDescriptor]

'firstOrNull' @ [323:113] ==> public inline fun <T> Array<out (PsiImportStatementBase..PsiImportStatementBase?)>.firstOrNull(predicate: ((PsiImportStatementBase..PsiImportStatementBase?)) -> Boolean): PsiImportStatementBase? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiImportStatementBase..com.intellij.psi.PsiImportStatementBase?)

'when (it) {
                    is PsiImportStatement -> it.qualifiedName == oldClassName
                    is PsiImportStaticStatement -> it.isOnDemand && it.importReference?.canonicalText == oldClassName
                    else -> false
                }' @ [324:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'it' @ [324:23] ==> value-parameter it: (PsiImportStatementBase..PsiImportStatementBase?) defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [325:46] ==> value-parameter it: (PsiImportStatementBase..PsiImportStatementBase?) defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedName' @ [325:49] ==> public final val PsiImportStatement.qualifiedName: String?[MyPropertyDescriptor]

'oldClassName' @ [325:66] ==> val oldClassName: String? defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[LocalVariableDescriptor]

'it' @ [326:52] ==> value-parameter it: (PsiImportStatementBase..PsiImportStatementBase?) defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference.<anonymous>[ValueParameterDescriptorImpl]

'isOnDemand' @ [326:55] ==> public final val PsiImportStaticStatement.isOnDemand: Boolean[MyPropertyDescriptor]

'it' @ [326:69] ==> value-parameter it: (PsiImportStatementBase..PsiImportStatementBase?) defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference.<anonymous>[ValueParameterDescriptorImpl]

'importReference' @ [326:72] ==> public final val PsiImportStaticStatement.importReference: PsiJavaCodeReferenceElement?[MyPropertyDescriptor]

'canonicalText' @ [326:89] ==> public final val PsiJavaCodeReferenceElement.canonicalText: String[MyPropertyDescriptor]

'oldClassName' @ [326:106] ==> val oldClassName: String? defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[LocalVariableDescriptor]

'importOfOldClass' @ [330:17] ==> val importOfOldClass: PsiImportStatementBase? defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[LocalVariableDescriptor]

'importOfOldClass' @ [330:45] ==> val importOfOldClass: PsiImportStatementBase? defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[LocalVariableDescriptor]

'resolve' @ [330:62] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiImportStatementBase[JavaMethodDescriptor]

'importOfOldClass' @ [331:17] ==> val importOfOldClass: PsiImportStatementBase? defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[LocalVariableDescriptor]

'delete' @ [331:34] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiImportStatementBase[JavaMethodDescriptor]

'newElement' @ [335:24] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[ValueParameterDescriptorImpl]

'containingClass' @ [335:35] ==> public final val PsiMember.containingClass: PsiClass?[MyPropertyDescriptor]

'newClass' @ [336:13] ==> val newClass: PsiClass? defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[LocalVariableDescriptor]

'reference' @ [336:33] ==> value-parameter reference: PsiReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[ValueParameterDescriptorImpl]

'qualifierExpression' @ [336:43] ==> public final var PsiReferenceExpression.qualifierExpression: PsiExpression?[MyPropertyDescriptor]

'MockMoveMembersOptions' @ [337:42] ==> public constructor MockMoveMembersOptions(p0: (String..String?), p1: (Array<(PsiMember..PsiMember?)>..Array<out (PsiMember..PsiMember?)>?)) defined in com.intellij.refactoring.move.moveMembers.MockMoveMembersOptions[JavaClassConstructorDescriptor]

'newClass' @ [337:65] ==> val newClass: PsiClass? defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[LocalVariableDescriptor]

'qualifiedName' @ [337:74] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'arrayOf' @ [337:89] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiMember): Array<PsiMember> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiMember

'newElement' @ [337:97] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[ValueParameterDescriptorImpl]

'MoveMembersUsageInfo' @ [338:61] ==> public constructor MoveMembersUsageInfo(p0: (PsiMember..PsiMember?), p1: (PsiElement..PsiElement?), p2: (PsiClass..PsiClass?), p3: (PsiElement..PsiElement?), p4: (PsiReference..PsiReference?)) defined in com.intellij.refactoring.move.moveMembers.MoveMembersProcessor.MoveMembersUsageInfo[JavaClassConstructorDescriptor]

'newElement' @ [339:21] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[ValueParameterDescriptorImpl]

'reference' @ [339:33] ==> value-parameter reference: PsiReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[ValueParameterDescriptorImpl]

'element' @ [339:43] ==> public final val PsiReferenceExpression.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'newClass' @ [339:52] ==> val newClass: PsiClass? defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[LocalVariableDescriptor]

'reference' @ [339:62] ==> value-parameter reference: PsiReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[ValueParameterDescriptorImpl]

'qualifierExpression' @ [339:72] ==> public final var PsiReferenceExpression.qualifierExpression: PsiExpression?[MyPropertyDescriptor]

'reference' @ [339:93] ==> value-parameter reference: PsiReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[ValueParameterDescriptorImpl]

'EP_NAME' @ [340:55] ==> public final val EP_NAME: (LanguageExtension<(MoveMemberHandler..MoveMemberHandler?)>..LanguageExtension<(MoveMemberHandler..MoveMemberHandler?)>?) defined in com.intellij.refactoring.move.moveMembers.MoveMemberHandler[JavaPropertyDescriptor]

'forLanguage' @ [340:63] ==> public open fun forLanguage(@NotNull p0: Language): (MoveMemberHandler..MoveMemberHandler?) defined in com.intellij.lang.LanguageExtension[JavaMethodDescriptor]

'reference' @ [340:75] ==> value-parameter reference: PsiReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[ValueParameterDescriptorImpl]

'element' @ [340:85] ==> public final val PsiReferenceExpression.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'language' @ [340:93] ==> public final val PsiElement.language: Language[MyPropertyDescriptor]

'moveMemberHandler' @ [341:17] ==> val moveMemberHandler: (MoveMemberHandler..MoveMemberHandler?) defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[LocalVariableDescriptor]

'moveMemberHandler' @ [342:17] ==> val moveMemberHandler: (MoveMemberHandler..MoveMemberHandler?) defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[LocalVariableDescriptor]

'changeExternalUsage' @ [342:35] ==> public abstract fun changeExternalUsage(@NotNull p0: MoveMembersOptions, @NotNull p1: MoveMembersProcessor.MoveMembersUsageInfo): Boolean defined in com.intellij.refactoring.move.moveMembers.MoveMemberHandler[JavaMethodDescriptor]

'mockMoveMembersOptions' @ [342:55] ==> val mockMoveMembersOptions: MockMoveMembersOptions defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[LocalVariableDescriptor]

'moveMembersUsageInfo' @ [342:79] ==> val moveMembersUsageInfo: MoveMembersProcessor.MoveMembersUsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.updateJavaReference[LocalVariableDescriptor]

'oldToNewElementsMapping' @ [350:100] ==> value-parameter oldToNewElementsMapping: Map<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.mapToNewOrThis[ValueParameterDescriptorImpl]

'e' @ [350:124] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.mapToNewOrThis[ValueParameterDescriptorImpl]

'e' @ [350:130] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.mapToNewOrThis[ValueParameterDescriptorImpl]

'when (usage) {
        is NonCodeUsageInfo -> {
            nonCodeUsages.add(usage)
        }

        is UnqualifiableMoveRenameUsageInfo -> {
            val file = with(usage) { if (addImportToOriginalFile) originalFile else mapToNewOrThis(originalFile, oldToNewElementsMapping) } as KtFile
            val declaration = mapToNewOrThis(usage.referencedElement!!, oldToNewElementsMapping)
            addDelayedImportRequest(declaration, file)
        }

        is MoveRenameUsageInfo -> {
            val oldElement = usage.referencedElement!!
            val newElement = mapToNewOrThis(oldElement, oldToNewElementsMapping)
            val reference = (usage.element as? KtSimpleNameExpression)?.mainReference ?: usage.reference
            processReference(reference, newElement, shorteningMode, oldElement)
        }
    }' @ [358:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'usage' @ [358:11] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[ValueParameterDescriptorImpl]

'nonCodeUsages' @ [360:13] ==> value-parameter nonCodeUsages: ArrayList<NonCodeUsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[ValueParameterDescriptorImpl]

'add' @ [360:27] ==> public open fun add(element: NonCodeUsageInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'usage' @ [360:31] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[ValueParameterDescriptorImpl]

'with' @ [364:24] ==> @InlineOnly public inline fun <T, R> with(receiver: UnqualifiableMoveRenameUsageInfo, block: UnqualifiableMoveRenameUsageInfo.() -> PsiElement): PsiElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnqualifiableMoveRenameUsageInfo
    <R> -> PsiElement

'usage' @ [364:29] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[ValueParameterDescriptorImpl]

'if (addImportToOriginalFile) originalFile else mapToNewOrThis(originalFile, oldToNewElementsMapping)' @ [364:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'addImportToOriginalFile' @ [364:42] ==> public final val addImportToOriginalFile: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo[PropertyDescriptorImpl]

'originalFile' @ [364:67] ==> public final val originalFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo[PropertyDescriptorImpl]

'mapToNewOrThis' @ [364:85] ==> internal fun mapToNewOrThis(e: PsiElement, oldToNewElementsMapping: Map<PsiElement, PsiElement>): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'originalFile' @ [364:100] ==> public final val originalFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.UnqualifiableMoveRenameUsageInfo[PropertyDescriptorImpl]

'oldToNewElementsMapping' @ [364:114] ==> value-parameter oldToNewElementsMapping: Map<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[ValueParameterDescriptorImpl]

'mapToNewOrThis' @ [365:31] ==> internal fun mapToNewOrThis(e: PsiElement, oldToNewElementsMapping: Map<PsiElement, PsiElement>): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'usage' @ [365:46] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[ValueParameterDescriptorImpl]

'referencedElement' @ [365:52] ==> public final val UnqualifiableMoveRenameUsageInfo.referencedElement: PsiElement?[MyPropertyDescriptor]

'oldToNewElementsMapping' @ [365:73] ==> value-parameter oldToNewElementsMapping: Map<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[ValueParameterDescriptorImpl]

'addDelayedImportRequest' @ [366:13] ==> public fun addDelayedImportRequest(elementToImport: PsiElement, file: KtFile): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'declaration' @ [366:37] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[LocalVariableDescriptor]

'file' @ [366:50] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[LocalVariableDescriptor]

'usage' @ [370:30] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[ValueParameterDescriptorImpl]

'referencedElement' @ [370:36] ==> public final val MoveRenameUsageInfo.referencedElement: PsiElement?[MyPropertyDescriptor]

'mapToNewOrThis' @ [371:30] ==> internal fun mapToNewOrThis(e: PsiElement, oldToNewElementsMapping: Map<PsiElement, PsiElement>): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'oldElement' @ [371:45] ==> val oldElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[LocalVariableDescriptor]

'oldToNewElementsMapping' @ [371:57] ==> value-parameter oldToNewElementsMapping: Map<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[ValueParameterDescriptorImpl]

'?:' @ [372:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiReference?, right: PsiReference?): PsiReference?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiReference?

'usage' @ [372:30] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[ValueParameterDescriptorImpl]

'element' @ [372:36] ==> public final val MoveRenameUsageInfo.element: PsiElement?[MyPropertyDescriptor]

'mainReference' @ [372:73] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'usage' @ [372:90] ==> value-parameter usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[ValueParameterDescriptorImpl]

'reference' @ [372:96] ==> public final val MoveRenameUsageInfo.reference: PsiReference?[MyPropertyDescriptor]

'processReference' @ [373:13] ==> private fun processReference(reference: PsiReference?, newElement: PsiElement, shorteningMode: KtSimpleNameReference.ShorteningMode, oldElement: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'reference' @ [373:30] ==> val reference: PsiReference? defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[LocalVariableDescriptor]

'newElement' @ [373:41] ==> val newElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[LocalVariableDescriptor]

'shorteningMode' @ [373:53] ==> value-parameter shorteningMode: KtSimpleNameReference.ShorteningMode defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[ValueParameterDescriptorImpl]

'oldElement' @ [373:69] ==> val oldElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsage[LocalVariableDescriptor]

'when {
            reference is KtSimpleNameReference -> reference.bindToElement(newElement, shorteningMode)
            reference is PsiReferenceExpression && updateJavaReference(reference, oldElement, newElement) -> return
            else -> reference?.bindToElement(newElement)
        }' @ [380:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'reference' @ [381:13] ==> value-parameter reference: PsiReference? defined in org.jetbrains.kotlin.idea.refactoring.move.processReference[ValueParameterDescriptorImpl]

'reference' @ [381:51] ==> value-parameter reference: PsiReference? defined in org.jetbrains.kotlin.idea.refactoring.move.processReference[ValueParameterDescriptorImpl]

'bindToElement' @ [381:61] ==> public final fun bindToElement(element: PsiElement, shorteningMode: KtSimpleNameReference.ShorteningMode): PsiElement defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedSimpleFunctionDescriptor]

'newElement' @ [381:75] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.processReference[ValueParameterDescriptorImpl]

'shorteningMode' @ [381:87] ==> value-parameter shorteningMode: KtSimpleNameReference.ShorteningMode defined in org.jetbrains.kotlin.idea.refactoring.move.processReference[ValueParameterDescriptorImpl]

'reference' @ [382:13] ==> value-parameter reference: PsiReference? defined in org.jetbrains.kotlin.idea.refactoring.move.processReference[ValueParameterDescriptorImpl]

'updateJavaReference' @ [382:52] ==> private fun updateJavaReference(reference: PsiReferenceExpression, oldElement: PsiElement, newElement: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'reference' @ [382:72] ==> value-parameter reference: PsiReference? defined in org.jetbrains.kotlin.idea.refactoring.move.processReference[ValueParameterDescriptorImpl]

'oldElement' @ [382:83] ==> value-parameter oldElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.processReference[ValueParameterDescriptorImpl]

'newElement' @ [382:95] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.processReference[ValueParameterDescriptorImpl]

'reference' @ [383:21] ==> value-parameter reference: PsiReference? defined in org.jetbrains.kotlin.idea.refactoring.move.processReference[ValueParameterDescriptorImpl]

'bindToElement' @ [383:32] ==> public abstract fun bindToElement(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'newElement' @ [383:46] ==> value-parameter newElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.processReference[ValueParameterDescriptorImpl]

'emptyMap' @ [396:76] ==> public final fun <K : (Any..Any?), V : (Any..Any?)> emptyMap(): (MutableMap<(PsiElement..PsiElement?), (PsiElement..PsiElement?)>..Map<(PsiElement..PsiElement?), (PsiElement..PsiElement?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'DELAYED_SHORTENING' @ [397:57] ==> enum entry DELAYED_SHORTENING defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference.ShorteningMode[FakeCallableDescriptorForObject]

'usages' @ [399:28] ==> value-parameter usages: Collection<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages[ValueParameterDescriptorImpl]

'sortedWith' @ [399:35] ==> public fun <T> Iterable<UsageInfo>.sortedWith(comparator: Comparator<in UsageInfo> /* = Comparator<in UsageInfo> */): List<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'Comparator' @ [400:13] ==> @FunctionalInterface public fun <T : (Any..Any?)> Comparator(function: ((UsageInfo..UsageInfo?), (UsageInfo..UsageInfo?)) -> Int): Comparator<UsageInfo> defined in java.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> UsageInfo

'o1' @ [401:29] ==> value-parameter o1: (UsageInfo..UsageInfo?) defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [401:32] ==> public final val UsageInfo.virtualFile: VirtualFile?[MyPropertyDescriptor]

'o2' @ [402:29] ==> value-parameter o2: (UsageInfo..UsageInfo?) defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [402:32] ==> public final val UsageInfo.virtualFile: VirtualFile?[MyPropertyDescriptor]

'equal' @ [403:31] ==> public open fun <T : (Any..Any?)> equal(@Nullable p0: VirtualFile?, @Nullable p1: VirtualFile?): Boolean defined in com.intellij.openapi.util.Comparing[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VirtualFile

'file1' @ [403:37] ==> val file1: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages.<anonymous>[LocalVariableDescriptor]

'file2' @ [403:44] ==> val file2: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages.<anonymous>[LocalVariableDescriptor]

'o1' @ [404:43] ==> value-parameter o1: (UsageInfo..UsageInfo?) defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages.<anonymous>[ValueParameterDescriptorImpl]

'rangeInElement' @ [404:46] ==> public final val UsageInfo.rangeInElement: ProperTextRange?[MyPropertyDescriptor]

'o2' @ [405:43] ==> value-parameter o2: (UsageInfo..UsageInfo?) defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages.<anonymous>[ValueParameterDescriptorImpl]

'rangeInElement' @ [405:46] ==> public final val UsageInfo.rangeInElement: ProperTextRange?[MyPropertyDescriptor]

'rangeInElement1' @ [406:25] ==> val rangeInElement1: ProperTextRange? defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages.<anonymous>[LocalVariableDescriptor]

'rangeInElement2' @ [406:52] ==> val rangeInElement2: ProperTextRange? defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages.<anonymous>[LocalVariableDescriptor]

'rangeInElement2' @ [407:43] ==> val rangeInElement2: ProperTextRange? defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [407:59] ==> public final val ProperTextRange.startOffset: Int[MyPropertyDescriptor]

'rangeInElement1' @ [407:73] ==> val rangeInElement1: ProperTextRange? defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [407:89] ==> public final val ProperTextRange.startOffset: Int[MyPropertyDescriptor]

'file1' @ [411:21] ==> val file1: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages.<anonymous>[LocalVariableDescriptor]

'-' @ [411:54] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'file2' @ [412:21] ==> val file2: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages.<anonymous>[LocalVariableDescriptor]

'compare' @ [413:27] ==> public open fun <T : (Comparable<(String..String?)>..Comparable<(String..String?)>?)> compare(@Nullable p0: String?, @Nullable p1: String?): Int defined in com.intellij.openapi.util.Comparing[JavaMethodDescriptor]
Inferred types:
    <T : (Comparable<(T..T?)>..Comparable<(T..T?)>?)> -> String

'file1' @ [413:35] ==> val file1: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages.<anonymous>[LocalVariableDescriptor]

'path' @ [413:41] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'file2' @ [413:47] ==> val file2: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages.<anonymous>[LocalVariableDescriptor]

'path' @ [413:53] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'ArrayList' @ [417:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> NonCodeUsageInfo

'/' @ [419:24] ==> public final operator fun div(other: Int): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'sortedUsages' @ [419:28] ==> val sortedUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages[LocalVariableDescriptor]

'size' @ [419:41] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'getInstance' @ [420:45] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'progressIndicator' @ [420:59] ==> public final val ProgressManager.progressIndicator: (ProgressIndicator..ProgressIndicator?)[MyPropertyDescriptor]

'progressIndicator' @ [421:5] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages[LocalVariableDescriptor]

'text' @ [421:24] ==> public final var ProgressIndicator.text: (String..String?)[MyPropertyDescriptor]

'component1' @ [422:22] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [422:25] ==> public final operator fun component2(): UsageInfo defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'sortedUsages' @ [422:35] ==> val sortedUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages[LocalVariableDescriptor]

'withIndex' @ [422:48] ==> public fun <T> Iterable<UsageInfo>.withIndex(): Iterable<IndexedValue<UsageInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'progressIndicator' @ [423:9] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages[LocalVariableDescriptor]

'fraction' @ [423:28] ==> public final var ProgressIndicator.fraction: Double[MyPropertyDescriptor]

'*' @ [423:39] ==> public final operator fun times(other: Double): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'i' @ [423:40] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages[LocalVariableDescriptor]

'progressStep' @ [423:49] ==> val progressStep: Double defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages[LocalVariableDescriptor]

'postProcessMoveUsage' @ [424:9] ==> private fun postProcessMoveUsage(usage: UsageInfo, oldToNewElementsMapping: Map<PsiElement, PsiElement>, nonCodeUsages: ArrayList<NonCodeUsageInfo>, shorteningMode: KtSimpleNameReference.ShorteningMode): Unit defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'usage' @ [424:30] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages[LocalVariableDescriptor]

'oldToNewElementsMapping' @ [424:37] ==> value-parameter oldToNewElementsMapping: Map<PsiElement, PsiElement> = ... defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages[ValueParameterDescriptorImpl]

'nonCodeUsages' @ [424:62] ==> val nonCodeUsages: ArrayList<NonCodeUsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages[LocalVariableDescriptor]

'shorteningMode' @ [424:77] ==> value-parameter shorteningMode: KtSimpleNameReference.ShorteningMode = ... defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages[ValueParameterDescriptorImpl]

'progressIndicator' @ [426:5] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages[LocalVariableDescriptor]

'text' @ [426:24] ==> public final var ProgressIndicator.text: (String..String?)[MyPropertyDescriptor]

'nonCodeUsages' @ [428:12] ==> val nonCodeUsages: ArrayList<NonCodeUsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.postProcessMoveUsages[LocalVariableDescriptor]

'getValue' @ [431:48] ==> public final operator fun getValue(thisRef: R, desc: KProperty<*>): T? defined in org.jetbrains.kotlin.psi.UserDataProperty[DeserializedSimpleFunctionDescriptor]

'create' @ [431:69] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(Boolean..Boolean?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'UsageInfo' @ [433:107] ==> public constructor UsageInfo(@NotNull p0: PsiElement) defined in com.intellij.usageView.UsageInfo[JavaClassConstructorDescriptor]

'element' @ [433:117] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.<init>[ValueParameterDescriptorImpl]

'element' @ [435:23] ==> public final val OuterInstanceReferenceUsageInfo.element: PsiElement?[MyPropertyDescriptor]

'isIndirectOuter' @ [437:13] ==> private final val isIndirectOuter: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo[PropertyDescriptorImpl]

'conflicts' @ [438:13] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.reportConflictIfAny[ValueParameterDescriptorImpl]

'putValue' @ [438:23] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'element' @ [438:32] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.reportConflictIfAny[LocalVariableDescriptor]

'element' @ [438:89] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.reportConflictIfAny[LocalVariableDescriptor]

'text' @ [438:97] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'OuterInstanceReferenceUsageInfo' @ [448:9] ==> private constructor OuterInstanceReferenceUsageInfo(element: PsiElement, isIndirectOuter: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo[ClassConstructorDescriptorImpl]

'expression' @ [448:41] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ExplicitThis.<init>[ValueParameterDescriptorImpl]

'isIndirectOuter' @ [448:53] ==> value-parameter isIndirectOuter: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ExplicitThis.<init>[ValueParameterDescriptorImpl]

'element' @ [450:21] ==> public final val OuterInstanceReferenceUsageInfo.ExplicitThis.element: PsiElement?[MyPropertyDescriptor]

'OuterInstanceReferenceUsageInfo' @ [457:9] ==> private constructor OuterInstanceReferenceUsageInfo(element: PsiElement, isIndirectOuter: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo[ClassConstructorDescriptorImpl]

'callElement' @ [457:41] ==> value-parameter callElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver.<init>[ValueParameterDescriptorImpl]

'isIndirectOuter' @ [457:54] ==> value-parameter isIndirectOuter: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver.<init>[ValueParameterDescriptorImpl]

'element' @ [459:21] ==> public final val OuterInstanceReferenceUsageInfo.ImplicitReceiver.element: PsiElement?[MyPropertyDescriptor]

'super' @ [462:17] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver[LazyClassReceiverParameterDescriptor]

'reportConflictIfAny' @ [462:23] ==> public open fun reportConflictIfAny(conflicts: MultiMap<PsiElement, String>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo[SimpleFunctionDescriptorImpl]

'conflicts' @ [462:43] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver.reportConflictIfAny[ValueParameterDescriptorImpl]

'callElement' @ [464:28] ==> public final val callElement: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver[PropertyDescriptorImpl]

'let' @ [464:41] ==> @InlineOnly public inline fun <T, R> KtElement.let(block: (KtElement) -> KtElement): KtElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> KtElement

'it' @ [464:47] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver.reportConflictIfAny.<anonymous>[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelector' @ [464:50] ==> public fun KtElement.getQualifiedExpressionForSelector(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [464:89] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver.reportConflictIfAny.<anonymous>[ValueParameterDescriptorImpl]

'when {
                fullCall is KtQualifiedExpression -> {
                    conflicts.putValue(fullCall, "Qualified call won't be processed: ${fullCall.text}")
                    true
                }

                isDoubleReceiver -> {
                    conflicts.putValue(fullCall, "Member extension call won't be processed: ${fullCall.text}")
                    true
                }
                else -> false
            }' @ [465:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'fullCall' @ [466:17] ==> val fullCall: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver.reportConflictIfAny[LocalVariableDescriptor]

'conflicts' @ [467:21] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver.reportConflictIfAny[ValueParameterDescriptorImpl]

'putValue' @ [467:31] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'fullCall' @ [467:40] ==> val fullCall: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver.reportConflictIfAny[LocalVariableDescriptor]

'fullCall' @ [467:88] ==> val fullCall: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver.reportConflictIfAny[LocalVariableDescriptor]

'text' @ [467:97] ==> public final val KtQualifiedExpression.text: (String..String?)[MyPropertyDescriptor]

'isDoubleReceiver' @ [471:17] ==> private final val isDoubleReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver[PropertyDescriptorImpl]

'conflicts' @ [472:21] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver.reportConflictIfAny[ValueParameterDescriptorImpl]

'putValue' @ [472:31] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'fullCall' @ [472:40] ==> val fullCall: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver.reportConflictIfAny[LocalVariableDescriptor]

'fullCall' @ [472:95] ==> val fullCall: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver.reportConflictIfAny[LocalVariableDescriptor]

'text' @ [472:104] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'JvmOverloads' @ [481:1] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'member' @ [483:9] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[ValueParameterDescriptorImpl]

'member' @ [483:42] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[ValueParameterDescriptorImpl]

'!' @ [483:63] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'member' @ [483:64] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[ValueParameterDescriptorImpl]

'isInner' @ [483:71] ==> public final fun isInner(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'member' @ [485:19] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[ValueParameterDescriptorImpl]

'analyzeFully' @ [485:26] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'member' @ [486:35] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [486:42] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'containingClassOrObject' @ [487:32] ==> val containingClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[LocalVariableDescriptor]

'resolveToDescriptor' @ [487:56] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'member' @ [489:5] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[ValueParameterDescriptorImpl]

'accept' @ [489:12] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'PsiRecursiveElementWalkingVisitor' @ [490:22] ==> protected/*protected and package*/ constructor PsiRecursiveElementWalkingVisitor() defined in com.intellij.psi.PsiRecursiveElementWalkingVisitor[JavaClassConstructorDescriptor]

'when (element) {
                        is KtThisExpression -> {
                            val descriptor = context[BindingContext.REFERENCE_TARGET, element.instanceReference]
                            val isIndirect = when {
                                descriptor == outerClassDescriptor -> false
                                descriptor?.isAncestorOf(outerClassDescriptor, true) ?: false -> true
                                else -> return null
                            }
                            OuterInstanceReferenceUsageInfo.ExplicitThis(element, isIndirect)
                        }
                        is KtSimpleNameExpression -> {
                            val resolvedCall = element.getResolvedCall(context) ?: return null
                            val dispatchReceiver = resolvedCall.dispatchReceiver as? ImplicitReceiver
                            val extensionReceiver = resolvedCall.extensionReceiver as? ImplicitReceiver
                            var isIndirect = false
                            val isDoubleReceiver = when (outerClassDescriptor) {
                                dispatchReceiver?.declarationDescriptor -> extensionReceiver != null
                                extensionReceiver?.declarationDescriptor -> dispatchReceiver != null
                                else -> {
                                    isIndirect = true
                                    when {
                                        dispatchReceiver?.declarationDescriptor?.isAncestorOf(outerClassDescriptor, true) ?: false ->
                                            extensionReceiver != null
                                        extensionReceiver?.declarationDescriptor?.isAncestorOf(outerClassDescriptor, true) ?: false ->
                                            dispatchReceiver != null
                                        else -> return null
                                    }
                                }
                            }
                            OuterInstanceReferenceUsageInfo.ImplicitReceiver(resolvedCall.call.callElement, isIndirect, isDoubleReceiver)
                        }
                        else -> null
                    }' @ [492:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: OuterInstanceReferenceUsageInfo?, entry1: OuterInstanceReferenceUsageInfo?, entry2: OuterInstanceReferenceUsageInfo?): OuterInstanceReferenceUsageInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> OuterInstanceReferenceUsageInfo?

'element' @ [492:34] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[ValueParameterDescriptorImpl]

'context' @ [494:46] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [494:69] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [494:87] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[ValueParameterDescriptorImpl]

'instanceReference' @ [494:95] ==> public final val KtThisExpression.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'when {
                                descriptor == outerClassDescriptor -> false
                                descriptor?.isAncestorOf(outerClassDescriptor, true) ?: false -> true
                                else -> return null
                            }' @ [495:46] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'descriptor' @ [496:33] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'outerClassDescriptor' @ [496:47] ==> val outerClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[LocalVariableDescriptor]

'descriptor' @ [497:33] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'isAncestorOf' @ [497:45] ==> public fun DeclarationDescriptor.isAncestorOf(descriptor: DeclarationDescriptor, strict: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'outerClassDescriptor' @ [497:58] ==> val outerClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[LocalVariableDescriptor]

'ExplicitThis' @ [500:61] ==> public constructor ExplicitThis(expression: KtThisExpression, isIndirectOuter: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ExplicitThis[ClassConstructorDescriptorImpl]

'element' @ [500:74] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[ValueParameterDescriptorImpl]

'isIndirect' @ [500:83] ==> val isIndirect: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'element' @ [503:48] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[ValueParameterDescriptorImpl]

'getResolvedCall' @ [503:56] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [503:72] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[LocalVariableDescriptor]

'resolvedCall' @ [504:52] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'dispatchReceiver' @ [504:65] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'resolvedCall' @ [505:53] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'extensionReceiver' @ [505:66] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'when (outerClassDescriptor) {
                                dispatchReceiver?.declarationDescriptor -> extensionReceiver != null
                                extensionReceiver?.declarationDescriptor -> dispatchReceiver != null
                                else -> {
                                    isIndirect = true
                                    when {
                                        dispatchReceiver?.declarationDescriptor?.isAncestorOf(outerClassDescriptor, true) ?: false ->
                                            extensionReceiver != null
                                        extensionReceiver?.declarationDescriptor?.isAncestorOf(outerClassDescriptor, true) ?: false ->
                                            dispatchReceiver != null
                                        else -> return null
                                    }
                                }
                            }' @ [507:52] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'outerClassDescriptor' @ [507:58] ==> val outerClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[LocalVariableDescriptor]

'dispatchReceiver' @ [508:33] ==> val dispatchReceiver: ImplicitReceiver? defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'declarationDescriptor' @ [508:51] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'extensionReceiver' @ [508:76] ==> val extensionReceiver: ImplicitReceiver? defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'extensionReceiver' @ [509:33] ==> val extensionReceiver: ImplicitReceiver? defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'declarationDescriptor' @ [509:52] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'dispatchReceiver' @ [509:77] ==> val dispatchReceiver: ImplicitReceiver? defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'isIndirect' @ [511:37] ==> var isIndirect: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'when {
                                        dispatchReceiver?.declarationDescriptor?.isAncestorOf(outerClassDescriptor, true) ?: false ->
                                            extensionReceiver != null
                                        extensionReceiver?.declarationDescriptor?.isAncestorOf(outerClassDescriptor, true) ?: false ->
                                            dispatchReceiver != null
                                        else -> return null
                                    }' @ [512:37] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'dispatchReceiver' @ [513:41] ==> val dispatchReceiver: ImplicitReceiver? defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'declarationDescriptor' @ [513:59] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'isAncestorOf' @ [513:82] ==> public fun DeclarationDescriptor.isAncestorOf(descriptor: DeclarationDescriptor, strict: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'outerClassDescriptor' @ [513:95] ==> val outerClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[LocalVariableDescriptor]

'extensionReceiver' @ [514:45] ==> val extensionReceiver: ImplicitReceiver? defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'extensionReceiver' @ [515:41] ==> val extensionReceiver: ImplicitReceiver? defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'declarationDescriptor' @ [515:60] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'isAncestorOf' @ [515:83] ==> public fun DeclarationDescriptor.isAncestorOf(descriptor: DeclarationDescriptor, strict: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'outerClassDescriptor' @ [515:96] ==> val outerClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[LocalVariableDescriptor]

'dispatchReceiver' @ [516:45] ==> val dispatchReceiver: ImplicitReceiver? defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'ImplicitReceiver' @ [521:61] ==> public constructor ImplicitReceiver(callElement: KtElement, isIndirectOuter: Boolean, isDoubleReceiver: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver[ClassConstructorDescriptorImpl]

'resolvedCall' @ [521:78] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'call' @ [521:91] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'callElement' @ [521:96] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'isIndirect' @ [521:109] ==> var isIndirect: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'isDoubleReceiver' @ [521:121] ==> val isDoubleReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.getOuterInstanceReference[LocalVariableDescriptor]

'getOuterInstanceReference' @ [528:21] ==> private final fun getOuterInstanceReference(element: PsiElement): OuterInstanceReferenceUsageInfo? defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>[SimpleFunctionDescriptorImpl]

'element' @ [528:47] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'let' @ [528:57] ==> @InlineOnly public inline fun <T, R> OuterInstanceReferenceUsageInfo.let(block: (OuterInstanceReferenceUsageInfo) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OuterInstanceReferenceUsageInfo
    <R> -> Nothing

'invoke' @ [529:25] ==> public abstract operator fun invoke(p1: OuterInstanceReferenceUsageInfo): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [529:30] ==> value-parameter it: OuterInstanceReferenceUsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.visitElement.<anonymous>[ValueParameterDescriptorImpl]

'found' @ [530:25] ==> var found: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[LocalVariableDescriptor]

'stopAtFirst' @ [531:29] ==> value-parameter stopAtFirst: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[ValueParameterDescriptorImpl]

'stopWalking' @ [531:42] ==> public open fun stopWalking(): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>[JavaMethodDescriptor]

'super' @ [534:21] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitElement' @ [534:27] ==> public open fun visitElement(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiRecursiveElementWalkingVisitor[JavaMethodDescriptor]

'element' @ [534:40] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'found' @ [538:12] ==> var found: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.traverseOuterInstanceReferences[LocalVariableDescriptor]

'SmartList' @ [542:18] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> OuterInstanceReferenceUsageInfo

'traverseOuterInstanceReferences' @ [543:5] ==> @JvmOverloads public fun traverseOuterInstanceReferences(member: KtNamedDeclaration, stopAtFirst: Boolean, body: (OuterInstanceReferenceUsageInfo) -> Unit = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'member' @ [543:37] ==> value-parameter member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.collectOuterInstanceReferences[ValueParameterDescriptorImpl]

'result' @ [543:54] ==> val result: SmartList<OuterInstanceReferenceUsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.collectOuterInstanceReferences[LocalVariableDescriptor]

'it' @ [543:64] ==> value-parameter it: OuterInstanceReferenceUsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.collectOuterInstanceReferences.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [544:12] ==> val result: SmartList<OuterInstanceReferenceUsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.collectOuterInstanceReferences[LocalVariableDescriptor]

