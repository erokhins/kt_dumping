'AbstractKotlinInspection' @ [42:28] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [44:24] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'HashMap' @ [45:43] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtDeclaration
    <V : (Any..Any?)> -> Pseudocode

'super' @ [48:17] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitDeclaration' @ [48:23] ==> public open fun visitDeclaration(@NotNull p0: KtDeclaration): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'declaration' @ [48:40] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'when (declaration) {
                    is KtProperty -> {
                        if (declaration.isVar && declaration.isLocal &&
                            canBeVal(declaration,
                                     declaration.hasInitializer() || declaration.hasDelegateExpression(),
                                     listOf(declaration))) {
                            reportCanBeVal(declaration)
                        }
                    }

                    is KtDestructuringDeclaration -> {
                        val entries = declaration.entries
                        if (declaration.isVar && entries.all { canBeVal(it, true, entries) }) {
                            reportCanBeVal(declaration)
                        }
                    }
                }' @ [50:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'declaration' @ [50:23] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [52:29] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'isVar' @ [52:41] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'declaration' @ [52:50] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'isLocal' @ [52:62] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'canBeVal' @ [53:29] ==> private final fun canBeVal(declaration: KtVariableDeclaration, hasInitializerOrDelegate: Boolean, allDeclarations: Collection<KtVariableDeclaration>): Boolean defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'declaration' @ [53:38] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [54:38] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'hasInitializer' @ [54:50] ==> public open fun hasInitializer(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'declaration' @ [54:70] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'hasDelegateExpression' @ [54:82] ==> public open fun hasDelegateExpression(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'listOf' @ [55:38] ==> public fun <T> listOf(element: KtProperty): List<KtProperty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty

'declaration' @ [55:45] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'reportCanBeVal' @ [56:29] ==> private final fun reportCanBeVal(declaration: KtValVarKeywordOwner): Unit defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'declaration' @ [56:44] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [61:39] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'entries' @ [61:51] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'declaration' @ [62:29] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'isVar' @ [62:41] ==> public final val KtDestructuringDeclaration.isVar: Boolean[MyPropertyDescriptor]

