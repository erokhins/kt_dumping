'generateTestCalls' @ [34:9] ==> private final fun generateTestCalls(moduleDescriptor: ModuleDescriptor, packageName: FqName): Unit defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[SimpleFunctionDescriptorImpl]

'moduleDescriptor' @ [34:27] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[ValueParameterDescriptorImpl]

'ROOT' @ [34:52] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'JsFunction' @ [38:31] ==> public constructor JsFunction(@NotNull p0: JsScope, @NotNull p1: JsBlock, @NotNull p2: String) defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaClassConstructorDescriptor]

'context' @ [38:42] ==> public final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[PropertyDescriptorImpl]

'scope' @ [38:50] ==> @NotNull public open fun scope(): JsScope defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'JsBlock' @ [38:59] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'packageName' @ [38:73] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[ValueParameterDescriptorImpl]

'asString' @ [38:85] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'moduleDescriptor' @ [40:35] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[ValueParameterDescriptorImpl]

'getPackage' @ [40:52] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'packageName' @ [40:63] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[ValueParameterDescriptorImpl]

'fragments' @ [40:76] ==> public abstract val fragments: List<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getContainingModule' @ [41:33] ==> @NotNull public open fun getContainingModule(@NotNull p0: DeclarationDescriptor): ModuleDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'packageDescriptor' @ [41:53] ==> val packageDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[LocalVariableDescriptor]

'moduleDescriptor' @ [41:76] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[ValueParameterDescriptorImpl]

'packageDescriptor' @ [43:13] ==> val packageDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[LocalVariableDescriptor]

'getMemberScope' @ [43:31] ==> public abstract fun getMemberScope(): MemberScope defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedSimpleFunctionDescriptor]

'getContributedDescriptors' @ [43:48] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [43:74] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'CLASSIFIERS' @ [43:95] ==> @field:JvmField public final val CLASSIFIERS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'MemberScope' @ [43:108] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'ALL_NAME_FILTER' @ [43:120] ==> public final val ALL_NAME_FILTER: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.scopes.MemberScope.Companion[DeserializedPropertyDescriptor]

'forEach' @ [43:137] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [44:21] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls.<anonymous>[ValueParameterDescriptorImpl]

'generateTestFunctions' @ [45:21] ==> private final fun generateTestFunctions(classDescriptor: ClassDescriptor, parentFun: JsFunction): Unit defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[SimpleFunctionDescriptorImpl]

'it' @ [45:43] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls.<anonymous>[ValueParameterDescriptorImpl]

'packageFunction' @ [45:47] ==> val packageFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[LocalVariableDescriptor]

'!' @ [50:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'packageFunction' @ [50:14] ==> val packageFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[LocalVariableDescriptor]

'body' @ [50:30] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'isEmpty' @ [50:35] ==> public final val JsBlock.isEmpty: Boolean[MyPropertyDescriptor]

'JsStringLiteral' @ [51:29] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'packageName' @ [51:45] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[ValueParameterDescriptorImpl]

'asString' @ [51:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'context' @ [52:13] ==> public final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[PropertyDescriptorImpl]

'addTopLevelStatement' @ [52:21] ==> public open fun addTopLevelStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'JsInvocation' @ [52:42] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'suiteRef' @ [52:55] ==> private final val suiteRef: JsExpression defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[PropertyDescriptorImpl]

'suiteName' @ [52:65] ==> val suiteName: JsStringLiteral defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[LocalVariableDescriptor]

'JsBooleanLiteral' @ [52:76] ==> public constructor JsBooleanLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaClassConstructorDescriptor]

'packageFunction' @ [52:101] ==> val packageFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[LocalVariableDescriptor]

'makeStmt' @ [52:118] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'moduleDescriptor' @ [55:32] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[ValueParameterDescriptorImpl]

'getSubPackagesOf' @ [55:49] ==> public abstract fun getSubPackagesOf(fqName: FqName, nameFilter: (Name) -> Boolean): Collection<FqName> defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'packageName' @ [55:66] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[ValueParameterDescriptorImpl]

'MemberScope' @ [55:79] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'ALL_NAME_FILTER' @ [55:91] ==> public final val ALL_NAME_FILTER: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.scopes.MemberScope.Companion[DeserializedPropertyDescriptor]

'generateTestCalls' @ [56:13] ==> private final fun generateTestCalls(moduleDescriptor: ModuleDescriptor, packageName: FqName): Unit defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[SimpleFunctionDescriptorImpl]

'moduleDescriptor' @ [56:31] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[ValueParameterDescriptorImpl]

'subpackageName' @ [56:49] ==> val subpackageName: FqName defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestCalls[LocalVariableDescriptor]

'classDescriptor' @ [61:13] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunctions[ValueParameterDescriptorImpl]

'modality' @ [61:29] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [61:42] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [61:51] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'JsFunction' @ [63:29] ==> public constructor JsFunction(@NotNull p0: JsScope, @NotNull p1: JsBlock, @NotNull p2: String) defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaClassConstructorDescriptor]

