'when (targetContainer) {
                is KtFile -> targetContainer.add(originalElement) as KtNamedDeclaration
                is KtClassOrObject -> targetContainer.addDeclaration(originalElement)
                else -> error("Unexpected element: ${targetContainer.getElementTextWithContext()}")
            }' @ [63:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtNamedDeclaration, entry1: KtNamedDeclaration, entry2: KtNamedDeclaration): KtNamedDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtNamedDeclaration

'targetContainer' @ [63:26] ==> value-parameter targetContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover.Default.invoke[ValueParameterDescriptorImpl]

'targetContainer' @ [64:30] ==> value-parameter targetContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover.Default.invoke[ValueParameterDescriptorImpl]

'add' @ [64:46] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'originalElement' @ [64:50] ==> value-parameter originalElement: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover.Default.invoke[ValueParameterDescriptorImpl]

'targetContainer' @ [65:39] ==> value-parameter targetContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover.Default.invoke[ValueParameterDescriptorImpl]

'addDeclaration' @ [65:55] ==> public final inline fun <reified T : KtDeclaration> addDeclaration(declaration: KtNamedDeclaration): KtNamedDeclaration defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : KtDeclaration> -> KtNamedDeclaration

'originalElement' @ [65:70] ==> value-parameter originalElement: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover.Default.invoke[ValueParameterDescriptorImpl]

