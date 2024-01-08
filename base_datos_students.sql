
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--

--

-- --------------------------------------------------------

--

--

CREATE TABLE `asignatura`(
                         `id_class` int(11) NOT NULL,
                         `id_teacher` int(11) NOT NULL,
                         `id_course` int(11) NOT NULL,
                         `id_schedule` int(11) NOT NULL,
                         `name` varchar(255) NOT NULL,
                         `color` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- --------------------------------------------------------

--

--

CREATE TABLE `courses` (
                           `id_course` int(11) NOT NULL,
                           `name` varchar(255) NOT NULL,
                           `description` varchar(500) NOT NULL,
                           `date_start` date NOT NULL,
                           `date_end` date NOT NULL,
                           `active` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- --------------------------------------------------------

--

--

CREATE TABLE `enrollment` (
                              `id_enrollment` int(11) NOT NULL,
                              `id_student` int(11) NOT NULL,
                              `id_course` int(11) NOT NULL,
                              `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--

--

CREATE TABLE `schedule` (
                            `id_schedule` int(11) NOT NULL,
                            `id_class` int(11) NOT NULL,
                            `time_start` time NOT NULL,
                            `time_end` time NOT NULL,
                            `day` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--

--

CREATE TABLE `students` (
                            `id` int(11) NOT NULL,
                            `username` varchar(255) NOT NULL,
                            `pass` varchar(255) NOT NULL,
                            `email` varchar(255) NOT NULL,
                            `name` varchar(255) NOT NULL,
                            `surname` varchar(255) NOT NULL,
                            `telephone` varchar(50) NOT NULL,
                            `nif` varchar(50) NOT NULL,
                            `date_registered` datetime NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- --------------------------------------------------------

--

--

CREATE TABLE `teachers` (
                            `id_teacher` int(11) NOT NULL,
                            `name` varchar(255) NOT NULL,
                            `surname` varchar(255) NOT NULL,
                            `telephone` varchar(50) NOT NULL,
                            `nif` varchar(50) NOT NULL,
                            `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--

--

CREATE TABLE `users_admin` (
                               `id_user_admin` int(11) NOT NULL,
                               `username` varchar(255) NOT NULL,
                               `name` varchar(255) NOT NULL,
                               `email` varchar(255) NOT NULL,
                               `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--

--

--

ALTER TABLE "'aula'"
    ADD PRIMARY KEY (`id_class`),
  ADD UNIQUE KEY `id_teacher` (`id_teacher`,`id_course`,`id_schedule`);

--

--
ALTER TABLE `courses`
    ADD PRIMARY KEY (`id_course`),
  ADD UNIQUE KEY `name` (`name`,`date_start`,`date_end`);

--

--
ALTER TABLE `enrollment`
    ADD PRIMARY KEY (`id_enrollment`),
  ADD UNIQUE KEY `id_student` (`id_student`,`id_course`);

--

--
ALTER TABLE `schedule`
    ADD PRIMARY KEY (`id_schedule`);

--

--
ALTER TABLE `students`
    ADD PRIMARY KEY (`id`),
  ADD KEY `username` (`username`,`email`);

--

--
ALTER TABLE `teachers`
    ADD PRIMARY KEY (`id_teacher`);

--
ALTER TABLE `users_admin`
    ADD PRIMARY KEY (`id_user_admin`);

--
-
--

--

--
ALTER TABLE "'aula'"
    MODIFY `id_class` int(11) NOT NULL AUTO_INCREMENT;
--

ALTER TABLE `courses`
    MODIFY `id_course` int(11) NOT NULL AUTO_INCREMENT;
--

--
ALTER TABLE `enrollment`
    MODIFY `id_enrollment` int(11) NOT NULL AUTO_INCREMENT;
--

--
ALTER TABLE `schedule`
    MODIFY `id_schedule` int(11) NOT NULL AUTO_INCREMENT;
--

--
ALTER TABLE `students`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--

--
ALTER TABLE `teachers`
    MODIFY `id_teacher` int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE `users_admin`
    MODIFY `id_user_admin` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
