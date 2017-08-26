'AnAction' @ [39:43] ==> public constructor AnAction() defined in com.intellij.openapi.actionSystem.AnAction[JavaClassConstructorDescriptor]

'e' @ [41:23] ==> value-parameter e: AnActionEvent? defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.actionPerformed[ValueParameterDescriptorImpl]

'project' @ [41:26] ==> public final val AnActionEvent.project: Project?[MyPropertyDescriptor]

'e' @ [42:23] ==> value-parameter e: AnActionEvent? defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.actionPerformed[ValueParameterDescriptorImpl]

'getData' @ [42:25] ==> @Nullable public open fun <T : (Any..Any?)> getData(@NotNull p0: DataKey<(PsiFile..PsiFile?)>): PsiFile? defined in com.intellij.openapi.actionSystem.AnActionEvent[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiFile

'PSI_FILE' @ [42:48] ==> public final val PSI_FILE: (DataKey<(PsiFile..PsiFile?)>..DataKey<(PsiFile..PsiFile?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'psiFile' @ [44:20] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.actionPerformed[LocalVariableDescriptor]

'findModuleDescriptor' @ [44:28] ==> public fun KtElement.findModuleDescriptor(): ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'showInputDialog' @ [45:31] ==> @Nullable public open fun showInputDialog(p0: (String..String?), @Nls p1: (String..String?), @Nullable p2: Icon?): String? defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'getQuestionIcon' @ [45:118] ==> @NotNull public open fun getQuestionIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'fromSegments' @ [47:33] ==> @NotNull public open fun fromSegments(@NotNull p0: (MutableList<(String..String?)>..List<(String..String?)>)): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'result' @ [47:46] ==> val result: String? defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.actionPerformed[LocalVariableDescriptor]

'split' @ [47:55] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'desc' @ [48:13] ==> val desc: ModuleDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.actionPerformed[LocalVariableDescriptor]

'getPackage' @ [48:18] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'fqName' @ [48:29] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.actionPerformed[LocalVariableDescriptor]

'getInstance' @ [54:25] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'runProcessWithProgressSynchronously' @ [54:39] ==> public final fun runProcessWithProgressSynchronously(@NotNull p0: () -> Unit, @NotNull @Nls p1: String, p2: Boolean, @Nullable p3: Project?): Boolean defined in com.intellij.openapi.progress.ProgressManager[MyFunctionDescriptor]

'runReadAction' @ [56:21] ==> public fun <T> runReadAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'getInstance' @ [57:41] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'progressIndicator' @ [57:55] ==> public final val ProgressManager.progressIndicator: (ProgressIndicator..ProgressIndicator?)[MyPropertyDescriptor]

'isIndeterminate' @ [57:73] ==> public final var ProgressIndicator.isIndeterminate: Boolean[MyPropertyDescriptor]

'processAllDescriptors' @ [58:25] ==> private final fun processAllDescriptors(desc: DeclarationDescriptor, project: Project): Unit defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction[SimpleFunctionDescriptorImpl]

'packageDesc' @ [58:47] ==> val packageDesc: PackageViewDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.actionPerformed[LocalVariableDescriptor]

'project' @ [58:60] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.actionPerformed[LocalVariableDescriptor]

'project' @ [63:17] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.actionPerformed[LocalVariableDescriptor]

'mutableSetOf' @ [68:25] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'mutableSetOf' @ [70:34] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'desc' @ [73:17] ==> value-parameter desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[ValueParameterDescriptorImpl]

'processed' @ [73:25] ==> val processed: MutableSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'progress' @ [74:13] ==> public open fun progress(@NotNull p0: String, @Nullable p1: String?): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'processed' @ [74:44] ==> val processed: MutableSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'size' @ [74:54] ==> public abstract val size: Int defined in kotlin.collections.MutableSet[DeserializedPropertyDescriptor]

'pFunctions' @ [74:61] ==> var pFunctions: Int defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'matchedDescriptors' @ [74:74] ==> val matchedDescriptors: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'size' @ [74:93] ==> public abstract val size: Int defined in kotlin.collections.MutableSet[DeserializedPropertyDescriptor]

'desc' @ [74:103] ==> value-parameter desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[ValueParameterDescriptorImpl]

'when (desc) {

                is ModuleDescriptor -> recursive(desc.getPackage(FqName("java")))
                is ClassDescriptor -> desc.unsubstitutedMemberScope.getContributedDescriptors { true }.forEach(::recursive)
                is PackageViewDescriptor -> desc.memberScope.getContributedDescriptors { true }.forEach(::recursive)

                is FunctionDescriptor -> {
                    if (desc.isFromJava) {
                        val name = desc.fqNameUnsafe.shortName().asString()
                        if (name.length > 3 &&
                            ((name.startsWith("get") && desc.valueParameters.isEmpty() && desc.returnType != null) ||
                             (name.startsWith("set") && desc.valueParameters.size == 1))) {
                            if (desc in matchedDescriptors) return
                            matchedDescriptors += desc
                        }
                    }
                    pFunctions++
                    return
                }

            }' @ [75:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'desc' @ [75:19] ==> value-parameter desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[ValueParameterDescriptorImpl]

'recursive' @ [77:40] ==> local final fun recursive(desc: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[SimpleFunctionDescriptorImpl]

'desc' @ [77:50] ==> value-parameter desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[ValueParameterDescriptorImpl]

'getPackage' @ [77:55] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'FqName' @ [77:66] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'desc' @ [78:39] ==> value-parameter desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[ValueParameterDescriptorImpl]

'unsubstitutedMemberScope' @ [78:44] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedDescriptors' @ [78:69] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'forEach' @ [78:104] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'desc' @ [79:45] ==> value-parameter desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[ValueParameterDescriptorImpl]

'memberScope' @ [79:50] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [79:62] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'forEach' @ [79:97] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'desc' @ [82:25] ==> value-parameter desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[ValueParameterDescriptorImpl]

'isFromJava' @ [82:30] ==> public val CallableMemberDescriptor.isFromJava: Boolean defined in org.jetbrains.kotlin.load.java[DeserializedPropertyDescriptor]

'desc' @ [83:36] ==> value-parameter desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[ValueParameterDescriptorImpl]

'fqNameUnsafe' @ [83:41] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'shortName' @ [83:54] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'asString' @ [83:66] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [84:29] ==> val name: String defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[LocalVariableDescriptor]

'length' @ [84:34] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'name' @ [85:31] ==> val name: String defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[LocalVariableDescriptor]

'startsWith' @ [85:36] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'desc' @ [85:57] ==> value-parameter desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[ValueParameterDescriptorImpl]

'valueParameters' @ [85:62] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [85:78] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'desc' @ [85:91] ==> value-parameter desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[ValueParameterDescriptorImpl]

'returnType' @ [85:96] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'name' @ [86:31] ==> val name: String defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[LocalVariableDescriptor]

'startsWith' @ [86:36] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'desc' @ [86:57] ==> value-parameter desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[ValueParameterDescriptorImpl]

'valueParameters' @ [86:62] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [86:78] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'desc' @ [87:33] ==> value-parameter desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[ValueParameterDescriptorImpl]

'matchedDescriptors' @ [87:41] ==> val matchedDescriptors: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'matchedDescriptors' @ [88:29] ==> val matchedDescriptors: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'desc' @ [88:51] ==> value-parameter desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[ValueParameterDescriptorImpl]

'pFunctions' @ [91:21] ==> var pFunctions: Int defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'processed' @ [96:13] ==> val processed: MutableSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'desc' @ [96:26] ==> value-parameter desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.recursive[ValueParameterDescriptorImpl]

'recursive' @ [98:9] ==> local final fun recursive(desc: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[SimpleFunctionDescriptorImpl]

'desc' @ [98:19] ==> value-parameter desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[ValueParameterDescriptorImpl]

'mutableSetOf' @ [99:33] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'matchedDescriptors' @ [100:9] ==> val matchedDescriptors: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'flatMapTo' @ [100:28] ==> public inline fun <T, R, C : MutableCollection<in FunctionDescriptor>> Iterable<FunctionDescriptor>.flatMapTo(destination: MutableSet<FunctionDescriptor>, transform: (FunctionDescriptor) -> Iterable<FunctionDescriptor>): MutableSet<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> FunctionDescriptor
    <C : MutableCollection<in R>> -> MutableSet<FunctionDescriptor>

'resultDescriptors' @ [100:38] ==> val resultDescriptors: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'sequenceOf' @ [101:13] ==> public fun <T> sequenceOf(vararg elements: FunctionDescriptor): Sequence<FunctionDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'it' @ [101:24] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [101:30] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [101:33] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'toTypedArray' @ [101:55] ==> public inline fun <reified T> Collection<(FunctionDescriptor..FunctionDescriptor?)>.toTypedArray(): Array<(FunctionDescriptor..FunctionDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'asIterable' @ [101:72] ==> public fun <T> Sequence<FunctionDescriptor>.asIterable(): Iterable<FunctionDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'println' @ [103:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'resultDescriptors' @ [103:26] ==> val resultDescriptors: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'size' @ [103:44] ==> public abstract val size: Int defined in kotlin.collections.MutableSet[DeserializedPropertyDescriptor]

'this' @ [107:21] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.isTrivial[ReceiverParameterDescriptorImpl]

'text' @ [107:26] ==> public final val PsiMethod.text: (String..String?)[MyPropertyDescriptor]

't' @ [108:21] ==> val t: (String..String?) defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.isTrivial[LocalVariableDescriptor]

'indexOf' @ [108:23] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

't' @ [109:21] ==> val t: (String..String?) defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.isTrivial[LocalVariableDescriptor]

'lastIndexOf' @ [109:23] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (s != e && s != -1) t.substring(s, e).lines().size <= 3 else true' @ [110:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

's' @ [110:24] ==> val s: Int defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.isTrivial[LocalVariableDescriptor]

'e' @ [110:29] ==> val e: Int defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.isTrivial[LocalVariableDescriptor]

's' @ [110:34] ==> val s: Int defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.isTrivial[LocalVariableDescriptor]

'-' @ [110:39] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

't' @ [110:43] ==> val t: (String..String?) defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.isTrivial[LocalVariableDescriptor]

'substring' @ [110:45] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

's' @ [110:55] ==> val s: Int defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.isTrivial[LocalVariableDescriptor]

'e' @ [110:58] ==> val e: Int defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.isTrivial[LocalVariableDescriptor]

'lines' @ [110:61] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'size' @ [110:69] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'mutableMapOf' @ [114:38] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<FunctionDescriptor, PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FunctionDescriptor
    <V> -> PsiMethod

'resultDescriptors' @ [118:9] ==> val resultDescriptors: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'forEach' @ [118:27] ==> @HidesMembers public inline fun <T> Iterable<FunctionDescriptor>.forEach(action: (FunctionDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'progress' @ [119:13] ==> public open fun progress(@NotNull p0: String, @Nullable p1: String?): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'i' @ [119:33] ==> var i: Int defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'resultDescriptors' @ [119:43] ==> val resultDescriptors: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'size' @ [119:61] ==> public abstract val size: Int defined in kotlin.collections.MutableSet[DeserializedPropertyDescriptor]

'desc' @ [119:71] ==> value-parameter desc: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'DescriptorToSourceUtilsIde' @ [120:26] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAllDeclarations' @ [120:53] ==> public final fun getAllDeclarations(project: Project, targetDescriptor: DeclarationDescriptor, builtInsSearchScope: GlobalSearchScope? = ...): Collection<PsiElement> defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [120:72] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[ValueParameterDescriptorImpl]

'desc' @ [120:81] ==> value-parameter desc: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'filterIsInstance' @ [121:35] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> PsiMethod

'firstOrNull' @ [122:35] ==> public fun <T> List<PsiMethod>.firstOrNull(): PsiMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'source' @ [123:28] ==> val source: PsiMethod defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[LocalVariableDescriptor]

'modifierList' @ [123:35] ==> public final val PsiMethod.modifierList: PsiModifierList[MyPropertyDescriptor]

'hasModifierProperty' @ [123:48] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String): Boolean defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'ABSTRACT' @ [123:80] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'!' @ [124:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'abstract' @ [124:18] ==> val abstract: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[LocalVariableDescriptor]

'!' @ [125:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'source' @ [125:22] ==> val source: PsiMethod defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[LocalVariableDescriptor]

'isTrivial' @ [125:29] ==> local final fun PsiMethod.isTrivial(): Boolean defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[SimpleFunctionDescriptorImpl]

'descriptorToPsiBinding' @ [126:21] ==> val descriptorToPsiBinding: MutableMap<FunctionDescriptor, PsiMethod> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'desc' @ [126:44] ==> value-parameter desc: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [126:52] ==> val source: PsiMethod defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[LocalVariableDescriptor]

'mutableSetOf' @ [131:26] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'i' @ [132:9] ==> var i: Int defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'descriptorToPsiBinding' @ [133:9] ==> val descriptorToPsiBinding: MutableMap<FunctionDescriptor, PsiMethod> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'forEach' @ [133:32] ==> public final fun forEach(p0: (FunctionDescriptor, PsiMethod) -> Unit): Unit defined in kotlin.collections.MutableMap[MyFunctionDescriptor]

'progress' @ [134:13] ==> public open fun progress(@NotNull p0: String, @Nullable p1: String?): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'i' @ [134:33] ==> var i: Int defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'descriptorToPsiBinding' @ [134:43] ==> val descriptorToPsiBinding: MutableMap<FunctionDescriptor, PsiMethod> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'size' @ [134:66] ==> public abstract val size: Int defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

't' @ [134:76] ==> value-parameter t: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[ValueParameterDescriptorImpl]

't' @ [135:31] ==> value-parameter t: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [135:33] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'descriptors' @ [137:13] ==> val descriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>) defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[LocalVariableDescriptor]

'forEach' @ [137:25] ==> @HidesMembers public inline fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.forEach(action: ((FunctionDescriptor..FunctionDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'DescriptorToSourceUtilsIde' @ [138:30] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAllDeclarations' @ [138:57] ==> public final fun getAllDeclarations(project: Project, targetDescriptor: DeclarationDescriptor, builtInsSearchScope: GlobalSearchScope? = ...): Collection<PsiElement> defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [138:76] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[ValueParameterDescriptorImpl]

'it' @ [138:85] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'filterIsInstance' @ [138:89] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> PsiMethod

'firstOrNull' @ [138:119] ==> public fun <T> List<PsiMethod>.firstOrNull(): PsiMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'source' @ [139:21] ==> val source: PsiMethod? defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>.<anonymous>[LocalVariableDescriptor]

'source' @ [140:25] ==> val source: PsiMethod? defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>.<anonymous>[LocalVariableDescriptor]

'body' @ [140:32] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'source' @ [140:48] ==> val source: PsiMethod? defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>.<anonymous>[LocalVariableDescriptor]

'hasModifierProperty' @ [140:55] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'ABSTRACT' @ [140:87] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'nonTrivial' @ [141:25] ==> val nonTrivial: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'it' @ [141:39] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'impl' @ [142:21] ==> var impl: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[LocalVariableDescriptor]

'u' @ [145:17] ==> value-parameter u: PsiMethod defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [145:19] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'!' @ [146:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'impl' @ [146:22] ==> var impl: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[LocalVariableDescriptor]

'nonTrivial' @ [147:21] ==> val nonTrivial: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

't' @ [147:35] ==> value-parameter t: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'nonTrivial' @ [149:9] ==> val nonTrivial: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'forEach' @ [149:20] ==> @HidesMembers public inline fun <T> Iterable<FunctionDescriptor>.forEach(action: (FunctionDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'println' @ [150:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'nonTrivial' @ [150:39] ==> val nonTrivial: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.processAllDescriptors[LocalVariableDescriptor]

'size' @ [150:50] ==> public abstract val size: Int defined in kotlin.collections.MutableSet[DeserializedPropertyDescriptor]

'if (!KotlinInternalMode.enabled) {
            e.presentation.isVisible = false
            e.presentation.isEnabled = false
        }
        else {
            e.presentation.isVisible = true
            e.presentation.isEnabled = e.getData(CommonDataKeys.PSI_FILE) is KtFile
        }' @ [154:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [154:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KotlinInternalMode' @ [154:14] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [154:33] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[DeserializedPropertyDescriptor]

'e' @ [155:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.update[ValueParameterDescriptorImpl]

'presentation' @ [155:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isVisible' @ [155:28] ==> public final var Presentation.isVisible: Boolean[MyPropertyDescriptor]

'e' @ [156:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.update[ValueParameterDescriptorImpl]

'presentation' @ [156:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isEnabled' @ [156:28] ==> public final var Presentation.isEnabled: Boolean[MyPropertyDescriptor]

'e' @ [159:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.update[ValueParameterDescriptorImpl]

'presentation' @ [159:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isVisible' @ [159:28] ==> public final var Presentation.isVisible: Boolean[MyPropertyDescriptor]

'e' @ [160:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.update[ValueParameterDescriptorImpl]

'presentation' @ [160:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isEnabled' @ [160:28] ==> public final var Presentation.isEnabled: Boolean[MyPropertyDescriptor]

'e' @ [160:40] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.SearchNotPropertyCandidatesAction.update[ValueParameterDescriptorImpl]

'getData' @ [160:42] ==> @Nullable public open fun <T : (Any..Any?)> getData(@NotNull p0: DataKey<(PsiFile..PsiFile?)>): PsiFile? defined in com.intellij.openapi.actionSystem.AnActionEvent[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiFile

'PSI_FILE' @ [160:65] ==> public final val PSI_FILE: (DataKey<(PsiFile..PsiFile?)>..DataKey<(PsiFile..PsiFile?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

