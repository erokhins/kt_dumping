'TestOnly' @ [50:9] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'ImportInsertHelper' @ [71:38] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[FakeCallableDescriptorForObject]

'getInstance' @ [71:57] ==> @JvmStatic public final fun getInstance(project: Project): ImportInsertHelper defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper.Companion[SimpleFunctionDescriptorImpl]

'file' @ [71:69] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'project' @ [71:74] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'ImportRule' @ [75:54] ==> private constructor ImportRule() defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.ImportRule[ClassConstructorDescriptorImpl]

'+' @ [76:39] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'importPath' @ [76:45] ==> public final val importPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.ImportRule.Add[PropertyDescriptorImpl]

'toString' @ [76:56] ==> public open fun toString(): String defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedSimpleFunctionDescriptor]

'ImportRule' @ [80:59] ==> private constructor ImportRule() defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.ImportRule[ClassConstructorDescriptorImpl]

'+' @ [81:39] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'importPath' @ [81:45] ==> public final val importPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.ImportRule.DoNotAdd[PropertyDescriptorImpl]

'toString' @ [81:56] ==> public open fun toString(): String defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedSimpleFunctionDescriptor]

'HashSet' @ [85:31] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ImportRule

'file' @ [90:9] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'importDirectives' @ [90:14] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'mapNotNull' @ [91:18] ==> public inline fun <T, R : Any> Iterable<(KtImportDirective..KtImportDirective?)>.mapNotNull(transform: ((KtImportDirective..KtImportDirective?)) -> ImportPath?): List<ImportPath> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)
    <R : Any> -> ImportPath

'it' @ [91:31] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildOptimizedImports.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [91:34] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'filter' @ [92:18] ==> public inline fun <T> Iterable<ImportPath>.filter(predicate: (ImportPath) -> Boolean): List<ImportPath> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportPath

'it' @ [93:37] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildOptimizedImports.<anonymous>[ValueParameterDescriptorImpl]

'alias' @ [93:40] ==> public final val alias: Name? defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'aliasName' @ [94:21] ==> val aliasName: Name? defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildOptimizedImports.<anonymous>[LocalVariableDescriptor]

'aliasName' @ [94:42] ==> val aliasName: Name? defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildOptimizedImports.<anonymous>[LocalVariableDescriptor]

'it' @ [94:55] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildOptimizedImports.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [94:58] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'shortName' @ [94:65] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'mapTo' @ [96:18] ==> public inline fun <T, R, C : MutableCollection<in OptimizedImportsBuilder.ImportRule.Add>> Iterable<ImportPath>.mapTo(destination: HashSet<OptimizedImportsBuilder.ImportRule>, transform: (ImportPath) -> OptimizedImportsBuilder.ImportRule.Add): HashSet<OptimizedImportsBuilder.ImportRule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportPath
    <R> -> Add
    <C : MutableCollection<in R>> -> HashSet<ImportRule>

'importRules' @ [96:24] ==> private final val importRules: HashSet<OptimizedImportsBuilder.ImportRule> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'Add' @ [96:50] ==> public constructor Add(importPath: ImportPath) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.ImportRule.Add[ClassConstructorDescriptorImpl]

'it' @ [96:54] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildOptimizedImports.<anonymous>[ValueParameterDescriptorImpl]

'importRules' @ [99:37] ==> private final val importRules: HashSet<OptimizedImportsBuilder.ImportRule> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'size' @ [99:49] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

'tryBuildOptimizedImports' @ [100:26] ==> private final fun tryBuildOptimizedImports(): List<ImportPath>? defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'importRules' @ [101:17] ==> private final val importRules: HashSet<OptimizedImportsBuilder.ImportRule> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'size' @ [101:29] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

'importRulesBefore' @ [101:37] ==> val importRulesBefore: Int defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildOptimizedImports[LocalVariableDescriptor]

'result' @ [101:63] ==> val result: List<ImportPath>? defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildOptimizedImports[LocalVariableDescriptor]

'testLog' @ [102:13] ==> @TestOnly public final var testLog: StringBuilder? /* = StringBuilder? */ defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.Companion[PropertyDescriptorImpl]

