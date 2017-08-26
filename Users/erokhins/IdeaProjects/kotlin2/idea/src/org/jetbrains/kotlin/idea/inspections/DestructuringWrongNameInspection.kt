'AbstractKotlinInspection' @ [27:42] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [29:25] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [31:17] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitDestructuringDeclaration' @ [31:23] ==> public open fun visitDestructuringDeclaration(@NotNull p0: KtDestructuringDeclaration): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'destructuringDeclaration' @ [31:53] ==> value-parameter destructuringDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'destructuringDeclaration' @ [33:35] ==> value-parameter destructuringDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'initializer' @ [33:60] ==> public final val KtDestructuringDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'initializer' @ [34:28] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration[LocalVariableDescriptor]

'analyze' @ [34:40] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getType' @ [34:50] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'initializer' @ [34:58] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration[LocalVariableDescriptor]

'type' @ [36:39] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration[LocalVariableDescriptor]

'constructor' @ [36:44] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [36:56] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'classDescriptor' @ [38:45] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration[LocalVariableDescriptor]

'constructors' @ [38:61] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'firstOrNull' @ [39:50] ==> public inline fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.firstOrNull(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): ClassConstructorDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'it' @ [39:64] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'isPrimary' @ [39:67] ==> public final val ClassConstructorDescriptor.isPrimary: Boolean[MyPropertyDescriptor]

'valueParameters' @ [40:51] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [41:51] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> String

'it' @ [41:57] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [41:60] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [41:65] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'destructuringDeclaration' @ [43:17] ==> value-parameter destructuringDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'entries' @ [43:42] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'forEachIndexed' @ [43:50] ==> public inline fun <T> Iterable<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>.forEachIndexed(action: (index: Int, (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)

'entry' @ [44:40] ==> value-parameter entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [44:46] ==> public final val KtDestructuringDeclarationEntry.name: String?[MyPropertyDescriptor]

'variableName' @ [45:25] ==> val variableName: String? defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration.<anonymous>[LocalVariableDescriptor]

'primaryParameterNames' @ [45:41] ==> val primaryParameterNames: List<String> defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration[LocalVariableDescriptor]

'getOrNull' @ [45:63] ==> public fun <T> List<String>.getOrNull(index: Int): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'entryIndex' @ [45:73] ==> value-parameter entryIndex: Int defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [46:31] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [46:47] ==> public final operator fun component2(): String defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'primaryParameterNames' @ [46:65] ==> val primaryParameterNames: List<String> defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration[LocalVariableDescriptor]

'withIndex' @ [46:87] ==> public fun <T> Iterable<String>.withIndex(): Iterable<IndexedValue<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'parameterIndex' @ [47:33] ==> val parameterIndex: Int defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration.<anonymous>[LocalVariableDescriptor]

'entryIndex' @ [47:51] ==> value-parameter entryIndex: Int defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'variableName' @ [48:33] ==> val variableName: String? defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration.<anonymous>[LocalVariableDescriptor]

'parameterName' @ [48:49] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration.<anonymous>[LocalVariableDescriptor]

'primaryParameterNames' @ [49:43] ==> val primaryParameterNames: List<String> defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration[LocalVariableDescriptor]

'getOrNull' @ [49:65] ==> public fun <T> List<String>.getOrNull(index: Int): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'entryIndex' @ [49:75] ==> value-parameter entryIndex: Int defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [49:88] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> RenameElementFix): RenameElementFix defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> RenameElementFix

'RenameElementFix' @ [49:94] ==> public constructor RenameElementFix(@NotNull p0: PsiNamedElement, @NotNull p1: String) defined in com.intellij.codeInsight.daemon.impl.quickfix.RenameElementFix[JavaClassConstructorDescriptor]

'entry' @ [49:111] ==> value-parameter entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [49:118] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'holder' @ [50:33] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [50:40] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @Nullable vararg p2: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'entry' @ [51:41] ==> value-parameter entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'variableName' @ [52:58] ==> val variableName: String? defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration.<anonymous>[LocalVariableDescriptor]

'listOfNotNull' @ [53:42] ==> public fun <T : Any> listOfNotNull(element: RenameElementFix?): List<RenameElementFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> RenameElementFix

'fix' @ [53:56] ==> val fix: RenameElementFix? defined in org.jetbrains.kotlin.idea.inspections.DestructuringWrongNameInspection.buildVisitor.<no name provided>.visitDestructuringDeclaration.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [53:61] ==> public inline fun <reified T> Collection<RenameElementFix>.toTypedArray(): Array<RenameElementFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> RenameElementFix

