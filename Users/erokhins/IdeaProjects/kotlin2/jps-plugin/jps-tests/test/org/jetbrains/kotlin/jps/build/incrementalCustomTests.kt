'AbstractIncrementalJpsTest' @ [21:37] ==> public constructor AbstractIncrementalJpsTest(allowNoFilesWithSuffixInTestData: Boolean = ..., checkDumpsCaseInsensitively: Boolean = ..., allowNoBuildLogFileInTestData: Boolean = ...) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[ClassConstructorDescriptorImpl]

'doTest' @ [23:9] ==> protected open fun doTest(testDataPath: String): Unit defined in org.jetbrains.kotlin.jps.build.IncrementalRenameModuleTest[SimpleFunctionDescriptorImpl]

'projectDescriptor' @ [27:9] ==> protected final lateinit var projectDescriptor: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.IncrementalRenameModuleTest[PropertyDescriptorImpl]

'project' @ [27:27] ==> public final val ProjectDescriptor.project: (JpsProject..JpsProject?)[MyPropertyDescriptor]

'modules' @ [27:35] ==> public final val JpsProject.modules: (MutableList<(JpsModule..JpsModule?)>..List<(JpsModule..JpsModule?)>)[MyPropertyDescriptor]

'forEach' @ [27:43] ==> @HidesMembers public inline fun <T> Iterable<(JpsModule..JpsModule?)>.forEach(action: ((JpsModule..JpsModule?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.jps.model.module.JpsModule..org.jetbrains.jps.model.module.JpsModule?)

'it' @ [27:53] ==> value-parameter it: (JpsModule..JpsModule?) defined in org.jetbrains.kotlin.jps.build.IncrementalRenameModuleTest.performAdditionalModifications.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [27:56] ==> public final var JpsModule.name: String[MyPropertyDescriptor]