'context' @ [63:40] ==> public final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[PropertyDescriptorImpl]

'scope' @ [63:48] ==> @NotNull public open fun scope(): JsScope defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'JsBlock' @ [63:57] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'classDescriptor' @ [65:9] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunctions[ValueParameterDescriptorImpl]

'unsubstitutedMemberScope' @ [65:25] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedDescriptors' @ [65:50] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [65:76] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'FUNCTIONS' @ [65:97] ==> @field:JvmField public final val FUNCTIONS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'MemberScope' @ [65:108] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'ALL_NAME_FILTER' @ [65:120] ==> public final val ALL_NAME_FILTER: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.scopes.MemberScope.Companion[DeserializedPropertyDescriptor]

'forEach' @ [65:137] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [66:17] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunctions.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [66:45] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunctions.<anonymous>[ValueParameterDescriptorImpl]

'isTest' @ [66:48] ==> private final val FunctionDescriptor.isTest: Boolean defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[PropertyDescriptorImpl]

'generateCodeForTestMethod' @ [67:17] ==> private final fun generateCodeForTestMethod(functionDescriptor: FunctionDescriptor, classDescriptor: ClassDescriptor, parentFun: JsFunction): Unit defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[SimpleFunctionDescriptorImpl]

'it' @ [67:43] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunctions.<anonymous>[ValueParameterDescriptorImpl]

'classDescriptor' @ [67:47] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunctions[ValueParameterDescriptorImpl]

'suiteFunction' @ [67:64] ==> val suiteFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunctions[LocalVariableDescriptor]

'!' @ [71:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'suiteFunction' @ [71:14] ==> val suiteFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunctions[LocalVariableDescriptor]

'body' @ [71:28] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'isEmpty' @ [71:33] ==> public final val JsBlock.isEmpty: Boolean[MyPropertyDescriptor]

'JsStringLiteral' @ [72:29] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'classDescriptor' @ [72:45] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunctions[ValueParameterDescriptorImpl]

'name' @ [72:61] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'toString' @ [72:66] ==> public open fun toString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'parentFun' @ [74:13] ==> value-parameter parentFun: JsFunction defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunctions[ValueParameterDescriptorImpl]

'body' @ [74:23] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [74:28] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'JsInvocation' @ [74:42] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'suiteRef' @ [74:55] ==> private final val suiteRef: JsExpression defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[PropertyDescriptorImpl]

'suiteName' @ [74:65] ==> val suiteName: JsStringLiteral defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunctions[LocalVariableDescriptor]

'JsBooleanLiteral' @ [74:76] ==> public constructor JsBooleanLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaClassConstructorDescriptor]

'classDescriptor' @ [74:93] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunctions[ValueParameterDescriptorImpl]

'isIgnored' @ [74:109] ==> private final val DeclarationDescriptor.isIgnored: Boolean defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[PropertyDescriptorImpl]

'suiteFunction' @ [74:121] ==> val suiteFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunctions[LocalVariableDescriptor]

'makeStmt' @ [74:136] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'generateTestFunction' @ [79:30] ==> private final fun generateTestFunction(functionDescriptor: FunctionDescriptor, classDescriptor: ClassDescriptor, scope: JsScope): JsFunction defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [79:51] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateCodeForTestMethod[ValueParameterDescriptorImpl]

'classDescriptor' @ [79:71] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateCodeForTestMethod[ValueParameterDescriptorImpl]

'parentFun' @ [79:88] ==> value-parameter parentFun: JsFunction defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateCodeForTestMethod[ValueParameterDescriptorImpl]

'scope' @ [79:98] ==> public final val JsFunction.scope: JsFunctionScope[MyPropertyDescriptor]

'JsStringLiteral' @ [81:24] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'functionDescriptor' @ [81:40] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateCodeForTestMethod[ValueParameterDescriptorImpl]

'name' @ [81:59] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'toString' @ [81:64] ==> public open fun toString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'parentFun' @ [82:9] ==> value-parameter parentFun: JsFunction defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateCodeForTestMethod[ValueParameterDescriptorImpl]

'body' @ [82:19] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [82:24] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'JsInvocation' @ [82:38] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'testRef' @ [82:51] ==> private final val testRef: JsExpression defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[PropertyDescriptorImpl]

'testName' @ [82:60] ==> val testName: JsStringLiteral defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateCodeForTestMethod[LocalVariableDescriptor]

'JsBooleanLiteral' @ [82:70] ==> public constructor JsBooleanLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaClassConstructorDescriptor]

'functionDescriptor' @ [82:87] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateCodeForTestMethod[ValueParameterDescriptorImpl]

'isIgnored' @ [82:106] ==> private final val DeclarationDescriptor.isIgnored: Boolean defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[PropertyDescriptorImpl]

'functionToTest' @ [82:118] ==> val functionToTest: JsFunction defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateCodeForTestMethod[LocalVariableDescriptor]