'error' @ [66:25] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'targetContainer' @ [66:54] ==> value-parameter targetContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover.Default.invoke[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [66:70] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'apply' @ [67:15] ==> @InlineOnly public inline fun <T> KtNamedDeclaration.apply(block: KtNamedDeclaration.() -> Unit): KtNamedDeclaration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'originalElement' @ [68:33] ==> value-parameter originalElement: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover.Default.invoke[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [68:49] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'if (container is KtObjectDeclaration && container.isCompanion() && container.declarations.singleOrNull() == originalElement) {
                    container.deleteSingle()
                }
                else {
                    originalElement.deleteSingle()
                }' @ [69:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'container' @ [69:21] ==> val container: KtClassOrObject? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover.Default.invoke.<anonymous>[LocalVariableDescriptor]

'container' @ [69:57] ==> val container: KtClassOrObject? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover.Default.invoke.<anonymous>[LocalVariableDescriptor]

'isCompanion' @ [69:67] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'container' @ [69:84] ==> val container: KtClassOrObject? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover.Default.invoke.<anonymous>[LocalVariableDescriptor]

'declarations' @ [69:94] ==> public final val KtObjectDeclaration.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'singleOrNull' @ [69:107] ==> public fun <T> List<KtDeclaration>.singleOrNull(): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'originalElement' @ [69:125] ==> value-parameter originalElement: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover.Default.invoke[ValueParameterDescriptorImpl]

'container' @ [70:21] ==> val container: KtClassOrObject? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover.Default.invoke.<anonymous>[LocalVariableDescriptor]

'deleteSingle' @ [70:31] ==> public fun PsiElement.deleteSingle(): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'originalElement' @ [73:21] ==> value-parameter originalElement: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover.Default.invoke[ValueParameterDescriptorImpl]

'deleteSingle' @ [73:37] ==> public fun PsiElement.deleteSingle(): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'originalElement' @ [80:96] ==> value-parameter originalElement: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover.Idle.invoke[ValueParameterDescriptorImpl]

'JvmOverloads' @ [84:34] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'UsageInfo' @ [98:82] ==> public constructor UsageInfo(@NotNull p0: PsiElement) defined in com.intellij.usageView.UsageInfo[JavaClassConstructorDescriptor]

'element' @ [98:92] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ConflictUsageInfo.<init>[ValueParameterDescriptorImpl]

'e1' @ [102:13] ==> value-parameter e1: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ElementHashingStrategy.equals[ValueParameterDescriptorImpl]

'e2' @ [102:20] ==> value-parameter e2: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ElementHashingStrategy.equals[ValueParameterDescriptorImpl]

'e1' @ [104:13] ==> value-parameter e1: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ElementHashingStrategy.equals[ValueParameterDescriptorImpl]

'e2' @ [104:47] ==> value-parameter e2: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ElementHashingStrategy.equals[ValueParameterDescriptorImpl]

'e1' @ [105:20] ==> value-parameter e1: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ElementHashingStrategy.equals[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [105:23] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightDeclaration[DeserializedPropertyDescriptor]

'e2' @ [105:39] ==> value-parameter e2: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ElementHashingStrategy.equals[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [105:42] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightDeclaration[DeserializedPropertyDescriptor]

'e1' @ [105:58] ==> value-parameter e1: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ElementHashingStrategy.equals[ValueParameterDescriptorImpl]

'name' @ [105:61] ==> public final val <out T : KtDeclaration, out D : PsiElement> KtLightDeclaration<KtDeclaration, PsiElement>.name: String?[MyPropertyDescriptor]
Inferred types:
    <out T : KtDeclaration> -> KtDeclaration
    <out D : PsiElement> -> PsiElement

'e2' @ [105:69] ==> value-parameter e2: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ElementHashingStrategy.equals[ValueParameterDescriptorImpl]

'name' @ [105:72] ==> public final val <out T : KtDeclaration, out D : PsiElement> KtLightDeclaration<KtDeclaration, PsiElement>.name: String?[MyPropertyDescriptor]
Inferred types:
    <out T : KtDeclaration> -> KtDeclaration
    <out D : PsiElement> -> PsiElement

'e1' @ [107:16] ==> value-parameter e1: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ElementHashingStrategy.equals[ValueParameterDescriptorImpl]

'e2' @ [107:22] ==> value-parameter e2: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ElementHashingStrategy.equals[ValueParameterDescriptorImpl]

'when (e) {
            null -> 0
            is KtLightDeclaration<*, *> -> (e.kotlinOrigin?.hashCode() ?: 0) * 31 + (e.name?.hashCode() ?: 0)
            else -> e.hashCode()
        }' @ [111:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'e' @ [111:22] ==> value-parameter e: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ElementHashingStrategy.computeHashCode[ValueParameterDescriptorImpl]

'*' @ [113:44] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'e' @ [113:45] ==> value-parameter e: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ElementHashingStrategy.computeHashCode[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [113:47] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightDeclaration[DeserializedPropertyDescriptor]

'hashCode' @ [113:61] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.psi.KtDeclaration[DeserializedSimpleFunctionDescriptor]

'e' @ [113:86] ==> value-parameter e: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ElementHashingStrategy.computeHashCode[ValueParameterDescriptorImpl]

'name' @ [113:88] ==> public final val <out T : KtDeclaration, out D : PsiElement> KtLightDeclaration<KtDeclaration, PsiElement>.name: String?[MyPropertyDescriptor]
Inferred types:
    <out T : KtDeclaration> -> KtDeclaration
    <out D : PsiElement> -> PsiElement

'hashCode' @ [113:94] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'e' @ [114:21] ==> value-parameter e: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ElementHashingStrategy.computeHashCode[ValueParameterDescriptorImpl]

'hashCode' @ [114:23] ==> public open fun hashCode(): Int defined in com.intellij.psi.PsiElement[DeserializedSimpleFunctionDescriptor]

'Default' @ [121:34] ==> public object Default : Mover defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover[FakeCallableDescriptorForObject]

'BaseRefactoringProcessor' @ [121:45] ==> protected/*protected and package*/ constructor BaseRefactoringProcessor(@NotNull p0: Project) defined in com.intellij.refactoring.BaseRefactoringProcessor[JavaClassConstructorDescriptor]

'descriptor' @ [121:70] ==> value-parameter descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.<init>[ValueParameterDescriptorImpl]

'project' @ [121:81] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'descriptor' @ [127:25] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'project' @ [127:36] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'descriptor' @ [130:34] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'elementsToMove' @ [130:45] ==> public final val elementsToMove: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'filter' @ [130:60] ==> public inline fun <T> Iterable<KtNamedDeclaration>.filter(predicate: (KtNamedDeclaration) -> Boolean): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'e' @ [130:74] ==> value-parameter e: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.elementsToMove.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [130:76] ==> public final val KtNamedDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'descriptor' @ [130:86] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'moveTarget' @ [130:97] ==> public final val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'getTargetPsiIfExists' @ [130:108] ==> public abstract fun getTargetPsiIfExists(originalPsi: PsiElement): KtElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTarget[SimpleFunctionDescriptorImpl]

'e' @ [130:129] ==> value-parameter e: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.elementsToMove.<anonymous>[ValueParameterDescriptorImpl]

'elementsToMove' @ [131:53] ==> private final val elementsToMove: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'groupBy' @ [132:14] ==> public inline fun <T, K> Iterable<KtNamedDeclaration>.groupBy(keySelector: (KtNamedDeclaration) -> KtFile): Map<KtFile, List<KtNamedDeclaration>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <K> -> KtFile

'it' @ [132:24] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.kotlinToLightElementsBySourceFile.<anonymous>[ValueParameterDescriptorImpl]

'containingKtFile' @ [132:27] ==> public final val KtNamedDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'mapValues' @ [133:14] ==> public inline fun <K, V, R> Map<out KtFile, List<KtNamedDeclaration>>.mapValues(transform: (Map.Entry<KtFile, List<KtNamedDeclaration>>) -> Map<KtNamedDeclaration, List<PsiNamedElement>>): Map<KtFile, Map<KtNamedDeclaration, List<PsiNamedElement>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtFile
    <V> -> List<KtNamedDeclaration>
    <R> -> Map<KtNamedDeclaration, List<PsiNamedElement>>

'it' @ [133:26] ==> value-parameter it: Map.Entry<KtFile, List<KtNamedDeclaration>> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.kotlinToLightElementsBySourceFile.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [133:29] ==> public abstract val value: List<KtNamedDeclaration> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'keysToMap' @ [133:35] ==> public fun <K, V> Iterable<KtNamedDeclaration>.keysToMap(value: (KtNamedDeclaration) -> List<PsiNamedElement>): Map<KtNamedDeclaration, List<PsiNamedElement>> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtNamedDeclaration
    <V> -> List<PsiNamedElement>

'it' @ [133:47] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.kotlinToLightElementsBySourceFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toLightElements' @ [133:50] ==> public fun KtElement.toLightElements(): List<PsiNamedElement> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'ifEmpty' @ [133:68] ==> public inline fun <T, C : Collection<PsiNamedElement>> List<PsiNamedElement>.ifEmpty(body: () -> List<PsiNamedElement>): List<PsiNamedElement> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement
    <C : Collection<T>> -> List<PsiNamedElement>

'listOf' @ [133:78] ==> public fun <T> listOf(element: KtNamedDeclaration): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'it' @ [133:85] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.kotlinToLightElementsBySourceFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'MultiMap' @ [134:29] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> String

'REFACTORING_ID' @ [136:39] ==> public final val REFACTORING_ID: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.Companion[PropertyDescriptorImpl]

'descriptor' @ [139:37] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'moveTarget' @ [139:48] ==> public final val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'targetContainerFqName' @ [139:59] ==> public abstract val targetContainerFqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTarget[PropertyDescriptorImpl]

'let' @ [139:82] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> (String..String?)): (String..String?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> (kotlin.String..kotlin.String?)

'if (it.isRoot) UsageViewBundle.message("default.package.presentable.name") else it.asString()' @ [140:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'it' @ [140:17] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.createUsageViewDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'isRoot' @ [140:20] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'message' @ [140:44] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.usageView.UsageViewBundle[JavaMethodDescriptor]

'it' @ [140:93] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.createUsageViewDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [140:96] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'MoveMultipleElementsViewDescriptor' @ [142:16] ==> public constructor MoveMultipleElementsViewDescriptor(p0: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?), p1: (String..String?)) defined in com.intellij.refactoring.move.MoveMultipleElementsViewDescriptor[JavaClassConstructorDescriptor]

'elementsToMove' @ [142:51] ==> private final val elementsToMove: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'toTypedArray' @ [142:66] ==> public inline fun <reified T> Collection<KtNamedDeclaration>.toTypedArray(): Array<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtNamedDeclaration

'targetContainerFqName' @ [142:82] ==> val targetContainerFqName: String? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.createUsageViewDescriptor[LocalVariableDescriptor]

'conflicts' @ [145:51] ==> private final val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'entrySet' @ [145:61] ==> @NotNull public open fun entrySet(): (MutableSet<(MutableMap.MutableEntry<(PsiElement..PsiElement?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>..Map.Entry<(PsiElement..PsiElement?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>?)>..Set<(MutableMap.MutableEntry<(PsiElement..PsiElement?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>..Map.Entry<(PsiElement..PsiElement?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'map' @ [145:72] ==> public inline fun <T, R> Iterable<(MutableMap.MutableEntry<(PsiElement..PsiElement?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>..Map.Entry<(PsiElement..PsiElement?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>?)>.map(transform: ((MutableMap.MutableEntry<(PsiElement..PsiElement?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>..Map.Entry<(PsiElement..PsiElement?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>?)) -> ConflictUsageInfo): List<ConflictUsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableMap.MutableEntry<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (kotlin.collections.MutableCollection<(kotlin.String..kotlin.String?)>..kotlin.collections.Collection<(kotlin.String..kotlin.String?)>?)>..kotlin.collections.Map.Entry<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (kotlin.collections.MutableCollection<(kotlin.String..kotlin.String?)>..kotlin.collections.Collection<(kotlin.String..kotlin.String?)>?)>?)
    <R> -> ConflictUsageInfo

'ConflictUsageInfo' @ [145:78] ==> public constructor ConflictUsageInfo(element: PsiElement, messages: Collection<String>) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ConflictUsageInfo[ClassConstructorDescriptorImpl]

'it' @ [145:96] ==> value-parameter it: (MutableMap.MutableEntry<(PsiElement..PsiElement?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>..Map.Entry<(PsiElement..PsiElement?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.getConflictsAsUsages.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [145:99] ==> public abstract val key: (PsiElement..PsiElement?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'it' @ [145:104] ==> value-parameter it: (MutableMap.MutableEntry<(PsiElement..PsiElement?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>..Map.Entry<(PsiElement..PsiElement?), (MutableCollection<(String..String?)>..Collection<(String..String?)>?)>?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.getConflictsAsUsages.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [145:107] ==> public abstract val value: (MutableCollection<(String..String?)>..Collection<(String..String?)>?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'elementsToMove' @ [148:13] ==> private final val elementsToMove: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'isEmpty' @ [148:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'EMPTY_ARRAY' @ [148:56] ==> public final val EMPTY_ARRAY: (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>?) defined in com.intellij.usageView.UsageInfo[JavaPropertyDescriptor]

'descriptor' @ [150:32] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'moveTarget' @ [150:43] ==> public final val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'targetContainerFqName' @ [150:54] ==> public abstract val targetContainerFqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTarget[PropertyDescriptorImpl]

'asString' @ [150:77] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'kotlinToLightElements' @ [153:13] ==> value-parameter kotlinToLightElements: Map<KtNamedDeclaration, List<PsiNamedElement>> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages[ValueParameterDescriptorImpl]

'values' @ [153:35] ==> public abstract val values: Collection<List<PsiNamedElement>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'flatten' @ [153:42] ==> public fun <T> Iterable<Iterable<PsiNamedElement>>.flatten(): List<PsiNamedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'flatMapTo' @ [153:52] ==> public inline fun <T, R, C : MutableCollection<in UsageInfo>> Iterable<PsiNamedElement>.flatMapTo(destination: MutableCollection<UsageInfo>, transform: (PsiNamedElement) -> Iterable<UsageInfo>): MutableCollection<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement
    <R> -> UsageInfo
    <C : MutableCollection<in R>> -> MutableCollection<UsageInfo>

'result' @ [153:62] ==> value-parameter result: MutableCollection<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages[ValueParameterDescriptorImpl]

'getQualifiedName' @ [154:44] ==> @Contract public open fun getQualifiedName(@Nullable p0: String?, p1: (String..String?)): (String..String?) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'newContainerName' @ [154:61] ==> val newContainerName: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'lightElement' @ [154:79] ==> value-parameter lightElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [154:92] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'HashSet' @ [156:39] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiReference

'project' @ [157:36] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'projectScope' @ [157:44] ==> public fun Project.projectScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'search' @ [159:26] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'lightElement' @ [159:33] ==> value-parameter lightElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>[ValueParameterDescriptorImpl]

'projectScope' @ [159:47] ==> val projectScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>[LocalVariableDescriptor]

'mapNotNullTo' @ [160:26] ==> public inline fun <T, R : Any, C : MutableCollection<in UsageInfo>> Iterable<(PsiReference..PsiReference?)>.mapNotNullTo(destination: ArrayList<UsageInfo>, transform: ((PsiReference..PsiReference?)) -> UsageInfo?): ArrayList<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R : Any> -> UsageInfo
    <C : MutableCollection<in R>> -> ArrayList<UsageInfo>

'ArrayList' @ [160:39] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'if (foundReferences.add(ref) && elementsToMove.none { it.isAncestor(ref.element)}) {
                                createMoveUsageInfoIfPossible(ref, lightElement, true, false)
                            }
                            else null' @ [161:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UsageInfo?, elseBranch: UsageInfo?): UsageInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UsageInfo?

'foundReferences' @ [161:33] ==> val foundReferences: HashSet<PsiReference> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>[LocalVariableDescriptor]

'add' @ [161:49] ==> public open fun add(element: PsiReference): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'ref' @ [161:53] ==> value-parameter ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'elementsToMove' @ [161:61] ==> private final val elementsToMove: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'none' @ [161:76] ==> public inline fun <T> Iterable<KtNamedDeclaration>.none(predicate: (KtNamedDeclaration) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'it' @ [161:83] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAncestor' @ [161:86] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'ref' @ [161:97] ==> value-parameter ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [161:101] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'createMoveUsageInfoIfPossible' @ [162:33] ==> public fun createMoveUsageInfoIfPossible(reference: PsiReference, referencedElement: PsiElement, addImportToOriginalFile: Boolean, isInternal: Boolean): UsageInfo? defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'ref' @ [162:63] ==> value-parameter ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lightElement' @ [162:68] ==> value-parameter lightElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>[ValueParameterDescriptorImpl]

'lightElement' @ [167:28] ==> value-parameter lightElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>[ValueParameterDescriptorImpl]

'getKotlinFqName' @ [167:41] ==> public fun PsiElement.getKotlinFqName(): FqName? defined in org.jetbrains.kotlin.idea.refactoring.fqName[DeserializedSimpleFunctionDescriptor]

'asString' @ [167:60] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'name' @ [168:21] ==> val name: String? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>[LocalVariableDescriptor]

'findNonCodeUsages' @ [169:41] ==> public open fun findNonCodeUsages(p0: (PsiElement..PsiElement?), p1: (String..String?), p2: Boolean, p3: Boolean, p4: (String..String?), p5: (MutableCollection<(UsageInfo..UsageInfo?)>..Collection<(UsageInfo..UsageInfo?)>?)): Unit defined in com.intellij.refactoring.util.TextOccurrencesUtil[JavaMethodDescriptor]

'lightElement' @ [170:29] ==> value-parameter lightElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [171:29] ==> val name: String? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [172:29] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'searchInCommentsAndStrings' @ [172:40] ==> public final val searchInCommentsAndStrings: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'descriptor' @ [173:29] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'searchInNonCode' @ [173:40] ==> public final val searchInNonCode: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'newFqName' @ [174:29] ==> val newFqName: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>[LocalVariableDescriptor]

'results' @ [175:29] ==> val results: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>[LocalVariableDescriptor]

'EP_NAME' @ [179:34] ==> public final val EP_NAME: (ExtensionPointName<(MoveClassHandler..MoveClassHandler?)>..ExtensionPointName<(MoveClassHandler..MoveClassHandler?)>?) defined in com.intellij.refactoring.move.moveClassesOrPackages.MoveClassHandler[JavaPropertyDescriptor]

'extensions' @ [179:42] ==> public final val <T : (Any..Any?)> ExtensionPointName<(MoveClassHandler..MoveClassHandler?)>.extensions: (Array<(MoveClassHandler..MoveClassHandler?)>..Array<out (MoveClassHandler..MoveClassHandler?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.refactoring.move.moveClassesOrPackages.MoveClassHandler..com.intellij.refactoring.move.moveClassesOrPackages.MoveClassHandler?)

'forEach' @ [179:53] ==> public inline fun <T> Array<out (MoveClassHandler..MoveClassHandler?)>.forEach(action: ((MoveClassHandler..MoveClassHandler?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.refactoring.move.moveClassesOrPackages.MoveClassHandler..com.intellij.refactoring.move.moveClassesOrPackages.MoveClassHandler?)

'handler' @ [180:25] ==> value-parameter handler: (MoveClassHandler..MoveClassHandler?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'handler' @ [180:61] ==> value-parameter handler: (MoveClassHandler..MoveClassHandler?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'preprocessUsages' @ [180:69] ==> public abstract fun preprocessUsages(p0: (MutableCollection<(UsageInfo..UsageInfo?)>..Collection<(UsageInfo..UsageInfo?)>?)): Unit defined in com.intellij.refactoring.move.moveClassesOrPackages.MoveClassHandler[JavaMethodDescriptor]

'results' @ [180:86] ==> val results: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>[LocalVariableDescriptor]

'results' @ [183:17] ==> val results: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.collectUsages.<anonymous>[LocalVariableDescriptor]

'ArrayList' @ [187:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'MoveConflictChecker' @ [188:31] ==> public constructor MoveConflictChecker(project: Project, elementsToMove: Collection<KtElement>, moveTarget: KotlinMoveTarget, contextElement: KtElement, doNotGoIn: Collection<KtElement> = ..., allElementsToMove: Collection<PsiElement>? = ...) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[ClassConstructorDescriptorImpl]

'project' @ [189:17] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'elementsToMove' @ [190:17] ==> private final val elementsToMove: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'descriptor' @ [191:17] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'moveTarget' @ [191:28] ==> public final val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'elementsToMove' @ [192:17] ==> private final val elementsToMove: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'first' @ [192:32] ==> public fun <T> List<KtNamedDeclaration>.first(): KtNamedDeclaration defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'descriptor' @ [193:37] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'allElementsToMove' @ [193:48] ==> public final val allElementsToMove: List<PsiElement>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'component1' @ [195:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtFile, Map<KtNamedDeclaration, List<PsiNamedElement>>>.component1(): KtFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtFile
    <V> -> Map<KtNamedDeclaration, List<PsiNamedElement>>

'component2' @ [195:27] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtFile, Map<KtNamedDeclaration, List<PsiNamedElement>>>.component2(): Map<KtNamedDeclaration, List<PsiNamedElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtFile
    <V> -> Map<KtNamedDeclaration, List<PsiNamedElement>>

'kotlinToLightElementsBySourceFile' @ [195:53] ==> private final val kotlinToLightElementsBySourceFile: Map<KtFile, Map<KtNamedDeclaration, List<PsiNamedElement>>> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'LinkedHashSet' @ [196:34] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'LinkedHashSet' @ [197:34] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'if (descriptor.scanEntireFile) {
                val changeInfo = ContainerChangeInfo(
                        ContainerInfo.Package(sourceFile.packageFqName),
                        descriptor.moveTarget.targetContainerFqName?.let { ContainerInfo.Package(it) } ?: ContainerInfo.UnknownPackage
                )
                internalUsages += sourceFile.getInternalReferencesToUpdateOnPackageNameChange(changeInfo)
            }
            else {
                kotlinToLightElements.keys.forEach {
                    val packageNameInfo = descriptor.delegate.getContainerChangeInfo(it, descriptor.moveTarget)
                    internalUsages += it.getInternalReferencesToUpdateOnPackageNameChange(packageNameInfo)
                }
            }' @ [199:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [199:17] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'scanEntireFile' @ [199:28] ==> public final val scanEntireFile: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'ContainerChangeInfo' @ [200:34] ==> public constructor ContainerChangeInfo(oldContainer: ContainerInfo, newContainer: ContainerInfo) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerChangeInfo[ClassConstructorDescriptorImpl]

'Package' @ [201:39] ==> public constructor Package(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package[ClassConstructorDescriptorImpl]

'sourceFile' @ [201:47] ==> val sourceFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'packageFqName' @ [201:58] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'descriptor' @ [202:25] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'moveTarget' @ [202:36] ==> public final val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'targetContainerFqName' @ [202:47] ==> public abstract val targetContainerFqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTarget[PropertyDescriptorImpl]

'let' @ [202:70] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> ContainerInfo.Package): ContainerInfo.Package defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> Package

'Package' @ [202:90] ==> public constructor Package(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package[ClassConstructorDescriptorImpl]

'it' @ [202:98] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'UnknownPackage' @ [202:121] ==> public object UnknownPackage : ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo[FakeCallableDescriptorForObject]

'internalUsages' @ [204:17] ==> val internalUsages: LinkedHashSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'sourceFile' @ [204:35] ==> val sourceFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'getInternalReferencesToUpdateOnPackageNameChange' @ [204:46] ==> public fun KtElement.getInternalReferencesToUpdateOnPackageNameChange(containerChangeInfo: ContainerChangeInfo): List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'changeInfo' @ [204:95] ==> val changeInfo: ContainerChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'kotlinToLightElements' @ [207:17] ==> val kotlinToLightElements: Map<KtNamedDeclaration, List<PsiNamedElement>> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'keys' @ [207:39] ==> public abstract val keys: Set<KtNamedDeclaration> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'forEach' @ [207:44] ==> @HidesMembers public inline fun <T> Iterable<KtNamedDeclaration>.forEach(action: (KtNamedDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'descriptor' @ [208:43] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'delegate' @ [208:54] ==> public final val delegate: MoveDeclarationsDelegate defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'getContainerChangeInfo' @ [208:63] ==> public abstract fun getContainerChangeInfo(originalDeclaration: KtNamedDeclaration, moveTarget: KotlinMoveTarget): ContainerChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate[SimpleFunctionDescriptorImpl]

'it' @ [208:86] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [208:90] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'moveTarget' @ [208:101] ==> public final val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'internalUsages' @ [209:21] ==> val internalUsages: LinkedHashSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'it' @ [209:39] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'getInternalReferencesToUpdateOnPackageNameChange' @ [209:42] ==> public fun KtElement.getInternalReferencesToUpdateOnPackageNameChange(containerChangeInfo: ContainerChangeInfo): List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'packageNameInfo' @ [209:91] ==> val packageNameInfo: ContainerChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages.<anonymous>[LocalVariableDescriptor]

'internalUsages' @ [213:13] ==> val internalUsages: LinkedHashSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'descriptor' @ [213:31] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'delegate' @ [213:42] ==> public final val delegate: MoveDeclarationsDelegate defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'findInternalUsages' @ [213:51] ==> public open fun findInternalUsages(descriptor: MoveDeclarationsDescriptor): List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate[SimpleFunctionDescriptorImpl]

'descriptor' @ [213:70] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'collectUsages' @ [214:13] ==> local final fun collectUsages(kotlinToLightElements: Map<KtNamedDeclaration, List<PsiNamedElement>>, result: MutableCollection<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[SimpleFunctionDescriptorImpl]

'kotlinToLightElements' @ [214:27] ==> val kotlinToLightElements: Map<KtNamedDeclaration, List<PsiNamedElement>> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'externalUsages' @ [214:50] ==> val externalUsages: LinkedHashSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'conflictChecker' @ [215:13] ==> val conflictChecker: MoveConflictChecker defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'checkAllConflicts' @ [215:29] ==> public final fun checkAllConflicts(externalUsages: MutableSet<UsageInfo>, internalUsages: MutableSet<UsageInfo>, conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'externalUsages' @ [215:47] ==> val externalUsages: LinkedHashSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'internalUsages' @ [215:63] ==> val internalUsages: LinkedHashSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'conflicts' @ [215:79] ==> private final val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'descriptor' @ [216:13] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'delegate' @ [216:24] ==> public final val delegate: MoveDeclarationsDelegate defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'collectConflicts' @ [216:33] ==> public open fun collectConflicts(descriptor: MoveDeclarationsDescriptor, internalUsages: MutableSet<UsageInfo>, conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate[SimpleFunctionDescriptorImpl]

'descriptor' @ [216:50] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'internalUsages' @ [216:62] ==> val internalUsages: LinkedHashSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'conflicts' @ [216:78] ==> private final val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'usages' @ [218:13] ==> val usages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'internalUsages' @ [218:23] ==> val internalUsages: LinkedHashSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'usages' @ [219:13] ==> val usages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'externalUsages' @ [219:23] ==> val externalUsages: LinkedHashSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'removeDuplicatedUsages' @ [222:30] ==> @NotNull public open fun removeDuplicatedUsages(@NotNull p0: (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>)): (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>) defined in com.intellij.usageView.UsageViewUtil[JavaMethodDescriptor]

'usages' @ [222:53] ==> val usages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.findUsages[LocalVariableDescriptor]

'toTypedArray' @ [222:60] ==> public inline fun <reified T> Collection<UsageInfo>.toTypedArray(): Array<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> UsageInfo

'showConflicts' @ [226:16] ==> protected/*protected and package*/ open fun showConflicts(@NotNull p0: MultiMap<(PsiElement..PsiElement?), (String..String?)>, @Nullable p1: (Array<(UsageInfo..UsageInfo?)>?..Array<out (UsageInfo..UsageInfo?)>?)): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[JavaMethodDescriptor]

'conflicts' @ [226:30] ==> private final val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'refUsages' @ [226:41] ==> value-parameter refUsages: Ref<Array<UsageInfo>> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.preprocessUsages[ValueParameterDescriptorImpl]

'get' @ [226:51] ==> public final fun get(): (Array<UsageInfo>..Array<UsageInfo>?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'doPerformRefactoring' @ [229:69] ==> internal final fun doPerformRefactoring(usages: List<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[SimpleFunctionDescriptorImpl]

'usages' @ [229:90] ==> value-parameter usages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.performRefactoring[ValueParameterDescriptorImpl]

'toList' @ [229:97] ==> public fun <T> Array<out UsageInfo>.toList(): List<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'moveTarget' @ [233:35] ==> value-parameter moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring.moveDeclaration[ValueParameterDescriptorImpl]

'getOrCreateTargetPsi' @ [233:46] ==> public abstract fun getOrCreateTargetPsi(originalPsi: PsiElement): KtElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTarget[SimpleFunctionDescriptorImpl]

'declaration' @ [233:67] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring.moveDeclaration[ValueParameterDescriptorImpl]

'AssertionError' @ [234:44] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'declaration' @ [234:95] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring.moveDeclaration[ValueParameterDescriptorImpl]

'java' @ [234:114] ==> public val <T> KClass<out KtNamedDeclaration>.java: Class<out KtNamedDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'declaration' @ [234:123] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring.moveDeclaration[ValueParameterDescriptorImpl]

'text' @ [234:135] ==> public final val KtNamedDeclaration.text: (String..String?)[MyPropertyDescriptor]

'descriptor' @ [235:13] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'delegate' @ [235:24] ==> public final val delegate: MoveDeclarationsDelegate defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'preprocessDeclaration' @ [235:33] ==> public open fun preprocessDeclaration(descriptor: MoveDeclarationsDescriptor, originalDeclaration: KtNamedDeclaration): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate[SimpleFunctionDescriptorImpl]

'descriptor' @ [235:55] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'declaration' @ [235:67] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring.moveDeclaration[ValueParameterDescriptorImpl]

'invoke' @ [236:20] ==> public abstract fun invoke(p1: KtNamedDeclaration, p2: KtElement): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover[FunctionInvokeDescriptor]

'declaration' @ [236:26] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring.moveDeclaration[ValueParameterDescriptorImpl]

'targetContainer' @ [236:39] ==> val targetContainer: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring.moveDeclaration[LocalVariableDescriptor]

'apply' @ [236:56] ==> @InlineOnly public inline fun <T> KtNamedDeclaration.apply(block: KtNamedDeclaration.() -> Unit): KtNamedDeclaration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'addToBeShortenedDescendantsToWaitingSet' @ [237:17] ==> public fun KtElement.addToBeShortenedDescendantsToWaitingSet(): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'component1' @ [241:14] ==> public final operator fun component1(): List<UsageInfo> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [241:33] ==> public final operator fun component2(): List<UsageInfo> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'usages' @ [241:51] ==> value-parameter usages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[ValueParameterDescriptorImpl]

'partition' @ [241:58] ==> public inline fun <T> Iterable<UsageInfo>.partition(predicate: (UsageInfo) -> Boolean): Pair<List<UsageInfo>, List<UsageInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'it' @ [241:70] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [241:95] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'isInternal' @ [241:98] ==> public abstract val isInternal: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.KotlinMoveUsage[PropertyDescriptorImpl]

'ArrayList' @ [242:33] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'markInternalUsages' @ [244:9] ==> internal fun markInternalUsages(usages: Collection<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'oldInternalUsages' @ [244:28] ==> val oldInternalUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'ArrayList' @ [246:31] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (UsageInfo..UsageInfo?)>..Collection<(UsageInfo..UsageInfo?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'externalUsages' @ [246:41] ==> val externalUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'descriptor' @ [249:13] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'delegate' @ [249:24] ==> public final val delegate: MoveDeclarationsDelegate defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'preprocessUsages' @ [249:33] ==> public open fun preprocessUsages(descriptor: MoveDeclarationsDescriptor, usages: List<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate[SimpleFunctionDescriptorImpl]

'descriptor' @ [249:50] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'usages' @ [249:62] ==> value-parameter usages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[ValueParameterDescriptorImpl]

'THashMap' @ [251:43] ==> public constructor THashMap<K : (Any..Any?), V : (Any..Any?)>(p0: (TObjectHashingStrategy<(PsiElement..PsiElement?)>..TObjectHashingStrategy<(PsiElement..PsiElement?)>?)) defined in gnu.trove.THashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> PsiElement

'ElementHashingStrategy' @ [251:76] ==> private object ElementHashingStrategy : TObjectHashingStrategy<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations in file MoveKotlinDeclarationsProcessor.kt[FakeCallableDescriptorForObject]

'ArrayList' @ [253:35] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtNamedDeclaration

'component1' @ [255:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtFile, Map<KtNamedDeclaration, List<PsiNamedElement>>>.component1(): KtFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtFile
    <V> -> Map<KtNamedDeclaration, List<PsiNamedElement>>

'component2' @ [255:31] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtFile, Map<KtNamedDeclaration, List<PsiNamedElement>>>.component2(): Map<KtNamedDeclaration, List<PsiNamedElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtFile
    <V> -> Map<KtNamedDeclaration, List<PsiNamedElement>>

'kotlinToLightElementsBySourceFile' @ [255:57] ==> private final val kotlinToLightElementsBySourceFile: Map<KtFile, Map<KtNamedDeclaration, List<PsiNamedElement>>> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'component1' @ [256:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtNamedDeclaration, List<PsiNamedElement>>.component1(): KtNamedDeclaration defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtNamedDeclaration
    <V> -> List<PsiNamedElement>

'component2' @ [256:39] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtNamedDeclaration, List<PsiNamedElement>>.component2(): List<PsiNamedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtNamedDeclaration
    <V> -> List<PsiNamedElement>

'kotlinToLightElements' @ [256:60] ==> val kotlinToLightElements: Map<KtNamedDeclaration, List<PsiNamedElement>> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'transaction' @ [257:43] ==> protected/*protected and package*/ for synthetic extension final val MoveKotlinDeclarationsProcessor.transaction: (RefactoringTransaction..RefactoringTransaction?)[MyPropertyDescriptor]

'getElementListener' @ [257:56] ==> public abstract fun getElementListener(p0: (PsiElement..PsiElement?)): (RefactoringElementListener..RefactoringElementListener?) defined in com.intellij.refactoring.listeners.impl.RefactoringTransaction[JavaMethodDescriptor]

'oldDeclaration' @ [257:75] ==> val oldDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'moveDeclaration' @ [259:42] ==> local final fun moveDeclaration(declaration: KtNamedDeclaration, moveTarget: KotlinMoveTarget): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[SimpleFunctionDescriptorImpl]

'oldDeclaration' @ [259:58] ==> val oldDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'descriptor' @ [259:74] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'moveTarget' @ [259:85] ==> public final val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'newDeclarations' @ [260:21] ==> val newDeclarations: ArrayList<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'newDeclaration' @ [260:40] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'oldToNewElementsMapping' @ [262:21] ==> val oldToNewElementsMapping: THashMap<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'oldDeclaration' @ [262:45] ==> val oldDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'newDeclaration' @ [262:63] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'oldToNewElementsMapping' @ [263:21] ==> val oldToNewElementsMapping: THashMap<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'sourceFile' @ [263:45] ==> val sourceFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'newDeclaration' @ [263:59] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'containingKtFile' @ [263:74] ==> public final val KtNamedDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'elementListener' @ [265:21] ==> val elementListener: RefactoringElementListener? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'elementMoved' @ [265:38] ==> public abstract fun elementMoved(@NotNull p0: PsiElement): Unit defined in com.intellij.refactoring.listeners.RefactoringElementListener[JavaMethodDescriptor]

'newDeclaration' @ [265:51] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'component1' @ [266:27] ==> public final operator fun component1(): PsiNamedElement defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [266:39] ==> public final operator fun component2(): PsiNamedElement defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'oldLightElements' @ [266:54] ==> val oldLightElements: List<PsiNamedElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'asSequence' @ [266:71] ==> public fun <T> Iterable<PsiNamedElement>.asSequence(): Sequence<PsiNamedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'zip' @ [266:84] ==> public infix fun <T, R> Sequence<PsiNamedElement>.zip(other: Sequence<PsiNamedElement>): Sequence<Pair<PsiNamedElement, PsiNamedElement>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement
    <R> -> PsiNamedElement

'newDeclaration' @ [266:88] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'toLightElements' @ [266:103] ==> public fun KtElement.toLightElements(): List<PsiNamedElement> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'asSequence' @ [266:121] ==> public fun <T> Iterable<PsiNamedElement>.asSequence(): Sequence<PsiNamedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'oldToNewElementsMapping' @ [267:25] ==> val oldToNewElementsMapping: THashMap<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'oldElement' @ [267:49] ==> val oldElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'newElement' @ [267:63] ==> val newElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'descriptor' @ [270:25] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'openInEditor' @ [270:36] ==> public final val openInEditor: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'openInEditor' @ [271:38] ==> public open fun openInEditor(@NotNull p0: PsiElement): (Editor..Editor?) defined in com.intellij.ide.util.EditorHelper[JavaMethodDescriptor]

'newDeclaration' @ [271:51] ==> val newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'descriptor' @ [275:21] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'deleteSourceFiles' @ [275:32] ==> public final val deleteSourceFiles: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'sourceFile' @ [276:21] ==> val sourceFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'delete' @ [276:32] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'newDeclarations' @ [280:13] ==> val newDeclarations: ArrayList<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'forEach' @ [280:29] ==> @HidesMembers public inline fun <T> Iterable<KtNamedDeclaration>.forEach(action: (KtNamedDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'newInternalUsages' @ [280:39] ==> val newInternalUsages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'restoreInternalUsages' @ [280:60] ==> internal fun restoreInternalUsages(scope: KtElement, oldToNewElementsMapping: Map<PsiElement, PsiElement>, forcedRestore: Boolean = ...): List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'it' @ [280:82] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'oldToNewElementsMapping' @ [280:86] ==> val oldToNewElementsMapping: THashMap<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'usagesToProcess' @ [282:13] ==> val usagesToProcess: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'newInternalUsages' @ [282:32] ==> val newInternalUsages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'nonCodeUsages' @ [284:13] ==> private final var nonCodeUsages: Array<NonCodeUsageInfo>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'postProcessMoveUsages' @ [284:29] ==> public fun postProcessMoveUsages(usages: Collection<UsageInfo>, oldToNewElementsMapping: Map<PsiElement, PsiElement> = ..., shorteningMode: KtSimpleNameReference.ShorteningMode = ...): List<NonCodeUsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'usagesToProcess' @ [284:51] ==> val usagesToProcess: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'oldToNewElementsMapping' @ [284:68] ==> val oldToNewElementsMapping: THashMap<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'toTypedArray' @ [284:93] ==> public inline fun <reified T> Collection<NonCodeUsageInfo>.toTypedArray(): Array<NonCodeUsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> NonCodeUsageInfo

'nonCodeUsages' @ [287:13] ==> private final var nonCodeUsages: Array<NonCodeUsageInfo>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'processIncorrectOperation' @ [288:31] ==> public open fun processIncorrectOperation(p0: (Project..Project?), p1: (IncorrectOperationException..IncorrectOperationException?)): Unit defined in com.intellij.refactoring.util.RefactoringUIUtil[JavaMethodDescriptor]

'myProject' @ [288:57] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[JavaPropertyDescriptor]

'e' @ [288:68] ==> val e: IncorrectOperationException defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'cleanUpInternalUsages' @ [291:13] ==> internal fun cleanUpInternalUsages(usages: Collection<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'newInternalUsages' @ [291:35] ==> val newInternalUsages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'oldInternalUsages' @ [291:55] ==> val oldInternalUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.doPerformRefactoring[LocalVariableDescriptor]

'nonCodeUsages' @ [296:9] ==> private final var nonCodeUsages: Array<NonCodeUsageInfo>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'let' @ [296:24] ==> @InlineOnly public inline fun <T, R> Array<NonCodeUsageInfo>.let(block: (Array<NonCodeUsageInfo>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Array<NonCodeUsageInfo>
    <R> -> Unit

'renameNonCodeUsages' @ [296:58] ==> public open fun renameNonCodeUsages(@NotNull p0: Project, @NotNull p1: (Array<(NonCodeUsageInfo..NonCodeUsageInfo?)>..Array<out (NonCodeUsageInfo..NonCodeUsageInfo?)>)): Unit defined in com.intellij.refactoring.rename.RenameUtil[JavaMethodDescriptor]

'myProject' @ [296:78] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[JavaPropertyDescriptor]

'nonCodeUsages' @ [296:89] ==> value-parameter nonCodeUsages: Array<NonCodeUsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.performPsiSpoilingRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [297:9] ==> public final val descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[PropertyDescriptorImpl]

'moveCallback' @ [297:20] ==> public final val moveCallback: MoveCallback? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'refactoringCompleted' @ [297:34] ==> public abstract fun refactoringCompleted(): Unit defined in com.intellij.refactoring.move.MoveCallback[JavaMethodDescriptor]

'execute' @ [301:9] ==> protected/*protected and package*/ open fun execute(@NotNull p0: (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>)): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[JavaMethodDescriptor]

'usages' @ [301:17] ==> value-parameter usages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.execute[ValueParameterDescriptorImpl]

'toTypedArray' @ [301:24] ==> public inline fun <reified T> Collection<UsageInfo>.toTypedArray(): Array<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> UsageInfo

'REFACTORING_NAME' @ [304:45] ==> private final val REFACTORING_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor.Companion[PropertyDescriptorImpl]