'entries' @ [62:50] ==> val entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>) defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'all' @ [62:58] ==> public inline fun <T> Iterable<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>.all(predicate: ((KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)

'canBeVal' @ [62:64] ==> private final fun canBeVal(declaration: KtVariableDeclaration, hasInitializerOrDelegate: Boolean, allDeclarations: Collection<KtVariableDeclaration>): Boolean defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'it' @ [62:73] ==> value-parameter it: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.visitDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'entries' @ [62:83] ==> val entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>) defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.visitDeclaration[LocalVariableDescriptor]

'reportCanBeVal' @ [63:29] ==> private final fun reportCanBeVal(declaration: KtValVarKeywordOwner): Unit defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'declaration' @ [63:44] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.visitDeclaration[ValueParameterDescriptorImpl]

'allDeclarations' @ [74:21] ==> value-parameter allDeclarations: Collection<KtVariableDeclaration> defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[ValueParameterDescriptorImpl]

'all' @ [74:37] ==> public inline fun <T> Iterable<KtVariableDeclaration>.all(predicate: (KtVariableDeclaration) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtVariableDeclaration

'search' @ [74:60] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'it' @ [74:67] ==> value-parameter it: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [74:71] ==> value-parameter it: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal.<anonymous>[ValueParameterDescriptorImpl]

'useScope' @ [74:74] ==> public final val KtVariableDeclaration.useScope: SearchScope[MyPropertyDescriptor]

'none' @ [74:84] ==> public fun <T> Iterable<(PsiReference..PsiReference?)>.none(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'if (hasInitializerOrDelegate) {
                    val hasWriteUsages = ReferencesSearch.search(declaration, declaration.useScope).any {
                        (it as? KtSimpleNameReference)?.element?.readWriteAccess(useResolveForReadWrite = true)?.isWrite == true
                    }
                    !hasWriteUsages
                }
                else {
                    val bindingContext = declaration.analyze(BodyResolveMode.FULL)
                    val pseudocode = pseudocode(declaration, bindingContext) ?: return false
                    val descriptor = bindingContext[BindingContext.DECLARATION_TO_DESCRIPTOR, declaration] ?: return false

                    val writeInstructions = pseudocode.collectWriteInstructions(descriptor)
                    if (writeInstructions.isEmpty()) return false // incorrect code - do not report

                    writeInstructions.none { it.owner !== pseudocode || canReach(it, writeInstructions) }
                }' @ [79:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'hasInitializerOrDelegate' @ [79:28] ==> value-parameter hasInitializerOrDelegate: Boolean defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[ValueParameterDescriptorImpl]

'search' @ [80:59] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'declaration' @ [80:66] ==> value-parameter declaration: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[ValueParameterDescriptorImpl]

'declaration' @ [80:79] ==> value-parameter declaration: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[ValueParameterDescriptorImpl]

'useScope' @ [80:91] ==> public final val KtVariableDeclaration.useScope: SearchScope[MyPropertyDescriptor]

'any' @ [80:101] ==> public inline fun <T> Iterable<(PsiReference..PsiReference?)>.any(predicate: ((PsiReference..PsiReference?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'==' @ [81:25] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [81:26] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [81:57] ==> public final val KtSimpleNameReference.element: (KtSimpleNameExpression..KtSimpleNameExpression?)[MyPropertyDescriptor]

'readWriteAccess' @ [81:66] ==> public fun KtExpression.readWriteAccess(useResolveForReadWrite: Boolean): ReferenceAccess defined in org.jetbrains.kotlin.idea.references[DeserializedSimpleFunctionDescriptor]

'isWrite' @ [81:114] ==> public final val isWrite: Boolean defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[DeserializedPropertyDescriptor]

'!' @ [83:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasWriteUsages' @ [83:22] ==> val hasWriteUsages: Boolean defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[LocalVariableDescriptor]

'declaration' @ [86:42] ==> value-parameter declaration: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[ValueParameterDescriptorImpl]

'analyze' @ [86:54] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [86:78] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'pseudocode' @ [87:38] ==> private final fun pseudocode(element: KtElement, bindingContext: BindingContext): Pseudocode? defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'declaration' @ [87:49] ==> value-parameter declaration: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[ValueParameterDescriptorImpl]

'bindingContext' @ [87:62] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[LocalVariableDescriptor]

'bindingContext' @ [88:38] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [88:68] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [88:95] ==> value-parameter declaration: KtVariableDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[ValueParameterDescriptorImpl]

'pseudocode' @ [90:45] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[LocalVariableDescriptor]

'collectWriteInstructions' @ [90:56] ==> private final fun Pseudocode.collectWriteInstructions(descriptor: DeclarationDescriptor): Set<WriteValueInstruction> defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'descriptor' @ [90:81] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[LocalVariableDescriptor]

'writeInstructions' @ [91:25] ==> val writeInstructions: Set<WriteValueInstruction> defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[LocalVariableDescriptor]

'isEmpty' @ [91:43] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'writeInstructions' @ [93:21] ==> val writeInstructions: Set<WriteValueInstruction> defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[LocalVariableDescriptor]

'none' @ [93:39] ==> public inline fun <T> Iterable<WriteValueInstruction>.none(predicate: (WriteValueInstruction) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WriteValueInstruction

'it' @ [93:46] ==> value-parameter it: WriteValueInstruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [93:49] ==> public open var owner: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.WriteValueInstruction[DeserializedPropertyDescriptor]

'pseudocode' @ [93:59] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[LocalVariableDescriptor]

'canReach' @ [93:73] ==> private final fun canReach(from: Instruction, targets: Set<Instruction>, visited: HashSet<Instruction> = ...): Boolean defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'it' @ [93:82] ==> value-parameter it: WriteValueInstruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal.<anonymous>[ValueParameterDescriptorImpl]

'writeInstructions' @ [93:86] ==> val writeInstructions: Set<WriteValueInstruction> defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canBeVal[LocalVariableDescriptor]

'element' @ [98:35] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.pseudocode[ValueParameterDescriptorImpl]

'containingDeclarationForPseudocode' @ [98:43] ==> public val KtElement.containingDeclarationForPseudocode: KtDeclaration? defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedPropertyDescriptor]

'pseudocodeCache' @ [99:24] ==> private final val pseudocodeCache: HashMap<KtDeclaration, Pseudocode> defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>[PropertyDescriptorImpl]

'getOrPut' @ [99:40] ==> public inline fun <K, V> MutableMap<KtDeclaration, Pseudocode>.getOrPut(key: KtDeclaration, defaultValue: () -> Pseudocode): Pseudocode defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtDeclaration
    <V> -> Pseudocode

'declaration' @ [99:49] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.pseudocode[LocalVariableDescriptor]

'generatePseudocode' @ [99:79] ==> @NotNull public open fun generatePseudocode(@NotNull p0: KtDeclaration, @NotNull p1: BindingContext): Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeUtil[JavaMethodDescriptor]

'declaration' @ [99:98] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.pseudocode[LocalVariableDescriptor]

'bindingContext' @ [99:111] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.pseudocode[ValueParameterDescriptorImpl]

'with' @ [103:21] ==> @InlineOnly public inline fun <T, R> with(receiver: List<Instruction>, block: List<Instruction>.() -> Set<WriteValueInstruction>): Set<WriteValueInstruction> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Instruction>
    <R> -> Set<WriteValueInstruction>

'instructionsIncludingDeadCode' @ [103:27] ==> public abstract val instructionsIncludingDeadCode: List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[DeserializedPropertyDescriptor]

'filterIsInstance' @ [104:25] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<WriteValueInstruction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> WriteValueInstruction

'filter' @ [105:26] ==> public inline fun <T> Iterable<WriteValueInstruction>.filter(predicate: (WriteValueInstruction) -> Boolean): List<WriteValueInstruction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WriteValueInstruction

'==' @ [105:35] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[DeserializedSimpleFunctionDescriptor]

'it' @ [105:36] ==> value-parameter it: WriteValueInstruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.collectWriteInstructions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [105:39] ==> public final val target: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.WriteValueInstruction[DeserializedPropertyDescriptor]

'resolvedCall' @ [105:70] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget.Call[DeserializedPropertyDescriptor]

'resultingDescriptor' @ [105:84] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'descriptor' @ [105:107] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.collectWriteInstructions[ValueParameterDescriptorImpl]

'toSet' @ [106:26] ==> public fun <T> Iterable<WriteValueInstruction>.toSet(): Set<WriteValueInstruction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WriteValueInstruction

'filterIsInstance' @ [108:25] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<LocalFunctionDeclarationInstruction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> LocalFunctionDeclarationInstruction

'map' @ [109:26] ==> public inline fun <T, R> Iterable<LocalFunctionDeclarationInstruction>.map(transform: (LocalFunctionDeclarationInstruction) -> Set<WriteValueInstruction>): List<Set<WriteValueInstruction>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalFunctionDeclarationInstruction
    <R> -> Set<WriteValueInstruction>

'it' @ [109:32] ==> value-parameter it: LocalFunctionDeclarationInstruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.collectWriteInstructions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [109:35] ==> public final val body: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[DeserializedPropertyDescriptor]

'collectWriteInstructions' @ [109:40] ==> private final fun Pseudocode.collectWriteInstructions(descriptor: DeclarationDescriptor): Set<WriteValueInstruction> defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'descriptor' @ [109:65] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.collectWriteInstructions[ValueParameterDescriptorImpl]

'flatten' @ [110:26] ==> public fun <T> Iterable<Iterable<WriteValueInstruction>>.flatten(): List<WriteValueInstruction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WriteValueInstruction

'HashSet' @ [113:112] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Instruction

'from' @ [115:35] ==> value-parameter from: Instruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[ValueParameterDescriptorImpl]

'instruction' @ [116:24] ==> var instruction: Instruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[LocalVariableDescriptor]

'instruction' @ [117:25] ==> var instruction: Instruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[LocalVariableDescriptor]

'canReach' @ [118:29] ==> private final fun canReach(from: Instruction, targets: Set<Instruction>, visited: HashSet<Instruction> = ...): Boolean defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'instruction' @ [118:38] ==> var instruction: Instruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[LocalVariableDescriptor]

'body' @ [118:50] ==> public final val body: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[DeserializedPropertyDescriptor]

'enterInstruction' @ [118:55] ==> public abstract val enterInstruction: SubroutineEnterInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[DeserializedPropertyDescriptor]

'targets' @ [118:73] ==> value-parameter targets: Set<Instruction> defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[ValueParameterDescriptorImpl]

'visited' @ [118:82] ==> value-parameter visited: HashSet<Instruction> = ... defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[ValueParameterDescriptorImpl]

'instruction' @ [120:32] ==> var instruction: Instruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[LocalVariableDescriptor]

'next' @ [120:44] ==> public final var next: Instruction? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionWithNext[DeserializedPropertyDescriptor]

'next' @ [121:25] ==> val next: Instruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[LocalVariableDescriptor]

'visited' @ [121:33] ==> value-parameter visited: HashSet<Instruction> = ... defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[ValueParameterDescriptorImpl]

'next' @ [122:25] ==> val next: Instruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[LocalVariableDescriptor]

'targets' @ [122:33] ==> value-parameter targets: Set<Instruction> defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[ValueParameterDescriptorImpl]

'visited' @ [123:21] ==> value-parameter visited: HashSet<Instruction> = ... defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[ValueParameterDescriptorImpl]

'add' @ [123:29] ==> public open fun add(element: Instruction): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'next' @ [123:33] ==> val next: Instruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[LocalVariableDescriptor]

'instruction' @ [124:21] ==> var instruction: Instruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[LocalVariableDescriptor]

'next' @ [124:35] ==> val next: Instruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[LocalVariableDescriptor]

'instruction' @ [127:30] ==> var instruction: Instruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[LocalVariableDescriptor]

'nextInstructions' @ [127:42] ==> public abstract val nextInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[DeserializedPropertyDescriptor]

'next' @ [128:25] ==> val next: Instruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[LocalVariableDescriptor]

'visited' @ [128:33] ==> value-parameter visited: HashSet<Instruction> = ... defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[ValueParameterDescriptorImpl]

'next' @ [129:25] ==> val next: Instruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[LocalVariableDescriptor]

'targets' @ [129:33] ==> value-parameter targets: Set<Instruction> defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[ValueParameterDescriptorImpl]

'visited' @ [130:21] ==> value-parameter visited: HashSet<Instruction> = ... defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[ValueParameterDescriptorImpl]

'add' @ [130:29] ==> public open fun add(element: Instruction): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'next' @ [130:33] ==> val next: Instruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[LocalVariableDescriptor]

'canReach' @ [131:25] ==> private final fun canReach(from: Instruction, targets: Set<Instruction>, visited: HashSet<Instruction> = ...): Boolean defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'next' @ [131:34] ==> val next: Instruction defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[LocalVariableDescriptor]

'targets' @ [131:40] ==> value-parameter targets: Set<Instruction> defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[ValueParameterDescriptorImpl]

'visited' @ [131:49] ==> value-parameter visited: HashSet<Instruction> = ... defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.canReach[ValueParameterDescriptorImpl]

'declaration' @ [137:31] ==> value-parameter declaration: KtValVarKeywordOwner defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.reportCanBeVal[ValueParameterDescriptorImpl]

'valOrVarKeyword' @ [137:43] ==> public final val KtValVarKeywordOwner.valOrVarKeyword: PsiElement?[MyPropertyDescriptor]

'holder' @ [138:41] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor[ValueParameterDescriptorImpl]

'manager' @ [138:48] ==> public final val ProblemsHolder.manager: InspectionManager[MyPropertyDescriptor]

'createProblemDescriptor' @ [138:56] ==> @NotNull @Contract public abstract fun createProblemDescriptor(@NotNull p0: PsiElement, @NotNull p1: PsiElement, @NotNull @Nls p2: String, @NotNull p3: ProblemHighlightType, p4: Boolean, vararg p5: (LocalQuickFix..LocalQuickFix?)): ProblemDescriptor defined in com.intellij.codeInspection.InspectionManager[JavaMethodDescriptor]

'keyword' @ [139:25] ==> val keyword: PsiElement defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.reportCanBeVal[LocalVariableDescriptor]

'keyword' @ [140:25] ==> val keyword: PsiElement defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.reportCanBeVal[LocalVariableDescriptor]

'GENERIC_ERROR_OR_WARNING' @ [142:46] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'isOnTheFly' @ [143:25] ==> value-parameter isOnTheFly: Boolean defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor[ValueParameterDescriptorImpl]

'IntentionWrapper' @ [144:25] ==> public constructor IntentionWrapper(@NotNull p0: IntentionAction, @NotNull p1: PsiFile) defined in com.intellij.codeInspection.IntentionWrapper[JavaClassConstructorDescriptor]

'ChangeVariableMutabilityFix' @ [144:42] ==> public constructor ChangeVariableMutabilityFix(element: KtValVarKeywordOwner, makeVar: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix[ClassConstructorDescriptorImpl]

'declaration' @ [144:70] ==> value-parameter declaration: KtValVarKeywordOwner defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.reportCanBeVal[ValueParameterDescriptorImpl]

'declaration' @ [144:91] ==> value-parameter declaration: KtValVarKeywordOwner defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.reportCanBeVal[ValueParameterDescriptorImpl]

'containingFile' @ [144:103] ==> public final val KtValVarKeywordOwner.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'holder' @ [146:17] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [146:24] ==> public open fun registerProblem(@NotNull p0: ProblemDescriptor): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'problemDescriptor' @ [146:40] ==> val problemDescriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.CanBeValInspection.buildVisitor.<no name provided>.reportCanBeVal[LocalVariableDescriptor]