'makeStmt' @ [82:134] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'translateAsValueReference' @ [86:46] ==> @NotNull public open fun translateAsValueReference(@NotNull descriptor: DeclarationDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'classDescriptor' @ [86:72] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunction[ValueParameterDescriptorImpl]

'context' @ [86:89] ==> public final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[PropertyDescriptorImpl]

'JsNew' @ [87:25] ==> public constructor JsNew(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNew[JavaClassConstructorDescriptor]

'expression' @ [87:31] ==> val expression: JsExpression defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunction[LocalVariableDescriptor]

'CallTranslator' @ [88:34] ==> public object CallTranslator defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallTranslator.kt[FakeCallableDescriptorForObject]

'buildCall' @ [88:49] ==> public final fun buildCall(context: TranslationContext, functionDescriptor: FunctionDescriptor, args: List<JsExpression>, dispatchReceiver: JsExpression?): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.CallTranslator[SimpleFunctionDescriptorImpl]

'context' @ [88:59] ==> public final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[PropertyDescriptorImpl]

'functionDescriptor' @ [88:68] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunction[ValueParameterDescriptorImpl]

'emptyList' @ [88:88] ==> public fun <T> emptyList(): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'testClass' @ [88:115] ==> val testClass: JsNew defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunction[LocalVariableDescriptor]

'JsFunction' @ [89:30] ==> public constructor JsFunction(@NotNull p0: JsScope, @NotNull p1: String) defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaClassConstructorDescriptor]

'scope' @ [89:41] ==> value-parameter scope: JsScope defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunction[ValueParameterDescriptorImpl]

'functionToTest' @ [90:9] ==> val functionToTest: JsFunction defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunction[LocalVariableDescriptor]

'body' @ [90:24] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'JsBlock' @ [90:31] ==> public constructor JsBlock(p0: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'functionToTestCall' @ [90:39] ==> val functionToTestCall: JsExpression defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunction[LocalVariableDescriptor]

'makeStmt' @ [90:58] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'functionToTest' @ [92:16] ==> val functionToTest: JsFunction defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.generateTestFunction[LocalVariableDescriptor]

'lazy' @ [95:43] ==> public fun <T> lazy(initializer: () -> JsExpression): Lazy<JsExpression> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'findFunction' @ [95:50] ==> private final fun findFunction(name: String): JsExpression defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[SimpleFunctionDescriptorImpl]

'lazy' @ [96:42] ==> public fun <T> lazy(initializer: () -> JsExpression): Lazy<JsExpression> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'findFunction' @ [96:49] ==> private final fun findFunction(name: String): JsExpression defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[SimpleFunctionDescriptorImpl]

'?:' @ [99:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: FunctionDescriptor?, right: FunctionDescriptor): FunctionDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> FunctionDescriptor

'getFunctionByNameOrNull' @ [99:42] ==> @Nullable public open fun getFunctionByNameOrNull(@NotNull p0: MemberScope, @NotNull p1: Name): FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'context' @ [100:17] ==> public final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[PropertyDescriptorImpl]

'currentModule' @ [100:25] ==> public final val TranslationContext.currentModule: ModuleDescriptor[MyPropertyDescriptor]

'getPackage' @ [100:39] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'FqNameUnsafe' @ [100:50] ==> public constructor FqNameUnsafe(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaClassConstructorDescriptor]

'toSafe' @ [100:78] ==> @NotNull public open fun toSafe(): FqName defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'memberScope' @ [100:88] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'identifier' @ [101:22] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [101:33] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.findFunction[ValueParameterDescriptorImpl]

'JsNameRef' @ [101:50] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'name' @ [101:60] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.findFunction[ValueParameterDescriptorImpl]

'JsNameRef' @ [101:66] ==> public constructor JsNameRef(@NotNull p0: String) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'translateAsValueReference' @ [102:36] ==> @NotNull public open fun translateAsValueReference(@NotNull descriptor: DeclarationDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'descriptor' @ [102:62] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.findFunction[LocalVariableDescriptor]

'context' @ [102:74] ==> public final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[PropertyDescriptorImpl]

'annotationFinder' @ [106:17] ==> private final fun DeclarationDescriptor.annotationFinder(shortName: String, vararg packages: String): Boolean defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[SimpleFunctionDescriptorImpl]

'annotationFinder' @ [109:17] ==> private final fun DeclarationDescriptor.annotationFinder(shortName: String, vararg packages: String): Boolean defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator[SimpleFunctionDescriptorImpl]

'packages' @ [111:102] ==> value-parameter vararg packages: String defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.annotationFinder[ValueParameterDescriptorImpl]

'any' @ [111:111] ==> public inline fun <T> Array<out String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'annotations' @ [112:9] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedPropertyDescriptor]

'hasAnnotation' @ [112:21] ==> public open fun hasAnnotation(fqName: FqName): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'FqName' @ [112:35] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'packageName' @ [112:44] ==> value-parameter packageName: String defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.annotationFinder.<anonymous>[ValueParameterDescriptorImpl]

'shortName' @ [112:57] ==> value-parameter shortName: String defined in org.jetbrains.kotlin.js.translate.test.JSTestGenerator.annotationFinder[ValueParameterDescriptorImpl]

