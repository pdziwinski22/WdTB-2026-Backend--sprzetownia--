-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('ola@student.merito.pl',   'Ola',   'USER',    current_timestamp),
    ('kuba@student.merito.pl',  'Kuba',  'USER',    current_timestamp),
    ('firma@example.com',       'Firma', 'PARTNER', current_timestamp),
    ('admin@example.com',       'Admin', 'ADMIN',   current_timestamp);

-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
insert into user_account (email, display_name, role, created_at) values
    ('wrx81843@student.wroclaw.merito.pl', 'Patryk',  'USER', current_timestamp),
    ('s480084@student.wroclaw.merito.pl',  'Mateusz', 'USER', current_timestamp);

-- LAB 01: konto Marka (persona z wizytówki, właściciel wypożyczalni, więc rola ADMIN).
-- Zespół jest na razie dwuosobowy, a reguła R1.03 wymaga co najmniej 3 kont poza demo.
insert into user_account (email, display_name, role, created_at) values
    ('marek@example.com', 'Marek', 'ADMIN', current_timestamp);

-- ===== LAB 02 · rental_point =====
insert into rental_point (name, phone, capacity, active, street, city, postal_code) values
    ('Punkt Centrum',   '600100200', 40, true,  'ul. Konstytucji 3 Maja 12', 'Karpacz',          '58-540'),
    ('Punkt Biały Jar', '600100201', 25, true,  'ul. Karkonoska 5',          'Karpacz',          '58-540'),
    ('Punkt Szklarska', null,        15, false, 'ul. Jedności Narodowej 8',  'Szklarska Poręba', '58-580');

-- ===== LAB 02 · equipment =====
insert into equipment (name, inventory_number, daily_price, deposit, condition, purchase_date) values
    ('Rower górski 29"',      'ROW-001', 70.00, 300.00, 'GOOD', '2025-04-10'),
    ('Narty zjazdowe 170 cm', 'NAR-001', 60.00, 250.00, 'NEW',  '2026-10-01'),
    ('Kask narciarski M',     'KAS-001', 15.00,  50.00, 'WORN', null);

-- ===== LAB 02 · rental =====
insert into rental (status, reserved_at, start_date, planned_return_date, returned_on) values
    ('RETURNED', '2026-10-01 10:15:00', '2026-10-02', '2026-10-05', '2026-10-05'),
    ('OVERDUE',  '2026-10-08 18:30:00', '2026-10-10', '2026-10-12', null),
    ('ISSUED',   '2026-10-22 12:00:00', '2026-10-23', '2026-10-26', null),
    ('RESERVED', '2026-10-20 09:00:00', '2026-11-14', '2026-11-16', null);

-- ===== LAB 02 · customer =====
insert into customer (first_name, last_name, email, phone, registered_on) values
    ('Anna',  'Kowalska', 'anna.kowalska@example.com', '600200300', '2026-09-15'),
    ('Piotr', 'Nowak',    'piotr.nowak@example.com',   null,        '2026-10-02'),
    ('Ewa',   'Zielińska','ewa.zielinska@example.com', '600400500', '2026-10-20');