'append' @ [102:22] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'importRules' @ [102:85] ==> private final val importRules: HashSet<OptimizedImportsBuilder.ImportRule> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'joinToString' @ [102:97] ==> public fun <T> Iterable<OptimizedImportsBuilder.ImportRule>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((OptimizedImportsBuilder.ImportRule) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportRule

'element' @ [107:22] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getExpressionToAnalyze[ValueParameterDescriptorImpl]

'parent' @ [107:30] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when {
            parent is KtQualifiedExpression && element == parent.selectorExpression -> parent
            parent is KtCallExpression && element == parent.calleeExpression -> getExpressionToAnalyze(parent)
            parent is KtOperationExpression && element == parent.operationReference -> parent
            parent is KtUserType -> null //TODO: is it always correct?
            else -> element as? KtExpression //TODO: what if not expression? Example: KtPropertyDelegationMethodsReference
        }' @ [108:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?, entry3: KtExpression?, entry4: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'parent' @ [109:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getExpressionToAnalyze[LocalVariableDescriptor]

'element' @ [109:48] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getExpressionToAnalyze[ValueParameterDescriptorImpl]

'parent' @ [109:59] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getExpressionToAnalyze[LocalVariableDescriptor]

'selectorExpression' @ [109:66] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'parent' @ [109:88] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getExpressionToAnalyze[LocalVariableDescriptor]

'parent' @ [110:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getExpressionToAnalyze[LocalVariableDescriptor]

'element' @ [110:43] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getExpressionToAnalyze[ValueParameterDescriptorImpl]

'parent' @ [110:54] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getExpressionToAnalyze[LocalVariableDescriptor]

'calleeExpression' @ [110:61] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'getExpressionToAnalyze' @ [110:81] ==> private final fun getExpressionToAnalyze(element: KtElement): KtExpression? defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'parent' @ [110:104] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getExpressionToAnalyze[LocalVariableDescriptor]

'parent' @ [111:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getExpressionToAnalyze[LocalVariableDescriptor]

'element' @ [111:48] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getExpressionToAnalyze[ValueParameterDescriptorImpl]

'parent' @ [111:59] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getExpressionToAnalyze[LocalVariableDescriptor]

'operationReference' @ [111:66] ==> public final val KtOperationExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'parent' @ [111:88] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getExpressionToAnalyze[LocalVariableDescriptor]

'parent' @ [112:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getExpressionToAnalyze[LocalVariableDescriptor]

'element' @ [113:21] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getExpressionToAnalyze[ValueParameterDescriptorImpl]

'HashSet' @ [118:33] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ImportPath

'importRules' @ [119:9] ==> private final val importRules: HashSet<OptimizedImportsBuilder.ImportRule> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'filterIsInstance' @ [120:18] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<OptimizedImportsBuilder.ImportRule.Add> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Add

'mapTo' @ [121:18] ==> public inline fun <T, R, C : MutableCollection<in ImportPath>> Iterable<OptimizedImportsBuilder.ImportRule.Add>.mapTo(destination: HashSet<ImportPath>, transform: (OptimizedImportsBuilder.ImportRule.Add) -> ImportPath): HashSet<ImportPath> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Add
    <R> -> ImportPath
    <C : MutableCollection<in R>> -> HashSet<ImportPath>

'importsToGenerate' @ [121:24] ==> val importsToGenerate: HashSet<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'it' @ [121:45] ==> value-parameter it: OptimizedImportsBuilder.ImportRule.Add defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [121:48] ==> public final val importPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.ImportRule.Add[PropertyDescriptorImpl]

'HashMap' @ [123:41] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FqName
    <V : (Any..Any?)> -> MutableSet<DeclarationDescriptor>

'data' @ [124:28] ==> private final val data: OptimizedImportsBuilder.InputData defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'descriptorsToImport' @ [124:33] ==> public final val descriptorsToImport: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.InputData[PropertyDescriptorImpl]

'descriptor' @ [125:26] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'importableFqName' @ [125:37] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports in file ImportsUtils.kt[PropertyDescriptorImpl]

'ImportPath' @ [127:38] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'fqName' @ [127:49] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'explicitImportPath' @ [128:17] ==> val explicitImportPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'importsToGenerate' @ [128:39] ==> val importsToGenerate: HashSet<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'fqName' @ [130:32] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'parent' @ [130:39] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'ImportPath' @ [131:34] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'parentFqName' @ [131:45] ==> val parentFqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'if (canUseStarImport(descriptor, fqName) && starImportPath.isAllowedByRules()) {
                descriptorsByParentFqName.getOrPut(parentFqName) { HashSet() }.add(descriptor)
            }
            else {
                importsToGenerate.add(explicitImportPath)
            }' @ [132:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'canUseStarImport' @ [132:17] ==> private final fun canUseStarImport(descriptor: DeclarationDescriptor, fqName: FqName): Boolean defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'descriptor' @ [132:34] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'fqName' @ [132:46] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'starImportPath' @ [132:57] ==> val starImportPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'isAllowedByRules' @ [132:72] ==> private final fun ImportPath.isAllowedByRules(): Boolean defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'descriptorsByParentFqName' @ [133:17] ==> val descriptorsByParentFqName: HashMap<FqName, MutableSet<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'getOrPut' @ [133:43] ==> public inline fun <K, V> MutableMap<FqName, MutableSet<DeclarationDescriptor>>.getOrPut(key: FqName, defaultValue: () -> MutableSet<DeclarationDescriptor>): MutableSet<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName
    <V> -> MutableSet<DeclarationDescriptor>

'parentFqName' @ [133:52] ==> val parentFqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'HashSet' @ [133:68] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'add' @ [133:80] ==> public abstract fun add(element: DeclarationDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [133:84] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'importsToGenerate' @ [136:17] ==> val importsToGenerate: HashSet<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'add' @ [136:35] ==> public open fun add(element: ImportPath): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'explicitImportPath' @ [136:39] ==> val explicitImportPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'HashSet' @ [140:33] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'descriptorsByParentFqName' @ [142:30] ==> val descriptorsByParentFqName: HashMap<FqName, MutableSet<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'keys' @ [142:56] ==> public open val keys: MutableSet<FqName> defined in java.util.HashMap[JavaPropertyDescriptor]

'ImportPath' @ [143:34] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'parentFqName' @ [143:45] ==> val parentFqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'starImportPath' @ [144:17] ==> val starImportPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'importsToGenerate' @ [144:35] ==> val importsToGenerate: HashSet<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'descriptorsByParentFqName' @ [146:31] ==> val descriptorsByParentFqName: HashMap<FqName, MutableSet<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'parentFqName' @ [146:57] ==> val parentFqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'descriptors' @ [147:27] ==> val descriptors: MutableSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'map' @ [147:39] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> FqName

'it' @ [147:45] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports.<anonymous>[ValueParameterDescriptorImpl]

'importableFqName' @ [147:48] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports in file ImportsUtils.kt[PropertyDescriptorImpl]

'toSet' @ [147:69] ==> public fun <T> Iterable<FqName>.toSet(): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'descriptors' @ [148:38] ==> val descriptors: MutableSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'first' @ [148:50] ==> public fun <T> Iterable<DeclarationDescriptor>.first(): DeclarationDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'nameCountToUseStar' @ [148:58] ==> private final fun DeclarationDescriptor.nameCountToUseStar(): Int defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'fqNames' @ [149:38] ==> val fqNames: Set<FqName> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'size' @ [149:46] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'nameCountToUseStar' @ [149:53] ==> val nameCountToUseStar: Int defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'!' @ [149:75] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'options' @ [149:76] ==> private final val options: OptimizedImportsBuilder.Options defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'invoke' @ [149:84] ==> public abstract operator fun invoke(p1: FqName): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'parentFqName' @ [149:112] ==> val parentFqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'!' @ [150:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'starImportPath' @ [150:42] ==> val starImportPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'isAllowedByRules' @ [150:57] ==> private final fun ImportPath.isAllowedByRules(): Boolean defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'if (useExplicitImports) {
                fqNames
                        .filter { !isImportedByDefault(it) }
                        .mapTo(importsToGenerate) { ImportPath(it, false) }
            }
            else {
                descriptors
                        .asSequence()
                        .filterIsInstance<ClassDescriptor>()
                        .map { it.importableFqName!! }
                        .filterTo(classNamesToCheck) { !isImportedByDefault(it) }

                if (!fqNames.all(this::isImportedByDefault)) {
                    importsToGenerate.add(starImportPath)
                }
            }' @ [151:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'useExplicitImports' @ [151:17] ==> val useExplicitImports: Boolean defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'fqNames' @ [152:17] ==> val fqNames: Set<FqName> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'filter' @ [153:26] ==> public inline fun <T> Iterable<FqName>.filter(predicate: (FqName) -> Boolean): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'!' @ [153:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isImportedByDefault' @ [153:36] ==> private final fun isImportedByDefault(fqName: FqName): Boolean defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'it' @ [153:56] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports.<anonymous>[ValueParameterDescriptorImpl]

'mapTo' @ [154:26] ==> public inline fun <T, R, C : MutableCollection<in ImportPath>> Iterable<FqName>.mapTo(destination: HashSet<ImportPath>, transform: (FqName) -> ImportPath): HashSet<ImportPath> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> ImportPath
    <C : MutableCollection<in R>> -> HashSet<ImportPath>

'importsToGenerate' @ [154:32] ==> val importsToGenerate: HashSet<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'ImportPath' @ [154:53] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'it' @ [154:64] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports.<anonymous>[ValueParameterDescriptorImpl]

'descriptors' @ [157:17] ==> val descriptors: MutableSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'asSequence' @ [158:26] ==> public fun <T> Iterable<DeclarationDescriptor>.asSequence(): Sequence<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'filterIsInstance' @ [159:26] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<ClassDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ClassDescriptor

'map' @ [160:26] ==> public fun <T, R> Sequence<ClassDescriptor>.map(transform: (ClassDescriptor) -> FqName): Sequence<FqName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> FqName

'it' @ [160:32] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports.<anonymous>[ValueParameterDescriptorImpl]

'importableFqName' @ [160:35] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports in file ImportsUtils.kt[PropertyDescriptorImpl]

'filterTo' @ [161:26] ==> public inline fun <T, C : MutableCollection<in FqName>> Sequence<FqName>.filterTo(destination: HashSet<FqName>, predicate: (FqName) -> Boolean): HashSet<FqName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <C : MutableCollection<in T>> -> HashSet<FqName>

'classNamesToCheck' @ [161:35] ==> val classNamesToCheck: HashSet<FqName> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'!' @ [161:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isImportedByDefault' @ [161:57] ==> private final fun isImportedByDefault(fqName: FqName): Boolean defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'it' @ [161:77] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [163:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'fqNames' @ [163:22] ==> val fqNames: Set<FqName> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'all' @ [163:30] ==> public inline fun <T> Iterable<FqName>.all(predicate: (FqName) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'this' @ [163:34] ==> <this> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[LazyClassReceiverParameterDescriptor]

'isImportedByDefault' @ [163:40] ==> private final fun isImportedByDefault(fqName: FqName): Boolean defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'importsToGenerate' @ [164:21] ==> val importsToGenerate: HashSet<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'add' @ [164:39] ==> public open fun add(element: ImportPath): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'starImportPath' @ [164:43] ==> val starImportPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'addExplicitImportsForClassesWhenRequired' @ [170:9] ==> private final fun addExplicitImportsForClassesWhenRequired(classNamesToCheck: Collection<FqName>, descriptorsByParentFqName: Map<FqName, MutableSet<DeclarationDescriptor>>, importsToGenerate: MutableSet<ImportPath>, originalFile: KtFile): Unit defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'classNamesToCheck' @ [170:50] ==> val classNamesToCheck: HashSet<FqName> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'descriptorsByParentFqName' @ [170:69] ==> val descriptorsByParentFqName: HashMap<FqName, MutableSet<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'importsToGenerate' @ [170:96] ==> val importsToGenerate: HashSet<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'file' @ [170:115] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'importsToGenerate' @ [172:39] ==> val importsToGenerate: HashSet<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'sortedWith' @ [172:57] ==> public fun <T> Iterable<ImportPath>.sortedWith(comparator: Comparator<in ImportPath> /* = Comparator<in ImportPath> */): List<ImportPath> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportPath

'importInsertHelper' @ [172:68] ==> private final val importInsertHelper: ImportInsertHelper defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'importSortComparator' @ [172:87] ==> public abstract val importSortComparator: Comparator<ImportPath> defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[PropertyDescriptorImpl]

'file' @ [175:26] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'importDirectives' @ [175:31] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'oldImports' @ [176:13] ==> val oldImports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'size' @ [176:24] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'sortedImportsToGenerate' @ [176:32] ==> val sortedImportsToGenerate: List<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'size' @ [176:56] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'oldImports' @ [176:64] ==> val oldImports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'map' @ [176:75] ==> public inline fun <T, R> Iterable<(KtImportDirective..KtImportDirective?)>.map(transform: ((KtImportDirective..KtImportDirective?)) -> ImportPath?): List<ImportPath?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)
    <R> -> ImportPath?

'it' @ [176:81] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [176:84] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'sortedImportsToGenerate' @ [176:100] ==> val sortedImportsToGenerate: List<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'file' @ [178:33] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'getFileResolutionScope' @ [178:38] ==> private final fun KtFile.getFileResolutionScope(): ImportingScope defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'buildScopeByImports' @ [179:28] ==> private final fun buildScopeByImports(originalFile: KtFile, importsToGenerate: Collection<ImportPath>): ImportingScope defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'file' @ [179:48] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'sortedImportsToGenerate' @ [179:54] ==> val sortedImportsToGenerate: List<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'data' @ [181:26] ==> private final val data: OptimizedImportsBuilder.InputData defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'references' @ [181:31] ==> public final val references: Collection<OptimizedImportsBuilder.AbstractReference> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.InputData[PropertyDescriptorImpl]

'testLog' @ [182:13] ==> @TestOnly public final var testLog: StringBuilder? /* = StringBuilder? */ defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.Companion[PropertyDescriptorImpl]

'references' @ [184:13] ==> var references: Collection<OptimizedImportsBuilder.AbstractReference> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'references' @ [184:26] ==> var references: Collection<OptimizedImportsBuilder.AbstractReference> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'sortedBy' @ [184:37] ==> public inline fun <T, R : Comparable<String>> Iterable<OptimizedImportsBuilder.AbstractReference>.sortedBy(crossinline selector: (OptimizedImportsBuilder.AbstractReference) -> String?): List<OptimizedImportsBuilder.AbstractReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractReference
    <R : Comparable<R>> -> String

'it' @ [184:48] ==> value-parameter it: OptimizedImportsBuilder.AbstractReference defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [184:51] ==> public open fun toString(): String defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.AbstractReference[DeserializedSimpleFunctionDescriptor]

'component1' @ [186:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Collection<Name>, List<OptimizedImportsBuilder.AbstractReference>>.component1(): Collection<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Collection<Name>
    <V> -> List<AbstractReference>

'component2' @ [186:22] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Collection<Name>, List<OptimizedImportsBuilder.AbstractReference>>.component2(): List<OptimizedImportsBuilder.AbstractReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Collection<Name>
    <V> -> List<AbstractReference>

'references' @ [186:31] ==> var references: Collection<OptimizedImportsBuilder.AbstractReference> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'groupBy' @ [186:42] ==> public inline fun <T, K> Iterable<OptimizedImportsBuilder.AbstractReference>.groupBy(keySelector: (OptimizedImportsBuilder.AbstractReference) -> Collection<Name>): Map<Collection<Name>, List<OptimizedImportsBuilder.AbstractReference>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractReference
    <K> -> Collection<Name>

'it' @ [186:52] ==> value-parameter it: OptimizedImportsBuilder.AbstractReference defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports.<anonymous>[ValueParameterDescriptorImpl]

'dependsOnNames' @ [186:55] ==> public abstract val dependsOnNames: Collection<Name> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.AbstractReference[PropertyDescriptorImpl]

'!' @ [187:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'areScopeSlicesEqual' @ [187:18] ==> private final fun areScopeSlicesEqual(scope1: ImportingScope, scope2: ImportingScope, names: Collection<Name>): Boolean defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'originalFileScope' @ [187:38] ==> val originalFileScope: ImportingScope defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'newFileScope' @ [187:57] ==> val newFileScope: ImportingScope defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'names' @ [187:71] ==> val names: Collection<Name> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'refs' @ [188:29] ==> val refs: List<OptimizedImportsBuilder.AbstractReference> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'ref' @ [189:35] ==> val ref: OptimizedImportsBuilder.AbstractReference defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'element' @ [189:39] ==> public abstract val element: KtElement defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.AbstractReference[PropertyDescriptorImpl]

'element' @ [190:42] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'analyze' @ [190:50] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve in file resolutionApi.kt[SimpleFunctionDescriptorImpl]

'getExpressionToAnalyze' @ [191:47] ==> private final fun getExpressionToAnalyze(element: KtElement): KtExpression? defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'element' @ [191:70] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'element' @ [192:36] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'getResolutionScope' @ [192:44] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util in file scopeUtils.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [192:63] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'file' @ [192:79] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'getResolutionFacade' @ [192:84] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve in file resolutionApi.kt[SimpleFunctionDescriptorImpl]

'replaceImportingScopes' @ [192:107] ==> public fun LexicalScope.replaceImportingScopes(importingScopeChain: ImportingScope?): LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'newFileScope' @ [192:130] ==> val newFileScope: ImportingScope defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'expressionToAnalyze' @ [193:45] ==> val expressionToAnalyze: KtExpression defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'analyzeAsReplacement' @ [193:65] ==> @JvmOverloads public fun KtExpression.analyzeAsReplacement(expressionToBeReplaced: KtExpression, bindingContext: BindingContext, scope: LexicalScope, trace: BindingTrace = ..., contextDependency: ContextDependency = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis in file AnalyzerUtil.kt[SimpleFunctionDescriptorImpl]

'expressionToAnalyze' @ [193:86] ==> val expressionToAnalyze: KtExpression defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'bindingContext' @ [193:107] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'newScope' @ [193:123] ==> val newScope: LexicalScope defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'BindingTraceContext' @ [193:141] ==> public constructor BindingTraceContext() defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaClassConstructorDescriptor]

'testLog' @ [195:21] ==> @TestOnly public final var testLog: StringBuilder? /* = StringBuilder? */ defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.Companion[PropertyDescriptorImpl]

'append' @ [195:30] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'ref' @ [195:72] ==> val ref: OptimizedImportsBuilder.AbstractReference defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'ref' @ [197:38] ==> val ref: OptimizedImportsBuilder.AbstractReference defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'resolve' @ [197:42] ==> public abstract fun resolve(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.AbstractReference[SimpleFunctionDescriptorImpl]

'bindingContext' @ [197:50] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'ref' @ [198:38] ==> val ref: OptimizedImportsBuilder.AbstractReference defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'resolve' @ [198:42] ==> public abstract fun resolve(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.AbstractReference[SimpleFunctionDescriptorImpl]

'newBindingContext' @ [198:50] ==> val newBindingContext: BindingContext defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'!' @ [199:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'areTargetsEqual' @ [199:26] ==> private final fun areTargetsEqual(descriptors1: Collection<DeclarationDescriptor>, descriptors2: Collection<DeclarationDescriptor>): Boolean defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'oldTargets' @ [199:42] ==> val oldTargets: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'newTargets' @ [199:54] ==> val newTargets: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'testLog' @ [200:25] ==> @TestOnly public final var testLog: StringBuilder? /* = StringBuilder? */ defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.Companion[PropertyDescriptorImpl]

'append' @ [200:34] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'ref' @ [200:62] ==> val ref: OptimizedImportsBuilder.AbstractReference defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'oldTargets' @ [201:26] ==> val oldTargets: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'newTargets' @ [201:39] ==> val newTargets: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'forEach' @ [201:51] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'lockImportForDescriptor' @ [201:61] ==> private final fun lockImportForDescriptor(descriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'it' @ [201:85] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports.<anonymous>[ValueParameterDescriptorImpl]

'sortedImportsToGenerate' @ [207:16] ==> val sortedImportsToGenerate: List<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.tryBuildOptimizedImports[LocalVariableDescriptor]

'descriptor' @ [211:22] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.lockImportForDescriptor[ValueParameterDescriptorImpl]

'importableFqName' @ [211:33] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports in file ImportsUtils.kt[PropertyDescriptorImpl]

'ImportPath' @ [212:34] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'fqName' @ [212:45] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.lockImportForDescriptor[LocalVariableDescriptor]

'ImportPath' @ [213:30] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'fqName' @ [213:41] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.lockImportForDescriptor[LocalVariableDescriptor]

'parent' @ [213:48] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'file' @ [214:27] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'importDirectives' @ [214:32] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'map' @ [214:49] ==> public inline fun <T, R> Iterable<(KtImportDirective..KtImportDirective?)>.map(transform: ((KtImportDirective..KtImportDirective?)) -> ImportPath?): List<ImportPath?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)
    <R> -> ImportPath?

'it' @ [214:55] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.lockImportForDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [214:58] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'when {
            explicitImportPath in importPaths ->
                importRules.add(ImportRule.Add(explicitImportPath))
            starImportPath in importPaths ->
                importRules.add(ImportRule.Add(starImportPath))
            else -> // there is no import for this descriptor in the original import list, so do not allow to import it by star-import
                importRules.add(ImportRule.DoNotAdd(starImportPath))
        }' @ [215:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'explicitImportPath' @ [216:13] ==> val explicitImportPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.lockImportForDescriptor[LocalVariableDescriptor]

'importPaths' @ [216:35] ==> val importPaths: List<ImportPath?> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.lockImportForDescriptor[LocalVariableDescriptor]

'importRules' @ [217:17] ==> private final val importRules: HashSet<OptimizedImportsBuilder.ImportRule> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'add' @ [217:29] ==> public open fun add(element: OptimizedImportsBuilder.ImportRule): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'Add' @ [217:44] ==> public constructor Add(importPath: ImportPath) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.ImportRule.Add[ClassConstructorDescriptorImpl]

'explicitImportPath' @ [217:48] ==> val explicitImportPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.lockImportForDescriptor[LocalVariableDescriptor]

'starImportPath' @ [218:13] ==> val starImportPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.lockImportForDescriptor[LocalVariableDescriptor]

'importPaths' @ [218:31] ==> val importPaths: List<ImportPath?> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.lockImportForDescriptor[LocalVariableDescriptor]

'importRules' @ [219:17] ==> private final val importRules: HashSet<OptimizedImportsBuilder.ImportRule> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'add' @ [219:29] ==> public open fun add(element: OptimizedImportsBuilder.ImportRule): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'Add' @ [219:44] ==> public constructor Add(importPath: ImportPath) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.ImportRule.Add[ClassConstructorDescriptorImpl]

'starImportPath' @ [219:48] ==> val starImportPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.lockImportForDescriptor[LocalVariableDescriptor]

'importRules' @ [221:17] ==> private final val importRules: HashSet<OptimizedImportsBuilder.ImportRule> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'add' @ [221:29] ==> public open fun add(element: OptimizedImportsBuilder.ImportRule): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'DoNotAdd' @ [221:44] ==> public constructor DoNotAdd(importPath: ImportPath) defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.ImportRule.DoNotAdd[ClassConstructorDescriptorImpl]

'starImportPath' @ [221:53] ==> val starImportPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.lockImportForDescriptor[LocalVariableDescriptor]

'buildScopeByImports' @ [231:21] ==> private final fun buildScopeByImports(originalFile: KtFile, importsToGenerate: Collection<ImportPath>): ImportingScope defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'originalFile' @ [231:41] ==> value-parameter originalFile: KtFile defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[ValueParameterDescriptorImpl]

'importsToGenerate' @ [231:55] ==> value-parameter importsToGenerate: MutableSet<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[ValueParameterDescriptorImpl]

'filter' @ [231:73] ==> public inline fun <T> Iterable<ImportPath>.filter(predicate: (ImportPath) -> Boolean): List<ImportPath> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportPath

'it' @ [231:82] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired.<anonymous>[ValueParameterDescriptorImpl]

'isAllUnder' @ [231:85] ==> public final val isAllUnder: Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'classNamesToCheck' @ [232:24] ==> value-parameter classNamesToCheck: Collection<FqName> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[ValueParameterDescriptorImpl]

'scope' @ [233:17] ==> val scope: ImportingScope defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[LocalVariableDescriptor]

'findClassifier' @ [233:23] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'fqName' @ [233:38] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[LocalVariableDescriptor]

'shortName' @ [233:45] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'FROM_IDE' @ [233:75] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'importableFqName' @ [233:86] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports in file ImportsUtils.kt[PropertyDescriptorImpl]

'fqName' @ [233:106] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[LocalVariableDescriptor]

'importsToGenerate' @ [235:17] ==> value-parameter importsToGenerate: MutableSet<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[ValueParameterDescriptorImpl]

'add' @ [235:35] ==> public abstract fun add(element: ImportPath): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'ImportPath' @ [235:39] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'fqName' @ [235:50] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[LocalVariableDescriptor]

'fqName' @ [237:36] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[LocalVariableDescriptor]

'parent' @ [237:43] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'descriptorsByParentFqName' @ [239:40] ==> value-parameter descriptorsByParentFqName: Map<FqName, MutableSet<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[ValueParameterDescriptorImpl]

'parentFqName' @ [239:66] ==> val parentFqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[LocalVariableDescriptor]

'siblingsToImport' @ [240:36] ==> val siblingsToImport: MutableSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[LocalVariableDescriptor]

'filter' @ [240:53] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [240:62] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired.<anonymous>[ValueParameterDescriptorImpl]

'importableFqName' @ [240:65] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports in file ImportsUtils.kt[PropertyDescriptorImpl]

'fqName' @ [240:85] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[LocalVariableDescriptor]

'siblingsToImport' @ [241:21] ==> val siblingsToImport: MutableSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[LocalVariableDescriptor]

'remove' @ [241:38] ==> public abstract fun remove(element: DeclarationDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [241:45] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[LocalVariableDescriptor]

'siblingsToImport' @ [244:21] ==> val siblingsToImport: MutableSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[LocalVariableDescriptor]

'isEmpty' @ [244:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'importsToGenerate' @ [245:21] ==> value-parameter importsToGenerate: MutableSet<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[ValueParameterDescriptorImpl]

'remove' @ [245:39] ==> public abstract fun remove(element: ImportPath): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'ImportPath' @ [245:46] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'parentFqName' @ [245:57] ==> val parentFqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.addExplicitImportsForClassesWhenRequired[LocalVariableDescriptor]

'buildString' @ [252:24] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [253:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [254:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'originalFile' @ [254:20] ==> value-parameter originalFile: KtFile defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildScopeByImports[ValueParameterDescriptorImpl]

'packageFqName' @ [254:33] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'toUnsafe' @ [254:47] ==> @NotNull public open fun toUnsafe(): FqNameUnsafe defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'render' @ [254:58] ==> public fun FqNameUnsafe.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'append' @ [255:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'importsToGenerate' @ [257:32] ==> value-parameter importsToGenerate: Collection<ImportPath> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildScopeByImports[ValueParameterDescriptorImpl]

'append' @ [258:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [259:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'importPath' @ [259:24] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildScopeByImports.<anonymous>[LocalVariableDescriptor]

'pathStr' @ [259:35] ==> public final val pathStr: String defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'importPath' @ [260:21] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildScopeByImports.<anonymous>[LocalVariableDescriptor]

'hasAlias' @ [260:32] ==> public final fun hasAlias(): Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedSimpleFunctionDescriptor]

'append' @ [261:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [262:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'importPath' @ [262:28] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildScopeByImports.<anonymous>[LocalVariableDescriptor]

'alias' @ [262:39] ==> public final val alias: Name? defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'render' @ [262:47] ==> public fun Name.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'append' @ [264:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'KtPsiFactory' @ [267:31] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'originalFile' @ [267:44] ==> value-parameter originalFile: KtFile defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildScopeByImports[ValueParameterDescriptorImpl]

'createAnalyzableFile' @ [267:58] ==> public final fun createAnalyzableFile(fileName: String, text: String, contextToAnalyzeIn: PsiElement): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'fileText' @ [267:91] ==> val fileText: String defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildScopeByImports[LocalVariableDescriptor]

'originalFile' @ [267:101] ==> value-parameter originalFile: KtFile defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildScopeByImports[ValueParameterDescriptorImpl]

'fileWithImports' @ [268:16] ==> val fileWithImports: KtFile defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.buildScopeByImports[LocalVariableDescriptor]

'getFileResolutionScope' @ [268:32] ==> private final fun KtFile.getFileResolutionScope(): ImportingScope defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'getResolutionFacade' @ [271:51] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve in file resolutionApi.kt[SimpleFunctionDescriptorImpl]

'frontendService' @ [271:73] ==> public inline fun <reified T : Any> ResolutionFacade.frontendService(): FileScopeProvider defined in org.jetbrains.kotlin.idea.resolve[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> FileScopeProvider

'getFileScopes' @ [271:110] ==> public abstract fun getFileScopes(file: KtFile): FileScopes defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProvider[DeserializedSimpleFunctionDescriptor]

'this' @ [271:124] ==> <this> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.getFileResolutionScope[ReceiverParameterDescriptorImpl]

'importingScope' @ [271:130] ==> public final val importingScope: ImportingScope defined in org.jetbrains.kotlin.resolve.lazy.FileScopes[DeserializedPropertyDescriptor]

'scope1' @ [274:22] ==> value-parameter scope1: ImportingScope defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areScopeSlicesEqual[ValueParameterDescriptorImpl]

'extractSliceTower' @ [274:29] ==> private final fun ImportingScope.extractSliceTower(names: Collection<Name>): Sequence<Collection<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'names' @ [274:47] ==> value-parameter names: Collection<Name> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areScopeSlicesEqual[ValueParameterDescriptorImpl]

'scope2' @ [275:22] ==> value-parameter scope2: ImportingScope defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areScopeSlicesEqual[ValueParameterDescriptorImpl]

'extractSliceTower' @ [275:29] ==> private final fun ImportingScope.extractSliceTower(names: Collection<Name>): Sequence<Collection<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'names' @ [275:47] ==> value-parameter names: Collection<Name> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areScopeSlicesEqual[ValueParameterDescriptorImpl]

'tower1' @ [276:25] ==> val tower1: Sequence<Collection<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areScopeSlicesEqual[LocalVariableDescriptor]

'iterator' @ [276:32] ==> public abstract operator fun iterator(): Iterator<Collection<DeclarationDescriptor>> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'tower2' @ [277:25] ==> val tower2: Sequence<Collection<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areScopeSlicesEqual[LocalVariableDescriptor]

'iterator' @ [277:32] ==> public abstract operator fun iterator(): Iterator<Collection<DeclarationDescriptor>> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'when {
                !iterator1.hasNext() -> return !iterator2.hasNext()
                !iterator2.hasNext() -> return false
                else -> if (!areTargetsEqual(iterator1.next(), iterator2.next())) return false
            }' @ [279:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'!' @ [280:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'iterator1' @ [280:18] ==> val iterator1: Iterator<Collection<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areScopeSlicesEqual[LocalVariableDescriptor]

'hasNext' @ [280:28] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'!' @ [280:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'iterator2' @ [280:49] ==> val iterator2: Iterator<Collection<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areScopeSlicesEqual[LocalVariableDescriptor]

'hasNext' @ [280:59] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'!' @ [281:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'iterator2' @ [281:18] ==> val iterator2: Iterator<Collection<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areScopeSlicesEqual[LocalVariableDescriptor]

'hasNext' @ [281:28] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'!' @ [282:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'areTargetsEqual' @ [282:30] ==> private final fun areTargetsEqual(descriptors1: Collection<DeclarationDescriptor>, descriptors2: Collection<DeclarationDescriptor>): Boolean defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[SimpleFunctionDescriptorImpl]

'iterator1' @ [282:46] ==> val iterator1: Iterator<Collection<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areScopeSlicesEqual[LocalVariableDescriptor]

'next' @ [282:56] ==> public abstract operator fun next(): Collection<DeclarationDescriptor> defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator2' @ [282:64] ==> val iterator2: Iterator<Collection<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areScopeSlicesEqual[LocalVariableDescriptor]

'next' @ [282:74] ==> public abstract operator fun next(): Collection<DeclarationDescriptor> defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'parentsWithSelf' @ [288:16] ==> public val HierarchicalScope.parentsWithSelf: Sequence<HierarchicalScope> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedPropertyDescriptor]

'map' @ [289:18] ==> public fun <T, R> Sequence<HierarchicalScope>.map(transform: (HierarchicalScope) -> List<DeclarationDescriptorNonRoot>): Sequence<List<DeclarationDescriptorNonRoot>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HierarchicalScope
    <R> -> List<DeclarationDescriptorNonRoot>

'names' @ [290:21] ==> value-parameter names: Collection<Name> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.extractSliceTower[ValueParameterDescriptorImpl]

'flatMap' @ [290:27] ==> public inline fun <T, R> Iterable<Name>.flatMap(transform: (Name) -> Iterable<DeclarationDescriptorNonRoot>): List<DeclarationDescriptorNonRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name
    <R> -> DeclarationDescriptorNonRoot

'scope' @ [291:25] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.extractSliceTower.<anonymous>[ValueParameterDescriptorImpl]

'getContributedFunctions' @ [291:31] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.HierarchicalScope[DeserializedSimpleFunctionDescriptor]

'name' @ [291:55] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.extractSliceTower.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'FROM_IDE' @ [291:78] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'scope' @ [292:25] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.extractSliceTower.<anonymous>[ValueParameterDescriptorImpl]

'getContributedVariables' @ [292:31] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.HierarchicalScope[DeserializedSimpleFunctionDescriptor]

'name' @ [292:55] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.extractSliceTower.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'FROM_IDE' @ [292:78] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'listOfNotNull' @ [293:25] ==> public fun <T : Any> listOfNotNull(element: ClassifierDescriptor?): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassifierDescriptor

'scope' @ [293:39] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.extractSliceTower.<anonymous>[ValueParameterDescriptorImpl]

'getContributedClassifier' @ [293:45] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.HierarchicalScope[DeserializedSimpleFunctionDescriptor]

'name' @ [293:70] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.extractSliceTower.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'FROM_IDE' @ [293:93] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'filter' @ [296:18] ==> public fun <T> Sequence<List<DeclarationDescriptorNonRoot>>.filter(predicate: (List<DeclarationDescriptorNonRoot>) -> Boolean): Sequence<List<DeclarationDescriptorNonRoot>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<DeclarationDescriptorNonRoot>

'it' @ [296:27] ==> value-parameter it: List<DeclarationDescriptorNonRoot> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.extractSliceTower.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [296:30] ==> @InlineOnly public inline fun <T> Collection<DeclarationDescriptorNonRoot>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptorNonRoot

'when {
            fqName.parent().isRoot -> false
            (descriptor.containingDeclaration as? ClassDescriptor)?.kind == ClassKind.OBJECT -> false
            else -> true
        }' @ [300:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'fqName' @ [301:13] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.canUseStarImport[ValueParameterDescriptorImpl]

'parent' @ [301:20] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'isRoot' @ [301:29] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'==' @ [302:13] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ClassKind[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [302:14] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.canUseStarImport[ValueParameterDescriptorImpl]

'containingDeclaration' @ [302:25] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'kind' @ [302:69] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [302:87] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'importInsertHelper' @ [307:55] ==> private final val importInsertHelper: ImportInsertHelper defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'isImportedWithDefault' @ [307:74] ==> public abstract fun isImportedWithDefault(importPath: ImportPath, contextFile: KtFile): Boolean defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[SimpleFunctionDescriptorImpl]

'ImportPath' @ [307:96] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'fqName' @ [307:107] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.isImportedByDefault[ValueParameterDescriptorImpl]

'file' @ [307:123] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'containingDeclaration' @ [310:24] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'if (isMember)
            options.nameCountToUseStarImportForMembers
        else
            options.nameCountToUseStarImport' @ [311:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'isMember' @ [311:20] ==> val isMember: Boolean defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.nameCountToUseStar[LocalVariableDescriptor]

'options' @ [312:13] ==> private final val options: OptimizedImportsBuilder.Options defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'nameCountToUseStarImportForMembers' @ [312:21] ==> public final val nameCountToUseStarImportForMembers: Int defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.Options[PropertyDescriptorImpl]

'options' @ [314:13] ==> private final val options: OptimizedImportsBuilder.Options defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'nameCountToUseStarImport' @ [314:21] ==> public final val nameCountToUseStarImport: Int defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.Options[PropertyDescriptorImpl]

'descriptors1' @ [318:16] ==> value-parameter descriptors1: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areTargetsEqual[ValueParameterDescriptorImpl]

'size' @ [318:29] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'descriptors2' @ [318:37] ==> value-parameter descriptors2: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areTargetsEqual[ValueParameterDescriptorImpl]

'size' @ [318:50] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'descriptors1' @ [319:16] ==> value-parameter descriptors1: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areTargetsEqual[ValueParameterDescriptorImpl]

'zip' @ [319:29] ==> public infix fun <T, R> Iterable<DeclarationDescriptor>.zip(other: Iterable<DeclarationDescriptor>): List<Pair<DeclarationDescriptor, DeclarationDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> DeclarationDescriptor

'descriptors2' @ [319:33] ==> value-parameter descriptors2: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areTargetsEqual[ValueParameterDescriptorImpl]

'all' @ [319:47] ==> public inline fun <T> Iterable<Pair<DeclarationDescriptor, DeclarationDescriptor>>.all(predicate: (Pair<DeclarationDescriptor, DeclarationDescriptor>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<DeclarationDescriptor, DeclarationDescriptor>

'it' @ [319:53] ==> value-parameter it: Pair<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areTargetsEqual.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [319:56] ==> public final val first: DeclarationDescriptor defined in kotlin.Pair[DeserializedPropertyDescriptor]

'importableFqName' @ [319:62] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports in file ImportsUtils.kt[PropertyDescriptorImpl]

'it' @ [319:82] ==> value-parameter it: Pair<DeclarationDescriptor, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.areTargetsEqual.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [319:85] ==> public final val second: DeclarationDescriptor defined in kotlin.Pair[DeserializedPropertyDescriptor]

'importableFqName' @ [319:92] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports in file ImportsUtils.kt[PropertyDescriptorImpl]

'importRules' @ [322:58] ==> private final val importRules: HashSet<OptimizedImportsBuilder.ImportRule> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder[PropertyDescriptorImpl]

'none' @ [322:70] ==> public inline fun <T> Iterable<OptimizedImportsBuilder.ImportRule>.none(predicate: (OptimizedImportsBuilder.ImportRule) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportRule

'it' @ [322:77] ==> value-parameter it: OptimizedImportsBuilder.ImportRule defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.isAllowedByRules.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [322:106] ==> value-parameter it: OptimizedImportsBuilder.ImportRule defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.isAllowedByRules.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [322:109] ==> public final val importPath: ImportPath defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.ImportRule.DoNotAdd[PropertyDescriptorImpl]

'this' @ [322:123] ==> <this> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.isAllowedByRules[ReceiverParameterDescriptorImpl]

